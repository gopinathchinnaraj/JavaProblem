public class LongestSequence {

    public static int largestCount(String str){
        int count = 0;
        int maxcount = 0;
        for(int i = str.length() - 1; i>=0; i--){
            for(int j=0;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j))
                    count = j - i - 1;

                if(count > maxcount)
                    maxcount = count;
            }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        String str = "abcccccbbd";
        System.out.println(largestCount(str));
    }
}
