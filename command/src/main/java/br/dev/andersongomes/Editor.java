package br.dev.andersongomes;

public class Editor {
    private String text;

    public String getSelection(){
        return text;
    }

    public void deleteSelection(){
        //deletar
    }

    public void replaceSelection(String text){
        //substituir
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
