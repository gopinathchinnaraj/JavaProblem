public class OddNumberGenerater {

    public static void range(int si, int ei){
        for(int i=si;i<ei;i++)
            if(i%2!=0)
                System.out.print(i + " ");
        
        System.out.println();
    }

    public static void main(String[] args) {
        int si = 2, ei = 15;
        range(si, ei);
    }
    
}
