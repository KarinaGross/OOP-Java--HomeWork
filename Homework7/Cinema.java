package Homework7;

public class Cinema {
    int id;
    int directorId;
    String name;
    int genreId;

    public Cinema(int cinemaId, String name, int genreId, int directorId) {
        this.id = cinemaId;
        this.directorId = directorId;
        this.name = name;
        this.genreId = genreId;
    }
}
