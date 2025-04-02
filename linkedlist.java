import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Nome{
    public String nome;

    public Nome(String nome){
        this.nome= nome;
    }
    public String toString(){
        return this.nome;
    }
}

public class linkedlist{
    public static void main(String[] args){
        List<Nome> vec = new LinkedList<Nome>();
        vec.add(new Nome("Lucas"));
        vec.add(new Nome("Ana"));
        vec.add(new Nome("Maria"));
        vec.add(new Nome("Isis"));
        vec.add(new Nome("Ronaldo"));
        Iterator<Nome> it = vec.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }    
    }
}
