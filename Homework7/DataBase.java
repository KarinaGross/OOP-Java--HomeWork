package Homework7;

import java.util.ArrayList;

public class DataBase {
    ArrayList<Cinema> films = new ArrayList<>();
    ArrayList<Studio> studios = new ArrayList<>();
    ArrayList<Genre> genres = new ArrayList<>();
    ArrayList<Director> directors = new ArrayList<>();

    public void addStudios(Studio producer) {
        studios.add(producer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cinema film : films) {
            sb.append(String.format("%d. '%s'\n", film.id, film.name));
        }
        return sb.toString();
    }
}
