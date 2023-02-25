package com.gamemaster.fnstatscalculator.utils;

import com.gamemaster.fnstatscalculator.Main;

import java.net.URL;

public class ResourcesLocation {

    public static URL getImg(String p_0005) {
        return Main.class.getResource("/img/" + p_0005);
    }

}
