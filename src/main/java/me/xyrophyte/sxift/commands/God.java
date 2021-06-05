package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {

    private final Sxift instance;
    public God(Sxift instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            ((Player) sender).setInvulnerable(true);
            sender.sendMessage("Entered God Mode.");
        } else {
            instance.getLogger().warning(ChatColor.DARK_RED + " Failed to run command. REASON: Not a PLAYER.");
        }
        return true;
    }
}
