
public class ClientCode {
    public static void main(String[] args) {
        Human p1 = new Person("Maria");
        Human p2 = new Person("Rita");
        Human p3 = new Person("Oleg");
        Human p4 = new Person("Vlad");
        Human p5 = new Person("Serafima");
        Human p6 = new Person("Sveta");

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
        tree.print();
    }
}



