package br.dev.andersongomes;

import java.nio.Buffer;
import java.util.Objects;

public class AuthenticationDialog implements Mediator {
    private String title;
    private Checkbox loginOrRegisterChkBx;
    private Textbox loginUsername;
    private Textbox loginPassword;
    private Textbox registrationUsername;
    private Textbox registrationPassword;
    private Textbox registrationEmail;
    private Button okBtn;
    private Button cancelBtn;

    public AuthenticationDialog() {
    }

    @Override
    public void notify(Component sender, String event) {
        if(sender == loginOrRegisterChkBx && Objects.equals(event, "check")){
            if(loginOrRegisterChkBx.isChecked()){
                title = "Log in";
            }else {
                title = "Register";
            }
            System.out.printf(event + " : " +title);
        }
        if(sender == okBtn && Objects.equals(event, "click")){
            if(loginOrRegisterChkBx.isChecked()){
                //find user
                boolean found = true;
                if(!found){
                    //error
                }
            } else {
                //criar uma nova conta
            }
            System.out.printf(event);
        }
    }
}
