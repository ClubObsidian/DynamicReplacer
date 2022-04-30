package com.clubobsidian.dynamicreplacer.common.replacer;

public abstract class ReplacerRegistry {

    private static ReplacerRegistry instance;

    public static ReplacerRegistry getInstance() {
        return instance;
    }

    public static boolean registerInstance(ReplacerRegistry registry) {
        if (instance != null && registry != null) {
            instance = registry;
            return true;
        }
        return false;
    }

    public abstract <T> boolean register(Replacer replacer, T plugin);

    public boolean unregister(Replacer replacer) {
        return this.unregister(replacer.getIdentifier());
    }

    public abstract boolean unregister(String replacerIdentifier);

}