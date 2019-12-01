/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pengguna;

/**
 *
 * @author USER
 */
public abstract class Manusia {
    public abstract void setNama(String nama);
    protected abstract String getNama();
    public abstract void setNoHp(int noHp);
    protected abstract int getNoHp();
    public abstract void print();
}
