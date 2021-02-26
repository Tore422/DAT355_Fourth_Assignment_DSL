/**
 */
package my.dsl.engineignition.impl;

import java.util.Collection;

import my.dsl.engineignition.EngineignitionPackage;
import my.dsl.engineignition.State;
import my.dsl.engineignition.Transition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link my.dsl.engineignition.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link my.dsl.engineignition.impl.StateImpl#getIncomming <em>Incomming</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NamedElementImpl implements State {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The cached value of the '{@link #getIncomming() <em>Incomming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineignitionPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					EngineignitionPackage.STATE__OUTGOING, EngineignitionPackage.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomming() {
		if (incomming == null) {
			incomming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					EngineignitionPackage.STATE__INCOMMING, EngineignitionPackage.TRANSITION__TARGET);
		}
		return incomming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EngineignitionPackage.STATE__OUTGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd(otherEnd, msgs);
		case EngineignitionPackage.STATE__INCOMMING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomming()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EngineignitionPackage.STATE__OUTGOING:
			return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd, msgs);
		case EngineignitionPackage.STATE__INCOMMING:
			return ((InternalEList<?>) getIncomming()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EngineignitionPackage.STATE__OUTGOING:
			return getOutgoing();
		case EngineignitionPackage.STATE__INCOMMING:
			return getIncomming();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EngineignitionPackage.STATE__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll((Collection<? extends Transition>) newValue);
			return;
		case EngineignitionPackage.STATE__INCOMMING:
			getIncomming().clear();
			getIncomming().addAll((Collection<? extends Transition>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EngineignitionPackage.STATE__OUTGOING:
			getOutgoing().clear();
			return;
		case EngineignitionPackage.STATE__INCOMMING:
			getIncomming().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EngineignitionPackage.STATE__OUTGOING:
			return outgoing != null && !outgoing.isEmpty();
		case EngineignitionPackage.STATE__INCOMMING:
			return incomming != null && !incomming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
