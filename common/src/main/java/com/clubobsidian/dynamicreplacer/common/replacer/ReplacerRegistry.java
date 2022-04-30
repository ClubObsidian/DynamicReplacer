package com.clubobsidian.dynamicreplacer.common.replacer;

public abstract class ReplacerRegistry<T> {

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

    public abstract boolean register(Replacer replacer, T plugin);

    public boolean unregister(Replacer replacer) {
        return this.unregister(replacer.getIdentifier());
    }

    public abstract boolean unregister(String identifier);

}