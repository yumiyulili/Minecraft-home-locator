package ru.yumiyulili.lybimkiCraft

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin

class LybimkiCraft : JavaPlugin() {

    override fun onEnable() {
        Bukkit.getScheduler().runTaskTimer(this, Runnable({
            for (player in Bukkit.getOnlinePlayers()) {
                var loc1 = player.location
                var loc2 = player.respawnLocation
                if(loc2 != null){
                   if(loc1.distance(loc2) < 50.0){

                } else {
                    player.sendActionBar(ChatColor.translateAlternateColorCodes('&',"&aДо точки спавна ${Math.ceil(loc1.distance(loc2))} блоков"))
                }}

            }

        }), 10, 10);

        Bukkit.getPluginManager().registerEvents(Handler(), this); // сделать так, чтобы плагин работал с этим событием
        // тоесть он не будет считать это просто какимто паносекам, а будет знать что это класс с событиями
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
