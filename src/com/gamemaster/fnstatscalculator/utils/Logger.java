package com.gamemaster.fnstatscalculator.utils;

public class Logger {

    private String loggerName;

    public Logger(String loggerName) {
        this.loggerName = loggerName;
    }

    public void sendLog(String log) {
        System.out.println("[" + this.loggerName + "/INFO] " + log);
    }

    public void sendWarn(String warn) {
        System.out.println("[" + this.loggerName + "/WARN] " + warn);
    }

    public String getLoggerName() {
        return this.loggerName;
    }

}
