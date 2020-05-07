package coachApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("TennisCoach")
//@Scope("prototype")
public class TennisCoach implements MyCoach{
	
	private DailyFortune fortuneService;
	
	public TennisCoach()
	{
		System.out.println("Inside constructor!");
	}
	/*
	//annotation for dependency injection 
    @Autowired
	public TennisCoach(HappyFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
    */
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your back hand volley";
	}

    @Autowired
    @Qualifier("HappyService")
	public void setFortuneService(DailyFortune fortuneService) {
    	System.out.println("Inside Setter!");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	//creating init and destroy methods 
	@PostConstruct()
	public static void doStuffonInitialisation()
	{
		System.out.println("Inside init method");
	}
    
	@PreDestroy()
	public static void doStuffBeforeDestroy()
	{
		System.out.println("Inside destroy method");
	}

}
