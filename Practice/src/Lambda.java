interface i1{
    void f2(int a);
}
public class Lambda {
    public static void main(String args[]){
        i1 x = (b) -> {
            System.out.println("Hello" + " " + b);
        };
        x.f2(10);
    }
}




// -> ArrayList<ArrayList<Integer>> x;
// -> int b[];
// -> ArrayList<HashMap<String, String>> al;
// -> String c[],
// -> String b,
// -> String [][],
// -> HashSet<String> h1,
// -> HashMap<Integer,Integer> hm,
// -> int a[][][],
// -> ArrayList<HashSet<Integer>> h