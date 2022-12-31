package maven_project.SPRING_PROJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("exynos")
	private MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa Core,4GB RAM,12MP camera");
		cpu.processor();
	}
	@Override
	public String toString() {
		return "Samsung [cpu=" + cpu + "]";
	}
	
	
}
