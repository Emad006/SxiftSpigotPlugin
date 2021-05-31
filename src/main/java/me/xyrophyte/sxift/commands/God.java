package me.xyrophyte.sxift.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            ((Player) sender).setInvulnerable(true);
            sender.sendMessage("Entered God Mode.");
        } else {
            System.out.println(ChatColor.DARK_RED + " Failed to run command. " + ChatColor.YELLOW + "Reason: " + ChatColor.RED + "Not a Player.");
        }
        return false;
    }
}
