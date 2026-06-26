package br.dev.andersongomes;

public class Editor {
    private String text;
    private Long curX;
    private Long curY;
    private Long selectionWidth;

    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(Long curX, Long curY) {
        this.curX = curX;
        this.curY = curY;
    }

    public void setSelectionWidth(Long selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public Snapshot createSnapshot(){
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }
}
