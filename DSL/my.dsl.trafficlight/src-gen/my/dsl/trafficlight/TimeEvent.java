/**
 */
package my.dsl.trafficlight;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link my.dsl.trafficlight.TimeEvent#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see my.dsl.trafficlight.TrafficlightPackage#getTimeEvent()
 * @model
 * @generated
 */
public interface TimeEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see my.dsl.trafficlight.TrafficlightPackage#getTimeEvent_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link my.dsl.trafficlight.TimeEvent#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // TimeEvent
