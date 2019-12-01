package Main;

import Operasi.*;
import Data.Data;
import java.util.Scanner;

public class Main extends Abstraksi{
    static Data data = new Data();
    
    @Override
    public void seq_search(int cari){
        int found = -1;
        for(int i = 0; i < data.getLength(); i++){
            if(data.getData(i) == cari){
                System.out.println("\nData ada di index-"+i+"\n");
                found = 1;
                break;
            }else{
                found = 0;
            }
        }
        if(found == 0){
            System.out.println("\nData Tidak Ada\n");
        }
    }
    
    @Override
    public void bin_search(int cari){
        int awal = 0, akhir= data.getLength()-1, found=0;
        for(int i = 0; i < data.getLength(); i++){
            int tengah = (akhir-awal)/2;
            if(data.getData(i) == cari){
                found = i;
            }else if(data.getData(tengah) > cari){
                akhir = tengah - 1;
            }else{
                awal = tengah+1;
            }
        }
        
        if(found == 0){
            System.out.println("\nData Tidak Ada\n");
        }else{
            System.out.println("\nData ada di index-"+found+"\n");
        }
    }
    
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
                        System.out.println("");
                        data.setData(index, angka);
                        index++;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("DATA PENUH!!!\n");
                    }
                break;
                    
                case 2:
                    System.out.println("\nDATA");
                    for (int i = 0; i < index; i++) {
                        System.out.println(data.getData(i));
                    }
                    System.out.println("");
                break;
                    
                case 3:
                    System.out.print("Masukkan Angka ");
                    cari = in.nextInt();
                    System.out.println("");
                    System.out.print("Pilihan Pencarian\n1.Sequential Search\n2.Binary Search\nPilih: ");
                    pil_cari = in.nextInt();
                    switch(pil_cari){
                        case 1:
                            new Main().seq_search(cari);
                            break;
                            
                        case 2:
                            new Main().bin_search(cari);
                            break;
                    }
                break;    
            }
        }while(pilih!=0);
    }    
}
