package Homework5;

import java.util.ArrayList;
import java.util.List;

public class Chatroom implements Chat {
    List<User> users;
    List<String> messages;

    public Chatroom() {
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    @Override
    public void viewUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public void addUser(User user) {
        messages.add("\n >>> добавился(ась) " + user.fullName);
        users.add(user);
    }

    @Override
    public void printMassages() {
        for (String msg : messages) {
            System.out.println(msg + "\n");
        }
    }

    @Override
    public void sendMsg(User user, String msg) {
        messages.add(user + " : " + msg);
    }
}
