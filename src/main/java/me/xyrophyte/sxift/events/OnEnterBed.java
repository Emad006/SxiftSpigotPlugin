package me.xyrophyte.sxift.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class OnEnterBed implements Listener {

    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent event) {
        event.getPlayer().sendMessage("Good Night!");
    }
}
