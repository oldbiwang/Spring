package tools.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Userinfo {
	public Userinfo() {
		System.out.println("tools.entity.Userinfo 构造方法执行了：" + this.hashCode());
	}
}
