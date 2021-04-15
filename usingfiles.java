import java.io.*;
import java.util.*;
public class usingfiles {
    public static void main(String[]args) throws FileNotFoundException{
        File myFile = new File("C:\\Users\\YangE24\\Java\\example.txt");
        Scanner input= new Scanner(myFile);
double temp1=0;
        if(input.hasNextDouble()){

        }
        
        double temp=input.nextDouble();
        
        double temp2=0;
        double change=0;
        while (input.hasNext()){
            
            while(input.hasNext()){
                if(input.hasNextDouble()){
                    temp2=input.nextDouble();
                    change= temp2-temp2;
                    System.out.printf("%,if to %,if change"  );
                    temp1=temp2;
                    
                }
                else{
                    String trash= input.next();
                }
            
                

                
                    
                

                
                
    
    }
}
    }
}
    


