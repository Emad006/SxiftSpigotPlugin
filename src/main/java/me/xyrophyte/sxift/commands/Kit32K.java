package me.xyrophyte.sxift.commands;

import me.xyrophyte.sxift.Sxift;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class Kit32K implements CommandExecutor {
    private final Sxift instance;

    public Kit32K(Sxift instance) {
        this.instance = instance;
    }
    
    private final Plugin plugin = Sxift.getPlugin(Sxift.class);
    private final String noPermission = plugin.getConfig().getString("NoPermission");
    private final String playerOnly = plugin.getConfig().getString("PlayerOnly");

    private final ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
    private final ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
    private final ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
    private final ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);

    private final ItemStack sword = new ItemStack(Material.IRON_SWORD);
    private final ItemStack axe = new ItemStack(Material.IRON_AXE);
    private final ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
    private final ItemStack shovel = new ItemStack(Material.IRON_SPADE);
    private final ItemStack hoe = new ItemStack(Material.IRON_HOE);
    private final ItemStack bow = new ItemStack(Material.BOW);
    private final ItemStack arrow = new ItemStack(Material.ARROW, 64);

    private final ItemStack stickOfDoom = new ItemStack(Material.STICK);
    private final ItemStack knockbackStick = new ItemStack(Material.STICK);

    private final ItemStack[] kit = {
            helmet,
            chestplate,
            leggings,
            boots,
            sword,
            axe,
            pickaxe,
            shovel,
            hoe,
            bow,
            arrow,
            stickOfDoom,
            knockbackStick
    };

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("sxift.32k")) {
                helmet.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                helmet.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                helmet.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                helmet.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                helmet.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                helmet.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                helmet.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                helmet.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                helmet.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                helmet.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                helmet.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                helmet.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                helmet.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                helmet.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                helmet.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                helmet.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                helmet.addUnsafeEnchantment(Enchantment.LURE, 32767);
                helmet.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                helmet.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                helmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                helmet.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                helmet.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                helmet.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                helmet.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                helmet.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                helmet.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                helmet.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                helmet.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                helmet.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta helmetMeta = helmet.getItemMeta();
                helmetMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Cap");
                helmetMeta.setUnbreakable(true);
                ArrayList<String> helmetLore = new ArrayList<>();
                helmetLore.add(ChatColor.BLACK + "Sxift");
                helmetMeta.setLore(helmetLore);

                chestplate.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                chestplate.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                chestplate.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.LURE, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                chestplate.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta chestplateMeta = chestplate.getItemMeta();
                chestplateMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Shirt");
                chestplateMeta.setUnbreakable(true);
                ArrayList<String> chestplateLore = new ArrayList<>();
                chestplateLore.add(ChatColor.BLACK + "Sxift");
                chestplateMeta.setLore(chestplateLore);

                leggings.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                leggings.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                leggings.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                leggings.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                leggings.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                leggings.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                leggings.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                leggings.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                leggings.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                leggings.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                leggings.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                leggings.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                leggings.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                leggings.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                leggings.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                leggings.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                leggings.addUnsafeEnchantment(Enchantment.LURE, 32767);
                leggings.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                leggings.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                leggings.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                leggings.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                leggings.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                leggings.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                leggings.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                leggings.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                leggings.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                leggings.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                leggings.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                leggings.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta leggingsMeta = leggings.getItemMeta();
                leggingsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Pants");
                leggingsMeta.setUnbreakable(true);
                ArrayList<String> leggingsLore = new ArrayList<>();
                leggingsLore.add(ChatColor.BLACK + "Sxift");
                leggingsMeta.setLore(leggingsLore);

                boots.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                boots.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                boots.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                boots.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                boots.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                boots.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                boots.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                boots.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                boots.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                boots.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                boots.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                boots.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                boots.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                boots.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                boots.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                boots.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                boots.addUnsafeEnchantment(Enchantment.LURE, 32767);
                boots.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                boots.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                boots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                boots.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                boots.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                boots.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                boots.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                boots.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                boots.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                boots.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                boots.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                boots.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta bootsMeta = boots.getItemMeta();
                bootsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Shoes");
                bootsMeta.setUnbreakable(true);
                ArrayList<String> bootsLore = new ArrayList<>();
                bootsLore.add(ChatColor.BLACK + "Sxift");
                bootsMeta.setLore(bootsLore);

                sword.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                sword.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                sword.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                sword.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                sword.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                sword.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                sword.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                sword.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                sword.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                sword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                sword.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                sword.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                sword.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                sword.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                sword.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                sword.addUnsafeEnchantment(Enchantment.LURE, 32767);
                sword.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                sword.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                sword.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                sword.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                sword.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                sword.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                sword.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                sword.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                sword.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                sword.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                sword.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                sword.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta swordMeta = sword.getItemMeta();
                swordMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Sword");
                swordMeta.setUnbreakable(true);
                ArrayList<String> swordLore = new ArrayList<>();
                swordLore.add(ChatColor.BLACK + "Sxift");
                swordMeta.setLore(swordLore);

                axe.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                axe.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                axe.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                axe.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                axe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                axe.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                axe.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                axe.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                axe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                axe.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                axe.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                axe.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                axe.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                axe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                axe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                axe.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                axe.addUnsafeEnchantment(Enchantment.LURE, 32767);
                axe.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                axe.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                axe.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                axe.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                axe.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                axe.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                axe.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                axe.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                axe.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                axe.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                axe.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                axe.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta axeMeta = axe.getItemMeta();
                axeMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Axe");
                axeMeta.setUnbreakable(true);
                ArrayList<String> axeLore = new ArrayList<>();
                axeLore.add(ChatColor.BLACK + "Sxift");
                axeMeta.setLore(axeLore);

                pickaxe.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                pickaxe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                pickaxe.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.LURE, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                pickaxe.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta pickaxeMeta = pickaxe.getItemMeta();
                pickaxeMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Miner");
                pickaxeMeta.setUnbreakable(true);
                ArrayList<String> pickaxeLore = new ArrayList<>();
                pickaxeLore.add(ChatColor.BLACK + "Sxift");
                pickaxeMeta.setLore(pickaxeLore);

                shovel.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                shovel.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                shovel.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                shovel.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                shovel.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                shovel.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                shovel.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                shovel.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                shovel.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                shovel.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                shovel.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                shovel.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                shovel.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                shovel.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                shovel.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                shovel.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                shovel.addUnsafeEnchantment(Enchantment.LURE, 32767);
                shovel.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                shovel.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                shovel.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                shovel.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                shovel.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                shovel.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                shovel.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                shovel.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                shovel.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                shovel.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                shovel.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                shovel.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta shovelMeta = shovel.getItemMeta();
                shovelMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Digger");
                shovelMeta.setUnbreakable(true);
                ArrayList<String> shovelLore = new ArrayList<>();
                shovelLore.add(ChatColor.BLACK + "Sxift");
                shovelMeta.setLore(shovelLore);

                hoe.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                hoe.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                hoe.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                hoe.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                hoe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                hoe.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                hoe.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                hoe.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                hoe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                hoe.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                hoe.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                hoe.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                hoe.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                hoe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                hoe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                hoe.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                hoe.addUnsafeEnchantment(Enchantment.LURE, 32767);
                hoe.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                hoe.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                hoe.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                hoe.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                hoe.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                hoe.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                hoe.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                hoe.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                hoe.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                hoe.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                hoe.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                hoe.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta hoeMeta = hoe.getItemMeta();
                hoeMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Hoe");
                hoeMeta.setUnbreakable(true);
                ArrayList<String> hoeLore = new ArrayList<>();
                hoeLore.add(ChatColor.BLACK + "Sxift");
                hoeMeta.setLore(hoeLore);

                bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                bow.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                bow.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                bow.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                bow.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                bow.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                bow.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                bow.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                bow.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                bow.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                bow.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                bow.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                bow.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                bow.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                bow.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                bow.addUnsafeEnchantment(Enchantment.LURE, 32767);
                bow.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                bow.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                bow.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                bow.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                bow.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                bow.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                bow.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                bow.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                bow.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                bow.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                bow.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                bow.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta bowMeta = bow.getItemMeta();
                bowMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Bow");
                bowMeta.setUnbreakable(true);
                ArrayList<String> bowLore = new ArrayList<>();
                bowLore.add(ChatColor.BLACK + "Sxift");
                bowMeta.setLore(bowLore);

                arrow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                arrow.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                arrow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                arrow.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                arrow.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                arrow.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                arrow.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                arrow.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                arrow.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                arrow.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                arrow.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                arrow.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                arrow.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                arrow.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                arrow.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                arrow.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                arrow.addUnsafeEnchantment(Enchantment.LURE, 32767);
                arrow.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                arrow.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                arrow.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                arrow.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                arrow.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                arrow.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                arrow.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                arrow.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                arrow.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                arrow.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                arrow.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                arrow.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta arrowMeta = arrow.getItemMeta();
                arrowMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Arrows");
                arrowMeta.setUnbreakable(true);
                ArrayList<String> arrowLore = new ArrayList<>();
                arrowLore.add(ChatColor.BLACK + "Sxift");
                arrowMeta.setLore(arrowLore);

                stickOfDoom.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.DIG_SPEED, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.DURABILITY, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.FROST_WALKER, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 100);
                stickOfDoom.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 100);
                stickOfDoom.addUnsafeEnchantment(Enchantment.LUCK, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.LURE, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.MENDING, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.OXYGEN, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.THORNS, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 32767);
                stickOfDoom.addUnsafeEnchantment(Enchantment.WATER_WORKER, 32767);
                ItemMeta stickOfDoomMeta = stickOfDoom.getItemMeta();
                stickOfDoomMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Bitch");
                stickOfDoomMeta.setUnbreakable(true);
                ArrayList<String> stickOfDoomLore = new ArrayList<>();
                stickOfDoomLore.add(ChatColor.BLACK + "Sxift");
                stickOfDoomMeta.setLore(stickOfDoomLore);

                knockbackStick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 32767);
                ItemMeta knockbackStickMeta = knockbackStick.getItemMeta();
                knockbackStickMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "32K Bitch");
                knockbackStickMeta.setUnbreakable(true);
                ArrayList<String> knockbackStickLore = new ArrayList<>();
                knockbackStickLore.add(ChatColor.BLACK + "Sxift");
                knockbackStickMeta.setLore(knockbackStickLore);


                Player player = (Player) sender;
                Inventory kit32K = Bukkit.createInventory(player, 18, "32K Kit");
                player.openInventory(kit32K);
                kit32K.setContents(kit);
            } else {
                sender.sendMessage(ChatColor.DARK_RED + noPermission);
            }
        } else {
            instance.getLogger().warning(playerOnly);
        }
        return true;
    }
}
