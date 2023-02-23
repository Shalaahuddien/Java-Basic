public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusNilai && lulusAbsen;

        if(nilai >= 75 && absen >= 75)
        {
            System.out.println("Anda Lulus");
        } else
        {
            System.out.println("Anda Tidak Lulus");
        }
    }
}
