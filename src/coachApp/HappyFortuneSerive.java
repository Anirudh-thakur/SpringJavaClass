package coachApp;

import org.springframework.stereotype.Component;

@Component("HappyService")
public class HappyFortuneSerive implements DailyFortune {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky Day";
	}

}
