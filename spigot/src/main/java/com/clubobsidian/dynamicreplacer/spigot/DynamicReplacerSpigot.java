package com.clubobsidian.dynamicreplacer.spigot;

import com.clubobsidian.dynamicreplacer.common.replacer.ReplacerRegistry;
import com.clubobsidian.dynamicreplacer.spigot.replacer.PapiReplacerRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public class DynamicReplacerSpigot extends JavaPlugin {

    @Override
    public void onEnable() {
        if (this.isPluginLoaded("PlaceholderAPI")) {
            ReplacerRegistry.registerInstance(new PapiReplacerRegistry());
        }
    }

    private boolean isPluginLoaded(String pluginName) {
        return this.getServer().getPluginManager().getPlugin(pluginName) != null;
    }
}
