package entity1.entity2.entity3;

import org.springframework.stereotype.Repository;

@Repository
public class Bookinfo {
	public Bookinfo() {
		System.out.println("Bookinfo �Ĺ��췽���������� " + this.hashCode());
	}
}
