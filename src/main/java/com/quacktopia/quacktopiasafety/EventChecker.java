package com.quacktopia.quacktopiasafety;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.AreaEffectCloudApplyEvent;
import org.bukkit.event.entity.LingeringPotionSplashEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class EventChecker implements Listener {
    @EventHandler
    public void Lingering(LingeringPotionSplashEvent e){
        e.setCancelled(true);
    }
    @EventHandler
    public void Projectile (ProjectileLaunchEvent e){
        e.setCancelled(true);
    }
}
