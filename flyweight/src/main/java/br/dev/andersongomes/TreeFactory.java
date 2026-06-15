package br.dev.andersongomes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeFactory {
    public static List<TreeType> treeTypes = new ArrayList<>();
    public static TreeType getTreeType(String name, String color, String texture){
        TreeType type = treeTypes.stream().filter(filter -> {
            return filter.getName().equalsIgnoreCase(name) && filter.getColor().equalsIgnoreCase(color) && filter.getTexture().equalsIgnoreCase(texture);
        }).findFirst().orElse(null);
        if(Objects.isNull(type)){
            type = new TreeType(name, color, texture);
            treeTypes.add(type);
        }
        return type;
    }
}
