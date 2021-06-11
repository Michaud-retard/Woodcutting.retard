package com.epicbot.michaud;

import com.epicbot.api.shared.GameType;
import com.epicbot.api.shared.script.LoopScript;
import com.epicbot.api.shared.script.ScriptManifest;

@ScriptManifest(name = "GUI", gameType = GameType.OS)
public class main extends LoopScript {

    gui settings = new gui();


    @Override
    public boolean onStart(String... strings) {
        new gui();
        return true;
    }

    @Override
    protected int loop() {
        if (settings.treeType == null) {
            return -1;
        }
        return 0;
    }
}
