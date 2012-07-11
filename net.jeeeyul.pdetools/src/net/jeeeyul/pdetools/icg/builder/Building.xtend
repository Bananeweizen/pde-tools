package net.jeeeyul.pdetools.icg.builder

import com.google.inject.Inject
import java.io.ByteArrayInputStream
import net.jeeeyul.pdetools.icg.builder.model.ICGConfiguration
import net.jeeeyul.pdetools.icg.builder.model.PaletteModelGenerator
import net.jeeeyul.pdetools.icg.builder.parts.ErrorPart
import net.jeeeyul.pdetools.icg.builder.parts.ImageCosntantGenerator
import net.jeeeyul.pdetools.icg.builder.parts.JavaProjectPart
import net.jeeeyul.pdetools.icg.builder.parts.ResourceDeltaPart
import net.jeeeyul.pdetools.shared.ResourceExtensions
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor

class Building {
	extension ResourceExtensions = new ResourceExtensions()
	
	@Inject
	extension IncrementalProjectBuilder builder
	
	@Inject
	extension ErrorPart
	
	@Inject
	extension ResourceDeltaPart
	
	@Inject
	extension ImageCosntantGenerator
	
	@Inject
	ICGConfiguration config
	
	@Inject
	extension JavaProjectPart
	
	def IProject[ ] build(IProgressMonitor monitor) {
		monitor.beginTask("ICG Build", IProgressMonitor::UNKNOWN);
		
		// ���� ������ ������ �˻��Ѵ�.
		validate()
		
		// ���� ���ҽ� ��Ŀ���� �����ϰ�, �˻� ����� ���� ��Ŀ���� �����Ѵ�.
		cleanMarkers()
		generateMarkers()

		// ���� �� �ʿ䰡 ���ų�, ���尡 �Ұ����ϸ� �����Ѵ�.
		if(!canBuild() || !hasResourceDelta()) {
			monitor.done()
			println("���� ���")
			return emptyList
		}
		
		// ��µ� �ڹ� �ҽ��� ��� �ڹ� �ҽ� ������ Ȯ���Ѵ�.
		ensureJavaSourceFolder()
		
		var pmg = new PaletteModelGenerator(config)
		var paletteModel = pmg.generatePalette(config.monitoringFolder)
		
		if(config.ouputFile.exists) {
			config.ouputFile.delete(true, new NullProgressMonitor())
		}
		
		var stream = new ByteArrayInputStream(paletteModel.generateJavaSource().toString.bytes)
		config.ouputFile.parent.ensureExist()
		config.ouputFile.create(stream, true, new NullProgressMonitor())
		stream.close()
		config.ouputFile.derived = config.markDerived
		
		monitor.done()
		return newArrayList(project)
	}
	
	def boolean isNullOrBlank(String src){
		if(src == null){
			return true
		}else{
			return src.trim.empty
		}
	}
}