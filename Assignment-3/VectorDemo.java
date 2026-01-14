
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

       

        Vector<Integer> v1 = new Vector<Integer>();         
        Vector<Integer> v2 = new Vector<Integer>(5);         
        Vector<Integer> v3 = new Vector<Integer>(5, 3);      

     

        v1.add(10);                  // add()
        v1.add(20);
        v1.add(30);

        v1.addElement(40);           // addElement()

        v1.insertElementAt(15, 1);   // insertElementAt()


        System.out.println("First Element : " + v1.firstElement());
        System.out.println("Last Element  : " + v1.lastElement());

        System.out.println("Element at index 2 : " + v1.elementAt(2));
        System.out.println("Using get() : " + v1.get(0));

        

        v1.set(0, 100);              // set()

       

        v1.remove(2);                // remove(index)
        v1.removeElement(40);        // removeElement()

        

        System.out.println("Size     : " + v1.size());
        System.out.println("Capacity : " + v1.capacity());

   

        System.out.println("Contains 20 : " + v1.contains(20));

   

        v1.clear();                  // clear()

        System.out.println("Is Vector Empty : " + v1.isEmpty());

        System.out.println("Vector Program Executed Successfully");
    }
}
