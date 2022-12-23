package galaxydevnetwork.minehuttracker;

import galaxydevnetwork.minehuttracker.commands.checkserver;
import galaxydevnetwork.minehuttracker.commands.mhtracker;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinehutTracker extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        Bukkit.getLogger().info("[Minehut Tracker] Plugin has started");
        // Commands
        getCommand("mhtracker").setExecutor(new mhtracker(this));
        getCommand("checkserver").setExecutor(new checkserver(this));
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[Minehut Tracker] bye bye!");
    }
}
