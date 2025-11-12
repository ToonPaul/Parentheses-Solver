//Name: Paul Hudalla
//Date: 11/7/25
//Determine if all the open parantheses in the string have matching closing parantheses

public class Attempt2{
    public static boolean isValid(String s){
        for(int i = s.length(); i > 0;i--){
            if(s.indexOf[i].equals("(")){
                if(s.indexOf[i+1].equal(")")){
                    s = s.substring(0,i) + s.substring(i+2);
                } else{
                    return false;
                }
            } else if (s.indexOf[i].equals("[")){
                if(s.indexOf[i+1].equal("]")){
                    s = s.substring(0,i) + s.substring(i+2);
                } else{
                    return false;
                }
            } else if (s.indexOf[i].equals("{")){
                if(s.indexOf[i+1].equal("}")){
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