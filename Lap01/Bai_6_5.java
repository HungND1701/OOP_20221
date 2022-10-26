public class Bai_6_5 {
    
    public static void main(String[] args) {
        final Integer[] arr = {1789,2035,1899,1456,2013};
        // bubble sort
        boolean haveSwap = false;
        for (int i = 0; i < arr.length-1; i++){
            haveSwap = false;
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    haveSwap = true; 
                }
            }
            if(haveSwap == false){
                break;
            }
        }
        String arr_string = "";
        for(int i = 0 ; i<arr.length;i++){
            arr_string +=arr[i]+",";
        }
        System.out.println("Array after sort is : ");
        System.out.println(arr_string);
    }
}
