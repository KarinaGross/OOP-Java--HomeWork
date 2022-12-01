import java.util.ArrayList;

public class Homework {
    public static void main(String[] args) {
        Person p1 = new Person("Maria");
        Person p2 = new Person("Rita");
        Person p3 = new Person("Oleg");
        Person p4 = new Person("Vlad");
        Person p5 = new Person("Serafima");
        Person p6 = new Person("Sveta");

        GeoTree tree = new GeoTree();

        tree.addRecord(p2, Relationship.parents(), p1);
        tree.addRecord(p3, Relationship.parents(), p1);
        tree.addRecord(p4, Relationship.parents(), p3);
        tree.addRecord(p6, Relationship.parents(), p2);
        tree.addRecord(p6, Relationship.parents(), p5);
        tree.addRecord(p5, Relationship.siblings(), p2);
        tree.addRecord(p2, Relationship.partner(), p3);

        System.out.println(new Research(tree).relationDegree(p1, Relationship.parents()));
        System.out.println(new Research(tree).relationDegree(p2, Relationship.siblings()));
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

class Relationship {
    private static String children = "children";
    private static String parents = "parents";
    private static String siblings = "siblings";
    private static String partner = "partner";

    public static String parents() {
        return parents;
    }

    public static String children() {
        return children;
    }

    public static String siblings() {
        return siblings;
    }
    
    public static String partner() {
        return partner;
    }
}

class GeoTree {
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

class Record {
    private Person person1;
    private Person person2;
    private String relation;

    public Record(Person person1, String relation, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
        this.relation = relation;
    }

    public Person getPerson1() {
        return person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public String getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return String.format("[%s - %s - %s]", person1, relation, person2);
    }
}

class Research {
    private ArrayList<Record> geoTree;

    public Research(GeoTree geoTree) {
        this.geoTree = geoTree.getGeoTree();
    }

    public ArrayList<Person> relationDegree(Person person, String relation) {
        ArrayList<Person> result = new ArrayList<>();

        for (Record record : geoTree) {
            if ((record.getPerson2() == person) && (record.getRelation().equals(relation))) {
                result.add(record.getPerson1());
            }
        }
        return result;
    }
}


