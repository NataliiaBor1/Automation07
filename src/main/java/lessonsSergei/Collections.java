package lectionsSergei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class Collections {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("Sergey", 30);
        map.put("Anna", 30);
        map.put("Lucy", 30);
        map.put("Anna", 20);

        System.out.println(map);
    }


}
