package com.clubobsidian.dynamicreplacer.spigot.replacer;

import com.clubobsidian.dynamicreplacer.common.replacer.Replacer;
import com.clubobsidian.dynamicreplacer.common.replacer.ReplacerRegistry;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class PapiReplacerRegistry extends ReplacerRegistry<JavaPlugin> {

    @Override
    public boolean register(Replacer replacer, JavaPlugin plugin) {
        return new PapiReplacer(replacer, plugin).register();
    }

    @Override
    public boolean unregister(String identifier) {
        return PlaceholderAPI.unregisterPlaceholderHook(identifier);
    }
}
