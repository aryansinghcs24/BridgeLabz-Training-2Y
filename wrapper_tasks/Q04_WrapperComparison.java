public class Q04_WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println("a == b: " + (a == b));
        System.out.println("c == d: " + (c == d));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a and b use cached Integer objects between -128 and 127, so == is true. c and d are outside cache so different objects, == is false. equals compares values and is true for a and b.");
    }
}
