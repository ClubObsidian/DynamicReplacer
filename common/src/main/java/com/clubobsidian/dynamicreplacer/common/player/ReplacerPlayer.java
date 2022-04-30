package com.clubobsidian.dynamicreplacer.common.player;

import java.util.UUID;

public interface ReplacerPlayer<P> {

    public P getNativePlayer();
    public abstract UUID getUniqueId();

}
