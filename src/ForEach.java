public class ForEach {
    public static void main(String[] args) {
        String[] array =
                {
                        "Eko","Kurniawan","Khanedy",
                        "Programmer","Zaman","Now"
                };

        for (var value : array)
        {
            System.out.println(value);
        }

//        for (int i = 0; i < array.length; i++)
//        {
//            System.out.println(array[i]);
//        }
    }
}
