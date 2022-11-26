package task1.question1.animals;

public class Main {
    public static void main(String[] args) {
       Ping ping =new Ping("lolo","bird",80,15,"white");
       Ping ping1 =new Ping("lulu","bird",65,12,"white-black");
        ping.eat();
        System.out.println(ping);
       boolean flag = ping.equals(ping1);


        System.out.println(ping.hashCode());
        System.out.println(ping1.hashCode());
        System.out.println(ping1.toString());
        System.out.println(flag);
    }
}
