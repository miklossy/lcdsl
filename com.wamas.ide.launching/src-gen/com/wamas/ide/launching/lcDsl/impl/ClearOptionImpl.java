/**
 * generated by Xtext 2.10.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.ClearOption;
import com.wamas.ide.launching.lcDsl.LcDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clear Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.ClearOptionImpl#isWorkspace <em>Workspace</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.ClearOptionImpl#isLog <em>Log</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.ClearOptionImpl#isNoAskClear <em>No Ask Clear</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.ClearOptionImpl#isConfig <em>Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearOptionImpl extends MinimalEObjectImpl.Container implements ClearOption
{
  /**
   * The default value of the '{@link #isWorkspace() <em>Workspace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWorkspace()
   * @generated
   * @ordered
   */
  protected static final boolean WORKSPACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWorkspace() <em>Workspace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWorkspace()
   * @generated
   * @ordered
   */
  protected boolean workspace = WORKSPACE_EDEFAULT;

  /**
   * The default value of the '{@link #isLog() <em>Log</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLog()
   * @generated
   * @ordered
   */
  protected static final boolean LOG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLog() <em>Log</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLog()
   * @generated
   * @ordered
   */
  protected boolean log = LOG_EDEFAULT;

  /**
   * The default value of the '{@link #isNoAskClear() <em>No Ask Clear</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoAskClear()
   * @generated
   * @ordered
   */
  protected static final boolean NO_ASK_CLEAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoAskClear() <em>No Ask Clear</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoAskClear()
   * @generated
   * @ordered
   */
  protected boolean noAskClear = NO_ASK_CLEAR_EDEFAULT;

  /**
   * The default value of the '{@link #isConfig() <em>Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConfig()
   * @generated
   * @ordered
   */
  protected static final boolean CONFIG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConfig() <em>Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConfig()
   * @generated
   * @ordered
   */
  protected boolean config = CONFIG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClearOptionImpl()
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
    return LcDslPackage.Literals.CLEAR_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWorkspace()
  {
    return workspace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkspace(boolean newWorkspace)
  {
    boolean oldWorkspace = workspace;
    workspace = newWorkspace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.CLEAR_OPTION__WORKSPACE, oldWorkspace, workspace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLog()
  {
    return log;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLog(boolean newLog)
  {
    boolean oldLog = log;
    log = newLog;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.CLEAR_OPTION__LOG, oldLog, log));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoAskClear()
  {
    return noAskClear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoAskClear(boolean newNoAskClear)
  {
    boolean oldNoAskClear = noAskClear;
    noAskClear = newNoAskClear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.CLEAR_OPTION__NO_ASK_CLEAR, oldNoAskClear, noAskClear));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConfig()
  {
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfig(boolean newConfig)
  {
    boolean oldConfig = config;
    config = newConfig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.CLEAR_OPTION__CONFIG, oldConfig, config));
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
      case LcDslPackage.CLEAR_OPTION__WORKSPACE:
        return isWorkspace();
      case LcDslPackage.CLEAR_OPTION__LOG:
        return isLog();
      case LcDslPackage.CLEAR_OPTION__NO_ASK_CLEAR:
        return isNoAskClear();
      case LcDslPackage.CLEAR_OPTION__CONFIG:
        return isConfig();
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
      case LcDslPackage.CLEAR_OPTION__WORKSPACE:
        setWorkspace((Boolean)newValue);
        return;
      case LcDslPackage.CLEAR_OPTION__LOG:
        setLog((Boolean)newValue);
        return;
      case LcDslPackage.CLEAR_OPTION__NO_ASK_CLEAR:
        setNoAskClear((Boolean)newValue);
        return;
      case LcDslPackage.CLEAR_OPTION__CONFIG:
        setConfig((Boolean)newValue);
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
      case LcDslPackage.CLEAR_OPTION__WORKSPACE:
        setWorkspace(WORKSPACE_EDEFAULT);
        return;
      case LcDslPackage.CLEAR_OPTION__LOG:
        setLog(LOG_EDEFAULT);
        return;
      case LcDslPackage.CLEAR_OPTION__NO_ASK_CLEAR:
        setNoAskClear(NO_ASK_CLEAR_EDEFAULT);
        return;
      case LcDslPackage.CLEAR_OPTION__CONFIG:
        setConfig(CONFIG_EDEFAULT);
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
      case LcDslPackage.CLEAR_OPTION__WORKSPACE:
        return workspace != WORKSPACE_EDEFAULT;
      case LcDslPackage.CLEAR_OPTION__LOG:
        return log != LOG_EDEFAULT;
      case LcDslPackage.CLEAR_OPTION__NO_ASK_CLEAR:
        return noAskClear != NO_ASK_CLEAR_EDEFAULT;
      case LcDslPackage.CLEAR_OPTION__CONFIG:
        return config != CONFIG_EDEFAULT;
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
    result.append(" (workspace: ");
    result.append(workspace);
    result.append(", log: ");
    result.append(log);
    result.append(", noAskClear: ");
    result.append(noAskClear);
    result.append(", config: ");
    result.append(config);
    result.append(')');
    return result.toString();
  }

} //ClearOptionImpl