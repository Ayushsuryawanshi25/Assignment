import java.util.*;
public class TreeMapDemo {

	    public static void main(String[] args) {

	        TreeMap<Integer, String> tm1 = new TreeMap<>();
	        TreeMap<Integer, String> tm2 = new TreeMap<>(Collections.reverseOrder());
	        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);
	        TreeMap<Integer, String> tm4 = new TreeMap<>(new Comparator<Integer>() {
	            public int compare(Integer a, Integer b) {
	                return a.compareTo(b);
	            }
	        });

	        tm1.put(10, "Ten");
	        tm1.put(20, "Twenty");
	        tm1.put(30, "Thirty");
	        tm1.put(40, "Forty");

	        System.out.println("1. get(): " + tm1.get(20));
	        System.out.println("2. firstKey(): " + tm1.firstKey());
	        System.out.println("3. lastKey(): " + tm1.lastKey());
	        System.out.println("4. higherKey(): " + tm1.higherKey(20));
	        System.out.println("5. lowerKey(): " + tm1.lowerKey(30));

	        System.out.println("6. ceilingKey(): " + tm1.ceilingKey(25));
	        System.out.println("7. floorKey(): " + tm1.floorKey(25));

	        System.out.println("8. headMap(): " + tm1.headMap(30));
	        System.out.println("9. tailMap(): " + tm1.tailMap(20));
	        System.out.println("10. subMap(): " + tm1.subMap(10, 40));

	        System.out.println("11. keySet(): " + tm1.keySet());
	        System.out.println("12. values(): " + tm1.values());
	        System.out.println("13. entrySet(): " + tm1.entrySet());

	        tm1.remove(40);
	        System.out.println("14. remove(): " + tm1);

	        tm1.clear();
	        System.out.println("15. clear(): " + tm1);
	    }
	}

