/**
 */
package my.dsl.shopping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link my.dsl.shopping.TransactionEvent#getSum <em>Sum</em>}</li>
 * </ul>
 *
 * @see my.dsl.shopping.ShoppingPackage#getTransactionEvent()
 * @model
 * @generated
 */
public interface TransactionEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum</em>' attribute.
	 * @see #setSum(int)
	 * @see my.dsl.shopping.ShoppingPackage#getTransactionEvent_Sum()
	 * @model
	 * @generated
	 */
	int getSum();

	/**
	 * Sets the value of the '{@link my.dsl.shopping.TransactionEvent#getSum <em>Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sum</em>' attribute.
	 * @see #getSum()
	 * @generated
	 */
	void setSum(int value);

} // TransactionEvent
