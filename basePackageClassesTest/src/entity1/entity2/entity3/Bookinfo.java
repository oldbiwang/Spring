package entity1.entity2.entity3;

import org.springframework.stereotype.Repository;

@Repository
public class Bookinfo {
	public Bookinfo() {
		System.out.println("Bookinfo 的构造方法被调用了 " + this.hashCode());
	}
}
