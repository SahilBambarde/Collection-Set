import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args){
        TreeSet data = new TreeSet(new MySorting());
        data.add(152);
        data.add(185);
        data.add(254);
        data.add(10);
        data.add(132);
        data.add(10);

        System.out.println(data);
        //[10, 132, 152, 185, 254]

        //By Default JVM will use compareTo Method for default
        //natural sorting order

        //After implementing Comparator
//        [254, 185, 152, 132, 10]
        //descending order


    }
}
