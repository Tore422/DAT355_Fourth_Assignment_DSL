/**
 */
package my.dsl.engineignition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see my.dsl.engineignition.EngineignitionPackage
 * @generated
 */
public interface EngineignitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EngineignitionFactory eINSTANCE = my.dsl.engineignition.impl.EngineignitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Event</em>'.
	 * @generated
	 */
	TimeEvent createTimeEvent();

	/**
	 * Returns a new object of class '<em>Threshold Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threshold Event</em>'.
	 * @generated
	 */
	ThresholdEvent createThresholdEvent();

	/**
	 * Returns a new object of class '<em>Stopped</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stopped</em>'.
	 * @generated
	 */
	Stopped createStopped();

	/**
	 * Returns a new object of class '<em>Heating</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heating</em>'.
	 * @generated
	 */
	Heating createHeating();

	/**
	 * Returns a new object of class '<em>Running</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Running</em>'.
	 * @generated
	 */
	Running createRunning();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EngineignitionPackage getEngineignitionPackage();

} //EngineignitionFactory
