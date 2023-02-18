public class MethodBlock {

    //Write a program to demonstrate static variables, methods, and blocks.

    static int a =10;//static variable

    public  void display(){
        System.out.println("This is a display method"); //method
    }

    public static void main(String[] args) {

        MethodBlock n= new MethodBlock();

        System.out.println(display());

    }
}
