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
        int classes=1;
        while(input.hasNext()){
            String schedule=input.nextLine();
            classes++;
        }
        System.out.println(classes);
       

       
        
    }

    
}
