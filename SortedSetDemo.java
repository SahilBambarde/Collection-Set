import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args){
        //SortedSet is subclass of Set
        //properties
        //No insertion order
        //No Duplicates
        //Accepts only homogeneous elements

        SortedSet s = new TreeSet();
        s.add(5);
        s.add(10);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(7);

        System.out.println(s);
        //[1, 2, 3, 5, 7, 10]

        //Methods is SortedSet Interface TreeSet Collection Integer
        //Object first()
        System.out.println(s.first());
        //1


        //Object last()
        System.out.println(s.last());
        //10

        //SortedSet headSet(Object o)
        System.out.println(s.headSet(3));
//        [1, 2]

        //SortedSet tailSet(Object o)
        System.out.println(s.tailSet(3));
        //[3, 5, 7, 10]


        //SortedSet subSet(Object o,Object p)
        System.out.println(s.subSet(3,7));
        //[3, 5]

        //Comparator comparator()
        System.out.println(s.comparator());
        //null
    }
}
