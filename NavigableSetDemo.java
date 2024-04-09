import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args){
        NavigableSet<Integer> data = new TreeSet<Integer>();
        data.add(1000);
        data.add(3000);
        data.add(13000);
        data.add(40000);
        data.add(54000);
        System.out.println("---------TreeSet-------------");
        System.out.println(data);
        //[1000, 3000, 13000, 40000, 54000]
        System.out.println("----------------------------");

        //Methods

        System.out.println(data.floor(13500));
        //13000
        //FInd the number equal or new the give number
        System.out.println(data);


        System.out.println(data.lower(3000));
        //1000
        //Number which is less than the given number and also present in the set

        System.out.println(data.ceiling(2500));
        //3000
        //number equal to or just greater than the given number

        System.out.println(data.higher(4000));
        //13000
        //Number higher than the given number

        System.out.println(data.pollFirst());
        //1000
        //first number in the set and remove it

        System.out.println(data.pollLast());
        //54000
        //Last number in the set and remove it

        System.out.println(data.descendingSet());
        //[40000, 13000, 3000]
        //return the element in reverse order
    }
}
