import java.util.*;
public class arrayproject {
    //. Write a game of Hangman using arrays. Allow the user to guess letters and represent which letters have been
//guessed in an array.
    public static void main (String[]args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = input.next();
        char[] dash = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
          dash[i] = '_';
        }



        int wordGuess = word.length();
        int unsuccessful = 6;
        while(wordGuess >0 && unsuccessful >0 ){
            System.out.println();
            for ( int i = 0; i < word.length(); i++) {
              System.out.print(" " + dash[i] + " ");
            }
            System.out.println();

            System.out.println("You have " +unsuccessful+ " tries to make a guess");
            System.out.println("Please enter your guess: ");
           
            char guess = input.next().charAt(0);
            boolean iscorrect = false;
            for (int i = 0; i < dash.length; i++) {
                if(word.charAt(i) == guess)
                {
                    dash[i] = guess;
                    wordGuess--;
                    iscorrect = true;
                }
            }

            if(!iscorrect)
                unsuccessful--;
        }

        if(wordGuess == 0)
            System.out.println("congrats you have won!");
        else System.out.println("sorry you have lost");

    }

}
    

