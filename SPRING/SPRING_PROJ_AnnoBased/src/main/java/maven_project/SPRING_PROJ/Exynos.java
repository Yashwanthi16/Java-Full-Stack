package maven_project.SPRING_PROJ;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Exynos implements MobileProcessor {

	public void processor() {
		
		System.out.println("you are using yyy version of exynos");
	}

}
