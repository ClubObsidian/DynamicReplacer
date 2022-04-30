/*
 *     DynamicReplacer
 *     Copyright (C) 2022 virustotalop
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *     USA
 */

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
