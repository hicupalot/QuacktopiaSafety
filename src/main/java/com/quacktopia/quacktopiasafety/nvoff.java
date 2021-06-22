package com.quacktopia.quacktopiasafety;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class nvoff implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            ((Player) sender).removePotionEffect(PotionEffectType.NIGHT_VISION);
            sender.sendMessage(ChatColor.GREEN+"Removed your Night Vision!");
        }
    return false;
    }
}
