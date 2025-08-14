package day3;

public class Product {
	private int pid;
	private String name;
	private float price;
/*public product() {
		//default constructor
		this.pid=101;
		this.name="anbu";
		this.price=245.6f;
	}*/
	public Product(int a,String s,float p) {
		//parametrized constructorr
		this.pid=a;
		this.name=s;
		this.price=p;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	

}
