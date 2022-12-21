package Homework7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        FilmFinder finder = new FilmFinder();
        Scanner input = new Scanner(System.in);
        int command = -2;
        while (command != -1) {
            System.out.println("0 - посмотреть весь список фильмов\nID фильма - увидеть информацию о фильме\n-1 - выход\n");
            command = input.nextInt();
            if (command == 0) {
                System.out.println(finder.getAllFilms());
            } 
            else if (command == -1) {
                break;
            } else {
                System.out.println(finder.getAllInfoBy(command) + "\n");
            }
        }

        input.close();
    }
}
