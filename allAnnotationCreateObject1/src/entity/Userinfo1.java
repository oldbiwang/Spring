package entity;

import org.springframework.stereotype.Repository;

@Repository
public class Userinfo1 {
	public Userinfo1() {
		System.out.println("Userinfo1 构造方法执行了：" + this);
	}
}
