public class reverse {
    public static void reversed(int numbers[]){

        int start = 0, end = numbers.length-1;
        while(start < end){

            int temp = numbers[end];
            numbers[end]= numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
    } 
    public static void main(String[] args) {
        int numbers[] = {5,7,9,11,13,15,17};
        reversed(numbers);
        for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
