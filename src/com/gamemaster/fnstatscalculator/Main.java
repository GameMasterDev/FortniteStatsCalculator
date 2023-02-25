package com.gamemaster.fnstatscalculator;

import com.gamemaster.fnstatscalculator.gui.Menu;
import com.gamemaster.fnstatscalculator.utils.Logger;

public class Main {

    static Logger logger = new Logger("FortniteStatsCalculator");

    public static void main(String[] args) {

        logger.sendLog("Starting App...");
        Menu.display();
        logger.sendLog("Started App");

    }

}
