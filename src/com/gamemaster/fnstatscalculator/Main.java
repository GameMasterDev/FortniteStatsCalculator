package com.gamemaster.fnstatscalculator;

import com.gamemaster.fnstatscalculator.gui.Menu;
import com.gamemaster.fnstatscalculator.rpc.RpcManager;
import com.gamemaster.fnstatscalculator.utils.Logger;

public class Main {

    static Logger logger = new Logger("FortniteStatsCalculator");
    static RpcManager discord;

    public static void main(String[] args) {

        logger.sendLog("Starting App...");
        Menu.display();
        logger.sendLog("Started App");
        discord = new RpcManager();

    }

    public RpcManager getDiscord() {
        return discord;
    }

}
