package my.dsl.engineignition.design;

import org.eclipse.emf.ecore.EObject;

import my.dsl.engineignition.Transition;

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
	
	
	
	public String getTransitionValue(Transition transition) {
		if (transition.getTimer() == null) {
			return Integer.toString(transition.getSensor().getTemperature());
		} else {
			return Integer.toString(transition.getTimer().getTime());
		}
	}
	
	
	
}
