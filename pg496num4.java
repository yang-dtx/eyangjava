import java.util.*;
public class  pg496num4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are you going to input? ");
        int size = input.nextInt();
        double[]array= new double[size];

        //input values
        for(int i=0; i<size;i++){
            System.out.println("What is the " + (i+1)+" number");
            array[i]= input.nextDouble();
        }
        System.out.println("Here is the array: " + Arrays.toString(array));

        isSorted(array);
    }

    public static boolean isSorted (double[] array){
        boolean result;
        for(int i=0; i<array.length; i++){
            if(array[i]<array[i+1]){
                result= true;
            }
            else{
                result= false;
            }
        }
        return result;
    }
}