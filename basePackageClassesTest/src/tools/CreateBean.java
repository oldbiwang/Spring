package tools;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import entity1.entity2.Entity2222;
import entity1.entity2.entity3.Userinfo;


@Configuration
//@ComponentScan(basePackageClasses = { Entity2222.class, Userinfo.class})
@ComponentScan(basePackageClasses = { Userinfo.class})
@ComponentScan(basePackageClasses = { Entity2222.class})

public class CreateBean {
	@Bean
	public Date createDate() {
		Date nowDate = new Date();
		System.out.println("createDate " + nowDate.getTime());
		return nowDate;
	}
}
