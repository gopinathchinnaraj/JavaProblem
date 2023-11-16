public class ReserveStringRecursion {

    public static void stringReverse(String[] arr,int key){
        if(key == arr.length - 1){
            System.out.println(arr[key]);
            return ;
        }
        stringReverse(arr, ++key);
        System.out.println(arr[--key]);
    }
    public static void main(String[] args) {
        String str = "one two three four five";
        String[] arr = str.split(" ");
        stringReverse(arr, 0);
    }    
}
