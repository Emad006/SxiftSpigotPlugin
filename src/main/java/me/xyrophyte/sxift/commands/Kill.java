package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Kill implements CommandExecutor {

    private final Sxift instance;

    public Kill(Sxift instance) {
        this.instance = instance;
    }

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String killMessage = plugin.getConfig().getString("KillMessage");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // TODO: Make command player only.
        if (args.length == 1) {
            Player player = (Player) sender;
            Player target = Bukkit.getPlayerExact(args[0]);
            if (target instanceof Player) {
                target.setHealth(0);
                target.sendMessage(ChatColor.LIGHT_PURPLE + "You've just been mudured by " + ChatColor.RED + player.getDisplayName());
                sender.sendMessage(ChatColor.GREEN + "Successfully killed " + ChatColor.LIGHT_PURPLE + target.getDisplayName());
            } else {
                sender.sendMessage(ChatColor.DARK_RED + "Failed to run command. REASON: Not a PLAYER.");
            }
        } else if(args.length > 1) {
            sender.sendMessage(ChatColor.DARK_RED + "Failed to run command. REASON: Too many arguments");
        } else {
            if (sender instanceof Player) {
                ((Player) sender).setHealth(0);
                sender.sendMessage(ChatColor.RED + ((Player) sender).getDisplayName() + ChatColor.BLUE + " " + killMessage);
            } else {
                instance.getLogger().warning(ChatColor.DARK_RED + "Failed to run command. REASON: Player doesn't exist.");
                instance.getLogger().info(ChatColor.DARK_PURPLE + "You can however kill another player by providing an argument.");
            }
        }
        return true;
    }
}
