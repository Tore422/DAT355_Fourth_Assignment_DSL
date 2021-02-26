package my.dsl.trafficlight.design;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import my.dsl.trafficlight.State;
import my.dsl.trafficlight.StateMachine;
import my.dsl.trafficlight.Transition;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }*/
    
    
    public State getNextState(State currentState) {
  //  	State parentState = (State) currentState.eContainer();
  //  	return parentState.getIncoming().get(0);
    	
    	//    	StateMachine parentMachine = (StateMachine) currentState.eContainer();
//    	return parentMachine.getTransitions().get(0);
    	//    	return currentState.getIncoming().get(0);
//    	return currentState.getOutgoing().get(1);
    	
    	
    	/*
    	StateMachine parentMachine = (StateMachine) currentState.eContainer();
    	List<Transition> transitions = parentMachine.getTransitions();
    	Transition currentTransition = currentState.getOutgoing().get(0);
    	int position = transitions.indexOf(currentTransition);
    	if (position == transitions.size() - 1) {
    		return null;
    	} else {
    		return transitions.get(position + 1);
    	}*/
    	
    	
    	
    	StateMachine parentMachine = (StateMachine) currentState.eContainer();
    	List<State> states = parentMachine.getStates();
    	int position = states.indexOf(currentState);
    	if (position == states.size() - 1) {
    		return null;
    	} else {
    		return states.get(position + 1);
    	}
    	
    	
    }
    
    
    
    
}
