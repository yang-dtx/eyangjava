import java.util.*;
public class chap4exercise14 {
    public static void main (String[]args){
Scanner input= new Scanner(System.in);
System.out.println("Enter a word");
String string = input.next();
swapPairs(string);
    }
    public static void swapPairs(String string){
        
    String total="";
    int index=0;
    while(index<string.length()/2){
        total+=string.charAt(2*index+1);
        total+=string.charAt(2*index);
        index++;
    }
    if(string.length()%2!=0){
        total+=string.charAt(string.length()-1);
    }
    System.out.print(total);
    }
}
