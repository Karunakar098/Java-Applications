package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = null;
		try(FileInputStream fis = new FileInputStream("person.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			person = (Person) ois.readObject();
			
		}
		catch(IOException io) {
			System.out.println(io);
		}
		System.out.println("Deserialized person :::::");
		System.out.println(person);
	}

}
