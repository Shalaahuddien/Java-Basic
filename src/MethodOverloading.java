public class MethodOverloading {
    public static void main(String[] args) {

    }
    static void sayHello()
    {
        System.out.println("Hello");
    }

//    static void sayHello(String name)
//    {
//        System.out.println("Hello " + name);
//    }

    static void sayHello(String firstName)
    {
        System.out.println("Hello " + firstName);
    }
    static void sayHello(String firstName, String lastName)
    {
        System.out.println("Hello "+firstName+""+lastName);
    }
}
