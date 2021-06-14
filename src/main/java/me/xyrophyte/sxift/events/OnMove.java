package me.xyrophyte.sxift.events;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;

public class OnMove implements Listener {

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String noPermissionToMoveMessage = plugin.getConfig().getString("PlayerNoPermissionToMove:");

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        if (!event.getPlayer().hasPermission("sxift.move")) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.DARK_RED + noPermissionToMoveMessage);
        }
    }
}
