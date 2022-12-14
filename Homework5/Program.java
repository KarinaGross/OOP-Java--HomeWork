package Homework5;

public class Program {
    public static void main(String[] args) {
        Chat cats = new Chatroom();
        User u1 = new User("Вика Иванова");
        User u2 = new User("Леша Попов");
        User u3 = new User("Илья Казаков");
        User u4 = new User("Марина Игнатова");

        cats.addUser(u1);
        cats.addUser(u2);
        cats.addUser(u3);
        
        // cats.viewUsers();

        cats.sendMsg(u1, "Всем привет! Я Вика)");
        cats.sendMsg(u3, "Привет, меня зовут Илья");
        cats.sendMsg(u2, "Привет, я Леша");

        cats.addUser(u4);

        cats.sendMsg(u4, "А я Марина, привет))");

        cats.printMassages();
    }
}
