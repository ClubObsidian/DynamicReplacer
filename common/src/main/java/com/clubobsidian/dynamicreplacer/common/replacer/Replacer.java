package com.clubobsidian.dynamicreplacer.common.replacer;

import com.clubobsidian.dynamicreplacer.common.player.ReplacerPlayer;

public abstract class Replacer {

    private final String identifier;

    public Replacer(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public <T> boolean register(T plugin) {
        return ReplacerRegistry.getInstance().register(this, plugin);
    }

    public abstract String replace(ReplacerPlayer player, String params);
}