package com.imaboy321.autoblock;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoBlock extends JavaPlugin implements Listener {

    public ArrayList<Material> blockable = new ArrayList<>();

    @Override
    public void onEnable() {
        getLogger().info(this.getDescription() + " has been enabled!");
        blockable.addAll(Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.DIAMOND, Material.COAL, Material.REDSTONE, Material.INK_SACK, Material.EMERALD));
    }

    @EventHandler(ignoreCancelled = true)
    public void onPickup(PlayerPickupItemEvent e) {
        if(blockable.contains(e.getItem().getItemStack().getType())) {

        }
    }

}
