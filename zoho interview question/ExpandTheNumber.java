public class ExpandTheNumber {

    public static void expand(String str){
        String ch="";
        int num=0;
        for(int i=0;i<str.length()-1;i++){
            if(!Character.isLetter(str.charAt(i))){
                ch = String.valueOf(str.charAt(i-1));
                while(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    num = (num * 10) + (str.charAt(i) - 48);
                    i++;
                }i--;
                for(int j=0;j<num;j++)
                    System.out.print(ch);
                num = 0;
            }
            
            
        }
    }

    public static void main(String[] args) {
        String str = "a12b13c10d20";
        str += "a3";
        expand(str);
    }
}
