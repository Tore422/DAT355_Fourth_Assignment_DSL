/**
 */
package my.dsl.engineignition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link my.dsl.engineignition.ThresholdEvent#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see my.dsl.engineignition.EngineignitionPackage#getThresholdEvent()
 * @model
 * @generated
 */
public interface ThresholdEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(int)
	 * @see my.dsl.engineignition.EngineignitionPackage#getThresholdEvent_Temperature()
	 * @model
	 * @generated
	 */
	int getTemperature();

	/**
	 * Sets the value of the '{@link my.dsl.engineignition.ThresholdEvent#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(int value);

} // ThresholdEvent
