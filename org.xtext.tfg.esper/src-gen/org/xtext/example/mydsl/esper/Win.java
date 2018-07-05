/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Win</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.Win#getDefaultMethod <em>Default Method</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper.EsperPackage#getWin()
 * @model
 * @generated
 */
public interface Win extends EObject
{
  /**
   * Returns the value of the '<em><b>Default Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Method</em>' containment reference.
   * @see #setDefaultMethod(DefaultMethods)
   * @see org.xtext.example.mydsl.esper.EsperPackage#getWin_DefaultMethod()
   * @model containment="true"
   * @generated
   */
  DefaultMethods getDefaultMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper.Win#getDefaultMethod <em>Default Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Method</em>' containment reference.
   * @see #getDefaultMethod()
   * @generated
   */
  void setDefaultMethod(DefaultMethods value);

} // Win