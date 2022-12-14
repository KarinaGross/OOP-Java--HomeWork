import java.util.ArrayList;

public class GeoTree implements Printer{
    private ArrayList<Record> geoTree = new ArrayList<>();

    public ArrayList<Record> getGeoTree() {
        return geoTree;
    }

    public void addRecord(Human person1, Relationship relation, Human person2) {
        if (relation.equals(Relationship.PARENTS)) {
            geoTree.add(new Record(person1, Relationship.PARENTS, person2));
            geoTree.add(new Record(person2, Relationship.CHILDREN, person1));
        } else {
            geoTree.add(new Record(person1, relation, person2));
            geoTree.add(new Record(person2, relation, person1));
        } 
    }

    @Override
    public void print() {
        for (Record record : geoTree) {
            System.out.println(record);
        }
        
    }
}
