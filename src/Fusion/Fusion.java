package Fusion;

import arc.util.Log;
import mindustry.mod.Mod;

public class Fusion extends Mod {
    private static boolean debug;

    static {
        if (!isDebug()) {
            setDebug(false);
        }
    }

    public Fusion() {
    }

    @Override
    public void loadContent() {
        Load();
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean debug) {
        Fusion.debug = debug;
        //String text = Core.bundle.get("fusion.bundle");
        //If Core.bundle.get method using before the bundle load,the method return ???key???
        //Use it too early
        Log.infoTag("Mod-Fusion-debug", String.valueOf(isDebug()));
    }

    private void Load() {

    }
}
