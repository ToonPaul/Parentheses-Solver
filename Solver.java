//Name: Paul Hudalla
//Date: 11/7/25
//Determine if all the open parantheses in the string have matching closing parantheses

/*public class Solver{
    public static boolean StringTest(String s){
        String sub = s.substring(0,1);
        String newS = s.substring(1);
        do{
        if(sub.equals("(")){
            for(int i = 1;i < s.length();i++){
                if(s.indexOf[i].equals(")")){
                   newS = s.substring(0, i) + s.substring(i + 1); 
                }
            }
        }
        else{
            return false;
        }
        if (sub.equals("[")){
            for(int i = 1;i < s.length();i++){
                if(s.indexOf[i].equals("]")){
                    newS = s.substring(0, i) + s.substring(i + 1);
                }
            }
        }
        else{
            return false;
        }
        if (sub.equals("{")){
            for(int i = 1;i < s.length();i++){
                if(s.indexOf[i].equals("}")){
                    newS = s.substring(0, i) + s.substring(i + 1);
                }
            }
        }
    }while (s.length() > 0);
        if(s.equal("")){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        StringTest("(){}[]");
    }
}
    
/* int indexToRemove = 4; 
    String newS = s.substring(0, i) + s.substring(i + 1);
    
    do{
    
    }while(s.length() > 0)*/

    /*
     
    
     */