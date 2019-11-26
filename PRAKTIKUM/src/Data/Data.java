package Data;

public class Data {
    private int[] data = new int[10];
    
    public void setData(int index, int angka){
        data[index] = angka;
    }
    
    public int getData(int index){
        return data[index];
    }
    
    public int getLength(){
        return data.length;
    }
    
}
