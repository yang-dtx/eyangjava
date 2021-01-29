public class LoopHomework{
    public static void main(String [] args){
        //question 3
        int first= 0;
        int second = 1; 
        int size= 10;
        int count = 0; 
        for (int i = 1; i<=size; i++){
            int print = first+second;
            System.out.println(print);
            if (count == 0){
                first= first+second;
                count = 1;
            }
            else if(count == 1){
                first = first + second;
                count = 0;
            }
        }
        //question 5
        for(int j=0; j<=5; j++){
            for(int x=0; x<=j; x++){
                System.out.print("*"); 
            }
            System.out.println();
        }
        System.out.println();
        //question 9
        topline();
        PrintWeird();
        printNumbers();
        topline();
        //question 11
        for (int i = 0; i <10; i++){
            for( int x=0; x<4; x++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 0; i <10; i++){
            for (int x=1; x<=4; x++){
                System.out.print(x);
            }
            System.out.print("0");
        }
        System.out.println();
        for (int i = 0; i <7; i++){
            for( int x=0; x<7; x++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 0; i <7; i++){
            for (int x=1; x<=7; x++){
                System.out.print(x);
            }
            System.out.print("0");
        }
            System.out.println();
        //question 15
        printDesign();

        //question 13
        for(int i = 0; i<5; i++){
            for(int x=9; x>=0; x--){
                for(int y=0; y < 5; y++){
                    System.out.print(x);
                }
            }
            System.out.println();
        }

        //question 17
        int Height = 4;
        for(int i = 0; i<=Height; i++){
            for (int x=0; x<=Height*2-1; x++){
            }
        }
    }
    public static void topline () {   
        for(int dots=1; dots<=40; dots++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void printNumbers() {
        for(int i=1; i<=20; i++){
        System.out.print(i%10);
        System.out.print(i%10);
        }
        System.out.println();
    }
    public static void PrintWeird(){ 
        for(int i=1; i<=10; i++){
            System.out.print("_-^-");
        }
        System.out.println();
    }
    public static void printDesign(){
        int z=1;
        for (int i =5; i>0; i--){
            for (int x = 0; x<=i-1; x++){
                System.out.print("-");
            }
            for(int y=0; y<z; y++){
                System.out.print(z);
            }
            z+=2;
            for (int x = 0; x<=i-1; x++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}