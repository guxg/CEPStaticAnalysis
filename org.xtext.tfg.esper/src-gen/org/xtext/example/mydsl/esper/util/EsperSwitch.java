/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.esper.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.esper.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.esper.EsperPackage
 * @generated
 */
public class EsperSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EsperPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsperSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EsperPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EsperPackage.DOMAINMODEL:
      {
        Domainmodel domainmodel = (Domainmodel)theEObject;
        T result = caseDomainmodel(domainmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseKindOfEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.ATTRIBUTES:
      {
        Attributes attributes = (Attributes)theEObject;
        T result = caseAttributes(attributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.ATTRIBUTES_DEFINITION:
      {
        AttributesDefinition attributesDefinition = (AttributesDefinition)theEObject;
        T result = caseAttributesDefinition(attributesDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.RULE_PARTS:
      {
        RuleParts ruleParts = (RuleParts)theEObject;
        T result = caseRuleParts(ruleParts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.INSERT:
      {
        Insert insert = (Insert)theEObject;
        T result = caseInsert(insert);
        if (result == null) result = caseKindOfEvent(insert);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.PRIORITY:
      {
        Priority priority = (Priority)theEObject;
        T result = casePriority(priority);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.SELECT:
      {
        Select select = (Select)theEObject;
        T result = caseSelect(select);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.KIND_SELECT_ATTRIBUTES_DEFINITION:
      {
        KindSelectAttributesDefinition kindSelectAttributesDefinition = (KindSelectAttributesDefinition)theEObject;
        T result = caseKindSelectAttributesDefinition(kindSelectAttributesDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.SELECT_ATTRIBUTES_DEFINITION:
      {
        SelectAttributesDefinition selectAttributesDefinition = (SelectAttributesDefinition)theEObject;
        T result = caseSelectAttributesDefinition(selectAttributesDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.SINGLE_SELECT_DEFINITION:
      {
        SingleSelectDefinition singleSelectDefinition = (SingleSelectDefinition)theEObject;
        T result = caseSingleSelectDefinition(singleSelectDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.FROM:
      {
        From from = (From)theEObject;
        T result = caseFrom(from);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.JOIN_FOLLOW_BY:
      {
        JoinFollowBy joinFollowBy = (JoinFollowBy)theEObject;
        T result = caseJoinFollowBy(joinFollowBy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.ABSTRACT_FOLLOW_BY:
      {
        AbstractFollowBy abstractFollowBy = (AbstractFollowBy)theEObject;
        T result = caseAbstractFollowBy(abstractFollowBy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.FOLLOW_BY:
      {
        FollowBy followBy = (FollowBy)theEObject;
        T result = caseFollowBy(followBy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.TERMINAL_EXPRESSION:
      {
        TerminalExpression terminalExpression = (TerminalExpression)theEObject;
        T result = caseTerminalExpression(terminalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.KIND_OF_EVENT:
      {
        KindOfEvent kindOfEvent = (KindOfEvent)theEObject;
        T result = caseKindOfEvent(kindOfEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.SINGLE_DEFINITION:
      {
        SingleDefinition singleDefinition = (SingleDefinition)theEObject;
        T result = caseSingleDefinition(singleDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.WIN:
      {
        Win win = (Win)theEObject;
        T result = caseWin(win);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.FOLLOW_BY_WHERE:
      {
        FollowByWhere followByWhere = (FollowByWhere)theEObject;
        T result = caseFollowByWhere(followByWhere);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.TIMER:
      {
        Timer timer = (Timer)theEObject;
        T result = caseTimer(timer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.GROUP_BY:
      {
        GroupBy groupBy = (GroupBy)theEObject;
        T result = caseGroupBy(groupBy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.HAVING:
      {
        Having having = (Having)theEObject;
        T result = caseHaving(having);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.DEFAULT_METHODS:
      {
        DefaultMethods defaultMethods = (DefaultMethods)theEObject;
        T result = caseDefaultMethods(defaultMethods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.ANYTHING:
      {
        Anything anything = (Anything)theEObject;
        T result = caseAnything(anything);
        if (result == null) result = caseExtraParenthesisRule(anything);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsperPackage.EXTRA_PARENTHESIS_RULE:
      {
        ExtraParenthesisRule extraParenthesisRule = (ExtraParenthesisRule)theEObject;
        T result = caseExtraParenthesisRule(extraParenthesisRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainmodel(Domainmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributes(Attributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attributes Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attributes Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributesDefinition(AttributesDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Parts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Parts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleParts(RuleParts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsert(Insert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Priority</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Priority</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePriority(Priority object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelect(Select object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kind Select Attributes Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kind Select Attributes Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKindSelectAttributesDefinition(KindSelectAttributesDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Attributes Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Attributes Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectAttributesDefinition(SelectAttributesDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Select Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Select Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleSelectDefinition(SingleSelectDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrom(From object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join Follow By</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join Follow By</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoinFollowBy(JoinFollowBy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Follow By</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Follow By</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractFollowBy(AbstractFollowBy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Follow By</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Follow By</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFollowBy(FollowBy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalExpression(TerminalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kind Of Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kind Of Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKindOfEvent(KindOfEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleDefinition(SingleDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Win</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Win</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWin(Win object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Follow By Where</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Follow By Where</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFollowByWhere(FollowByWhere object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimer(Timer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group By</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group By</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupBy(GroupBy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Having</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Having</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHaving(Having object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Methods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Methods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultMethods(DefaultMethods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anything</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anything</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnything(Anything object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extra Parenthesis Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extra Parenthesis Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtraParenthesisRule(ExtraParenthesisRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EsperSwitch
