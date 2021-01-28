public class LoopsHomework{
    public static void main(String [] args){

        //7
        int count = 0;
        for (int i =5; i>0; i--){
            for (int x = 0; x<=i-2; x++){
                System.out.print(" ");
            }
            count += 1;
            System.out.print(count);
            System.out.println();
        }
        //9
topline();
PrintWeird();
printNumbers();
topline();

        //11
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

//13
for(int i = 0; i<5; i++){
    for(int x=9; x>=0; x--){
        for(int y=0; y < 5; y++){
            System.out.print(x);
        }
    }
    System.out.println();
}
//15
 printDesign();
//17


}
    //9
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

