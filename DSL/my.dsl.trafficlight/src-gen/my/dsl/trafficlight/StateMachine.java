/**
 */
package my.dsl.trafficlight;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link my.dsl.trafficlight.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link my.dsl.trafficlight.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link my.dsl.trafficlight.StateMachine#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see my.dsl.trafficlight.TrafficlightPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link my.dsl.trafficlight.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see my.dsl.trafficlight.TrafficlightPackage#getStateMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link my.dsl.trafficlight.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see my.dsl.trafficlight.TrafficlightPackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(State)
	 * @see my.dsl.trafficlight.TrafficlightPackage#getStateMachine_Start()
	 * @model required="true"
	 * @generated
	 */
	State getStart();

	/**
	 * Sets the value of the '{@link my.dsl.trafficlight.StateMachine#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(State value);

} // StateMachine
