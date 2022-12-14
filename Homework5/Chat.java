package Homework5;


public interface Chat {

    public void addUser(User user);

    public void viewUsers();

    public void printMassages();

    public void sendMsg(User user, String msg);

}
