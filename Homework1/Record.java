public class Record {
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
