import java.io.*;
import java.util.*;
public class hoursproblem {
        public static void main(String[] args) throws FileNotFoundException {
            File myFile = new File("C:\\Users\\YangE24\\Java\\hours.txt");
            Scanner input= new Scanner(myFile);
            int id = 0;         // employee id ex=456
            String employeename = " ";        // example "Eric, Kim, or Stef"
            double sum = 0.0;
            int count = 0;
            while (input.hasNextLine()) {
                Scanner line = new Scanner (input.nextLine());
                Employee(line, id, employeename, sum, count);
                sum=0;
                count=0;
            }
        }
    
        public static void Employee(Scanner lineScan, int id, String employeename, double sum, int count) {
            if(lineScan.hasNextInt()){
                 id= lineScan.nextInt();
            }
            if(lineScan.hasNext()){
                employeename= lineScan.next();
            }
            
            while (lineScan.hasNextDouble()) {
                sum = sum + lineScan.nextDouble();
                count++;
            }
    
            double average = sum / count;
            System.out.println(employeename + " (employeeID#" + id + ") worked " +sum + " hours (" + average + " hours/day)");
        }
    
    


}



