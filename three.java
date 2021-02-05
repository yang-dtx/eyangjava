public class test {
    public static final int SIZE=4;
    
    public static void main(String[]args){
        Dashline();
        Top();
        Bottom();
        Dashline();
        Bottom();
        Top();
        Dashline();
    }
       public static void Dashline(){
            System.out.print("+");
            for(int dash=1; dash<SIZE*2; dash++){
            System.out.print("-");
            }
            System.out.println("+");
    }
    

    public static void Bottom() {
        for(int line=1; line<=SIZE;line++){
            System.out.print("|");
            space2(line);
            for(int backslash=1; backslash<=-line+SIZE;backslash++){
                System.out.print("\\");
            }
            System.out.print("*");
            for(int slash=1; slash<=-line+SIZE;slash++){
                System.out.print("/");
            }
            space2(line);
            System.out.println("|");
    
        }
        
        
    }
public static void space2(int line){
    for(int space=1; space<=line-1;space++){
        System.out.print(" ");

    }

}

    public static void Top() {
        for(int line=1; line<=SIZE; line++){
            System.out.print("|");
            space(line);
            for(int slash=1; slash<=line-1;slash++){
                System.out.print("/");
            }
            System.out.print("*");
            for(int backslash=1; backslash<=line-1;backslash++){
                System.out.print("\\");
            }
            space(line);
            System.out.println("|");


        }
    }
    public static void space(int line){
        for(int space=1; space<=-1*line+SIZE;space++ ){
            System.out.print(" ");

        }
    }
//5










   
}
