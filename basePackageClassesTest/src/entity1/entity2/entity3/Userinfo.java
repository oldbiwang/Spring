package entity1.entity2.entity3;

import org.springframework.stereotype.Component;

@Component 
public class Userinfo {
	public Userinfo() {
		System.out.println("Userinfo ���췽��ִ���ˣ�" + this.hashCode());
	}
}
