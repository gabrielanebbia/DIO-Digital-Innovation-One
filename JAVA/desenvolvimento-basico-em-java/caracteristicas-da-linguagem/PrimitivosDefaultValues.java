public class PrimitivosDefaultValues {
    public static void main(String[] args) {
        final Default d = new Default();
        System.out.println(d.getI()); // 0 - default value
        System.out.println(d.isActive()); // false - default value
    }
}

class Default {
    int i;
    boolean active;

    public int getI() {
        return i;
    }

    public boolean isActive() {
        return active;
    }
}
