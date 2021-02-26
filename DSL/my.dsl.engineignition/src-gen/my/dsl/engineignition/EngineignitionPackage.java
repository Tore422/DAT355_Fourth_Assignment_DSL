/**
 */
package my.dsl.engineignition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see my.dsl.engineignition.EngineignitionFactory
 * @model kind="package"
 * @generated
 */
public interface EngineignitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "engineignition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mydsl.no/engineignition/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "engineignition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EngineignitionPackage eINSTANCE = my.dsl.engineignition.impl.EngineignitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link my.dsl.engineignition.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.dsl.engineignition.impl.NamedElementImpl
	 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link my.dsl.engineignition.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.dsl.engineignition.impl.StateMachineImpl
	 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__START = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link my.dsl.engineignition.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.dsl.engineignition.impl.StateImpl
	 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link my.dsl.engineignition.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.dsl.engineignition.impl.TransitionImpl
	 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TIMER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SENSOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link my.dsl.engineignition.impl.TimeEventImpl <em>Time Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.dsl.engineignition.impl.TimeEventImpl
	 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getTimeEvent()
	 * @generated
	 */
	int TIME_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__TIME = 0;

	/**
	 * The number of structural features of the '<em>Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link my.dsl.engineignition.impl.ThresholdEventImpl <em>Threshold Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.dsl.engineignition.impl.ThresholdEventImpl
	 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getThresholdEvent()
	 * @generated
	 */
	int THRESHOLD_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_EVENT__TEMPERATURE = 0;

	/**
	 * The number of structural features of the '<em>Threshold Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Threshold Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link my.dsl.engineignition.impl.StoppedImpl <em>Stopped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.dsl.engineignition.impl.StoppedImpl
	 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getStopped()
	 * @generated
	 */
	int STOPPED = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOPPED__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOPPED__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOPPED__INCOMMING = STATE__INCOMMING;

	/**
	 * The number of structural features of the '<em>Stopped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOPPED_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stopped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOPPED_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link my.dsl.engineignition.impl.HeatingImpl <em>Heating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.dsl.engineignition.impl.HeatingImpl
	 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getHeating()
	 * @generated
	 */
	int HEATING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATING__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATING__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATING__INCOMMING = STATE__INCOMMING;

	/**
	 * The number of structural features of the '<em>Heating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATING_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Heating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATING_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link my.dsl.engineignition.impl.RunningImpl <em>Running</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.dsl.engineignition.impl.RunningImpl
	 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getRunning()
	 * @generated
	 */
	int RUNNING = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING__INCOMMING = STATE__INCOMMING;

	/**
	 * The number of structural features of the '<em>Running</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Running</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link my.dsl.engineignition.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see my.dsl.engineignition.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link my.dsl.engineignition.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see my.dsl.engineignition.StateMachine#getTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link my.dsl.engineignition.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see my.dsl.engineignition.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the reference '{@link my.dsl.engineignition.StateMachine#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see my.dsl.engineignition.StateMachine#getStart()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Start();

	/**
	 * Returns the meta object for class '{@link my.dsl.engineignition.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see my.dsl.engineignition.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link my.dsl.engineignition.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see my.dsl.engineignition.State#getOutgoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link my.dsl.engineignition.State#getIncomming <em>Incomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomming</em>'.
	 * @see my.dsl.engineignition.State#getIncomming()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incomming();

	/**
	 * Returns the meta object for class '{@link my.dsl.engineignition.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see my.dsl.engineignition.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link my.dsl.engineignition.Transition#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer</em>'.
	 * @see my.dsl.engineignition.Transition#getTimer()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Timer();

	/**
	 * Returns the meta object for the containment reference '{@link my.dsl.engineignition.Transition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensor</em>'.
	 * @see my.dsl.engineignition.Transition#getSensor()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Sensor();

	/**
	 * Returns the meta object for the reference '{@link my.dsl.engineignition.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see my.dsl.engineignition.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link my.dsl.engineignition.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see my.dsl.engineignition.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link my.dsl.engineignition.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see my.dsl.engineignition.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link my.dsl.engineignition.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see my.dsl.engineignition.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link my.dsl.engineignition.TimeEvent <em>Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Event</em>'.
	 * @see my.dsl.engineignition.TimeEvent
	 * @generated
	 */
	EClass getTimeEvent();

	/**
	 * Returns the meta object for the attribute '{@link my.dsl.engineignition.TimeEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see my.dsl.engineignition.TimeEvent#getTime()
	 * @see #getTimeEvent()
	 * @generated
	 */
	EAttribute getTimeEvent_Time();

	/**
	 * Returns the meta object for class '{@link my.dsl.engineignition.ThresholdEvent <em>Threshold Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold Event</em>'.
	 * @see my.dsl.engineignition.ThresholdEvent
	 * @generated
	 */
	EClass getThresholdEvent();

	/**
	 * Returns the meta object for the attribute '{@link my.dsl.engineignition.ThresholdEvent#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see my.dsl.engineignition.ThresholdEvent#getTemperature()
	 * @see #getThresholdEvent()
	 * @generated
	 */
	EAttribute getThresholdEvent_Temperature();

	/**
	 * Returns the meta object for class '{@link my.dsl.engineignition.Stopped <em>Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stopped</em>'.
	 * @see my.dsl.engineignition.Stopped
	 * @generated
	 */
	EClass getStopped();

	/**
	 * Returns the meta object for class '{@link my.dsl.engineignition.Heating <em>Heating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heating</em>'.
	 * @see my.dsl.engineignition.Heating
	 * @generated
	 */
	EClass getHeating();

	/**
	 * Returns the meta object for class '{@link my.dsl.engineignition.Running <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Running</em>'.
	 * @see my.dsl.engineignition.Running
	 * @generated
	 */
	EClass getRunning();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EngineignitionFactory getEngineignitionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link my.dsl.engineignition.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.dsl.engineignition.impl.StateMachineImpl
		 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITIONS = eINSTANCE.getStateMachine_Transitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__START = eINSTANCE.getStateMachine_Start();

		/**
		 * The meta object literal for the '{@link my.dsl.engineignition.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.dsl.engineignition.impl.StateImpl
		 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING = eINSTANCE.getState_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incomming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMMING = eINSTANCE.getState_Incomming();

		/**
		 * The meta object literal for the '{@link my.dsl.engineignition.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.dsl.engineignition.impl.TransitionImpl
		 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TIMER = eINSTANCE.getTransition_Timer();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SENSOR = eINSTANCE.getTransition_Sensor();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link my.dsl.engineignition.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.dsl.engineignition.impl.NamedElementImpl
		 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link my.dsl.engineignition.impl.TimeEventImpl <em>Time Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.dsl.engineignition.impl.TimeEventImpl
		 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getTimeEvent()
		 * @generated
		 */
		EClass TIME_EVENT = eINSTANCE.getTimeEvent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_EVENT__TIME = eINSTANCE.getTimeEvent_Time();

		/**
		 * The meta object literal for the '{@link my.dsl.engineignition.impl.ThresholdEventImpl <em>Threshold Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.dsl.engineignition.impl.ThresholdEventImpl
		 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getThresholdEvent()
		 * @generated
		 */
		EClass THRESHOLD_EVENT = eINSTANCE.getThresholdEvent();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_EVENT__TEMPERATURE = eINSTANCE.getThresholdEvent_Temperature();

		/**
		 * The meta object literal for the '{@link my.dsl.engineignition.impl.StoppedImpl <em>Stopped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.dsl.engineignition.impl.StoppedImpl
		 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getStopped()
		 * @generated
		 */
		EClass STOPPED = eINSTANCE.getStopped();

		/**
		 * The meta object literal for the '{@link my.dsl.engineignition.impl.HeatingImpl <em>Heating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.dsl.engineignition.impl.HeatingImpl
		 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getHeating()
		 * @generated
		 */
		EClass HEATING = eINSTANCE.getHeating();

		/**
		 * The meta object literal for the '{@link my.dsl.engineignition.impl.RunningImpl <em>Running</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.dsl.engineignition.impl.RunningImpl
		 * @see my.dsl.engineignition.impl.EngineignitionPackageImpl#getRunning()
		 * @generated
		 */
		EClass RUNNING = eINSTANCE.getRunning();

	}

} //EngineignitionPackage
