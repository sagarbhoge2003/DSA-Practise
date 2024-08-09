
public class BinarySearch {
    public static void main(String[] args) {
        int numbers [] = {10,20,30,40,50,60,70,80,90};
        int key = 70;
        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                System.out.println("Index is at " + mid); 
            }
            if(numbers[mid]>key){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return;
    }
}
