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

import org.xtext.example.mydsl.esper.Anything;
import org.xtext.example.mydsl.esper.DefaultMethods;
import org.xtext.example.mydsl.esper.EsperPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Methods</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper.impl.DefaultMethodsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper.impl.DefaultMethodsImpl#getAnything <em>Anything</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultMethodsImpl extends MinimalEObjectImpl.Container implements DefaultMethods
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAnything() <em>Anything</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnything()
   * @generated
   * @ordered
   */
  protected Anything anything;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultMethodsImpl()
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
    return EsperPackage.Literals.DEFAULT_METHODS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.DEFAULT_METHODS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anything getAnything()
  {
    return anything;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnything(Anything newAnything, NotificationChain msgs)
  {
    Anything oldAnything = anything;
    anything = newAnything;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsperPackage.DEFAULT_METHODS__ANYTHING, oldAnything, newAnything);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnything(Anything newAnything)
  {
    if (newAnything != anything)
    {
      NotificationChain msgs = null;
      if (anything != null)
        msgs = ((InternalEObject)anything).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsperPackage.DEFAULT_METHODS__ANYTHING, null, msgs);
      if (newAnything != null)
        msgs = ((InternalEObject)newAnything).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsperPackage.DEFAULT_METHODS__ANYTHING, null, msgs);
      msgs = basicSetAnything(newAnything, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsperPackage.DEFAULT_METHODS__ANYTHING, newAnything, newAnything));
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
      case EsperPackage.DEFAULT_METHODS__ANYTHING:
        return basicSetAnything(null, msgs);
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
      case EsperPackage.DEFAULT_METHODS__NAME:
        return getName();
      case EsperPackage.DEFAULT_METHODS__ANYTHING:
        return getAnything();
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
      case EsperPackage.DEFAULT_METHODS__NAME:
        setName((String)newValue);
        return;
      case EsperPackage.DEFAULT_METHODS__ANYTHING:
        setAnything((Anything)newValue);
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
      case EsperPackage.DEFAULT_METHODS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EsperPackage.DEFAULT_METHODS__ANYTHING:
        setAnything((Anything)null);
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
      case EsperPackage.DEFAULT_METHODS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EsperPackage.DEFAULT_METHODS__ANYTHING:
        return anything != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DefaultMethodsImpl
