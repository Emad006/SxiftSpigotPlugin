package events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class OnLeaveBed implements Listener {

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        event.getPlayer().sendMessage("Good Morning!");
    }
}
