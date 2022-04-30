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

public abstract class ReplacerRegistry<T> {

    private static ReplacerRegistry instance;

    public static ReplacerRegistry getInstance() {
        return instance;
    }

    public static boolean registerInstance(ReplacerRegistry registry) {
        if (instance == null && registry != null) {
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