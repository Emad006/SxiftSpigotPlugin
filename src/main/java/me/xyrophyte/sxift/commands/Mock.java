package me.xyrophyte.sxift.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Mock implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("69420")) {
                sender.sendMessage(ChatColor.GREEN + "Congrats, you found the funny");
                sender.sendMessage(ChatColor.DARK_PURPLE + "Now go to sussy jail.");
            }
            sender.sendMessage(args[0]);
        } else {
            sender.sendMessage(ChatColor.DARK_RED + "Not enough arguments.");
        }
        return true;
    }
}
