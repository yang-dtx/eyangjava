import java.util.*;
public class conditionalbranchingandlooping {
    public static void main (String[]args) {
//Exercise 10
//Write a method called hopscotch that accepts an integer number of “hops” as its parameter and prints a pattern of
//numbers that resembles a hopscotch board. A “hop” is a three-number sequence where the output shows two numbers on a line, followed by one number on its own line. 0 hops is a board up to 1; one hop is a board up to 4; two
//hops is a board up to 7; and so on. For example, the call of hopscotch(3); should print the following output:
    Scanner input=  new Scanner( System.in);
    System.out.println("How many hops are there ?");
    int hops= input.nextInt();

    hopscotch(hops);
    }

public static void hopscotch(int hops){
    if(hops<0){
        System.out.println("Please enter a non-negative value");
    }
    if (hops==0){
        System.out.println("   1");
    }
    int num=1;
    while(hops>0){
        System.out.println("  "+num);
        System.out.println(num+1+"   "+ (num+2) );
        num+=3;
        hops--;
    }
}

}

