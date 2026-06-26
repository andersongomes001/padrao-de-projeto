package br.dev.andersongomes;

import java.util.Objects;

public class Dialog extends Container {
    private String wikiPageUrl;

    public Dialog(String text) {
        super();
    }

    @Override
    public void showHelp() {
        if(Objects.nonNull(wikiPageUrl)){
            System.out.printf(wikiPageUrl);
        }else{
            super.showHelp();
        }
    }

    public void setWikiPageUrl(String wikiPageUrl) {
        this.wikiPageUrl = wikiPageUrl;
    }
}
