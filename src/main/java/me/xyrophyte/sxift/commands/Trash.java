package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

public class Trash implements CommandExecutor {
    private final Sxift instance;

    public Trash(Sxift instance) {
        this.instance = instance;
    }

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String noPermission = plugin.getConfig().getString("NoPermission");
    private final String playerOnly = plugin.getConfig().getString("PlayerOnly");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.trash")) {
                Player player = (Player) sender;
                Inventory trash = Bukkit.createInventory(player, 27, "Trash");
                player.openInventory(trash);
            } else {
                sender.sendMessage(ChatColor.DARK_RED + noPermission);
            }
        } else {
            instance.getLogger().warning(playerOnly);
        }
        return true;
    }
}
