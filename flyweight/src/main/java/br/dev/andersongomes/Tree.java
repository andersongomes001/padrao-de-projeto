package br.dev.andersongomes;

public class Tree {
    private double x;
    private double y;
    private TreeType type;

    public Tree(double x, double y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(String canvas){
        type.draw(canvas, this.x, this.y);
    }
}
