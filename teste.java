import java.util.Collections;
import java.util.ListIterator;
import java.util.LinkedList;


public class teste{
    public static void main(String[] args){
        LinkedList<Integer> L = new LinkedList<>();
        L.add(10);
        L.add(4);
        L.add(7);
        L.add(2);
        L.add(9);
        ListIterator<Integer> it = L.listIterator();
        while(it.hasNext()) {

            if(it.next()>5){
                
                it.set(99);
            }
        }
        Collections.shuffle(L);
        System.out.println("Lista embaralhada: "+L);
        
    }
}
