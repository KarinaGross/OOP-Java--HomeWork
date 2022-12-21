package Homework7;

public class Cinema {
    int id;
    int directorId;
    String name;
    int genreId;
    int studioId;

    public Cinema(int cinemaId, String name, int genreId, int directorId, int studioId) {
        this.id = cinemaId;
        this.directorId = directorId;
        this.name = name;
        this.genreId = genreId;
        this.studioId = studioId;
    }
}
