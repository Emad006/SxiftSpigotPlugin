package me.xyrophyte.sxift.events;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.Plugin;

public class OnEnterBed implements Listener {

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String onEnterBedMessage = plugin.getConfig().getString("PlayerEnterBedMessage");

    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent event) {
        event.getPlayer().sendMessage(ChatColor.GREEN + onEnterBedMessage);
    }
}
