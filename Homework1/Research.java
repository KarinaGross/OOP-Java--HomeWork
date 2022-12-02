import java.util.ArrayList;

public class Research {
    private ArrayList<Record> geoTree;

    public Research(GeoTree geoTree) {
        this.geoTree = geoTree.getGeoTree();
    }

    public ArrayList<Human> relationDegree(Human person, Relationship relation) {
        ArrayList<Human> result = new ArrayList<>();

        for (Record record : geoTree) {
            if ((record.getPerson2() == person) && (record.getRelation().equals(relation))) {
                result.add(record.getPerson1());
            }
        }
        return result;
    }
}
