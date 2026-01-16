// Review  questions practice
package Level1;

public class Practice {
//    public static class Test{
//        {
//            System.out.println("Non static in test");
//        }
//        static{
//            System.out.println("This is a static block in test");
//        }
//        int marks;
//        Test(int marks){
//            this.marks = marks;
//        }
//    }
    static{
        System.out.println("This is a static block practice");
    }
    {
        System.out.println("Non static practice");
    }
    Practice(){
        System.out.println("Practice constructor");
    }
    public static void main(String args[]) {
        System.out.println("main start");
//        Test t = new Test(10);
//        System.out.println(t.marks);
        Practice p = new Practice();
        System.out.println("Main end");
    }
}
