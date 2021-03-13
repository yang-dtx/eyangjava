import java.util.*;
public class chapter5 {
    //Write a program that plays a reverse guessing game with the user. The user thinks of a number between 1 and 10, and
//the computer repeatedly tries to guess it by guessing random numbers. It’s fine for the computer to guess the same
//random number more than once. At the end of the game, the program reports how many guesses it made. Here is a
//sample execution:

    public static void main (String[]args){
        numberguesser();
        }
        
        
    

    public static void numberguesser() {
      
        
    Random random = new Random();
    int r;
     
     System.out.println("Think of a number 1-10 and I'll try and guess it");
     String ANSWER;
       do{
        r= random.nextInt(10)+1;
        Scanner input= new Scanner (System.in);
System.out.println("Is your number " +r +"?");
System.out.println("Yes or No?");
      ANSWER= input.next();
       }
       while(ANSWER.equalsIgnoreCase("No"));
     
if(ANSWER.equalsIgnoreCase("Yes")){
 System.out.println("Hah!I guessed your number!");
}


}


}
//might need to run twice for it to work









