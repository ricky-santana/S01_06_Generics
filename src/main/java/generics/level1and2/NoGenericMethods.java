package generics.level1and2;

public class NoGenericMethods {
    private int element1;
    private int element2;
    private int element3;

    public NoGenericMethods(int element1, int element2, int element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public int getElement1() {
        return element1;
    }

    public int getElement2() {
        return element2;
    }

    public int getElement3() {
        return element3;
    }
}
