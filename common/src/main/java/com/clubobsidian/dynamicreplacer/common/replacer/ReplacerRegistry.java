package com.clubobsidian.dynamicreplacer.common.replacer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

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

    private final Collection<RegistryCapability> capabilities;

    public ReplacerRegistry(RegistryCapability... capabilities) {
        this(Arrays.asList(capabilities));
    }

    public ReplacerRegistry(Collection<RegistryCapability> capabilities) {
        this.capabilities = new HashSet<>(capabilities);
    }

    public boolean hasCapability(RegistryCapability capability) {
        return this.capabilities.contains(capability);
    }

    public abstract boolean register(Replacer replacer);

    public boolean unregister(Replacer replacer) {
        return this.unregister(replacer.getIdentifier());
    }

    public abstract boolean unregister(String replacerIdentifier);

    protected abstract boolean canCreateRegistry();
}