//Name: Paul Hudalla
//Date: 11/7/25
//Determine if all the open parantheses in the string have matching closing parantheses

public class Solver{
    public static boolean StringTest(String s){
        String sub = s.substring(0,1);
        String sub2;
        if(sub.equals("(")){
            for(int i = 1;i < s.length();i++){
                if(s.indexOf[i].equals(")")){
                    sub2 = s.substring(i, i+1);
                }
            }
        }
        else if (sub.equals("[")){
            for(int i = 1;i < s.length();i++){
                if(s.indexOf[i].equals("]")){
                    sub2 = s.substring(i, i+1);
                }
            }
        }
        else if (sub.equals("{")){
            for(int i = 1;i < s.length();i++){
                if(s.indexOf[i].equals("}")){
                    sub2 = s.substring(i, i+1);
                }
            }
        }
        else{
            return false;
        }
    }
}
    