
public class Person {
	
	public String name;
	public Age age;
	@Override
	
	
	public String toString() {
		return "I am " + name + ", and I am " + age + " years old";
	}
	
	
	public Person(String name, int years, int months, int days) {
		super();
		this.name = name;
		this.age = new Age(years, months, days);
	}
	
	

}
