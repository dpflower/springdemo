package springdemo.lookup;

import java.util.Random;

public class Person {
	 private String[] names = { "Tom", "Jake", "Mary", "Cook", "Ban", "Are" };
	    private String name;
	    public Person() {
	        this.name = names[new Random().nextInt(6)];
	    }
	    public void sayHello() {
	        System.out.println("Hello, I'm " + name);
	    }
}
