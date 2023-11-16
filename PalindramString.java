import java.util.*;
public class PalindramString {
    public static void main(String[] args) {
        String str = "epajfxzfnvte";
        // String rstr = "";
        // for(int i=0;i<str.length();i++){
        //     rstr = str.charAt(i) + rstr ;
        // }

        // System.out.println(str.equals(rstr));
        // System.out.println(rstr);

        int low = 0, high = str.length()-1, flag = 0;
        while(low<=high){
            if(str.charAt(low) != str.charAt(high)){
                flag = 1;
                break;
            }
            low++;
            high--;
        }

        System.out.println(flag == 0);
    }
}
