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

package com.clubobsidian.dynamicreplacer.common.replacer;

import com.clubobsidian.dynamicreplacer.common.player.ReplacerPlayer;

public abstract class Replacer {

    private final String identifier;

    public Replacer(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public <T> boolean register(T plugin) {
        return ReplacerRegistry.getInstance().register(this, plugin);
    }

    public abstract String replace(ReplacerPlayer player, String params);
}