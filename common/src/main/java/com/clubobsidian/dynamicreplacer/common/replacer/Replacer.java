package com.clubobsidian.dynamicreplacer.common.replacer;

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
}