package  com.springcloud.registry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudRegistry{
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRegistry.class,args);
	}
}