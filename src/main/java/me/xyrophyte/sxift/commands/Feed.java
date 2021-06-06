package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {

    private final Sxift instance;

    public Feed(Sxift instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.feed")) {
                if (((Player) sender).getSaturation() == 20) {
                    sender.sendMessage("Hunger already full.");
                } else {
                    ((Player) sender).setSaturation(20);
                }
            } else {
                sender.sendMessage(ChatColor.DARK_RED + "Failed to run command. Not enough permission.");
            }
        } else {
            instance.getLogger().warning(ChatColor.DARK_RED + " Failed to run command. REASON: Not a PLAYER.");
        }
        return true;
    }
}
