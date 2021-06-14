package me.xyrophyte.sxift.events;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.Plugin;

public class OnDeath implements Listener {

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String playerDeathMessage = plugin.getConfig().getString("PlayerDeathMessage");

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        event.getEntity().sendMessage(ChatColor.RED + playerDeathMessage);
    }
}
