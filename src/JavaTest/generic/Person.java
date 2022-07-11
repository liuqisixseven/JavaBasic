package JavaTest.generic;

public class Person <T extends Info>{
	private T info;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Person [info=" + info + "]";
	}

	public Person(T info) {
		super();
		this.info = info;
	}
	
}
