package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
                Iterator<String> iterator = e.getValue().iterator();
                while (iterator.hasNext()){
                    if (developer.equals(iterator.next())){
                        list.add(e.getKey());
                        break;
                    }
            }
        }

        return list;
    }
}
