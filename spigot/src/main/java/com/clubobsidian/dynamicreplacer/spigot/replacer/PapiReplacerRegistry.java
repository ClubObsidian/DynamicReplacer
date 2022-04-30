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
