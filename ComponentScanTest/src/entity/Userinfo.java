package entity;

//@Component 不用这个注解，因为不是通过组件扫描的方式
public class Userinfo {
	public Userinfo() {
		System.out.println("Userinfo 构造方法执行了：" + this);
	}
}
