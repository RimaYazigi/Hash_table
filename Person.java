
package MyHashTable;

/**
 *
 * @author Rima Yazigi
 */
//  Person.java

 public class Person {
    private String firstName, lastName;
    private String email;
    private String phoneNumber;
     
    
    public Person(String firstName,String lastName,String phoneNumber,String email){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person(String firstName,String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getName(){
        return(this.firstName + " " +this.lastName);
    }

    public void setName(String firstName, String lastname){
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    

    @Override
    public String toString() {
        return firstName + " " + lastName + phoneNumber + email ;
      }
public int MyHash(String firstName, String LastName){
    String str = getFirstName()+ " " + getLastName();
        return str.hashCode();
}
 }

    

