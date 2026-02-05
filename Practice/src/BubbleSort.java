public class BubbleSort {
    public static void main(String[] args){
        int a[] = {7,3,2,1,10,9,6};
        for(int i = a.length-1;i>0;i--){
            for(int j = 0;j<i;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
