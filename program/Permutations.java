public class Permutations {
    public static void printpermutaitions(String str,String Permutations){

        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0,i)+ str.substring(i+1);
            printpermutaitions(newstr,Permutations+currchar);

        }
    }
    public static void main(String args[]){
        String str="abc";
        printpermutaitions(str,"");
    }
}
5b5