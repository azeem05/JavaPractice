import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapExample {

    public static void main(String[] args){

        PriorityQueue<Integer> pq=new PriorityQueue<>(); // min heap by default
        //pq=new PriorityQueue<>(Comparator.reverseOrder()); //max heap

        pq.add(6);
        pq.add(1);
        pq.add(2);
        pq.add(4);
        //pq.add(3);

        /*
      Step 1(Input 6) : 6
      Step 2(Input 1) :    6
                         1
                        Heapify as child is lesser than root
                           1
                        6
      Step 3(Input 2) :    1
                        6      2
      Step 4(Input 4) :    1
                        6      2
                     4
                     Heapify as child (4) is lesser than root(6)
                           1
                        4      2
                     6
       Output is 1 4 2 6

         */

        System.out.println(pq);
    }
}
