/**
 */
package my.dsl.shopping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link my.dsl.shopping.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link my.dsl.shopping.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link my.dsl.shopping.Transition#getAdding <em>Adding</em>}</li>
 *   <li>{@link my.dsl.shopping.Transition#getSubtracting <em>Subtracting</em>}</li>
 *   <li>{@link my.dsl.shopping.Transition#getPaying <em>Paying</em>}</li>
 * </ul>
 *
 * @see my.dsl.shopping.ShoppingPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link my.dsl.shopping.State#getIncomming <em>Incomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see my.dsl.shopping.ShoppingPackage#getTransition_Target()
	 * @see my.dsl.shopping.State#getIncomming
	 * @model opposite="incomming" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link my.dsl.shopping.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link my.dsl.shopping.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see my.dsl.shopping.ShoppingPackage#getTransition_Source()
	 * @see my.dsl.shopping.State#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link my.dsl.shopping.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Adding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adding</em>' containment reference.
	 * @see #setAdding(AddingItemEvent)
	 * @see my.dsl.shopping.ShoppingPackage#getTransition_Adding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AddingItemEvent getAdding();

	/**
	 * Sets the value of the '{@link my.dsl.shopping.Transition#getAdding <em>Adding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adding</em>' containment reference.
	 * @see #getAdding()
	 * @generated
	 */
	void setAdding(AddingItemEvent value);

	/**
	 * Returns the value of the '<em><b>Subtracting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtracting</em>' containment reference.
	 * @see #setSubtracting(RemovingItemEvent)
	 * @see my.dsl.shopping.ShoppingPackage#getTransition_Subtracting()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RemovingItemEvent getSubtracting();

	/**
	 * Sets the value of the '{@link my.dsl.shopping.Transition#getSubtracting <em>Subtracting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtracting</em>' containment reference.
	 * @see #getSubtracting()
	 * @generated
	 */
	void setSubtracting(RemovingItemEvent value);

	/**
	 * Returns the value of the '<em><b>Paying</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paying</em>' containment reference.
	 * @see #setPaying(TransactionEvent)
	 * @see my.dsl.shopping.ShoppingPackage#getTransition_Paying()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransactionEvent getPaying();

	/**
	 * Sets the value of the '{@link my.dsl.shopping.Transition#getPaying <em>Paying</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paying</em>' containment reference.
	 * @see #getPaying()
	 * @generated
	 */
	void setPaying(TransactionEvent value);

} // Transition
