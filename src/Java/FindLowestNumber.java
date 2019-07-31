package Java;

public class FindLowestNumber {
    public static void main(String[] args) {
        int numbers [] ={-1,0,21,52,32,25};

        int smallnum=0;
        int largenum =0;
         for (int i=0; i<numbers.length-1;i++){
             if(numbers[i]>largenum) {
                 largenum = numbers[i];
             }else if (numbers[i]<smallnum){
                 smallnum=numbers[i];
             }





         }
        System.out.println("smallest number is "+smallnum);
    }
}
