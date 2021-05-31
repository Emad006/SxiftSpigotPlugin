package me.xyrophyte.sxift.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class OnShear implements Listener {

    @EventHandler
    public void onShear(PlayerShearEntityEvent event) {
        event.getPlayer().giveExp(10);
        event.getPlayer().sendMessage(ChatColor.GREEN + "You received 10XP for Shearing the Entity.");
    }
}
