/**
 */
package my.dsl.shopping.impl;

import my.dsl.shopping.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShoppingFactoryImpl extends EFactoryImpl implements ShoppingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShoppingFactory init() {
		try {
			ShoppingFactory theShoppingFactory = (ShoppingFactory) EPackage.Registry.INSTANCE
					.getEFactory(ShoppingPackage.eNS_URI);
			if (theShoppingFactory != null) {
				return theShoppingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShoppingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShoppingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ShoppingPackage.TRANSITION:
			return createTransition();
		case ShoppingPackage.STATE:
			return createState();
		case ShoppingPackage.STATE_MACHINE:
			return createStateMachine();
		case ShoppingPackage.ADDING_ITEM_EVENT:
			return createAddingItemEvent();
		case ShoppingPackage.REMOVING_ITEM_EVENT:
			return createRemovingItemEvent();
		case ShoppingPackage.TRANSACTION_EVENT:
			return createTransactionEvent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddingItemEvent createAddingItemEvent() {
		AddingItemEventImpl addingItemEvent = new AddingItemEventImpl();
		return addingItemEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovingItemEvent createRemovingItemEvent() {
		RemovingItemEventImpl removingItemEvent = new RemovingItemEventImpl();
		return removingItemEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionEvent createTransactionEvent() {
		TransactionEventImpl transactionEvent = new TransactionEventImpl();
		return transactionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShoppingPackage getShoppingPackage() {
		return (ShoppingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShoppingPackage getPackage() {
		return ShoppingPackage.eINSTANCE;
	}

} //ShoppingFactoryImpl
