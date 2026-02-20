import java.util.ArrayList;

public class exceptions {
//    String f(){
//        try{
//            int i = 9/0;
//            System.out.println(i);
//        }
//        catch(Exception e){
//            System.out.println("red");
//            return "green";
//        }
//        finally{
//            System.out.println("black");
//
//        }
//        System.out.println("purple");
//        return "orange";
//    }
//    ArrayList<Integer> x = new ArrayList<>();
//    try{
//        x.add(7);x.add(4);x.add(8);
//        x.get(3);
//        x.add(2);
//    }
//    catch(NullPointerException e){
//        System.out.println("India" + x.size());
//    }
//    catch(ArrayIndexOutOfBoundsException  e){
//        System.out.println("America" + x.size());
//    }

    String f(){
        try{
            int x = 0;
            try{
                int y = x/0;
            }
            catch(NullPointerException e){
                System.out.println("auto");
            }
            finally{
                System.out.println("Taxi");
            }
        }
        catch(ArithmeticException e){
            System.out.println("ola");
        }
        finally {
            System.out.println("uber");
            return "rapido";
        }
    }
}
