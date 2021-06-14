package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class Ping implements CommandExecutor {

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String pingMessage = plugin.getConfig().getString("PingMessage");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.DARK_PURPLE + pingMessage);
        return true;
    }
}
