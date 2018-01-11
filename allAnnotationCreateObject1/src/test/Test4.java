package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entity.Userinfo;

public class Test4 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("tools");
		//Userinfo userinfo = context.getBean(Userinfo.class);
		Userinfo userinfo1 = (Userinfo)context.getBean("userinfo1");
		Userinfo userinfo2 = (Userinfo)context.getBean("userinfo2");
		System.out.println("main userinfo1 = " + userinfo1);
		System.out.println("main userinfo2 = " + userinfo2);
	}
}

