public class HelloItGirls {

    public static void main(String[] args) {
        String myName = args[0];
        System.out.println("Hello, " + myName + "!");
        System.out.println("Hello, Oleg!");
        System.out.println("Hello, Oleg!");
        System.out.println("Hello, Oleg!");
        
    }

    public static void sayHello() {
        System.out.println("Hello, Friend!");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

}