public class AddBinary {
    
    public static int addBinary(String a) {
        int k=0, sum1=0;
        for(int i=a.length()-1;i>=0;i--){
            int z = a.charAt(i) - '0';
            sum1+=z*Math.pow(2, k);//(int)a.charAt(i)*2^k;
            k++;
        }
        return sum1;
    }

    public static String convert(int sum){
        int rem;
        StringBuilder st = new StringBuilder();
        do{
            rem = sum % 2;
            st.append(rem);
            sum = sum / 2;
        }while(sum>=1);
        if(sum/2==1)
            st.append(1);

        return new String(st.reverse());
    }



    public static void main(String[] args) {
        System.out.println(convert(addBinary("1000")+addBinary("001")));
    }
    
}
