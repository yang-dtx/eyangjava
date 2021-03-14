import java.util.*;
public class chap4ex16 {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("input an X value ");
        double x= input.nextDouble();
        System.out.println("Input a Y value");
        double y= input.nextDouble();
        if(x==0 || y==0){
            System.out.print("The coordinates you input are on the axis");
        }
        else if(x>0 && y>0){
            System.out.println("The coordinates you input are in Quadrant 1");
        }
        else if(x>0 && y<0){
            System.out.println("The coordinates you input are in quadrant 4");
        }
        else if (x<0 && y<0){
            System.out.println("The coordinates you input are in quadrant 3");
        }
        else if( x<0 && y>0){
            System.out.println("The coordinates you have input are in quadrant 2");
        }
    }
}
