public class Ques19 {
    public static void main(String args[]){
        int arr[] = {23,45,82,27,66,12,78,13,71,86};
        findMax(arr);
    }
    public static void findMax(int arr[]){
        if(arr == null){
            System.out.println("NO ELEMENTS IN THE ARRAY");
        }
        int maxValue = 0;
        int maxIndex = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}
