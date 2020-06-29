package demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BadmintonCoach implements Coach {

	public BadmintonCoach() {
		System.out.println(">> BadmintonCoach : Constructor is called");
	}
	
	@Override
	public String getDailyWorkout() {
		return "In Badminton : Practice Badminton smash 2 hours a day";
	}
	
	// define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> BadmintonCoach : Inside doMyStartupStuff()");
	}
	
	// define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> BadmintonCoach : Inside doMyCleanupStuff()");
	}
}
