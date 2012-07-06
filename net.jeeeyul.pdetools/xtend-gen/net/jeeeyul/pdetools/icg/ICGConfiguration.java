package net.jeeeyul.pdetools.icg;

import net.jeeeyul.pdetools.Activator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * Image Constants Generator�� ȯ�漳�� ��ü.
 */
@SuppressWarnings("all")
public class ICGConfiguration {
  private final static String MONITORING_FOLDER = "monitoring-folder";
  
  private IProject project;
  
  public ICGConfiguration(final IProject project) {
    Assert.isNotNull(project);
    this.project = project;
  }
  
  /**
   * �̹��� ���ҽ��� ����͸��� ������ ��θ� ����ϴ�.
   * 
   * @returns
   * 	�̹��� ���ҽ��� ����͸��� ������ ������Ʈ ��� ���.
   */
  public IPath getMonitoringFolder() {
    ScopedPreferenceStore _store = this.store();
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
    ScopedPreferenceStore _store = this.store();
    String _portableString = path.toPortableString();
    _store.putValue(ICGConfiguration.MONITORING_FOLDER, _portableString);
  }
  
  public ScopedPreferenceStore store() {
    ProjectScope _projectScope = new ProjectScope(this.project);
    String _plus = (Activator.PLUGIN_ID + ".icg");
    ScopedPreferenceStore _scopedPreferenceStore = new ScopedPreferenceStore(_projectScope, _plus);
    return _scopedPreferenceStore;
  }
}
