/**
 */
package my.dsl.engineignition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link my.dsl.engineignition.Transition#getTimer <em>Timer</em>}</li>
 *   <li>{@link my.dsl.engineignition.Transition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link my.dsl.engineignition.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link my.dsl.engineignition.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see my.dsl.engineignition.EngineignitionPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' containment reference.
	 * @see #setTimer(TimeEvent)
	 * @see my.dsl.engineignition.EngineignitionPackage#getTransition_Timer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeEvent getTimer();

	/**
	 * Sets the value of the '{@link my.dsl.engineignition.Transition#getTimer <em>Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' containment reference.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(TimeEvent value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference.
	 * @see #setSensor(ThresholdEvent)
	 * @see my.dsl.engineignition.EngineignitionPackage#getTransition_Sensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ThresholdEvent getSensor();

	/**
	 * Sets the value of the '{@link my.dsl.engineignition.Transition#getSensor <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' containment reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(ThresholdEvent value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link my.dsl.engineignition.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see my.dsl.engineignition.EngineignitionPackage#getTransition_Source()
	 * @see my.dsl.engineignition.State#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link my.dsl.engineignition.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link my.dsl.engineignition.State#getIncomming <em>Incomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see my.dsl.engineignition.EngineignitionPackage#getTransition_Target()
	 * @see my.dsl.engineignition.State#getIncomming
	 * @model opposite="incomming" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link my.dsl.engineignition.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

} // Transition
