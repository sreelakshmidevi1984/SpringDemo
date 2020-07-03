package SBasic.AnnotationIOC;

import org.springframework.stereotype.Component;

@Component
public class IndicaModel implements Vehicle {

	@Override
	public String carModel() {
		// TODO Auto-generated method stub
		return "IndicaModel";
	}

}
