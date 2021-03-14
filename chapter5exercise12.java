import java.util.*;
public class chapter5exercise12 {
    public static void main (String[]args){
//Write a method called printAverage that uses a sentinel loop to repeatedly prompt the user for numbers. Once the
//user types any number less than zero, the method should display the average of all nonnegative numbers typed.
//Display the average as a double. Here is a sample dialogue with the user:
    Scanner input= new Scanner(System.in);
     int total=0;
    int amount=0;
        System.out.println("Please enter a number");
        int result= input.nextInt();
        total+=result;
        amount+=1;
        while(result>=0){
            System.out.println("Enter another number or a negative number to stop");
        
        result=input.nextInt();

    if( amount!=0 &&result<=0){
        double average=(double)total/amount;
        System.out.printf("The average of your numbers is %.2f%n",average);
    }
    else{
        total+=result;
        amount+=1;
    }
}

} 
}
