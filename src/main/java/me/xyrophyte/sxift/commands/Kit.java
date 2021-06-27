package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class Kit implements CommandExecutor {

    private final Sxift instance;

    public Kit(Sxift instance) {
        this.instance = instance;
    }

    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String noPermission = plugin.getConfig().getString("NoPermission");
    private final String playerOnly = plugin.getConfig().getString("PlayerOnly");

    private final ItemStack diamondHelmet = new ItemStack(Material.DIAMOND_HELMET);
    private final ItemStack diamondChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
    private final ItemStack diamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
    private final ItemStack diamondBoots = new ItemStack(Material.DIAMOND_BOOTS);
    private final ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
    private final ItemStack diamondPickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
    private final ItemStack diamondAxe = new ItemStack(Material.DIAMOND_AXE);
    private final ItemStack diamondShovel = new ItemStack(Material.DIAMOND_SPADE);
    private final ItemStack diamondHoe = new ItemStack(Material.DIAMOND_HOE);
    private final ItemStack[] diamondKit = {
            diamondHelmet,
            diamondChestplate,
            diamondLeggings,
            diamondBoots,
            diamondSword,
            diamondPickaxe,
            diamondAxe,
            diamondShovel,
            diamondHoe
    };

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.kit")) {
                ((Player) sender).getInventory().addItem(diamondKit);
                sender.sendMessage(ChatColor.GREEN + "You received " + ChatColor.BLUE + "Diamond Kit");
            } else {
                sender.sendMessage(ChatColor.DARK_RED + noPermission);
            }
        } else {
            instance.getLogger().warning(ChatColor.DARK_RED + playerOnly);
        }
        return true;
    }
}
