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
    private final String noPermission = plugin.getConfig().getString("NoPermission");
    private final String playerOnly = plugin.getConfig().getString("PlayerOnly");
    private final String invalidPlayer = plugin.getConfig().getString("InvalidPlayer");
    private final String tooManyArgs = plugin.getConfig().getString("TooManyArgs");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.kill")) {
                if (args.length == 1) {
                    Player player = (Player) sender;
                    Player target = Bukkit.getPlayer(args[0]);
                    if (target != null) {
                        target.setHealth(0);
                        target.sendMessage(ChatColor.LIGHT_PURPLE + "You've just been murdered by " + ChatColor.RED + player.getDisplayName());
                        sender.sendMessage(ChatColor.GREEN + "Successfully killed " + ChatColor.LIGHT_PURPLE + target.getDisplayName());
                    } else {
                        sender.sendMessage(ChatColor.DARK_RED + invalidPlayer);
                    }
                } else if (args.length > 1) {
                    sender.sendMessage(ChatColor.DARK_RED + tooManyArgs);
                } else {
                    ((Player) sender).setHealth(0);
                    sender.sendMessage(ChatColor.RED + ((Player) sender).getDisplayName() + ChatColor.BLUE + " " + killMessage);
                }
            } else {
                sender.sendMessage(ChatColor.DARK_RED + noPermission);
            }
        } else {
            instance.getLogger().warning(ChatColor.DARK_RED + playerOnly);
        }
        return true;
    }
}
