
public class ClientCode {
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



