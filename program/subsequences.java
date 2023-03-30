import java.util.HashSet;

public class subsequences {
    public static  void subsequences1(String str,int idx,String newstring ,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newstring)){
                return;
            }else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }

        }
        char Currchar=str.charAt(idx);
        //to be
        subsequences1(str, idx+1, newstring+Currchar,set);
        //noot to be
        subsequences1(str, idx+1 , newstring,set);
    }
     public static void main(String args[]) {
        String str="aaa";
        HashSet<String>set=new HashSet<>();
        subsequences1(str, 0, "",set);
        
    }
}
