package br.dev.andersongomes;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query("SELECT * FROM users");
        database = Database.getInstance();
        database.query("SELECT * FROM products");
    }
}
