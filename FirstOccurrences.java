import java.util.HashMap;
import java.util.Map;

public class FirstOccurrences {
    public static void main(String[] args) {
        String str1 = "ZOHOCORPORATION";
        String str2 = "PORT";

        solution(str1, str2);
    }

    public static void solution(String str1, String str2){
        HashMap<Character , Boolean> map = new HashMap<>();
        for(int i=0;i<str2.length();i++)
            map.put(str2.charAt(i), true);
        int flag = 1, si=0, ei=0;
        for(int i=0;i<str1.length();i++){
            char currentChar = str1.charAt(i);
            if (map.containsKey(currentChar)) { // Check if it exists in the map
                if (flag == 1){
                    si = i;
                    flag = 0;
                }
                map.remove(currentChar);
                if (map.size() == 0) { // Change the condition to check if map is empty
                    ei = i;
                    break;
                }
            }
        }
                
        for(int i=si;i<=ei;i++){
            System.out.print(str1.charAt(i));
        }
    }
}