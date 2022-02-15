package main.java;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainTest {
    Main main = new Main();

    @Test
    void printMapTest() {
        Map<String, String> map = new HashMap<>();

        map.put("hi1", "hi4");
        map.put("hi2", "hi5");
        map.put("hi3", "hi6");

        main.printMap(map);

        assertNotNull(map);

        System.out.println(main.printMap(map));
    }
}