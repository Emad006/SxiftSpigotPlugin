package me.xyrophyte.sxift;

import me.xyrophyte.sxift.commands.God;
import me.xyrophyte.sxift.commands.Heal;
import me.xyrophyte.sxift.commands.Ping;
import me.xyrophyte.sxift.commands.Suicide;
import me.xyrophyte.sxift.events.*;
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

        // Registering commands
        getCommand("god").setExecutor(new God(this));
        getCommand("heal").setExecutor(new Heal(this));
        getCommand("ping").setExecutor(new Ping());
        getCommand("suicide").setExecutor(new Suicide(this));

        getLogger().info("Plugin started.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin is shutting down.");
    }
}
