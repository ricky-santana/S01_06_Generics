package generics.level3;

public class Main {
    static void main() {

        GenericUtils.usePhone(new SmartPhone());
        GenericUtils.useSmartPhone(new SmartPhone());

        GenericUtils.usePhone(new NoSmartPhone());

    }

}
