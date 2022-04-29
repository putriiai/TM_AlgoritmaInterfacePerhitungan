import Model.Perhitungan;

public class JalankanPerhitungan {

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(25,4,0);
        s.PrintJudul();
        int hasilTambah = s.HitungTambah(25,4);
        System.out.println("Hasil Tambah = " + hasilTambah);
        int hasilPerkalian = s.HitungKali(25,4);
        System.out.println("Hasil Kali = " + hasilPerkalian);
    }
}
