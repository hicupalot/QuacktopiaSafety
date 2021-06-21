package com.quacktopia.quacktopiasafety;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCreativeEvent;

public class BlockBanner implements Listener {
    @EventHandler
    public void StructureVoid(InventoryCreativeEvent e) {
        if (!e.getWhoClicked().hasPermission("quacktopia.staff"))
            if (e.getInventory().contains(Material.STRUCTURE_VOID)) {
                e.getInventory().remove(Material.STRUCTURE_VOID);
            }
    }

    @EventHandler
    public void CommandBlock(InventoryCreativeEvent e) {
        if (!e.getWhoClicked().hasPermission("quacktopia.staff"))
            if (e.getInventory().contains(Material.COMMAND_BLOCK)) {
                e.getInventory().remove(Material.COMMAND_BLOCK);
            }
    }

    @EventHandler
    public void RepeatCommand(InventoryCreativeEvent e) {
        if (!e.getWhoClicked().hasPermission("quacktopia.staff"))
            if (e.getInventory().contains(Material.REPEATING_COMMAND_BLOCK)) {
                e.getInventory().remove(Material.REPEATING_COMMAND_BLOCK);
            }
    }

    @EventHandler
    public void ChainCommand(InventoryCreativeEvent e) {
        if (!e.getWhoClicked().hasPermission("quacktopia.staff"))
            if (e.getInventory().contains(Material.CHAIN_COMMAND_BLOCK)) {
                e.getInventory().remove(Material.CHAIN_COMMAND_BLOCK);

            }
    }

    @EventHandler
    public void StructureBlock(InventoryCreativeEvent e) {
        if (!e.getWhoClicked().hasPermission("quacktopia.staff"))
            if (e.getInventory().contains(Material.STRUCTURE_BLOCK)) {
                e.getInventory().remove(Material.STRUCTURE_BLOCK);
            }
    }
}

