public class Primitive {
//Write a Java program to display the default value of all primitive data types of Java
    byte b;
    int i;
    short s;
    long l;
    char c;
    float f;
    double d;
    boolean B;

    public static void main(String[] args) {

        Primitive obj =new Primitive();

        System.out.println("byte:"+obj.b);

        System.out.println("int:"+obj.i);

        System.out.println("short:"+obj.s);

        System.out.println("long:"+obj.l);

        System.out.println("char:"+obj.c);

        System.out.println("float:"+obj.f);

        System.out.println("double:"+obj.d);

        System.out.println("boolean:"+obj.B);

    }
}
