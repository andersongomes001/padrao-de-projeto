package br.dev.andersongomes;

public class Checkbox extends Component {
    private boolean checked;

    public Checkbox(Mediator dialog) {
        super(dialog);
    }

    void check(){
        checked = true;
        dialog.notify(this,"check");
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
