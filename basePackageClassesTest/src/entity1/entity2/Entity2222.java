package entity1.entity2;

import org.springframework.stereotype.Repository;

@Repository
public class Entity2222 {
	public Entity2222() {
		System.out.println("Entity2222 构造方法执行了：" + this.hashCode());
	}
}
