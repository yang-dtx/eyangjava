
import java.util.*;
public class arrayproject2{
   
    //Java’s type int has a limit on how large an integer it can store. This limit can be circumvented by representing an
//integer as an array of digits. Write an interactive program that adds two integers of up to 50 digits each.
public static void main(String[]args){
  Random rando = new Random();
  int [] max1= new int[50];
  int [] max2= new int[50];
for (int i=0; i<50; i++){
    max1[i]=rando.nextInt(10);
    max2[i]=rando.nextInt(10);

}

 int[]sumArray=new int[51];
 int carryon=0;
for (int i=49; i>=0; i--){
    int temp= max1[i]+max2[i]+carryon;   //temp=10
sumArray[i+1]=temp%10;    //sum Array(49)=0
 carryon=temp/10;  //carryon=1
}
sumArray[0]=carryon;
System.out.println(Arrays.toString(max1));
System.out.println(Arrays.toString(max2));
System.out.println(Arrays.toString(sumArray));
}


}

