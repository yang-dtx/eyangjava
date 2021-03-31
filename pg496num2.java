import java.util.*;
public class  pg496num2{
    public static void main(String[]args){
        range();
    }

    public static void range (){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are you going to input? ");
        int size = input.nextInt();

        //input values
        int[]list= new int[size];
        for(int i=0; i<size;i++){
            System.out.println("What is the " + (i+1)+" integer");
            list[i]= input.nextInt();
            
        }
        System.out.println("Here is the array: " + Arrays.toString(list));

        //find max
        int max=0;
        for(int i=0;i<list.length;i++){
            if(list[i]>max){
                max=list[i];
            }
        }
        System.out.println("The max is "+max);

        //find min
        int min=max;
        for(int i=0;i<list.length;i++){
            if(list[i]<min){
                min=list[i];
            }
        }
        System.out.println("The min is "+min);

        //find answer
        int boojey= max-min+1;
        System.out.println("The range plus one is " + boojey);   
    }
}