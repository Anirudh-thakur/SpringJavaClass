package coachApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
	
	public static void main(String arg[])throws Exception
	{
		//Create spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//call bean 
		MyCoach myCoach = context.getBean("TennisCoach",MyCoach.class);
		
		// call function using bean
		System.out.println(myCoach.getDailyWorkout());
		
		
		//Dependency injection
		System.out.println(myCoach.getFortune());
		
		//clossing context in variable
		context.close();
		
	}

}
