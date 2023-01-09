package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {
        // HashSet

        HashSet<String> names = new HashSet<>();

        // Add elements
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");
        names.add("Anna");

        System.out.println(names);

        // Remove element
        names.remove("Bob");
        System.out.println(names);

        // Size
        System.out.println(names.size());

        // Contains
        System.out.println(names.contains("Lisa"));
        System.out.println(names.contains("Anna"));

        // Iterate
        for (String str:names) {
            System.out.println(str);
        }

        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // Example 2

        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("intSet1 : " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2 : " + intSet2);

        // Find union

        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("Union before: " + union);
        union.addAll(intSet2);
        System.out.println("Union after: " + union);

        // Find intersection
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("Intersection: " + intersection);

        // Find unique elements
        HashSet<Integer> difference1 = new HashSet<>(intSet1);
        difference1.removeAll(intSet2);
        System.out.println("Difference inset1: " + difference1);

        HashSet<Integer> difference2 = new HashSet<>(intSet2);
        difference2.removeAll(intSet1);
        System.out.println("Difference inset2: " + difference2);

        // All differences
        HashSet<Integer> difAll = new HashSet<>(difference1);
        difAll.addAll(difference2);
        System.out.println("All differences: " + difAll);

        // LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Lithuania");
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Italy");

        System.out.println(linkedHashSet);

        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);

    }
}
