public class CheckSubString {
    public static boolean checkSubString(String str1, String str2){
        String s = "";
        for(int i=0;i<str1.length()-1;i++){
            if(str1.charAt(i) == str2.charAt(0)){
                s = str1.substring(i, i+str2.length());
            }
        }
        return s.equals(str2);
    }
    public static void main(String[] args) {
        String str1="test123string";
        String str2 = "1234";

        System.out.println(checkSubString(str1, str2));
    }    
}
