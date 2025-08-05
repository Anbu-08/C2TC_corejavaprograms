package prefer;


public class Emp {
	private int age;
	private String s;
	private float f;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", s=" + s + ", f=" + f + "]";
	}
	
	

}
