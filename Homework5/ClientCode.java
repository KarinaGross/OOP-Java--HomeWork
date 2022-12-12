package Homework5;

public class ClientCode {
    public static void main(String[] args) {
        PlayingField map = new PlayingField();
        FieldPrinter fp = new FieldPrinter();
        System.out.println(fp.printColorField(map));

        Points start = new Points(15, 7);
        Points finish = new Points(1, 10);

        WaveAlgorithm wa = new WaveAlgorithm(map);
        wa.shortestWay(start, finish);
        System.out.println(fp.printFieldOfNumbers(map));
    }
}
