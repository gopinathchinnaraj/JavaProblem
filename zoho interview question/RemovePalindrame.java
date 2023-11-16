public class RemovePalindrame {

    public static Boolean isPalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void removePalindrome(String[] str){
        for(int i=0;i<str.length;i++)
            if(isPalindrome(str[i])){
                str[i] = "";
            }
    }
    public static void main(String[] args) {
        String str = "He did a good deed";
        String[] arr = str.split(" ");
        removePalindrome(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
            System.out.println();
    }
}
