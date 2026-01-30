public class Challenge {
    public static void main(String[] args) {
        int n = 1_000_000;

        long t1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("hello");
        long t4 = System.nanoTime();

        System.out.println("StringBuilder: " + (t2 - t1));
        System.out.println("StringBuffer : " + (t4 - t3));
    }
}
