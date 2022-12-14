package Homework4;


public class FieldPrinter {
    // PlayingField field;

    public String printColorField(PlayingField field) {
        // this.field = field;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < field.getRowLen(); i++) {
            for (int j = 0; j < field.getColLen(); j++) {
                if (field.getCountPoint(i, j) == -1) {
                    result.append("▓▓");
                } else if (field.getCountPoint(i, j) == -2) {
                    result.append("▒▒"); //
                } else {
                    result.append("░░");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    public String printFieldOfNumbers(PlayingField field) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < field.getRowLen(); i++) {
            for (int j = 0; j < field.getColLen(); j++) {
                if (String.valueOf(field.getCountPoint(i, j)).length() > 1) {
                    result.append(field.getCountPoint(i, j) + " ");
                } else {
                    result.append(" " + field.getCountPoint(i, j)  + " ");
                }
                
            }
            result.append("\n");
        }
        return result.toString();
    }
}
