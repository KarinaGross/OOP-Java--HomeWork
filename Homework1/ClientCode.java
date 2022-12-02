
public class ClientCode {
    public static void main(String[] args) {
        Human p1 = new Person("Maria");
        Human p2 = new Person("Rita");
        Human p3 = new Person("Oleg");
        Human p4 = new Person("Vlad");
        Human p5 = new Person("Serafima");
        Human p6 = new Person("Sveta");

        GeoTree tree = new GeoTree();

        tree.addRecord(p2, Relationship.PARENTS, p1);
        tree.addRecord(p3, Relationship.PARENTS, p1);
        tree.addRecord(p4, Relationship.PARENTS, p3);
        tree.addRecord(p6, Relationship.PARENTS, p2);
        tree.addRecord(p6, Relationship.PARENTS, p5);
        tree.addRecord(p5, Relationship.SIBLINGS, p2);
        tree.addRecord(p2, Relationship.PARTNER, p3);

        System.out.println(new Research(tree).relationDegree(p1, Relationship.PARENTS));
        System.out.println(new Research(tree).relationDegree(p2, Relationship.SIBLINGS));
        tree.print();
    }
}



