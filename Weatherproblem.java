import java.util.*;
public class Weatherproblem {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are you giving me? ");
        int size = input.nextInt();
        int[]numbers= new int[size];
        int sum=0;
        int counter=0;
        
        //input temperatures
        System.out.println();
        System.out.println("Input the highest temperature for each day of the week:");
        for(int i=0; i<size;i++){
            //How do we go about asking the user for each value?
            System.out.println("What is the highest temperature on day " + (i+1));
            numbers[i]= input.nextInt();
            sum = sum+numbers[i];
        }

        //average
        double average = (double)sum/size;
        System.out.println();
        System.out.print("The average is approx");
        System.out.printf("%.2f",average);
        System.out.println();
        System.out.println();

        //days above average
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]>average){
               counter++;
            }
        }
        System.out.println(counter + " days were above average");

        System.out.println("Temperatures: "+ Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("The 2 coldest recorded temperatures were "+ numbers[0]+" , "+numbers[1]);
        System.out.println("The 2 highest recorded temperatures were "+ numbers[size-1]+ " , "+ numbers[size-2]);

       } 

    }
