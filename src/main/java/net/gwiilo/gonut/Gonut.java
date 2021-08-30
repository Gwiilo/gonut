package net.gwiilo.gonut;

import net.fabricmc.api.ModInitializer;
import net.gwiilo.gonut.registry.ModItems;

public class Gonut implements ModInitializer {

    public static final String MOD_ID = "gonut";

    @Override
    public  void onInitialize() {
        ModItems.registerItems();
    }

    /*note(Daenyl)
    for this first mod, let's try adding keybind R zooms the camera in
     */

}

