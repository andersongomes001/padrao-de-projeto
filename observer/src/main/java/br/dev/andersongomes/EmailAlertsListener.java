package br.dev.andersongomes;

public class EmailAlertsListener implements EventListener {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        System.out.println(email+" : "+String.format(message, fileName));
    }
}
