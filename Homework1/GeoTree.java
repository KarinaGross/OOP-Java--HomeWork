import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Record> geoTree = new ArrayList<>();

    public ArrayList<Record> getGeoTree() {
        return geoTree;
    }

    public void addRecord(Person person1, String relation, Person person2) {
        if (relation.equals(Relationship.parents())) {
            geoTree.add(new Record(person1, Relationship.parents(), person2));
            geoTree.add(new Record(person2, Relationship.children(), person2));
        } else {
            geoTree.add(new Record(person1, relation, person2));
            geoTree.add(new Record(person2, relation, person1));
        }
        
    }
}
