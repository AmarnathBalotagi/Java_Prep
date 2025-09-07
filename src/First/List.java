package First;
import java.util.*;

public class List {

	    public static void main(String[] args) {
	        // Create a list
	        ArrayList <String> list = new ArrayList<>();

	        // 1. add(E e)
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        // 2. add(int index, E element)
	        list.add(1, "Date");

	        // 3. get(int index)
	        System.out.println("Element at index 2: " + list.get(2));

	        // 4. set(int index, E element)
	        list.set(2, "Coconut");

	        // 5. remove(Object o)
	        list.remove("Date");

	        // 6. remove(int index)
	        list.remove(1); // removes "Coconut"

	        // 7. contains(Object o)
	        System.out.println("Contains 'Apple'? " + list.contains("Apple"));

	        // 8. indexOf(Object o)
	        System.out.println("Index of 'Apple': " + list.indexOf("Apple"));

	        // 9. lastIndexOf(Object o)
	        list.add("Apple");
	        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

	        // 10. isEmpty()
	        System.out.println("Is list empty? " + list.isEmpty());

	        // 11. size()
	        System.out.println("List size: " + list.size());

	        // 12. toArray()
	        Object[] array = list.toArray();
	        System.out.println("Array from list: " + Arrays.toString(array));

	        // 13. toArray(T[] a)
	        String[] stringArray = list.toArray(new String[0]);
	        System.out.println("String array: " + Arrays.toString(stringArray));

	        // 14. subList(int fromIndex, int toIndex)
	     //   List<String> subList = list.subList(0, 1);
	     //   System.out.println("Sublist (0 to 1): " + subList);

	        // 15. iterator()
	        System.out.print("Iterating with Iterator: ");
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();

	        // 16. forEach(Consumer<? super E> action)
	        System.out.println("Using forEach:");
	        list.forEach(item -> System.out.println("Item: " + item));

	        // 17. addAll(Collection<? extends E> c)
	        java.util.List<String> extra = Arrays.asList("Fig", "Grape");
	        list.addAll(extra);
	        System.out.println("After addAll: " + list);

	        // 18. addAll(int index, Collection<? extends E> c)
	        list.addAll(1, Arrays.asList("Honeydew", "Kiwi"));
	        System.out.println("After indexed addAll: " + list);

	        // 19. removeAll(Collection<?> c)
	        list.removeAll(Arrays.asList("Apple", "Fig"));
	        System.out.println("After removeAll: " + list);

	        // 20. retainAll(Collection<?> c)
	        list.retainAll(Arrays.asList("Banana", "Grape", "Kiwi"));
	        System.out.println("After retainAll: " + list);

	        // 21. clear()
	        list.clear();
	        System.out.println("After clear, is empty? " + list.isEmpty());
	    }
	}



