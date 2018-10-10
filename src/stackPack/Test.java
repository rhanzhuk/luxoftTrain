package stackPack;

/**
 * Created by dsk15 on 10/10/2018.
 */
public class Test {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        //linkedList.add(1);
        //linkedList.add(13);
        linkedList.add("A");
        //linkedList.add("B");
       // linkedList.add(1.2);
        linkedList.add(null);
        //linkedList.add(-1);
        for (Object var: linkedList) {
            System.out.println(var);
        }
    }
}
