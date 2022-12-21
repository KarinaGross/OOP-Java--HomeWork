package Homework7;

public class Program {
    public static void main(String[] args) {
        FilmFinder finder = new FilmFinder();

        System.out.println(finder.getAllInfoBy(1));
        System.out.println(finder.getAllInfoBy(2));
        System.out.println(finder.getAllInfoBy(3));
        System.out.println(finder.getAllInfoBy(4));
    }
}
