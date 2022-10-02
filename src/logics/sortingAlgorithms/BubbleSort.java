package logics.sortingAlgorithms;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BubbleSort {
    public static void main(String[] args) {
        Implementation impl = new Implementation(new int[]{25,24,23,22,21,20});
        impl.sort();
    }
}

class Implementation{
    private int[] dataArray;

    public Implementation(int[] dataArray) {
        this.dataArray = dataArray;
    }

    public void sort(){
        if(dataArray == null) throw new NoSuchElementException();
        if(isSorted()){
            System.out.println("Already Sorted");
            return;
        }
        int temp = 0;
        for(int i=0; i<dataArray.length-1; i++){
            for(int j=0; j<dataArray.length-1; j++){
                if(dataArray[j] > dataArray[j+1]){
                    temp = dataArray[j];
                    dataArray[j] = dataArray[j+1];
                    dataArray[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(dataArray));
        }
    }

    public boolean isSorted(){
        for(int i=0; i<dataArray.length-2; i++){
            if(dataArray[i] > dataArray[i+1]){
                return false;
            }
        }
        return true;
    }
}
