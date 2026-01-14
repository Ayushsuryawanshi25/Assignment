import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");

        // Constructor: ArrayList(int initialCapacity)
        ArrayList<String> list2 = new ArrayList<>(5);
        list2.add("Spring");
        list2.add("Hibernate");

        // Constructor: ArrayList(Collection c)
        ArrayList<String> list3 = new ArrayList<>(list1);

        //  add(E e)
        list1.add("JavaScript");

        //  add(int index, E element)
        list1.add(1, "React");

        //  addAll(Collection c)
        list1.addAll(list2);

        // get(int index)
        System.out.println("Element at index 2: " + list1.get(2));

        // set(int index, E element)
        list1.set(0, "Core Java");

        // remove(int index)
        list1.remove(3);

        //  remove(Object o)
        list1.remove("Hibernate");

        //  size()
        System.out.println("Size of list: " + list1.size());

        //  isEmpty()
        System.out.println("Is list empty? " + list1.isEmpty());

        // contains(Object o)
        System.out.println("Contains Java? " + list1.contains("Java"));

        //  indexOf(Object o)
        System.out.println("Index of React: " + list1.indexOf("React"));

        // lastIndexOf(Object o)
        list1.add("Java");
        System.out.println("Last index of Java: " + list1.lastIndexOf("Java"));

        // toArray()
        Object[] arr = list1.toArray();
        System.out.println("Array elements:");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // iterator()
        System.out.println("Using Iterator:");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //  clear()
        list3.clear();
        System.out.println("List3 after clear(): " + list3);
    }
}
