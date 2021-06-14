package com.epicbot.michaud;

import com.epicbot.api.shared.GameType;
import com.epicbot.api.shared.model.Area;
import com.epicbot.api.shared.model.Tile;
import com.epicbot.api.shared.script.LoopScript;
import com.epicbot.api.shared.script.ScriptManifest;

@ScriptManifest(name = "GUI", gameType = GameType.OS)
public class main extends LoopScript {

    gui settings = new gui();
    private final Area AREA_NORMAL_TREE = new Area(new Tile(3185, 3498, 0), new Tile(3180, 3495, 0));
    private final Area TEST_2 = new Area(new Tile(3178, 3496, 0), new Tile(3175, 3499, 0));

    @Override
    public boolean onStart(String... strings) {
        return true;
    }

    @Override
    protected int loop() {
        if (settings == null){
            return -1;
        } else if (settings.value.equals("Value 1")) {  // Can not get the varible value.
            getAPIContext().walking().walkTo(AREA_NORMAL_TREE.getCentralTile());
        } else if (settings.value.equals("Value 2")) {  // Can not get the varible value.
            getAPIContext().walking().walkTo(TEST_2.getCentralTile());
        }

        return 0;
    }
}
