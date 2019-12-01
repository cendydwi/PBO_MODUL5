/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;
import Pengguna.*;
/**
 *
 * @author Erye
 */
public class Cucian {

    private Pegawai pegawai;
    private Pelanggan pelanggan;
    private float berat;
    private float hargaTotal;
    private float perKilo=5000;
    
    private Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    private Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    private float getBerat() {
        return berat;
    }

    private float getPerKilo() {
        return this.perKilo;
    }

    public float getHargaTotal(float berat) {
        this.berat=berat;
        return this.berat;
    }

    private float getHargaTotal(float berat,float perKilo) {
        return this.hargaTotal = berat * perKilo;
    }
    
    public void print (){
        System.out.println("Nama Pegawai : "+this.getPegawai().getNama());
        System.out.println("Nama Pelanggan : "+this.getPelanggan().getNama());
        System.out.println("Berat Cucuian : "+this.getBerat() + " KG. ");
        System.out.println("Harga Total Cucian : Rp. "+this.getHargaTotal(this.getHargaTotal(berat), this.getPerKilo()));
    }
    
}
