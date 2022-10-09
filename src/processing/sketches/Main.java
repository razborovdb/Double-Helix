package processing.sketches;

import processing.core.PApplet;

import java.util.Arrays;
import java.util.Collections;

public class Main extends PApplet {
    public static PApplet sketch;

    private final int GAP = 50;

    int num = 10;

    private Circle[] circles;

    final int RED = color(255, 230, 200);
    final int TAN = color(255, 100, 80);

    public void settings() {
        sketch = this;
        size(600, 600);
    }

    public void setup() {
        circles = new Circle[num*2];

        for(int i = 0; i < circles.length / 2; i++) {
            int xCoord = width / 2 + (i - num / 2) * GAP;
            float angle = PI / 6 * i;
            circles[i] = new Circle(xCoord,RED,angle );

            circles[i+num] = new Circle(xCoord,TAN,angle+ PI);
        }

    }

    public void draw() {
        background(20);

        Arrays.sort(circles);
        for(Circle currentCircle : circles) {
            currentCircle.drawSelf();
            currentCircle.move();
        }

    }

    public static void main(String... args) {
        PApplet.main("processing.sketches.Main");
    }
}
