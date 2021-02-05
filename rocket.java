package Project1;

public class rocket {
    public static final int SIZE=6; //must be divisible by 2
    public static void main (String[]args){
        Top();
        Bottom();
        Line();
        Topin();
        Bottomin();
        Line();
        Bottomin();
        Topin();
        Line();
        Top();

    }
    
    public static void Bottomin() {
        for(int line=0; line<SIZE; line++){
        System.out.print("|");
        
for(int dot = 1; dot <= line; dot++) {
    System.out.print(".");
}
for (int slash = 0; slash < SIZE-line; slash++) {
    System.out.print("\\/");
}
for(int dot = 1; dot <= line; dot++) {
    System.out.print("..");
}
for (int slash = 0; slash < SIZE-line; slash++) {
    System.out.print("\\/");
}
for(int dot = 1; dot <= line; dot++) {
    System.out.print(".");
}
System.out.println("|");
           
        }

    }

    public static void Topin() {
        for(int line=1; line<=SIZE;line++){
             System.out.print("|");
             for(int dots=1; dots<=-1*line+SIZE; dots++){
                 System.out.print(".");
             }
             for(int tri=1; tri<=line; tri++){
                 System.out.print("/\\");
             }
             for(int dots2=1; dots2<=-2*line+SIZE*2; dots2++){
                 System.out.print(".");
             }
             for(int tri=1; tri<=line; tri++){
                System.out.print("/\\");
                
            }
            for(int dots=1; dots<=-1*line+SIZE; dots++){
                System.out.print(".");
            }

             System.out.println("|");
            
         }
        }

    

    public static void Line() {
        System.out.print("+");
        for(int line=1; line<=2*SIZE; line++ ){
            System.out.print("=*");
        }
        System.out.println("+");

    }
    

    public static void Bottom() {

    }

    public static void Top() {
        for(int line=1; line<=2*SIZE-1; line++){
            for(int space=1; space<=-1*line+2*SIZE; space++){
                System.out.print(" ");
            }
            for(int slash=1; slash<=line; slash++){
                System.out.print("/");

            }
            System.out.print("**");
            for(int backslash=1 ; backslash<=line; backslash++){
                System.out.print("\\");

            }
            System.out.println();
            
           
}
    }
public static void space(int line) {
    }
}
   
   
   