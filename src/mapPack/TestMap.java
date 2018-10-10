package mapPack;

/**
 * Created by dsk15 on 10/10/2018.
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);

        System.out.println(hashMap.get("one"));
        System.out.println(hashMap.get("two"));
        System.out.println(hashMap.get("three"));
        System.out.println(hashMap.get("four"));

    }
}
