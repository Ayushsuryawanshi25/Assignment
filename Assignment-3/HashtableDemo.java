
	import java.util.Hashtable;

	public class HashtableDemo {

	    public static void main(String[] args) {

	        Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();     // Default
	        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(10);   // Capacity
	        Hashtable<Integer, String> ht3 = new Hashtable<Integer, String>(ht1);  // Copy constructor


	        ht1.put(1, "Java");           // put()
	        ht1.put(2, "Python");
	        ht1.put(3, "C++");

	       
	        System.out.println("Value at key 1 : " + ht1.get(1));

	        

	        System.out.println("Contains key 2 : " + ht1.containsKey(2));
	        System.out.println("Contains value Java : " + ht1.containsValue("Java"));

	     

	        ht1.remove(3);                // remove()

	        
	        System.out.println("Size : " + ht1.size());
	        System.out.println("Is Empty : " + ht1.isEmpty());

	     

	        System.out.println("Keys:");
	        for (Integer key : ht1.keySet()) {
	            System.out.println(key);
	        }

	      

	        System.out.println("Values:");
	        for (String value : ht1.values()) {
	            System.out.println(value);
	        }

	        System.out.println("Key-Value Pairs:");
	        for (Integer key : ht1.keySet()) {
	            System.out.println(key + " = " + ht1.get(key));
	        }

	        
	        ht1.clone();                  
	        ht1.clear();                  

	        System.out.println("Hashtable Program Executed Successfully");
	    }
	}


