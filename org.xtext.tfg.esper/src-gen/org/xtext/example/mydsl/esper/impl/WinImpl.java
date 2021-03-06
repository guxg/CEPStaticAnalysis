/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.esper.DefaultMethods;
import org.xtext.example.mydsl.esper.EsperPackage;
import org.xtext.example.mydsl.esper.Win;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.impl.WinImpl#getDefaultMethod <em>Default Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WinImpl extends MinimalEObjectImpl.Container implements Win
{
  /**
   * The cached value of the '{@link #getDefaultMethod() <em>Default Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultMethod()
   * @generated
   * @ordered
   */
  protected DefaultMethods defaultMethod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WinImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EsperPackage.Literals.WIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultMethods getDefaultMethod()
  {
    return defaultMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultMethod(DefaultMethods newDefaultMethod, NotificationChain msgs)
  {
    DefaultMethods oldDefaultMethod = defaultMethod;
    defaultMethod = newDefaultMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsperPackage.WIN__DEFAULT_METHOD, oldDefaultMethod, newDefaultMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultMethod(DefaultMethods newDefaultMethod)
  {
    if (newDefaultMethod != defaultMethod)
    {
      NotificationChain msgs = null;
      if (defaultMethod != null)
        msgs = ((InternalEObject)defaultMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsperPackage.WIN__DEFAULT_METHOD, null, msgs);
      if (newDefaultMethod != null)
        msgs = ((InternalEObject)newDefaultMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsperPackage.WIN__DEFAULT_METHOD, null, msgs);
      msgs = basicSetDefaultMethod(newDefaultMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.WIN__DEFAULT_METHOD, newDefaultMethod, newDefaultMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EsperPackage.WIN__DEFAULT_METHOD:
        return basicSetDefaultMethod(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EsperPackage.WIN__DEFAULT_METHOD:
        return getDefaultMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EsperPackage.WIN__DEFAULT_METHOD:
        setDefaultMethod((DefaultMethods)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EsperPackage.WIN__DEFAULT_METHOD:
        setDefaultMethod((DefaultMethods)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EsperPackage.WIN__DEFAULT_METHOD:
        return defaultMethod != null;
    }
    return super.eIsSet(featureID);
  }

} //WinImpl
