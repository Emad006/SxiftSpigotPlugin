package me.xyrophyte.sxift.events;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class OnJoin implements Listener {

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String welcomeMessage = plugin.getConfig().getString("WelcomeMessage");

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(welcomeMessage + " " + ChatColor.GREEN + player.getDisplayName());
    }
}
