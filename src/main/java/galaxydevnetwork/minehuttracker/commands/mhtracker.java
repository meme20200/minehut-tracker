package galaxydevnetwork.minehuttracker.commands;

import galaxydevnetwork.minehuttracker.MinehutTracker;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class mhtracker implements CommandExecutor {
    public MinehutTracker plugin;

    public mhtracker(MinehutTracker plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String prefix = Color(plugin.getConfig().getString("prefix"));
        if (!(sender instanceof Player)) {
            sender.sendMessage("[Minehut Tracker] Your not allowed to use this command");
            return true;
        }
        Player p = (Player) sender;
        if (args[0].equalsIgnoreCase("reload")) {
            if (p.hasPermission("mhtracker.admin")) {
                plugin.getConfig().getString("prefix");
                plugin.reloadConfig();
                p.sendMessage(prefix + Color("&aPlugin has reloaded sucessfully!"));
                return true;
            } else {
                p.sendMessage(prefix + Color("&cOh no no, you can't reload this plugin"));
                return true;
            }
        } else {
            p.sendMessage(prefix + Color(" &aVersion: 1.0"));
            p.sendMessage(Color("&8Plugin from https://github.com/meme20200/minehut-tracker"));
            p.sendMessage(Color("&3meme20200 is not Affiliated with Minehut or Mojang, AB."));
            return true;
        }
        if (args.length == 0) {
            p.sendMessage(prefix + Color(" &aVersion: 1.0"));
            p.sendMessage(Color("&8Plugin from https://github.com/meme20200/minehut-tracker"));
            p.sendMessage(Color("&3meme20200 is not Affiliated with Minehut or Mojang, AB."));
        }
    }
    public String Color(String s) {
        s = ChatColor.translateAlternateColorCodes('&', s);
        return s;
    }
}
