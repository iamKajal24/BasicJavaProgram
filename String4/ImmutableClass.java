package String4;

public final class Karamchari {
    private final String pancardNum;

    public Karamchari(String pancardNum) {
        this.pancardNum = pancardNum;
    }

    public String getPancardNum() {
        return pancardNum;
    }
}

public class ImmutableClass {

    public static void main(String[] args) {
        Karamchari kc = new Karamchari("ABCD123G");
        String s1 = kc.getPancardNum();
        System.out.println("Pancard Number: " + s1);
    }
}
