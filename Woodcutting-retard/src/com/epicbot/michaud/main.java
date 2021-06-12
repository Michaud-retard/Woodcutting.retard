package com.epicbot.michaud;

import com.epicbot.api.shared.GameType;
import com.epicbot.api.shared.methods.IWalkingAPI;
import com.epicbot.api.shared.model.Area;
import com.epicbot.api.shared.model.Tile;
import com.epicbot.api.shared.script.LoopScript;
import com.epicbot.api.shared.script.ScriptManifest;

@ScriptManifest(name = "GUI", gameType = GameType.OS)
public class main extends LoopScript {

    gui settings = new gui();
    private final Area AREA_NORMAL_TREE = new Area(new Tile(3171, 3418, 0), new Tile(3166, 3422, 0));


    @Override
    public boolean onStart(String... strings) {
        return true;
    }

    @Override
    protected int loop() {
        if (settings.treeType == null){
            return -1;
        } /* else if (settings.treeType == ??? ) {
            getAPIContext().walking().walkTo(AREA_NORMAL_TREE.getCentralTile());
        }*/

        return 0;
    }
}
