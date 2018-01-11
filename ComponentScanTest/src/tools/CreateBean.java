package tools;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Userinfo;

@Configuration
public class CreateBean {
	@Bean(name = "userinfo1")
	public Userinfo getUserinfo() {
		Userinfo userinfo1 = new Userinfo();
		System.out.println("���� userinfo1 = " + userinfo1);
		return userinfo1;
	}
	
	@Bean(name = "userinfo2")
	public Userinfo createUserinfo() {
		Userinfo userinfo2 = new Userinfo();
		System.out.println("���� userinfo2 = " + userinfo2);
		return userinfo2;
	}
}
