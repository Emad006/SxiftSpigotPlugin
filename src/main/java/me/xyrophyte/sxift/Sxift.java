package me.xyrophyte.sxift;

import me.xyrophyte.sxift.commands.*;
import me.xyrophyte.sxift.events.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Sxift extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin is starting up.");

        // Loading configuration
        getLogger().info("Loading plugin configuration.");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getLogger().info("Loaded plugin configuration");


        // Registering events
        getLogger().info("Registering events.");
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new OnEnterBed(), this);
        getServer().getPluginManager().registerEvents(new OnJoin(), this);
        getServer().getPluginManager().registerEvents(new OnLeave(), this);
        getServer().getPluginManager().registerEvents(new OnLeaveBed(), this);
        getServer().getPluginManager().registerEvents(new OnMove(), this);
        getServer().getPluginManager().registerEvents(new OnShear(), this);
        getLogger().info("Registered all events.");

        // Registering commands
        getLogger().info("Registering commands.");
        getCommand("feed").setExecutor(new Feed(this));
        getCommand("heal").setExecutor(new Heal(this));
        getCommand("kit").setExecutor(new Kit(this));
        getCommand("ping").setExecutor(new Ping());
        getCommand("suicide").setExecutor(new Suicide(this));
        getLogger().info("Registered all commands.");

        getLogger().info("Plugin started successfully.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin is shutting down.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("printMessageFromConfig")) {
            sender.sendMessage(getConfig().getString("Food"));
        }
        return true;
    }
}
