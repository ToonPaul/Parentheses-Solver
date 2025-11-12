//Name: Paul Hudalla
//Date: 11/7/25
//Determine if all the open parantheses in the string have matching closing parantheses

public class Solver{
    public static boolean isValid(String s){
        String s2 = s.substring(0,1);
        s = s.substring(1);
        if((s2.equals("{")) || (s2.equals("[")) || (s2.equals("("))){
            
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        isValid("(){}[]");
    }
}
    
/* int indexToRemove = 4; 
    String newS = s.substring(0, i) + s.substring(i + 1);
    
    do{
    
    }while(s.length() > 0)*/

