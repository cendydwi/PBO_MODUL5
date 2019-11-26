package Main;

import Operasi.Proses;
import Data.Data;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 1, index = 0, cari, pil_cari;
        Proses proses = new Proses();
        Data data = new Data();
        
        do{
            System.out.print("Menu\n1.Input\n2.Output\n3.Cari\nPilih: ");
            pilih = in.nextInt();
            switch(pilih){
                case 1:
                    try {
                        System.out.print("Masukkan Angka: ");
                        int angka = in.nextInt();
                        data.setData(index, angka);
                        index = index + 1;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.err.println("DATA PENUH!!!!");
                    }
                    break;
                
                case 2:
                    System.out.println("DATA");
                    for(int i = 0; i < data.getLength()-1; i++){
                        System.out.println(data.getData(index));
                    }
                    break;
                    
                case 3:
                    System.out.print("Masukkan Angka: ");
                    cari = in.nextInt();
                    System.out.print("Pilihan:\n1.Sequential Search\n2.Binary Search\nPilih: ");
                    pil_cari = in.nextInt();
                    switch(pil_cari){
                        case 1:
                            proses.seq_search(cari);
                            break;
                            
                        case 2:
                            proses.bin_search(cari);
                            break;
                    }
                        
            }
        }while(pilih != 0);
    }
    
}
