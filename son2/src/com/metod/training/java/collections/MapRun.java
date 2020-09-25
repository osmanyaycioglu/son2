package com.metod.training.java.collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRun {

    public static void main(final String[] args) {
        Map<String, String> mapRunLoc = new Hashtable<>();
        //Map<String, String> mapRunLoc = new ConcurrentHashMap<>();
        mapRunLoc.put("osman",
                      "helllo");
        mapRunLoc.put("osman",
                      "12345");
        String stringLoc = mapRunLoc.get("osman");

        Set<String> keySetLoc = mapRunLoc.keySet();
        for (String string2Loc : keySetLoc) {
            String value = mapRunLoc.get(string2Loc);
        }

        Collection<String> valuesLoc = mapRunLoc.values();
        for (String value : valuesLoc) {

        }

        Set<Entry<String, String>> entrySetLoc = mapRunLoc.entrySet();
        for (Entry<String, String> entryLoc : entrySetLoc) {
            String keyLoc = entryLoc.getKey();
            String valueLoc = entryLoc.getValue();
        }

    }
}
