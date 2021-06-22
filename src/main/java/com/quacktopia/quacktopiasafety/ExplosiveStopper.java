package com.quacktopia.quacktopiasafety;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class ExplosiveStopper implements Listener {

    @EventHandler
    public void TNT(EntitySpawnEvent e) {
        if (e.getEntity().getType().equals(EntityType.PRIMED_TNT)) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void EndCrystal(EntitySpawnEvent e) {
        if (e.getEntity().getType().equals(EntityType.ENDER_CRYSTAL)) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void BlockDamage(EntityDamageEvent e){
        if (e.getCause().equals(EntityDamageEvent.DamageCause.BLOCK_EXPLOSION)){
            e.setCancelled(true);
            e.setDamage(0);
        }
    }
    @EventHandler
    public void Lightning(EntityDamageByEntityEvent e){
        if (e.getDamager().getType().equals(EntityType.LIGHTNING)){
            e.setCancelled(true);
            e.setDamage(0);
        }
    }
}
