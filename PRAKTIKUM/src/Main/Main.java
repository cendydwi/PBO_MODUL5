package Main;

import Operasi.Proses;
import Data.Data;
import java.util.Scanner;

public class Main {
    static Data data = new Data();
    static Proses proses = new Proses();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 1, index = 0, cari, pil_cari;
        
        do{
            System.out.print("Menu\n1.Input\n2.Output\n3.Cari\nPilih: ");
            pilih = in.nextInt();
            switch(pilih){
                case 1:
                    try {
                        System.out.print("Masukkan Angka: ");
                        int angka = in.nextInt();
                        data.setData(index, angka);
                        index++;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("DATA PENUH!!!");
                    }
                break;
                    
                case 2:
                    System.out.println("DATA");
                    for (int i = 0; i < data.getLength(); i++) {
                        System.out.println(proses.getAngka(i));
                    }
                break;
                    
                case 3:
                    proses.getAngka(1);
                break;    
            }
        }while(pilih!=0);
    }    
}
