package stringBuffer;

/* Compare time taken by StringBuffer and StringBuilder to concatenate 1 million strings */

public class Ques2 {
    public static void main(String[] args){
        // 1 million strings count
        int n = 1000000;

        // StringBuilder
        StringBuilder sbd = new StringBuilder();
        long startBuilder = System.nanoTime();
        for(int i = 0;i<n;i++){
            sbd.append("Hello");
        }
        long endBuilder = System.nanoTime();
        System.out.println("Time taken by Builder: " + (endBuilder - startBuilder)+ " ns");

        // StringBuffer
        StringBuffer sbf = new StringBuffer();
        long startBuffer = System.nanoTime();
        for(int i = 0;i<n;i++){
            sbf.append("Hello");
        }
        long endBuffer = System.nanoTime();
        System.out.println("Time taken by Buffer: " + (endBuffer - startBuffer) + " ns");

    }
}
