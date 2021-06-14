package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Heal implements CommandExecutor {

    private final Sxift instance;

    public Heal(Sxift instance) {
        this.instance = instance;
    }

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String noPermission = plugin.getConfig().getString("NoPermission");
    private final String playerOnly = plugin.getConfig().getString("PlayerOnly");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.heal")) {
                if (((Player) sender).getHealth() < ((Player) sender).getHealthScale()) {
                    ((Player) sender).setHealth(((Player) sender).getHealthScale());
                    sender.sendMessage("Healed!");
                } else {
                    sender.sendMessage("Health already full.");
                }
            } else {
                sender.sendMessage(ChatColor.DARK_RED + noPermission);
            }
        } else {
            instance.getLogger().warning(ChatColor.DARK_RED + playerOnly);
        }
        return true;
    }
}
