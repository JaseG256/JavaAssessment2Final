package com.zipcodewilmington.assessment2.part2;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Router {

    private  Map<String, String> routerMap;

    public Router() {
        routerMap = new TreeMap<>();
    }

    public void add(String path, String controller) {
        routerMap.put(path, controller);
    }

    public int size() {
        return routerMap.size();
    }

    public String getController(String path) {
        String controllerFound = routerMap.get(path);
        return controllerFound;
    }

    public void update(String path, String newController) {
        routerMap.get(path);
        routerMap.put(path, newController);
    }


    public void remove(String path) {
        routerMap.remove(path);
    }

    @Override
    public String toString() {
        String describe = "";
        Set<Map.Entry<String, String>> setOfMap = routerMap.entrySet();
        for(Map.Entry<String, String> entry : setOfMap) {
            describe += entry.getKey() + " -> " + entry.getValue() + "\n";
        }
        return describe;
    }
}
