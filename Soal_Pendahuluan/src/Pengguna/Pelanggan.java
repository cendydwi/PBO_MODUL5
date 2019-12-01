/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pengguna;

import Pengguna.Manusia;

/**
 *
 * @author USER
 */
public class Pelanggan extends Manusia{

    private String nama;
    private int noHp;
    private int id;
    
    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int getNoHp() {
        return noHp;
    }

    @Override
    public void setNoHp(int noHp) {
        this.noHp = noHp;
    }
    @Override
    public void print(){
        for (int i=getId();i<=getId();i++){
            System.out.print(i+".");
        }
        System.out.println("\tNama : "+this.getNama());
        System.out.println("\tNo HP : "+this.getNoHp());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
