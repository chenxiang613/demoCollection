package just4test.io;

import java.io.Serializable;

import lombok.Data;

/**
 * @author cx
 * @version 1.0 V
 */
@Data
public class Person implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;
    private int age;
    private String name;
    private String sex;
    private String nation;
    
	public Person(int age, String name, String sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	
	public Person() {
		super();
	}
    
}