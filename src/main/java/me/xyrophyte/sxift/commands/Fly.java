package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class Fly implements CommandExecutor {
    private final Sxift instance;

    public Fly(Sxift instance) {
        this.instance = instance;
    }

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String noPermission = plugin.getConfig().getString("NoPermission");
    private final String playerOnly = plugin.getConfig().getString("PlayerOnly");
    private final String flyEnable = plugin.getConfig().getString("FlyEnable");
    private final String flyDisable = plugin.getConfig().getString("FlyDisable");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.fly")) {
                Player player = (Player) sender;
                if(!player.getAllowFlight()) {
                    player.setFlying(true);
                    player.sendMessage(ChatColor.AQUA + flyEnable);
                } else {
                    player.setFlying(false);
                    player.sendMessage(ChatColor.RED + flyDisable);
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
