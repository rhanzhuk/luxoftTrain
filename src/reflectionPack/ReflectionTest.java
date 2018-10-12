package reflectionPack;

/**
 * Created by dsk15 on 10/12/2018.
 */
public class ReflectionTest {
    public static void main(String[] args) throws Exception {

        String string = " ";
        Reflection reflection = new Reflection();

        //reflection.withoutParams(string);
        //reflection.withFinal(string);
        reflection.returnAllSuperClasses(string.getClass());
    }
}
