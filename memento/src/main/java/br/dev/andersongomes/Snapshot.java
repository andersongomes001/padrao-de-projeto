package br.dev.andersongomes;

public class Snapshot {
    private Editor editor;
    private String text;
    private Long curX;
    private Long curY;
    private Long selectionWidth;

    public Snapshot(Editor editor, String text, Long curX, Long curY, Long selectionWidth) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }


    public void restore() {
        editor.setText(text);
        editor.setCursor(curX, curY);
        editor.setSelectionWidth(selectionWidth);
    }


}
