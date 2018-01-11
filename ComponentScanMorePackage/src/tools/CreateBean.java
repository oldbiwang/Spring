package tools;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"entity1" , "entity2"})
public class CreateBean {
	@Bean
	public Date createDate() {
		Date nowDate = new Date();
		System.out.println("createDate " + nowDate.getTime());
		return nowDate;
	}
}
