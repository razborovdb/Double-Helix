package processing.sketches;

import processing.core.PApplet;

public class Circle implements Comparable<Circle> {
    public static final PApplet p = Main.sketch;
    private float x;
    private float y;
    private int color;
    private float diameter = 40;
    private float angle;

    public Circle(float x, int color, float angle) {
        this.x = x;
        this.color = color;
        this.angle = angle;
        this.y = p.height / 2;
    }

    public void drawSelf() {
        p.noStroke();
        p.fill(color);
        p.ellipse(x, y, diameter, diameter);
    }

    public void move() {
        y = p.height / 2 + 40 * (float) Math.sin(angle);
        angle += Math.PI / 60;
        diameter = 25 + 20 * (float) Math.cos(angle);
    }

    @Override
    public int compareTo(Circle other) {
        return Float.compare(this.diameter,other.diameter);
        //if(this.diameter > other.diameter) {
        //    return 1;
        //} else if(this.diameter < other.diameter) {
        //    return -1;
        //}
        //return 0;
    }
}
