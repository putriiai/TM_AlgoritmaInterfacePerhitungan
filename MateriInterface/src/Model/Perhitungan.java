package Model;

import Interfaces.ContohInterfaces;

public class Perhitungan implements ContohInterfaces {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int a, int b, int hasil){
        this.a = a;
        this.b = b;
        this.hasil = hasil;
        printJudulClass("Print judul dalam Class Perhitungan");
    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    public void PrintJudul(){
        System.out.println("Judul dalam interface");
    }

    public void HitungTambah(){
        this.hasil = this.a + this.b;
    }

    public void HitungKali(){
        this.hasil = this.a * this.b;
    }

    public int HitungTambah(int a1, int b1){
        this.a = a1;
        this.b = b1;
        HitungTambah();
        return this.hasil;
    }

    public int HitungKali(int a2, int b2){
        this.a = a2;
        this.b = b2;
        HitungKali();
        return this.hasil;
    }

}
