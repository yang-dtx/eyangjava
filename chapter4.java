import java.util.*;
public class chapter4 {
    public static void main (String[]args){
//Project for Chapter 4
Scanner input= new Scanner (System.in);
System.out.print("What is your name? ");
String name1= input.nextLine();
System.out.print("Please insert your GPA");
double GPA1 = input.nextDouble();
System.out.print("Please insert your SAT Scores");
int SAT1 = input.nextInt();
System.out.print("Please insert your ACT Scores");
int ACT1 = input.nextInt();
System.out.print("What is your name? ");
String name2= input.nextLine();
input.next();
System.out.print("Please insert your GPA");
double GPA2 = input.nextDouble();
System.out.print("Please insert your SAT Scores");
int SAT2 = input.nextInt();
System.out.print("Please insert your ACT Scores");
int ACT2 = input.nextInt();
int count1=0;
int count2=0;
if( GPA1>GPA2){
    count1++;
}
else if (GPA2>GPA1 ){
    count2++;
}
if(SAT1>SAT2){
    count1++;
}
else if (SAT2>SAT1){
    count2++;
}
if (ACT1>ACT2){
    count1++;
}
else if (ACT2>ACT1){
    count2++;
}
if(count1>count2){
    System.out.println("Applicant1 " + name1+" is qualified ");
}
else if( count2 > count1){
    System.out.println("Applicant2"+ name2+ " is qualified");
}
else{
    System.out.println("Neither are qualified");
}

    }

}
