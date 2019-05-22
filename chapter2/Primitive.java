package chapter2;

public class Primitive {
    public static void main(String... args) {
        charakter();
        SCOperators();
        wrapperClasses();
    }

    public static void charakter() {
        char c1 = 122;
        char c2 = '\u0122';
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("-------------------- \n");

    }

    public static void SCOperators() {
        int marks = 8;
        int total = 10;

        System.out.println(total < marks && ++marks > 5);
        System.out.println(marks);
        System.out.println(total == 10 || ++marks > 10);
        System.out.println(marks);
        System.out.println("-------------------- \n");

    }

    /*
    * Cache instances exists for the wrapper Boolean class for the values true and false. The Character class caches
    * instances with values 0 to 127. Classes Byte, Short, Integer and Long cache instances for values -127 to 128.
    * no cached instances exists for the Float and Double wrapper classes.
    * */

    public static void wrapperClasses() {
        Integer i1 = new Integer(129);
        Integer i2 = new Integer(129);

        Integer i3 = Integer.valueOf(129);
        Integer i4 = Integer.valueOf(129);

        Integer i5 = 129;
        Integer i6 = 129;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i4 == i5);
        System.out.println(i5 == i6);

        System.out.println("-------------------- \n");
    }

}