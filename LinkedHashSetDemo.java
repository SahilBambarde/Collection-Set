import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    /*
    * Child class of HashSet
    * */

    public static void main(String[] args){
        LinkedHashSet ihs = new LinkedHashSet();
        LinkedHashSet ihs2 = new LinkedHashSet(30);

        LinkedHashSet ihs3 = new LinkedHashSet(20,1.00f);
        //when the old LinkedHashSet is 100% full then it will create new hashSet and transfer
        //data to new LinkedHashSet. Remove the old LinkedHashSet by Garbage Collection

        //Underlying Data Structure for this LinkedHashSet is combination of HashTable and LinkedList
        //Insertion order is preserved.
    }
}
