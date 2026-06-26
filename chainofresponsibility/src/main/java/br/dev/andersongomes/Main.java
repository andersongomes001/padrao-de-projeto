package br.dev.andersongomes;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog("Budget Reports");
        dialog.setWikiPageUrl("https://pt.wikipedia.org/");
        Panel panel = new Panel(0,0,400,800);
        //panel.setModalHelpText("This panel does...");
        Button ok = new Button(250, 760, 50, 20, "OK");
        ok.setTooltipText("This is an OK button that...");
        Button cancel = new Button(320, 760, 50, 20, "Cancel");

        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);


        panel.showHelp();
    }
}