package org.example;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        Map<String, Object> map = new HashMap<>();
        map.put("test", "test1");


        Calendar cal = Calendar.getInstance();
        long start = cal.getTimeInMillis();

        for(int i=0; i<10000000; i++){
            String name = Optional.ofNullable(map.get("name")).orElseGet(()->"").toString();
            System.out.println("name :"+ name);
        }

        cal = Calendar.getInstance();
        long end = cal.getTimeInMillis();

        System.out.println(end - start);

        System.out.println("git test..");


    }
}