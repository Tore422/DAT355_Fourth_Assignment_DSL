/**
 */
package my.dsl.engineignition;

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
 *   <li>{@link my.dsl.engineignition.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link my.dsl.engineignition.State#getIncomming <em>Incomming</em>}</li>
 * </ul>
 *
 * @see my.dsl.engineignition.EngineignitionPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link my.dsl.engineignition.Transition}.
	 * It is bidirectional and its opposite is '{@link my.dsl.engineignition.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see my.dsl.engineignition.EngineignitionPackage#getState_Outgoing()
	 * @see my.dsl.engineignition.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incomming</b></em>' reference list.
	 * The list contents are of type {@link my.dsl.engineignition.Transition}.
	 * It is bidirectional and its opposite is '{@link my.dsl.engineignition.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomming</em>' reference list.
	 * @see my.dsl.engineignition.EngineignitionPackage#getState_Incomming()
	 * @see my.dsl.engineignition.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomming();

} // State
