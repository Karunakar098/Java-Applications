package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		Person person = new Person("sam", 22, "secret");
		try(FileOutputStream fos = new FileOutputStream("person.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			// serializing a person object
			oos.writeObject(person);
			System.out.println("Serialized data is in person");
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		
		
	}

}
