package com.first.test.ports.rest;

import com.first.test.models.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class GreetingController {
    private static final String template = "Hello,%s!";
    private final AtomicLong counter = new AtomicLong();

    public List<String> dynamicGreeting() {
        List<String> myList = new ArrayList<>();
        List<Long> myListLong = new ArrayList<>();
        myListLong.add(15L);
        myListLong.add(15L);
        myListLong.add(15L);
        IntStream intStream = myListLong.stream().mapToInt(Math::toIntExact);
        System.out.println("IntStream is =================+++>" + intStream);
        myList.add("zxcv");
        myList.add("zxcv2");
        myList.add("zxcv3");
        return myList;
        /*for (String stringList:myList){
            greeting(stringList);
        }*/
    }

    @PostMapping("/greeting")
    public @ResponseBody
    List<Greeting> greeting(@RequestBody List<Greeting> greeting) {
        List<String> strings = dynamicGreeting();
        List<Greeting> greeting1 = strings.stream().filter(asa -> asa.equals("zxcv"))
                .map(greet -> new Greeting(String.format(template, greet), (int) counter.incrementAndGet())).collect(Collectors.toList());
        return greeting1;
    }
}

