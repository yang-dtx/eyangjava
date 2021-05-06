import java.io.*;
import java.util.*;
public class classScheduling {
    public static void main(String[]args)throws  FileNotFoundException{
        File f = new File("C:\\Users\\YangE24\\Java\\classes.txt");
        Scanner input= new Scanner(f);
        Scanner banana= new Scanner(System.in);
        //Use Students from our Class
        System.out.println("Please Enter your name (first and last)");
        String name= banana.nextLine();
        System.out.println("What Grade are you in? (ex: 9,10,11,12)");
        int grade= banana.nextInt();
        
        while(input.hasNextLine()){
            if(input.nextLine()==name){
                System.out.println("We have found you in our system! Here is your schedule for today");
            }
            
            if(input.nextLine()!= name){
                System.out.println("Sorry, I do not seem to have you in my database. Please try again");
            }
            
                
            }
        
           
        }
        
       // String s1 = " ";
        //String s2 = " ";
        //if(s1.equalsIgnoreCase(s2)){

        
       
        
    }

    

