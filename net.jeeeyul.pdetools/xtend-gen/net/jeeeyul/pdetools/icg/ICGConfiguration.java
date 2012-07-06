package net.jeeeyul.pdetools.icg;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * Image Constants Generator�� ȯ�漳�� ��ü.
 */
@SuppressWarnings("all")
public class ICGConfiguration {
  private final static String MONITORING_FOLDER = "monitoring-folder";
  
  private ScopedPreferenceStore _store;
  
  public ScopedPreferenceStore getStore() {
    return this._store;
  }
  
  public void setStore(final ScopedPreferenceStore store) {
    this._store = store;
  }
  
  /**
   * �̹��� ���ҽ��� ����͸��� ������ ��θ� ����ϴ�.
   * 
   * @returns
   * 	�̹��� ���ҽ��� ����͸��� ������ ������Ʈ ��� ���.
   */
  public IPath getMonitoringFolder() {
    ScopedPreferenceStore _store = this.getStore();
    String _string = _store.getString(ICGConfiguration.MONITORING_FOLDER);
    Path _path = new Path(_string);
    return _path;
  }
  
  /**
   * �̹��� ���ҽ��� ����͸��� ������ ��θ� �����մϴ�.
   * 
   * @param path
   * 	�̹��� ���ҽ��� ����͸��� ������ ������Ʈ ��� ���.
   */
  public void setMonitoringFolder(final IPath path) {
    ScopedPreferenceStore _store = this.getStore();
    String _portableString = path.toPortableString();
    _store.putValue(ICGConfiguration.MONITORING_FOLDER, _portableString);
  }
}
