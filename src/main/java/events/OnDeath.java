package events;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        event.getEntity().sendMessage("You died.");
        event.getEntity().sendMessage("Changing GameMode to Spectator.");
        event.getEntity().setGameMode(GameMode.SPECTATOR);
    }
}
