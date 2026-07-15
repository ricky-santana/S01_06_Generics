package generics.level1and2;
import java.util.Arrays;

public class GenericMethods {

    public static <A, B> void printElements(A elemnt1, B elemnt2, String element3){
        System.out.println(elemnt1.toString() + "\n" +
                elemnt2.toString()  + "\n" +
                element3);
    }
    @SafeVarargs
    public static <A> void printAll(A ... elements){
        for (A e : elements){
            System.out.println(e.toString());
        }
    }
}
