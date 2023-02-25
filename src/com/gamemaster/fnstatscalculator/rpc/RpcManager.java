package com.gamemaster.fnstatscalculator.rpc;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import com.gamemaster.fnstatscalculator.utils.References;

public class RpcManager {

    private final DiscordRPC lib = DiscordRPC.INSTANCE;
    private final DiscordRichPresence presence = new DiscordRichPresence();

    public RpcManager() {

        // Initialize DiscordRPC
        final DiscordEventHandlers handlers = new DiscordEventHandlers();
        this.lib.Discord_Initialize("1078796036644028537", handlers, true, "");
        this.presence.startTimestamp = System.currentTimeMillis() / 1000;
        this.presence.details = "In the Menu";
        this.presence.state = "Fortnite Stats Calculator";
        this.presence.largeImageKey = "logo";
        this.presence.largeImageText = References.VERSION;
        this.lib.Discord_UpdatePresence(this.presence);

        // Thread
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                lib.Discord_RunCallbacks();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException var1) {}
            }
        }, "RPC_Callback_Handler").start();
    }

    public void setDetails(final String details) {
        this.presence.details = details;
        this.lib.Discord_UpdatePresence(this.presence);
    }

}