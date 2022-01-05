package com.example.mvp_demo.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtils {

    /**
     * 格式化打印
     *
     * @param obj
     * @return
     */
    public String printFormat(Object obj) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(obj);
    }
}
