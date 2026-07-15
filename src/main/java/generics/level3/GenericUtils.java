package generics.level3;

public class GenericUtils {

    public static <T extends Phone> void usePhone (T phone){
        phone.call();
    }

    public static <T extends SmartPhone> void useSmartPhone(T iPhone){
        iPhone.call();
        iPhone.takePhoto();
    }

}
