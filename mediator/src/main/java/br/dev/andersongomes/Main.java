package br.dev.andersongomes;

public class Main {
    public static void main(String[] args) {
        AuthenticationDialog dialog = new AuthenticationDialog();
        Checkbox loginOrRegisterChkBx = new Checkbox(dialog);
        Button okBtn = new Button(dialog);
        loginOrRegisterChkBx.check();
        okBtn.click();
    }
}