package btw.community.ears.mod;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import btw.community.ears.btwaddon.EarsBTWAddon;

public class EarsPreLaunchInit implements PreLaunchEntrypoint {
    /**
     * Runs the PreLaunch entrypoint to register BTW-Addon.
     * Don't initialize anything else here, use
     * the method Initialize() in the Addon.
     */
    @Override
    public void onPreLaunch() {
        EarsBTWAddon.getInstance();
    }
}
