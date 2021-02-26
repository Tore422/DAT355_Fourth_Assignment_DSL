/**
 */
package my.dsl.engineignition.impl;

import my.dsl.engineignition.*;

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
public class EngineignitionFactoryImpl extends EFactoryImpl implements EngineignitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EngineignitionFactory init() {
		try {
			EngineignitionFactory theEngineignitionFactory = (EngineignitionFactory) EPackage.Registry.INSTANCE
					.getEFactory(EngineignitionPackage.eNS_URI);
			if (theEngineignitionFactory != null) {
				return theEngineignitionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EngineignitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineignitionFactoryImpl() {
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
		case EngineignitionPackage.STATE_MACHINE:
			return createStateMachine();
		case EngineignitionPackage.STATE:
			return createState();
		case EngineignitionPackage.TRANSITION:
			return createTransition();
		case EngineignitionPackage.TIME_EVENT:
			return createTimeEvent();
		case EngineignitionPackage.THRESHOLD_EVENT:
			return createThresholdEvent();
		case EngineignitionPackage.STOPPED:
			return createStopped();
		case EngineignitionPackage.HEATING:
			return createHeating();
		case EngineignitionPackage.RUNNING:
			return createRunning();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
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
	public TimeEvent createTimeEvent() {
		TimeEventImpl timeEvent = new TimeEventImpl();
		return timeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThresholdEvent createThresholdEvent() {
		ThresholdEventImpl thresholdEvent = new ThresholdEventImpl();
		return thresholdEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stopped createStopped() {
		StoppedImpl stopped = new StoppedImpl();
		return stopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heating createHeating() {
		HeatingImpl heating = new HeatingImpl();
		return heating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Running createRunning() {
		RunningImpl running = new RunningImpl();
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineignitionPackage getEngineignitionPackage() {
		return (EngineignitionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EngineignitionPackage getPackage() {
		return EngineignitionPackage.eINSTANCE;
	}

} //EngineignitionFactoryImpl
