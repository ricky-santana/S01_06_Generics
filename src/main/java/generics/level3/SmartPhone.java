package generics.level3;

public class SmartPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Calling");
    }

    public void takePhoto(){
        System.out.println("Photo made");
    }
}
