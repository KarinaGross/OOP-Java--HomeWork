package Homework5;

import java.util.ArrayDeque;

public class WaveAlgorithm {
    private PlayingField field;
    private ArrayDeque<Points> queue;
    private int[][] moves = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

    public WaveAlgorithm(PlayingField field) {
        this.field = field;
    }

    public PlayingField shortestWay(Points start, Points finish) {
        this.queue = new ArrayDeque<>();
        Points currentPoint;
        
        field.setPoint(start, 1);
        queue.add(start);
        int count;

        while (!queue.isEmpty()) {
            currentPoint = queue.pop();
            count = field.getCountPoint(currentPoint.getX(), currentPoint.getY());
            for (int[] move : moves) {
                if (field.getCountPoint(currentPoint.getX() + move[0], currentPoint.getY() + move[1]) == 0) {
                    Points nextPoint = new Points(currentPoint.getX() + move[0], currentPoint.getY() + move[1]);
                    // nextPoint.setX(currentPoint.getX() + move[0]);
                    // nextPoint.setY(currentPoint.getY() + move[1]);
                    field.setPoint(nextPoint, count + 1);
                    queue.add(nextPoint);
                }
            }
        }

        int finishCount = field.getCountPoint(finish.getX(), finish.getY());
        currentPoint = finish;
        while (finishCount > 1) {
            for (int[] move : moves) {
                if (finishCount - field.getCountPoint(currentPoint.getX() + move[0],
                        currentPoint.getY() + move[1]) == 1) {
                    finishCount--;
                    field.setPoint(currentPoint, -2);
                    currentPoint.setX(currentPoint.getX() + move[0]);
                    currentPoint.setY(currentPoint.getY() + move[1]);
                }
            }
        }
        return field;
    }

}
