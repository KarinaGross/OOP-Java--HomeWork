package Homework7;

public class FilmFinder {
    public FilmFinder() {
        init();
      }
    
      DataBase db;
    
      public DataBase getDb() {
        return db;
      }
    
      public String getAllInfoBy(int id) {
        Cinema c = db.films.get(id - 1);
    
        return String.format("%d %s %s %s",
            c.id,
            c.name,
            db.genres.get(c.genreId - 1).name,
            db.studios.get(c.creatorId - 1).titleName);
      }
    
      DataBase init() {
        db = new DataBase();
        Cinema c1 = new Cinema(1, "РўСЊРјР°", 1, 1);
        Cinema c2 = new Cinema(2, "РЎРІРµС‚", 1, 2);
        Cinema c3 = new Cinema(3, "РћСЃРѕР±РµРЅРЅРѕСЃС‚Рё РѕС…РѕС‚С‹...", 3, 4);
        Cinema c4 = new Cinema(4, "Р§РµР»РѕРІРµРє РїР°СѓРє", 3, 3);
    
        db.films.add(c1);
        db.films.add(c2);
        db.films.add(c3);
        db.films.add(c4);
    
        db.genres.add(new Genre(1, "РЈР¶Р°СЃС‹"));
        db.genres.add(new Genre(2, "Р”СЂР°РјР°"));
        db.genres.add(new Genre(3, "РљРѕРјРµРґРёСЏ"));
        FilmCreatorFactory pf = new FilmCreatorFactory();
        db.addStudios(pf.getFilmProducer("Р›РµРЅС„РёР»СЊРј"));
        db.addStudios(pf.getFilmProducer("РњР°СЂРІРµР»"));
        db.addStudios(pf.getFilmProducer("РњРѕСЃС„РёР»СЊРј"));
        db.addStudios(pf.getFilmProducer("DC"));
    
        return db;
      }
    
}
