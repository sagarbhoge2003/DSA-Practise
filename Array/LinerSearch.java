import java.util.*;
public class LinerSearch {
    public static int linearSearch(int numbers[],int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {5,10,15,20,25,30,35,40,45};
        int key = 30;
        int index = linearSearch(numbers, key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key is at :" + index);
        }

    }
}
