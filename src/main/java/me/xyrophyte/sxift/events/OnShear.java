package me.xyrophyte.sxift.events;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.plugin.Plugin;

public class OnShear implements Listener {

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String playerSheepShearMessage = plugin.getConfig().getString("PlayerSheepShearMessage");

    @EventHandler
    public void onShear(PlayerShearEntityEvent event) {
        event.getPlayer().giveExp(10);
        event.getPlayer().sendMessage(ChatColor.GREEN + playerSheepShearMessage);
    }
}
