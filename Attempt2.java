//Name: Paul Hudalla
//Date: 11/7/25
//Determine if all the open parantheses in the string have matching closing parantheses

public class Attempt2{
    public static boolean isValid(String s){
        for(int i = s.length(); i > 0;i--){
            if(s.substring(i,i+1).equals("(")){
                if(s.substring(i+1,i+2).equals(")")){
                    s = s.substring(0,i) + s.substring(i+2);
                } else{
                    return false;
                }
            } else if (s.substring(i,i+1).equals("[")){
                if(s.substring(i+1,i+2).equals("]")){
                    s = s.substring(0,i) + s.substring(i+2);
                } else{
                    return false;
                }
            } else if (s.substring(i,i+1).equals("{")){
                if(s.substring(i+1,i+2).equals("}")){
                    s = s.substring(0,i) + s.substring(i+2);
                } else{
                    return false;
                }
            }
        
        }
    }
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]")); //true
    }
}