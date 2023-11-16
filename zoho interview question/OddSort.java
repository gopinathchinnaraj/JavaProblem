public class OddSort {

    public static void oddEvensort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+2;j<arr.length;j+=2)
                if(arr[i]<arr[j] || arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
    }

    public static void sortDescending(int[] arr){
        for(int i=0;i<arr.length;i+=2){
            for(int j = i+2;j<arr.length;j+=2){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=1;i<arr.length;i+=2){
            for(int j = i+2;j<arr.length;j+=2){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr){
        // for(int i=0;i<arr.length;i++)
        //     System.out.print(arr[i] + " ");
        // System.out.println();
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {13,2, 4,15,12,10,5};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};

        sortDescending(arr1);
        printArray(arr1); // 13,2,12,10,5,15,4
        sortDescending(arr2);
        printArray(arr2); // 9,2,7,4,5,6,3,8,1

        oddEvensort(arr1);
        printArray(arr1);
    }
}
