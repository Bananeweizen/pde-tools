package net.jeeeyul.pdetools.icg

import org.eclipse.ui.preferences.ScopedPreferenceStore
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.IPath
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ProjectScope
import net.jeeeyul.pdetools.Activator
import org.eclipse.core.runtime.Assert

/**
 * Image Constants Generator�� ȯ�漳�� ��ü.
 */
class ICGConfiguration {
	private static val MONITORING_FOLDER = "monitoring-folder";
	IProject project;
	
	new(IProject project){
		Assert::isNotNull(project);
		this.project = project
	}
	
	/**
	 * �̹��� ���ҽ��� ����͸��� ������ ��θ� ����ϴ�.
	 * 
	 * @returns 
	 * 	�̹��� ���ҽ��� ����͸��� ������ ������Ʈ ��� ���.
	 */
	def IPath getMonitoringFolder(){
		return new Path(store.getString(MONITORING_FOLDER));
	}
	
	/**
	 * �̹��� ���ҽ��� ����͸��� ������ ��θ� �����մϴ�.
	 * 
	 * @param path
	 * 	�̹��� ���ҽ��� ����͸��� ������ ������Ʈ ��� ���.
	 */
	def void setMonitoringFolder(IPath path){
		store.putValue(MONITORING_FOLDER, path.toPortableString);
	}
	
	def store(){
		return new ScopedPreferenceStore(new ProjectScope(project), Activator::PLUGIN_ID + ".icg");
	}
}