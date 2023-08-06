/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_Uas_No_1;

/**
 *
 * @author Pauland
 */
public class Henpon implements Pajak {
    private String vendor, tipe;
    private double harga;

    public Henpon(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    @Override
    public double hitungHargaSetelahPPN(double harga) {
        if (harga > 4500000) {
            return harga + (harga * 0.05); // PPN 5%
        } else if (harga >= 4200000) {
            return harga + (harga * 0.02); // PPN 2%
        } else if (harga > 4000000) {
            return harga + (harga * 0.01); // PPN 1%
        } else {
            return harga; // Harga tetap jika PPN tidak berlaku
        }
    }
    
    public static void main(String[] args) {
        Henpon Samsung = new Henpon("Samsung", "A51", 5000000.00);
        Henpon Oppo = new Henpon("Oppo", "Reno 5", 4400000.00);
        Henpon Xiaomi = new Henpon("Xiaomi", "A1", 4100000.00);

        System.out.println("Vendor: " + Samsung.vendor + "\t\t Tipe: " + Samsung.tipe + "\t\t Harga Setelah Terkena PPN: Rp " + Samsung.hitungHargaSetelahPPN(Samsung.harga));
        System.out.println("Vendor: " + Oppo.vendor + "\t\t Tipe: " + Oppo.tipe + "\t\t Harga Setelah terkena PPN: Rp " + Oppo.hitungHargaSetelahPPN(Oppo.harga));
        System.out.println("Vendor: " + Xiaomi.vendor + "\t\t Tipe: " + Xiaomi.tipe + "\t\t Harga Setelah PPn PPN: Rp " + Xiaomi.hitungHargaSetelahPPN(Xiaomi.harga));
    }
}