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
    }
}
