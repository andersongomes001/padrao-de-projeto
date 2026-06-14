package br.dev.andersongomes;

import java.util.Objects;

public class Database {
    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if(Objects.isNull(instance)){
            synchronized (Database.class){
                if(Objects.isNull(instance)){
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    public void query(String sql){
        System.out.printf("Hashcode: %s - Executing query: %s%n",System.identityHashCode(this), sql);
    }

}
