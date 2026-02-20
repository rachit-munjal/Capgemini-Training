import java.util.*;

public class PubSub {
    public static void main(String args[]){
        Tseries t = new Tseries();

        Users u1 = new A("Aman");
        Users u2 = new A("Simran");
        Users u3 = new A("Rahul");

        t.register(u1);
        t.register(u2);
        t.sendNotification("New Song Released!");
        t.register(u3);
        t.delete(u1);
        t.sendNotification("Live Concert Streaming!");
    }
}
interface Youtube{
    void register(Users u);
    void delete(Users u);
    void sendNotification(String message);
}
class Tseries implements Youtube{
    List<Users> ll = new ArrayList<>();
    public void register(Users u){
        ll.add(u);
    }
    public void delete(Users u){
        ll.remove(u);
    }
    public void sendNotification(String message){
        System.out.println(message);
        for(Users user : ll){
            user.update(message);
        }
    }
}
interface Users{
    void update(String a);
}
class A implements  Users{
    String name;
    public void update(String a){
        System.out.println(name + " " + a);
    }
    A(String name){
        this.name = name;
    }
}
