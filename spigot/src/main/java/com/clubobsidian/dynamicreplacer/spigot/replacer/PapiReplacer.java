package com.clubobsidian.dynamicreplacer.spigot.replacer;

import com.clubobsidian.dynamicreplacer.common.replacer.Replacer;
import com.clubobsidian.dynamicreplacer.spigot.player.SpigotReplacerPlayer;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PapiReplacer extends PlaceholderExpansion {

    private final Replacer replacer;
    private final String identifier;
    private final String author;
    private final String version;

    public PapiReplacer(Replacer replacer, JavaPlugin plugin) {
        this.replacer = replacer;
        this.identifier = replacer.getIdentifier();
        this.author = String.join(",", plugin.getDescription().getAuthors());
        this.version = plugin.getDescription().getVersion();
    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    @Override
    public String onPlaceholderRequest(Player p, String params) {
        return this.replacer.replace(new SpigotReplacerPlayer(p), params);
    }
}
