package com.epicbot.michaud;

import com.epicbot.api.shared.GameType;
import com.epicbot.api.shared.script.LoopScript;
import com.epicbot.api.shared.script.ScriptManifest;

@ScriptManifest(name = "GUI", gameType = GameType.OS)
public class main extends LoopScript {

    woodcuttingSetting settings = new woodcuttingSetting();

    @Override
    public boolean onStart(String... strings) {
        new gui();
        return true;
    }

    @Override
    protected int loop() {
        return 0;
    }
}
