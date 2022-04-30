package com.clubobsidian.dynamicreplacer.common.replacer;

import com.clubobsidian.dynamicreplacer.common.player.ReplacerPlayer;

public class TestReplacer extends Replacer {

    public TestReplacer() {
        super("test");
    }

    @Override
    public String replace(ReplacerPlayer player, String params) {
        if (params.equals("helloworld")) {
            return "Hello World!";
        }
        return null;
    }
}
