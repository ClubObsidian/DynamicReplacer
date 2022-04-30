package com.clubobsidian.dynamicreplacer.spigot.player;

import com.clubobsidian.dynamicreplacer.common.player.ReplacerPlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

public class SpigotReplacerPlayer implements ReplacerPlayer<Player> {

    private final Player player;

    public SpigotReplacerPlayer(Player player) {
        this.player = player;
    }

    @Override
    public Player getNativePlayer() {
        return this.player;
    }

    @Override
    public UUID getUniqueId() {
        return this.player.getUniqueId();
    }
}
