package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    private final Sxift instance;
    public Heal(Sxift instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            if(((Player) sender).getHealth() == ((Player) sender).getHealthScale()) {
                sender.sendMessage("Health already full.");
            } else {
                ((Player) sender).setHealth(((Player) sender).getHealthScale());
                sender.sendMessage("Healed!");
            }
        } else {
            instance.getLogger().warning(ChatColor.DARK_RED + " Failed to run command. REASON: Not a PLAYER.");
        }
        return true;
    }
}
