package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tools.CreateBean;

public class Test4 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CreateBean.class);
	}
}
