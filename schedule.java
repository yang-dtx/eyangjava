public class schedule {
    private String elective=" ";
    private String math=" ";
    private String sport=" ";
public schedule(){
    elective="Painting";
    math="Geometry";
    sport="Basketball";

}
public schedule(String elective1, String math1, String sport1){
    if(elective1.equalsIgnoreCase("Painting")||elective1.equalsIgnoreCase("Video Production")||elective1.equalsIgnoreCase("Drawing") ){
        elective=elective1;
    }
    else{
        elective="invalid option";
    }
    if(math1.equalsIgnoreCase("Geometry")||math1.equalsIgnoreCase("Calculus")||math1.equalsIgnoreCase("Algebra")){
        math=math1;

    }
    else{
        math="Sorry this math option is not available";
    }
    if(sport1.equalsIgnoreCase("Basketball")||sport1.equalsIgnoreCase("Soccer")||sport1.equalsIgnoreCase("Volleyball")){
        sport=sport1;
    }
    else{
        sport="Sorry, we do not offer this sport at the moment";
    }
}
    public String getElective(){
        return elective;
    }
    public String getMath(){
        return math;
    }
    public String getSport(){
        return sport;
    }
    


    //... create a get for each field
    //mutator methods    change values of fields
public void setElective(String newElective){
    elective=newElective;
}
public void setBreed(String newMath){
    math=newMath;
}
    public void setAge(String newSport){
        sport=newSport;
    }
    public static String toString(schedule ob){
        return("Your classes are"+ ob.elective+"   "+ob.math+ "    "+ ob.sport+ "    ");
    }
 

    

}

    
    


