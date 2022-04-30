package com.clubobsidian.dynamicreplacer.common.replacer;

public abstract class ReplacerRegistry {

    private static ReplacerRegistry instance;

    public static ReplacerRegistry getInstance() {
        if (instance == null) {
            instance = findInstance();
        }
        return instance;
    }

    private static ReplacerRegistry findInstance() {
        //TODO - implement
        return null;
    }

    public abstract <T> boolean register(Replacer replacer, T plugin);

    public boolean unregister(Replacer replacer) {
        return this.unregister(replacer.getIdentifier());
    }

    public abstract boolean unregister(String replacerIdentifier);

    protected abstract boolean canCreateRegistry();

}