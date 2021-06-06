package me.xyrophyte.sxift.events;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class OnLeave implements Listener {

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String leaveMessage = plugin.getConfig().getString("LeaveMessage");

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.RED + player.getDisplayName() + " " + leaveMessage);
    }
}
