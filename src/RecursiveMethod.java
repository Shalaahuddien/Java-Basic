public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factoriaRecursive(5));
        System.out.println(factorialLoop(5));
        System.out.println(1*2*3*4*5);

        loop(10);

        loop(10000);

    }

    static int factorialLoop(int value)
    {
        var result = 1;
        for(int i = 1; i <= value; i++)
        {
            result *= i;
        }
        return result;
    }

    static int factoriaRecursive(int value)
    {
        if(value == 1)
        {
            return 1;
        }
        else
        {
            return value * factoriaRecursive(value -1);
        }
    }

    static void loop(int value)
    {
        if(value == 0)
        {
            System.out.println("Selesai");
        }
        else
        {
            System.out.println("Loop-" + value);
            loop(value -1);
        }
    }

}
