import java.util.*;
public class EleminateVowal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Compuuter ";
        char arr[] = new char[25]; 
        int k=0,i=0,s = str.length();
        outer: for(;i<str.length();i++){
            
            if(i+1 < s)
                if(str.charAt(i) == str.charAt(i+1) ){
                arr[k++] = str.charAt(i);
                arr[k++] = str.charAt(i);
                continue outer;
            }
            
            switch(str.charAt(i)){
                case 'a': 
                    break;
                case 'e': 
                    break;
                case 'i': 
                    break;
                case 'o': 
                    break;
                case 'u': 
                    break;
                default :
                    arr[k++] = str.charAt(i);
            }
        }

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
        System.out.println();
    }    
}

