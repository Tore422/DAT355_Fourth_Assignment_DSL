/**
 */
package my.dsl.shopping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link my.dsl.shopping.State#getIncomming <em>Incomming</em>}</li>
 *   <li>{@link my.dsl.shopping.State#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see my.dsl.shopping.ShoppingPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incomming</b></em>' reference list.
	 * The list contents are of type {@link my.dsl.shopping.Transition}.
	 * It is bidirectional and its opposite is '{@link my.dsl.shopping.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomming</em>' reference list.
	 * @see my.dsl.shopping.ShoppingPackage#getState_Incomming()
	 * @see my.dsl.shopping.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link my.dsl.shopping.Transition}.
	 * It is bidirectional and its opposite is '{@link my.dsl.shopping.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see my.dsl.shopping.ShoppingPackage#getState_Outgoing()
	 * @see my.dsl.shopping.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

} // State
