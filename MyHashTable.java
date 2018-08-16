
package MyHashTable;

/**
 *
 * @author Rima Yazigi
 */
// R.Y. file MyHashTable.java
// Impelemtation of a chaining MyHash table saving values of class Person under
// keys of class String


// R.Y.Node of the linked list associated with each MyNode of the MyHash table

class MyNode {
    protected String key;
    protected Person value;
    protected MyNode next;
    protected MyNode(String kk, Person pp) {    // Constructor
       key=kk; value=pp;
    this.next = null;}
    public String toString() {
       return "Node[" + key +  " " + value.toString() + "]"; }
     
     public Person getValue(){
         return value;
     } 

      public MyNode getNext() { 

            return next; 

      } 

       public void setNext(MyNode next) { 

            this.next = next; 

      } 

} 
    

//
// R.Y. Each element of the MyHash table is the first node in a singly-linked
// unheaded list of nodes holding the key and the value.

public class MyHashTable {

     private static int DefaultSize = 20;

     public MyNode[] table;
     public int count; //the number of(key, value) pairs in the hash table.
     public MyHashTable(int size) {   // Constructor
        table = new MyNode[size];
       }

     public MyHashTable() { this(DefaultSize); } // Default constructor

public int MyHash(String S){
            return (Math.abs(S.hashCode())) % table.length;
}

     

//  R.Y. Find node for  Key at Index
     private MyNode FindNode(String Key, int Index) {
        MyNode N = table[Index];
        while (N != null && !(N.key.equals(Key))) 
           N = N.next; 
       
        return N;
       }

// R.Y. Add Person PP under key Key
      public void put(Person PP) {
          String Key = PP.getFirstName() + " "+PP.getLastName();
          Key = Key.toUpperCase();
        int Index = MyHash(Key);
        if (FindNode(Key,Index) == null) {
          MyNode New = new MyNode(Key,PP);
          New.next = table[Index];
          table[Index] = New;
          count++;
          System.out.println(PP + "----------------added" );
          }
       }

// R.Y. Locate the Person object under string Key
      public Person get(String Key) {
         //Key = PP.getName();
          Key = Key.toUpperCase();
        int Index = MyHash(Key);
        MyNode N = FindNode(Key,Index);
         if (N != null)
             System.out.println(N.getValue().toString()+ "-----------------found");
        
        
        if (N==null) {
            System.out.println(Key + "------------------Not found");
            return null;}
        
           else return N.value;
        }



    public void delete(String Key) {  
      
          Key = Key.toUpperCase();
       
      int index = MyHash(Key);  // At what location should the key be?
      
      if (table[index] == null) {
            // There are no keys in that location, so key does not
            // occur in the table.  There is nothing to do, so return.
         return; 
      }
      
      if (table[index].key.equals(Key)) {
            // If the key is the first node on the list, then
            // table[index] must be changed to eliminate the
            // first node from the list.
         table[index] = table[index].next;
         count--; // Remove new number of items in the table.
         
         return;
      }
      
      // R.Y.We have to remove a node from somewhere in the middle
      // of the list, or at the end.  Use a pointer to traverse
      // the list, looking for a node that contains the
      // specified key, and remove it if it is found.
      
      MyNode prev = table[index];  //R.Y. The node that precedes
                                      // curr in the list.  Prev.next
                                      // is always equal to curr.
      MyNode curr = prev.next;  // For traversing the list,
                                  // starting from the second node.
      while (curr != null && ! curr.key.equals(Key)) {
         curr = curr.next;
         prev = curr;
      }
      
      // R.Y.If we get to this point, then either curr is null,
      // or curr.key is equal to key.  In the latter case,
      // we have to remove curr from the list.  Do this
      // by making prev.next point to the node after curr,
      // instead of to curr.  If curr is null, it means that
      // the key was not found in the table, so there is nothing
      // to do.
      
      if (curr != null) {
         prev.next = curr.next;
         count--;  //R.Y. Record new number of items in the table.
         
      }
   }

}

