public class zoho1brackets{
    public static void main(String[] args) {
        String str= "(9*(7-2)*(1*5))";
        int c=0;
        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case '(':
                    c++;
                    break;
                case ')':
                    c--;
                    break;
            }
        }
        if(c==0)
            System.out.println("Complete");
        else 
        
            System.out.println("Incomplete");
    }
}