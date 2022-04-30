package com.clubobsidian.dynamicreplacer.common.replacer;

public abstract class Replacer {

    private final String identifier;

    public Replacer(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public abstract String getAuthor();

    public abstract String getVersion();

    public abstract <T> T getPlugin();

    public boolean register() {
        return ReplacerRegistry.getInstance().register(this);
    }
}