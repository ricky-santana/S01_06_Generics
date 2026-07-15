package generics.level3;

public class NoSmartPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Is the only thing i can do");
    }
}
