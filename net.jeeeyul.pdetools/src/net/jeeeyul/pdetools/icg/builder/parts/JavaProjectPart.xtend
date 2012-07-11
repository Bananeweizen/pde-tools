package net.jeeeyul.pdetools.icg.builder.parts

import net.jeeeyul.pdetools.icg.builder.model.ICGConfiguration
import com.google.inject.Inject
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.core.runtime.NullProgressMonitor
import net.jeeeyul.pdetools.shared.ResourceExtensions
import org.eclipse.jdt.core.IPackageFragmentRoot

class JavaProjectPart {
	@Inject
	extension ResourceExtensions
	
	@Inject
	ICGConfiguration config
	
	@Inject
	IJavaProject javaProject
	
	/**
	 * ��� �ڹ� �ҽ��� ������ �ҽ������� �����, �ڹ� �ҽ� ������ ���� �н��� ����Ѵ�.
	 * �̹� �����ϰ�, �̹� ��ϵǾ� ������ �ƹ��ϵ� ���� �ʴ´�.
	 */
	def ensureJavaSourceFolder(){
		// �ҽ� ������ ���縦 �����Ѵ�.
		config.generateSrcFolder.ensureExist()
		
		// �ҽ� ������ �̹� �ڹ� ������Ʈ�� �ҽ� ������ ��ϵǾ� �ִ��� Ȯ���Ѵ�.
		var javaElement = javaProject.findElement(config.generateSrcFolder.projectRelativePath)
		var isAlreadJavaSoruceFolder = javaElement instanceof IPackageFragmentRoot
		
		// �ڹ� �ҽ� ������ �ƴѰ��, �ڹ� �ҽ� ������ ����Ѵ�.
		if(!isAlreadJavaSoruceFolder){
			var rawClasspathes = newArrayList(javaProject.rawClasspath)
			rawClasspathes += JavaCore::newSourceEntry(config.generateSrcFolder.fullPath)
			javaProject.setRawClasspath(rawClasspathes, new NullProgressMonitor)
		}
	}
		
}