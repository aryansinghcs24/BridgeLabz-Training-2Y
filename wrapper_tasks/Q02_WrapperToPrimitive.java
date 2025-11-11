public class Q02_WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = Double.valueOf(45.67);
        double d = dObj.doubleValue();
        int i = (int) dObj.doubleValue();
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
