/**
 */
package net.jeeeyul.pdetools.model.pdetools;

import org.eclipse.core.resources.IFolder;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Palette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.jeeeyul.pdetools.model.pdetools.Palette#getParent <em>Parent</em>}</li>
 *   <li>{@link net.jeeeyul.pdetools.model.pdetools.Palette#getFolder <em>Folder</em>}</li>
 *   <li>{@link net.jeeeyul.pdetools.model.pdetools.Palette#getSubPalettes <em>Sub Palettes</em>}</li>
 *   <li>{@link net.jeeeyul.pdetools.model.pdetools.Palette#getImageFiles <em>Image Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.jeeeyul.pdetools.model.pdetools.PdetoolsPackage#getPalette()
 * @model
 * @generated
 */
public interface Palette extends FieldNameOwner {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.jeeeyul.pdetools.model.pdetools.Palette#getSubPalettes <em>Sub Palettes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Palette)
	 * @see net.jeeeyul.pdetools.model.pdetools.PdetoolsPackage#getPalette_Parent()
	 * @see net.jeeeyul.pdetools.model.pdetools.Palette#getSubPalettes
	 * @model opposite="subPalettes" transient="false"
	 * @generated
	 */
	Palette getParent();

	/**
	 * Sets the value of the '{@link net.jeeeyul.pdetools.model.pdetools.Palette#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Palette value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * �ȷ�Ʈ�� ǥ���ϴ� ��ũ�����̽����� ����.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Folder</em>' attribute.
	 * @see #setFolder(IFolder)
	 * @see net.jeeeyul.pdetools.model.pdetools.PdetoolsPackage#getPalette_Folder()
	 * @model unique="false" dataType="net.jeeeyul.pdetools.model.pdetools.IFolder"
	 * @generated
	 */
	IFolder getFolder();

	/**
	 * Sets the value of the '{@link net.jeeeyul.pdetools.model.pdetools.Palette#getFolder <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' attribute.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(IFolder value);

	/**
	 * Returns the value of the '<em><b>Sub Palettes</b></em>' containment reference list.
	 * The list contents are of type {@link net.jeeeyul.pdetools.model.pdetools.Palette}.
	 * It is bidirectional and its opposite is '{@link net.jeeeyul.pdetools.model.pdetools.Palette#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Palettes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Palettes</em>' containment reference list.
	 * @see net.jeeeyul.pdetools.model.pdetools.PdetoolsPackage#getPalette_SubPalettes()
	 * @see net.jeeeyul.pdetools.model.pdetools.Palette#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Palette> getSubPalettes();

	/**
	 * Returns the value of the '<em><b>Image Files</b></em>' containment reference list.
	 * The list contents are of type {@link net.jeeeyul.pdetools.model.pdetools.ImageFile}.
	 * It is bidirectional and its opposite is '{@link net.jeeeyul.pdetools.model.pdetools.ImageFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Files</em>' containment reference list.
	 * @see net.jeeeyul.pdetools.model.pdetools.PdetoolsPackage#getPalette_ImageFiles()
	 * @see net.jeeeyul.pdetools.model.pdetools.ImageFile#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ImageFile> getImageFiles();

} // Palette
