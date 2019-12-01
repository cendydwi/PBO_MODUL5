package Operasi;

import Data.Data;

public class Proses {
    static Data data = new Data();
    
//    @Override
//    public void seq_search(int cari){
//        int found = -1;
//        for(int i = 0; i < data.getLength(); i++){
//            if(data.getData(i) == cari){
//                System.out.println("\nData ada di index-"+i);
//            }else{
//                found = 0;
//            }
//        }
//        if(found == 0){
//            System.out.println("\nData Tidak Ada");
//        }
//    }
//    
//    @Override
//    public void bin_search(int cari){
//        int awal = 0, akhir= data.getLength()-1, found=0;
//        for(int i = 0; i < data.getLength(); i++){
//            int tengah = (akhir-awal)/2;
//            if(data.getData(i) == cari){
//                found = i+1;
//            }else if(data.getData(tengah) > cari){
//                akhir = tengah - 1;
//            }else{
//                awal = tengah+1;
//            }
//        }
//        
//        if(found == 0){
//            System.out.println("\nData Tidak Ada");
//        }else{
//            System.out.println("\nData ada di index-"+found);
//        }
//    }
//    
//    public int getAngka(int index){
//        return data.getData(index);
//    }

    public int getAngka(int index){
        return data.getData(index);
    }
}
