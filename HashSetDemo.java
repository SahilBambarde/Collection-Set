import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet(30);

        //Load Factor
        //At what level should the capacity of HashSet show change
        //Default Load Factor is 0.75
        //so when the capacity if filled by 75% then it will double its size.

        HashSet hs3 = new HashSet(100,.80f);
        //So when this hashset is over 80% then it will copy to new Hashset of size 200.
        //old hashset will be removed by Garbage Collection

        ArrayList l = new ArrayList();
        HashSet hs4 = new HashSet(l);


    }
}
