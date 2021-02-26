/**
 */
package my.dsl.shopping.impl;

import my.dsl.shopping.AddingItemEvent;
import my.dsl.shopping.RemovingItemEvent;
import my.dsl.shopping.ShoppingPackage;
import my.dsl.shopping.State;
import my.dsl.shopping.TransactionEvent;
import my.dsl.shopping.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link my.dsl.shopping.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link my.dsl.shopping.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link my.dsl.shopping.impl.TransitionImpl#getAdding <em>Adding</em>}</li>
 *   <li>{@link my.dsl.shopping.impl.TransitionImpl#getSubtracting <em>Subtracting</em>}</li>
 *   <li>{@link my.dsl.shopping.impl.TransitionImpl#getPaying <em>Paying</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getAdding() <em>Adding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdding()
	 * @generated
	 * @ordered
	 */
	protected AddingItemEvent adding;

	/**
	 * The cached value of the '{@link #getSubtracting() <em>Subtracting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtracting()
	 * @generated
	 * @ordered
	 */
	protected RemovingItemEvent subtracting;

	/**
	 * The cached value of the '{@link #getPaying() <em>Paying</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaying()
	 * @generated
	 * @ordered
	 */
	protected TransactionEvent paying;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShoppingPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (State) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppingPackage.TRANSITION__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(State newTarget, NotificationChain msgs) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShoppingPackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, ShoppingPackage.STATE__INCOMMING, State.class,
						msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, ShoppingPackage.STATE__INCOMMING, State.class,
						msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppingPackage.TRANSITION__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (State) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppingPackage.TRANSITION__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(State newSource, NotificationChain msgs) {
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShoppingPackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, ShoppingPackage.STATE__OUTGOING, State.class,
						msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, ShoppingPackage.STATE__OUTGOING, State.class,
						msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppingPackage.TRANSITION__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddingItemEvent getAdding() {
		return adding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdding(AddingItemEvent newAdding, NotificationChain msgs) {
		AddingItemEvent oldAdding = adding;
		adding = newAdding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShoppingPackage.TRANSITION__ADDING, oldAdding, newAdding);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdding(AddingItemEvent newAdding) {
		if (newAdding != adding) {
			NotificationChain msgs = null;
			if (adding != null)
				msgs = ((InternalEObject) adding).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShoppingPackage.TRANSITION__ADDING, null, msgs);
			if (newAdding != null)
				msgs = ((InternalEObject) newAdding).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShoppingPackage.TRANSITION__ADDING, null, msgs);
			msgs = basicSetAdding(newAdding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppingPackage.TRANSITION__ADDING, newAdding,
					newAdding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovingItemEvent getSubtracting() {
		return subtracting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtracting(RemovingItemEvent newSubtracting, NotificationChain msgs) {
		RemovingItemEvent oldSubtracting = subtracting;
		subtracting = newSubtracting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShoppingPackage.TRANSITION__SUBTRACTING, oldSubtracting, newSubtracting);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtracting(RemovingItemEvent newSubtracting) {
		if (newSubtracting != subtracting) {
			NotificationChain msgs = null;
			if (subtracting != null)
				msgs = ((InternalEObject) subtracting).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShoppingPackage.TRANSITION__SUBTRACTING, null, msgs);
			if (newSubtracting != null)
				msgs = ((InternalEObject) newSubtracting).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShoppingPackage.TRANSITION__SUBTRACTING, null, msgs);
			msgs = basicSetSubtracting(newSubtracting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppingPackage.TRANSITION__SUBTRACTING,
					newSubtracting, newSubtracting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionEvent getPaying() {
		return paying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaying(TransactionEvent newPaying, NotificationChain msgs) {
		TransactionEvent oldPaying = paying;
		paying = newPaying;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShoppingPackage.TRANSITION__PAYING, oldPaying, newPaying);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaying(TransactionEvent newPaying) {
		if (newPaying != paying) {
			NotificationChain msgs = null;
			if (paying != null)
				msgs = ((InternalEObject) paying).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShoppingPackage.TRANSITION__PAYING, null, msgs);
			if (newPaying != null)
				msgs = ((InternalEObject) newPaying).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShoppingPackage.TRANSITION__PAYING, null, msgs);
			msgs = basicSetPaying(newPaying, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppingPackage.TRANSITION__PAYING, newPaying,
					newPaying));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShoppingPackage.TRANSITION__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, ShoppingPackage.STATE__INCOMMING, State.class,
						msgs);
			return basicSetTarget((State) otherEnd, msgs);
		case ShoppingPackage.TRANSITION__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, ShoppingPackage.STATE__OUTGOING, State.class,
						msgs);
			return basicSetSource((State) otherEnd, msgs);
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
		case ShoppingPackage.TRANSITION__TARGET:
			return basicSetTarget(null, msgs);
		case ShoppingPackage.TRANSITION__SOURCE:
			return basicSetSource(null, msgs);
		case ShoppingPackage.TRANSITION__ADDING:
			return basicSetAdding(null, msgs);
		case ShoppingPackage.TRANSITION__SUBTRACTING:
			return basicSetSubtracting(null, msgs);
		case ShoppingPackage.TRANSITION__PAYING:
			return basicSetPaying(null, msgs);
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
		case ShoppingPackage.TRANSITION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case ShoppingPackage.TRANSITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ShoppingPackage.TRANSITION__ADDING:
			return getAdding();
		case ShoppingPackage.TRANSITION__SUBTRACTING:
			return getSubtracting();
		case ShoppingPackage.TRANSITION__PAYING:
			return getPaying();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ShoppingPackage.TRANSITION__TARGET:
			setTarget((State) newValue);
			return;
		case ShoppingPackage.TRANSITION__SOURCE:
			setSource((State) newValue);
			return;
		case ShoppingPackage.TRANSITION__ADDING:
			setAdding((AddingItemEvent) newValue);
			return;
		case ShoppingPackage.TRANSITION__SUBTRACTING:
			setSubtracting((RemovingItemEvent) newValue);
			return;
		case ShoppingPackage.TRANSITION__PAYING:
			setPaying((TransactionEvent) newValue);
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
		case ShoppingPackage.TRANSITION__TARGET:
			setTarget((State) null);
			return;
		case ShoppingPackage.TRANSITION__SOURCE:
			setSource((State) null);
			return;
		case ShoppingPackage.TRANSITION__ADDING:
			setAdding((AddingItemEvent) null);
			return;
		case ShoppingPackage.TRANSITION__SUBTRACTING:
			setSubtracting((RemovingItemEvent) null);
			return;
		case ShoppingPackage.TRANSITION__PAYING:
			setPaying((TransactionEvent) null);
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
		case ShoppingPackage.TRANSITION__TARGET:
			return target != null;
		case ShoppingPackage.TRANSITION__SOURCE:
			return source != null;
		case ShoppingPackage.TRANSITION__ADDING:
			return adding != null;
		case ShoppingPackage.TRANSITION__SUBTRACTING:
			return subtracting != null;
		case ShoppingPackage.TRANSITION__PAYING:
			return paying != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
