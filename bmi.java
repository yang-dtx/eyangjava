
    import java.util.*;
    public class bmi{

    
    public static  void main(String []args){
        //Person 1
        
        System.out.println("Please enter your height");
        Scanner input= new Scanner(System.in);
        Double height1 = input.nextDouble();
         System.out.println("Please enter your weight");
         Double weight1 = input.nextDouble();
         Double BMI1= (weight1/(height1*height1))*703;

        if( BMI1<18.5){
            System.out.println("You are underweight");
        }
        else if(BMI1>=18.5 && BMI1<=24.9 ){
            System.out.println("You are at a normal weight");
        }
        else if( BMI1>=25.0 && BMI1<=29.9){
            System.out.println("You are overweight");
        }
        else if(BMI1<=30.0){

                   System.out.println("You are obese");
        }
        System.out.println("Please enter your height");
        Scanner input2= new Scanner(System.in);
        Double height2 = input.nextDouble();
         System.out.println("Please enter your weight");
         Double weight2 = input.nextDouble();
         Double BMI2= (weight1/(height1*height1))*703;
         if( BMI2<18.5){
            System.out.println("You are underweight");
        }
        else if(BMI2>=18.5 && BMI2<=24.9 ){
            System.out.println("You are at a normal weight");
        }
        else if( BMI2>=25.0 && BMI2<=29.9){
            System.out.println("You are overweight");
        }
        else if(BMI2<=30.0){
            System.out.println("You are obese");
        }
}

    
    


    
}

