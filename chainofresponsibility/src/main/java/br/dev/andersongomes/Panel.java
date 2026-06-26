package br.dev.andersongomes;

import java.util.Objects;

public class Panel extends Container {
    private String modalHelpText;

    public Panel(int i, int i1, int i2, int i3) {
        super();
    }

    @Override
    public void showHelp() {
        if(Objects.nonNull(modalHelpText)){
            System.out.printf(modalHelpText);
        } else {
            super.showHelp();
        }
    }

    public void setModalHelpText(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }
}
