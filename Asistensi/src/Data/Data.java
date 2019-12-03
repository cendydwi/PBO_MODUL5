package Data;

public class Data {
    private int[] id = new int[10];
    private String[] barang = new String[10];
    
    public void setId(int index, int id){
        this.id[index] = id;
    }
    
    public void setBarang(int index, String barang){
        this.barang[index] = barang;
    }
    
    public int getId(int index){
        return id[index];
    }
    
    public String getBarang(int index){
        return barang[index];
    }
    
    public int getLength(){
        return id.length;
    }
    
}
