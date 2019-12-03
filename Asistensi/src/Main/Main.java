package Main;

import Operasi.*;
import Data.Data;
import java.util.Scanner;

public class Main extends Abstraksi{
    static Data data = new Data();
    
    public void sort(int index){
        int tempId, kecil;
        String tempBarang;
            for(int i = 0; i < index ; i++){
                kecil = i;
                for(int j = i+1; j < index; j++){
                    if (data.getId(j) < data.getId(kecil))
                        kecil = j;
                }
                tempId = data.getId(i);
                data.setId(i, data.getId(kecil));
                data.setId(kecil, tempId);
                
                tempBarang = data.getBarang(i);
                data.setBarang(i, data.getBarang(kecil));
                data.setBarang(kecil, tempBarang);
            }
    }
    @Override
    public void seq_search(String cari, int index){
        int found = -1;
        for(int i = 0; i < index; i++){
            if(data.getBarang(i).equals(cari)){
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
    public void bin_search(int cari, int index){
        int awal = 0, akhir= index-1, found=-1;
        for(int i = 0; i <= index; i++){
            int tengah = (akhir-awal)/2;
            if(data.getId(i) == cari){
                found = i;
            }else if(data.getId(tengah) > cari){
                akhir = tengah - 1;
            }else{
                awal = tengah+1;
            }
        }
        
        if(found == -1){
            System.out.println("\nData Tidak Ada\n");
        }else{
            System.out.println("\nData ada di index-"+found+"\n");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 1, index = 0, cariId, pil_cari;
        String cariBarang;
        
        do{
            System.out.print("Menu\n1.Input\n2.Output\n3.Cari\nPilih: ");
            pilih = in.nextInt();
            switch(pilih){
                case 1:
                    try {
                        System.out.print("Masukkan Id Barang: ");
                        int angka = in.nextInt();
                        in.nextLine();
                        System.out.print("Masukkan Nama Barang: ");
                        String barang = in.nextLine();
                        System.out.println("");
                        data.setId(index, angka);
                        data.setBarang(index,barang);
                        index++;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("DATA PENUH!!!\n");
                    }
                break;
                    
                case 2:
                    System.out.println("\nLIST DATA:\n");
                    for (int i = 0; i < index; i++) {
                        System.out.println("Id: "+data.getId(i));
                        System.out.println("Barang: "+data.getBarang(i));
                        System.out.println("");
                    }
                break;
                    
                case 3:
                    System.out.print("Pilihan Pencarian\n1.Sequential Search\n2.Binary Search\nPilih: ");
                    pil_cari = in.nextInt();
                    switch(pil_cari){
                        case 1:
                            in.nextLine();
                            System.out.print("Masukkan Nama Barang: ");
                            cariBarang = in.nextLine();
                            System.out.println("");
                            new Main().seq_search(cariBarang, index);
                            break;
                            
                        case 2:
                            System.out.print("Masukkan Id: ");
                            cariId = in.nextInt();
                            System.out.println("");
                            new Main().sort(index);
                            new Main().bin_search(cariId, index);
                            break;
                    }
                break;    
            }
        }while(pilih!=0);
    }    
}
