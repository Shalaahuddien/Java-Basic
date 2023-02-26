public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));

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

}
