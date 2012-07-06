package net.jeeeyul.pdetools.icg

import org.eclipse.ui.preferences.ScopedPreferenceStore
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.IPath

/**
 * Image Constants Generator�� ȯ�漳�� ��ü.
 */
class ICGConfiguration {
	private static val MONITORING_FOLDER = "monitoring-folder";
	
	@Property ScopedPreferenceStore store;
	
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
}