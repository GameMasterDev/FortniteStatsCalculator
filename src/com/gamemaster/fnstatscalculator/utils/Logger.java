package com.gamemaster.fnstatscalculator.utils;

public class Logger {

    private String p_0002;

    public Logger(String p_0001) {
        this.p_0002 = p_0001;
    }

    public void sendLog(String p_0003) {
        System.out.println("[" + this.p_0002 + "/INFO] " + p_0003);
    }

    public void sendWarn(String p_0004) {
        System.out.println("[" + this.p_0002 + "/WARN] " + p_0004);
    }

    public String getLoggerName() {
        return this.p_0002;
    }

}
