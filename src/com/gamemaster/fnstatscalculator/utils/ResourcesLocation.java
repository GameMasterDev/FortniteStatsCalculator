package com.gamemaster.fnstatscalculator.utils;

import com.gamemaster.fnstatscalculator.Main;

import java.net.URL;

public class ResourcesLocation {

    public static URL getImg(String location) {
        return Main.class.getResource("/img/" + location);
    }

}
