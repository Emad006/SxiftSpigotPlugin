package me.xyrophyte.sxift.events;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.plugin.Plugin;

public class OnLeaveBed implements Listener {

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String onLeaveBedMessage = plugin.getConfig().getString("PlayerLeaveBedMessage");

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        event.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + onLeaveBedMessage);
    }
}
