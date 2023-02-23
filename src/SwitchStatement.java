public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai)
        {
            case "A":
                System.out.println("Wow Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

//        var nilai2 = "B";

        switch (nilai)
        {
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default ->
            {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        String ucapan;

        switch (nilai)
        {
            case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah Jurusan";
        }

        System.out.println(ucapan);

    }
}
