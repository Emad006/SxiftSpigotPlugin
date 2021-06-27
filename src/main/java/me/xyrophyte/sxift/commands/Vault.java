package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class Vault implements CommandExecutor {

    private final Sxift instance;

    public Vault(Sxift instance) {
        this.instance = instance;
    }

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String noPermission = plugin.getConfig().getString("NoPermission");
    private final String playerOnly = plugin.getConfig().getString("PlayerOnly");

    private final ItemStack coal = new ItemStack(Material.COAL, 64);
    private final ItemStack coalBlock = new ItemStack(Material.COAL_BLOCK, 64);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.vault")) {
                Player player = (Player) sender;
                Inventory vault = Bukkit.createInventory(player, 27, "Vault");
                player.openInventory(vault);
                vault.setItem(1, coal); // Setting item in the 2nd slot.
                vault.addItem(coalBlock); // Adding the item in the first available slot.
                //vault.clear(); // Clears the inventory
            } else {
                sender.sendMessage(ChatColor.DARK_RED + noPermission);
            }

        } else {
            instance.getLogger().warning(playerOnly);
        }
        return true;
    }
}
