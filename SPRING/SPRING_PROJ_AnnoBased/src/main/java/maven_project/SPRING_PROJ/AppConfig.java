package maven_project.SPRING_PROJ;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "maven_project.SPRING_PROJ")
public class AppConfig {

//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//	not needed if we are using component scan
	
}
