package com.imaboy321.autoblock;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoBlock extends JavaPlugin {

    public ArrayList<Material> blockable = new ArrayList<>();

    @Override
    public void onEnable() {
        getLogger().info(this.getDescription() + " has been enabled!");
        blockable.addAll(Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.DIAMOND, Material.COAL, Material.REDSTONE, Material.INK_SACK));
    }


}
