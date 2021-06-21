package com.quacktopia.quacktopiasafety;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.graalvm.compiler.nodes.cfg.Block;

public class BlockBanner implements Listener {
    @EventHandler
    public void StructureVoid(BlockPlaceEvent e) {
        if (!e.getPlayer().hasPermission("quacktopia.staff"))
            if (e.getBlock().getType().equals(Material.STRUCTURE_VOID)){
                e.setCancelled(true);
            }
    }
    @EventHandler
    public void CommandBlock(BlockPlaceEvent e) {
        if (!e.getPlayer().hasPermission("quacktopia.staff"))
            if (e.getBlock().getType().equals(Material.COMMAND_BLOCK)) {
                e.setCancelled(true);
            }
    }

    @EventHandler
    public void RepeatCommand(BlockPlaceEvent e) {
        if (!e.getPlayer().hasPermission("quacktopia.staff"))
            if (e.getBlock().getType().equals(Material.REPEATING_COMMAND_BLOCK)) {
                e.setCancelled(true);
            }
    }

    @EventHandler
    public void ChainCommand(BlockPlaceEvent e) {
        if (!e.getPlayer().hasPermission("quacktopia.staff"))
            if (e.getBlock().getType().equals(Material.CHAIN_COMMAND_BLOCK)) {
                e.setCancelled(true);

            }
    }

    @EventHandler
    public void StructureBlock(BlockPlaceEvent e) {
        if (!e.getPlayer().hasPermission("quacktopia.staff"))
            if (e.getBlock().getType().equals(Material.STRUCTURE_BLOCK)) {
               e.setCancelled(true);
            }
    }
}

