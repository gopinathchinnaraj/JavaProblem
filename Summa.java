import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Summa {
//     public static boolean isValid(String s) { s="111.222.333.444"
//     // Write your code here
//     //if(s.charAt(0) == '0') return false;
//     if(s.length() > 15) return false;  
//     int counter = 0, si=0;//si=starting index
//     for(int i=0;i<s.length();i++){
//         if(s.charAt(i) == '.') 
//             counter++;
//     }
//     if(counter > 3) return false;  //ipv4 validation
//     for(int i=0;i<s.length();i++){
//         if(s.charAt(i) == '.') {
//             if(isValid(s, si, i)){
//                 counter++;
//                 si = i+1;
//             } else return false;
//             if(counter == 3){
//                 if(isValid(s, si, s.length()))
//                     return true;
//                 else 
//                     return false;
//             }
//         }
//     }
//     return counter == 3;
// }

// public static String reverseWords(String s)  String str = "i.like.this.program.very.much";
// {
//     // your code here
//     Stack<Character> ch = new Stack<>();
//     String ans = "";
//     for(int i=0;i<s.length();i++){
//         if(s.charAt(i) != '.')
//             ch.push(s.charAt(i));
//         else {
//             if(i<s.length())
//                 while(!ch.empty()){
//                     ans+=ch.pop();   // Convert Integer to words
//                 }
//             if(ch.empty())
//                 ans+='.';
//         }
//     }
//     while(!ch.empty()){
//         ans+=ch.pop();
//     }

//     return ans;
// }

    public static void main(String[] args) {
        // String str = "program";
        // int n = str.length();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j || i + j == n-1){
        //             System.out.print(str.charAt(j) + " ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //}
        int num = 1;
        char c = (char)(num + 64);
        System.out.println(c);

    }
}
