package br.dev.andersongomes;

import java.util.Objects;

public abstract class Component implements ComponentWithContextualHelper {
    private String tooltipText;
    protected Container container;

    @Override
    public void showHelp() {
        if(Objects.nonNull(tooltipText)){
            System.out.printf(tooltipText);
        } else {
            container.showHelp();
        }
    }

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
    }
}
