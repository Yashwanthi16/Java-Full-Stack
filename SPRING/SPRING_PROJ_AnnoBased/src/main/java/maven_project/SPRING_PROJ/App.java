package maven_project.SPRING_PROJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
    	//we must use a configuration class for annotation based spring project otherwise it throws "has not been refreshed yet" error
    	
    	Samsung s7 = context.getBean(Samsung.class);
    	s7.config();
    }
}
