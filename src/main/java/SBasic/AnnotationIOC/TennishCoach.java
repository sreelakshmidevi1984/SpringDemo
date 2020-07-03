package SBasic.AnnotationIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennishCoach implements Coach {
//	@Autowired

	private Vehicle obj1;

	private Vehicle obj2;
	
	/* Constructor  Injection */
    
	@Autowired
	public TennishCoach(@Qualifier("indicaModel") Vehicle obj) {
		 obj2 = obj;
	}

	public TennishCoach() {
		System.out.println("default constructor");
	}
	
	@Autowired
	@Qualifier("ritzModel")
	public void setVehicleObj(Vehicle obj) {
		System.out.println("Setter Injection is called");
		this.obj1= obj;
	}
	
	@Override
	public String getDailyWorkouts() {
		// TODO Auto-generated method stub
		return "100 min work out";
	}

	@Override
	public String getOwnedCarModel() {
		// TODO Auto-generated method stub
		return obj1.carModel();
	}
	@Override
	public String getindicamodel() {
		return obj2.carModel();
		
	}
  
}
