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

package com.clubobsidian.dynamicreplacer.spigot;

import com.clubobsidian.dynamicreplacer.common.replacer.ReplacerRegistry;
import com.clubobsidian.dynamicreplacer.common.replacer.TestReplacer;
import com.clubobsidian.dynamicreplacer.spigot.replacer.PapiReplacerRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public class DynamicReplacerSpigot extends JavaPlugin {

    @Override
    public void onEnable() {
        if (this.isPluginLoaded("PlaceholderAPI")) {
            ReplacerRegistry.registerInstance(new PapiReplacerRegistry());
        }
        new TestReplacer().register(this);
    }

    private boolean isPluginLoaded(String pluginName) {
        return this.getServer().getPluginManager().getPlugin(pluginName) != null;
    }
}
