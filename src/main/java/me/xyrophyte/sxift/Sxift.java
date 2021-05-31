package me.xyrophyte.sxift;

import events.*;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Sxift extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin is starting up.");

        // Registering events
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new OnEnterBed(), this);
        getServer().getPluginManager().registerEvents(new OnJoin(), this);
        getServer().getPluginManager().registerEvents(new OnLeave(), this);
        getServer().getPluginManager().registerEvents(new OnLeaveBed(), this);
        getServer().getPluginManager().registerEvents(new OnShear(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin is shutting down.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("suicide")) {
            if (sender instanceof Player) {
                ((Player) sender).setHealth(0);
                sender.sendMessage(ChatColor.BLUE + ((Player) sender).getDisplayName() + ChatColor.RED + " gave up on life.");
            } else {
                getLogger().warning(ChatColor.DARK_RED + " Failed to run command. " + ChatColor.YELLOW + "Reason: " + ChatColor.RED + "Not a Player.");
            }
        }
        return false;
    }
}
