package br.dev.andersongomes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shortcuts {
    Map<String, Runnable> list = new HashMap<>();
    public void onKeyPress(String key, Runnable command){
        list.put(key, command);
    }
}
