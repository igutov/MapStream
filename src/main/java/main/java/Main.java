package main.java;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public Map<String, String> printMap(Map<String, String> map) {
        return map.entrySet().stream()
                .limit(1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}