package SBasic.AnnotationIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext context = new
        		ClassPathXmlApplicationContext("SBasic\\AnnotationIOC\\applicationContext.xml");
        
        Coach obj = context.getBean(Coach.class);
        System.out.println("HashCode Obj:" + obj.hashCode());
        System.out.println(obj.getDailyWorkouts() );
        
        System.out.println(obj.getOwnedCarModel());
        System.out.println(obj.getindicamodel());
        
        Coach obj1 = context.getBean(Coach.class);
        System.out.println("HashCode Obj1:" + obj1.hashCode());
        System.out.println(obj1.getDailyWorkouts() ); 
        System.out.println(obj1.getOwnedCarModel());
        System.out.println(obj1.getindicamodel());
        context.close();
        		
	}

}