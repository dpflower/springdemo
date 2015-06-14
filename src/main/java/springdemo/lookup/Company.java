package springdemo.lookup;

public abstract class Company {
	public abstract Person createPerson();
    public void meet() {
        Person person = createPerson();
        person.sayHello();
    }
}
