package maven_project.SPRING_PROJ;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements MobileProcessor {

	public void processor() {

		System.out.println("you are using xxx version of snadragon");
		
	}

}
