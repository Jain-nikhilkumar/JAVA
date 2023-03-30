public class typicalkeypad_phonekey {
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static  void printcodde(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char Currchar=str.charAt(idx);
        String mapping=keypad[Currchar-'0'];

        for(int i=0;i<mapping.length();i++){
            printcodde(str,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str ="2";
        printcodde(str,0,"");
    }
}
