import java.io.*;
import java.util.*;
public class classScheduling {
    public static final int SIZE=4; //must be divisible by 2
    public static void main(String[]args)throws  FileNotFoundException{
        int grade1=0;
        int i = 0;
        String s = "hell"+ i +" there";
        System.out.println(s);
        File f = new File("C:\\Users\\YangE24\\Java\\classes.txt");//txt file with data
        Scanner input= new Scanner(f);//this is the scanner for the file
        Scanner scheduler= new Scanner(System.in);//this is the scanner for the user 
        System.out.println("What is your name");
        String name= scheduler.nextLine();
        System.out.println("What Grade are you in? (ex: 9,10,11,12)");
        int grade= scheduler.nextInt();
        scheduler.nextLine();
        String[]lines= new String[5];//array for the amount of lines to print
        while(input.hasNextInt()){ //while loop for file scanner
        grade1=input.nextInt();
        input.nextLine();
        if(grade1==grade){ //if statement sees if user input=line 1; it prints the next 4 lines
        lines[0]=input.nextLine();
        lines[1]= input.nextLine();
        lines[2]=input.nextLine();
        lines[3]=input.nextLine();
        lines[4]=input.nextLine();
    }
        else{   //else statement so if user input does not equal line 1; it moves 5 lines down and checks again
        input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();
        input.nextLine();
            
       }
       
        

        }       
        System.out.println(lines[0]);
        System.out.println(lines[1]);
        System.out.println(lines[2]);
        System.out.println(lines[3]);
        System.out.println(lines[4]);
        //this is the actual printing part for the different lines which in this case would be a schedule

        
    
        
        

        if(grade==9){ //if statements to make it seem more personalized

        System.out.println(" Hey " + name +" the freshman schedule for today is above");
        }
        
        
        if(grade==10){
        System.out.println("Howdy "+ name + " the sophomore schedule is above");
        }
        if(grade==11){
        System.out.println("Hola "+ name + " the junior schedule is above");
        }
        if(grade==12){
        System.out.println("Hello "+ name + " the senior schedule is above");
        }
        if(grade>12|| grade<9){
        System.out.println("I do not seem to have the data you inputted inside my database. Please try again");
        }
        else{
        System.out.println(" ");
        }
        //these are all methods for a rocket I made because my pun is "The sky is the limit"
        TopRocket();
        BottomRocket();
        Line();
        Topin();
        Bottomin();
        Line();
        Bottomin();
        Topin();
        Line();
        TopRocket();
        System.out.println("The Sky is the Limit! Keep up the hard work");
    }
        public static void Bottomin() { //bottom in part of the rocket
        for(int line=0; line<SIZE; line++){//for loop to print |
        System.out.print("|");
            
    for(int dot = 1; dot <= line; dot++) {//for loop that prints "."
    System.out.print(".");
    }
    for (int slash = 0; slash < SIZE-line; slash++) {//for loop that prints \/
    System.out.print("\\/");
    }
    for(int dot = 1; dot <= line; dot++) {//for loop that prints ..
    System.out.print("..");
    }
    for (int slash = 0; slash < SIZE-line; slash++) { //for loop that prints \/
    System.out.print("\\/");
    }
    for(int dot = 1; dot <= line; dot++) { //for loop that prints .
    System.out.print(".");
    }
    System.out.println("|");//prints the final |
               
            }
    
       }
    
    public static void Topin() { //topin part of the rocket
    for(int line=1; line<=SIZE;line++){//for loop to print|
    System.out.print("|");
    for(int dots=1; dots<=-1*line+SIZE; dots++){//for loop to print .
    System.out.print(".");
    }
    for(int tri=1; tri<=line; tri++){//for loop to print /\
    System.out.print("/\\");
    }
    for(int dots2=1; dots2<=-2*line+SIZE*2; dots2++){//for loop to print .
    System.out.print(".");
    }
    for(int tri=1; tri<=line; tri++){ //for loop to print /\
    System.out.print("/\\");
                    
    }
    for(int dots=1; dots<=-1*line+SIZE; dots++){// for loop to print .
    System.out.print(".");
    }
    
    System.out.println("|"); //prints the final |
                
    }
    }
    public static void Line() {// the line method
    System.out.print("+");//for loop for +
    for(int line=1; line<=2*SIZE; line++ ){
    System.out.print("=*");//for loop for =*
    }
    System.out.println("+");//prints the final +
    
    }
        
    
    public static void BottomRocket() {
    
    }
    
    public static void TopRocket() {
    for(int line=1; line<=2*SIZE-1; line++){
    for(int space=1; space<=-1*line+2*SIZE; space++){
    System.out.print(" ");
    }
    for(int slash=1; slash<=line; slash++){
    System.out.print("/");
    
    }
    System.out.print("**");
    for(int backslash=1 ; backslash<=line; backslash++){
    System.out.print("\\");
    
                }
    System.out.println();
                }
    }
    public static void space(int line) {
        
    }
    }





        
       
        
    

    

