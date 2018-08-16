
package MyHashTable;



/**
 *
 * @author Rima yazigi
 */
public class TestMyHashTable {
  

  public static void main(String[] args) {
       MyHashTable HT = new MyHashTable(13);
         HT.put(new Person("Bob", "Smith", "555-235-1111", "bsmith@somewhere.com")); 
         HT.put(new Person("Jane", "Williams","555-235-1112","jw@something.com" )); 
         HT.put(new Person("Mohammed", "al-Salam", "555-235-1113", "mas@someplace.com")); 
         HT.put(new Person("Pat", "Jones", "555-235-1114", "pjones@homesweethome.com")); 
         HT.put(new Person("Billy", "Kidd", "555-235-1115", "billy_the_kid@nowhere.com")); 
         HT.put(new Person("H.", "Houdini", "555-235-1116", "houdini@noplace.com")); 
         HT.put(new Person("Jack", "Jones"  , "555-235-1117", "jjones@hill.com")); 
         HT.put(new Person("Jill", "Jones", "555-235-1118", "jillj@hill.com")); 
         HT.put(new Person("John", "Doe", "555-235-1119", "jdoe@somedomain.com")); 
         HT.put(new Person("Jane", "Doe", "555-235-1120", "jdoe@somedomain.com")); 
 
 
        HT.get("Pat Jones"); 
        HT.get("Billy Kidd"); 
 
 
         HT.delete("John Doe"); 
 
 
         HT.put( new Person("Test", "Case", "555-235-1121", "Test_Case@testcase.com")); 
         HT.put( new Person("Nadezhda", "Kanachekhovskaya", "555-235-1122", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru" )); 
         HT.put( new Person("Jo", "Wu", "555-235-1123", "wu@h.com")); 
         HT.put( new Person("Millard", "Fillmore", "555-235-1124", "millard@theactualwhitehouse.us")); 
         HT.put(new Person("Bob", "vanDyke", "555-235-1125", "vandyke@nodomain.com")); 
         HT.put( new Person("Upside", "Down", "555-235-1126", "upsidedown@rightsideup.com")); 
 
         HT.get("Nadezhda Kanachekhovskaya"); 
         HT.get("Jack Jones"); 
         HT.get("Nadezhda Kanachekhovskaya"); 
  
         HT.delete(("Jill Jones")); 
         HT.get(("John Doe")); 
 
 
         HT.get("Jill Jones"); 
         HT.get("John Doe"); 
         HT.get("Nadezhda Kanachekhovskaya");    
         HT.get("Mallard Fillmore");       
  }
}











