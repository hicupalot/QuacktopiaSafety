package com.quacktopia.quacktopiasafety;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class QuacktopiaSafetyTest implements CommandExecutor {
    public static QuacktopiaSafety plugin;

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            sender.sendMessage(ChatColor.GOLD + "Author " + plugin.getDescription().getAuthors());
            sender.sendMessage(ChatColor.GOLD + "Version " + plugin.getDescription().getVersion());
        }
        return false;
    }
}
