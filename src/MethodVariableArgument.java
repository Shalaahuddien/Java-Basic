public class MethodVariableArgument {
    public static void main(String[] args) {

//        int[] values = {80,80,80,80,80};
//        sayCongrats("EKO", values);

        sayCongrats("EKO", 80,90,79,48);

    }

//    static void sayCongrats(String name, int[] values){
//        var total = 0;
//        for(var value : values)
//        {
//            total += value;
//        }
//        var finalValue = total / values.length;
//
//        if(finalValue >= 75)
//        {
//            System.out.println("Selamat " + name + ", Anda Lulus");
//        }
//        else
//        {
//            System.out.println("Maaf " + name + ", Anda Lulus");
//        }
//    }

    static void sayCongrats(String name, int... values)
    {
        int total = 0;
        for(var value : values)
        {
            total += value;
        }
        int finalValue = total / values.length;
        if(finalValue >= 75)
        {
            System.out.println("Selamat " +name+", Anda Lulus");
        }
        else
        {
            System.out.println("Maaf " + name + ", Anda Lulus");
        }
    }

}
