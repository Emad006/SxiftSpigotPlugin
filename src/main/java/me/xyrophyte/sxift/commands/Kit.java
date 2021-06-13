package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Kit implements CommandExecutor {

    private final Sxift instance;

    public Kit(Sxift instance) {
        this.instance = instance;
    }

    /*
    private final ItemStack diamondHelmet = new ItemStack(Material.DIAMOND_HELMET);
    private final ItemStack diamondChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
    private final ItemStack diamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
    private final ItemStack diamondBoots = new ItemStack(Material.DIAMOND_BOOTS);
    private final ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
    private final ItemStack diamondPickaxe = new ItemStack(Material.DIAMOND_AXE);
    private final ItemStack diamondAxe = new ItemStack(Material.DIAMOND_AXE);
    private final ItemStack diamondHoe = new ItemStack(Material.DIAMOND_HOE);
    */

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.kit")) {
                ItemStack diamondHelmet = new ItemStack(Material.DIAMOND_HELMET);
                ItemStack diamondChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
                ItemStack diamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
                ItemStack diamondBoots = new ItemStack(Material.DIAMOND_BOOTS);
                ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
                ItemStack diamondPickaxe = new ItemStack(Material.DIAMOND_AXE);
                ItemStack diamondAxe = new ItemStack(Material.DIAMOND_AXE);
                ItemStack diamondHoe = new ItemStack(Material.DIAMOND_HOE);

                ((Player) sender).getInventory().addItem(
                        diamondHelmet,
                        diamondChestplate,
                        diamondLeggings,
                        diamondBoots,
                        diamondSword,
                        diamondPickaxe,
                        diamondAxe,
                        diamondHoe
                );
                sender.sendMessage(ChatColor.GREEN + "You received " + ChatColor.BLUE + "Diamond Kit");
            } else {
                sender.sendMessage(ChatColor.DARK_RED + "Failed to run command. Not enough permission.");
            }
        } else {
            instance.getLogger().warning(ChatColor.DARK_RED + "Failed to run command. REASON: Not a PLAYER.");
        }
        return true;
    }
}
