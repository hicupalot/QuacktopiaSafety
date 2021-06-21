package com.quacktopia.quacktopiasafety;

import org.bukkit.plugin.java.JavaPlugin;

public final class QuacktopiaSafety extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlockBanner(), this);
        getServer().getPluginManager().registerEvents(new ExplosiveStopper(), this);
        getServer().getPluginManager().registerEvents(new EventChecker(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
