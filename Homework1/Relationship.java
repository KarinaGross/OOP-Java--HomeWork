// public class Relationship {
//     private static String children = "children";
//     private static String parents = "parents";
//     private static String siblings = "siblings";
//     private static String partner = "partner";

//     public static String parents() {
//         return parents;
//     }

//     public static String children() {
//         return children;
//     }

//     public static String siblings() {
//         return siblings;
//     }
    
//     public static String partner() {
//         return partner;
//     }
// }

public enum Relationship {
    CHILDREN,
    PARENTS,
    SIBLINGS,
    PARTNER;

    // CHILDREN("children"),
    // PARENTS("parents"),
    // SIBLINGS("siblings"),
    // PARTNER("partner");

    // private String relation;

    // private Relationship(String relation) {
    //     this.relation = relation;
    // }

    // @Override
    // public String toString() {
    //     return relation;
    // }
}