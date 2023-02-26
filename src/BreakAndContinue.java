public class BreakAndContinue {
    public static void main(String[] args) {
//        var counter = 1;
//        while(true)
//        {
//            System.out.println("Perulangan ke-" + counter);
//            counter++;
//
//            if(counter > 10)
//            {
//                break;
//            }
//        }
//        System.out.println("Perulangan berhenti");

        for(int counter = 1; counter <= 100; counter++)
        {
            if(counter % 2 == 0)
            {
                continue;
            }
            System.out.println("Perulangan Ganjil-"+ counter);
        }

    }
}
