import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        //TreeSet ts1 = new TreeSet(Comparator c);
        SortedSet s = new TreeSet();
        TreeSet ts2 = new TreeSet(s);

        HashSet hs = new HashSet();
        TreeSet ts3 = new TreeSet(hs);

        TreeSet<Employee> ts4 = new TreeSet<Employee>();
        ts4.add(new Employee("John",30));
        //class Employee cannot be cast to class java.lang.Comparable
        // (Employee is in unnamed module of loader 'app'; java.lang.Comparable is in
        // module java.base of loader 'bootstrap')
        //	at java.base/java.util.TreeMap.compare(TreeMap.java:1569)


    }
}
