package extraknowledge;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Main {
  public static void main(String[] args) throws Exception {
	  
	  File f = new File("D:/DEEP/test.txt");
	  f.createNewFile();
	  
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f));

    Object obj = null;

    while ((obj = inputStream.readObject()) != null) {
      if (obj instanceof Person) {
        System.out.println(((Person) obj).toString());
      }
    }
    inputStream.close();
  }
}

@SuppressWarnings("serial")
class Person implements Serializable {

  private String firstName;

  private String lastName;

  private int age;

  public Person() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    StringBuffer buffer = new StringBuffer();
    buffer.append(firstName);
    buffer.append("\n");
    buffer.append(lastName);
    buffer.append("\n");
    buffer.append(age);
    buffer.append("\n");

    return buffer.toString();
  }
}