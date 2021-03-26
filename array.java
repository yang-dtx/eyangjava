import java.util.*;
public class array {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("How many numbers are you giving me? ");
        int size = input.nextInt();
        int[]numbers= new int[size];
        int sum=0;
        int counter=0;
        for(int i=0; i<size;i++){
            //How do we go about asking the user for each value?
            System.out.print("What is the temperature on each day of the week?");
            System.out.println("What is the temperature on Monday");
            int monday = input.nextInt();
            System.out.println("What is the temperature on Tuesday");
            int Tuesday = input.nextInt();
            System.out.println("What is the temperature on Wednesday");
            int Wednesday = input.nextInt();
            System.out.println("What is the temperature on Thursday");
            int Thursday = input.nextInt();
            System.out.println("What is the temperature on Friday");
            int Friday = input.nextInt();
            System.out.println("What is the temperature on Saturday");
            int Saturday = input.nextInt();
            System.out.println("What is the temperature on Sunday");
            int Sunday = input.nextInt();

            numbers[i]= input.nextInt();
            sum= sum+numbers[i];
            
           
        }
        double average = (double)sum/size;

        for(int j=0; j<numbers.length; j++){ // another way to get the size of your array
            System.out.print(numbers[j]+", ");
        }
        System.out.println("The average is"+average);
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]>average){
                counter++;
                
    }
    
    
}
System.out.print(counter);
    

    }

    
}

