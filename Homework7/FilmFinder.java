package Homework7;

public class FilmFinder {
    public FilmFinder() {
        init();
      }
    
      DataBase db;
    
      public DataBase getAllFilms() {
        return db;
      }
    
      public String getAllInfoBy(int id) {
        Cinema c = db.films.get(id - 1);
    
        return String.format("%d. '%s', жанр: %s, кинокомпания: %s, режиссер: %s",
            c.id,
            c.name,
            db.genres.get(c.genreId - 1).name,
            db.studios.get(c.studioId - 1).name,
            db.directors.get(c.directorId - 1).name);
      }
    
      DataBase init() {
        db = new DataBase();
        Cinema c1 = new Cinema(1, "Тайна Коко", 1, 1, 1);
        Cinema c2 = new Cinema(2, "Белоснежка и семь гномов", 2, 2, 1);
        Cinema c3 = new Cinema(3, "Титаник", 3, 3, 2);
        Cinema c4 = new Cinema(4, "Ла-Ла Ленд", 3, 4, 3);
    
        db.films.add(c1);
        db.films.add(c2);
        db.films.add(c3);
        db.films.add(c4);
    
        db.genres.add(new Genre(1, "мультфильм"));
        db.genres.add(new Genre(2, "боевик"));
        db.genres.add(new Genre(3, "мелодрамма"));
        
        db.addStudios(new Studio(1, "Disney"));
        db.addStudios(new Studio(2, "Paramount Pictures"));
        db.addStudios(new Studio(3, "Summit Entertainment"));

        db.directors.add(new Director(1, "Эдриан Молина"));
        db.directors.add(new Director(2, "Дэвид Хэнд"));
        db.directors.add(new Director(3, "Джеймс Кэмерон"));
        db.directors.add(new Director(4, "Дэмьен Шазелл"));
    
        return db;
      }
    
}
