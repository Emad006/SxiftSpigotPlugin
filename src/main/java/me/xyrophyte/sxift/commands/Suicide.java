package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Suicide implements CommandExecutor {

    private final Sxift instance;

    public Suicide(Sxift instance) {
        this.instance = instance;
    }

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String suicideMessage = plugin.getConfig().getString("SuicideMessage");
    private final String noPermission = plugin.getConfig().getString("NoPermission");
    private final String playerOnly = plugin.getConfig().getString("PlayerOnly");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.suicide")) {
                ((Player) sender).setHealth(0);
                sender.sendMessage(ChatColor.RED + ((Player) sender).getDisplayName() + " " + ChatColor.BLUE + suicideMessage);
            } else {
                sender.sendMessage(ChatColor.DARK_RED + noPermission);
            }
        } else {
            instance.getLogger().warning(ChatColor.DARK_RED + playerOnly);
        }
        return true;
    }
}