/**
 */
package my.dsl.trafficlight;

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
 *   <li>{@link my.dsl.trafficlight.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link my.dsl.trafficlight.State#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see my.dsl.trafficlight.TrafficlightPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link my.dsl.trafficlight.Transition}.
	 * It is bidirectional and its opposite is '{@link my.dsl.trafficlight.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see my.dsl.trafficlight.TrafficlightPackage#getState_Outgoing()
	 * @see my.dsl.trafficlight.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link my.dsl.trafficlight.Transition}.
	 * It is bidirectional and its opposite is '{@link my.dsl.trafficlight.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see my.dsl.trafficlight.TrafficlightPackage#getState_Incoming()
	 * @see my.dsl.trafficlight.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

} // State
