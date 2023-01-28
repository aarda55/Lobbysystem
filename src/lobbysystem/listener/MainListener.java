package lobbysystem.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import lobbysystem.data.Data;
import lobbysystem.methods.Methods;

public class MainListener implements Listener{
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p= e.getPlayer();
		e.setJoinMessage(null);
		Methods.setLobbyItems(p);
		p.setFoodLevel(20);
		p.teleport(Data.spawn);
		p.setGameMode(GameMode.ADVENTURE);	
		for(@SuppressWarnings("unused") Player all : Bukkit.getOnlinePlayers()){
		}
		if(p.hasPlayedBefore()){
		}
		else {
			p.sendMessage("§dWillkommen auf Vitacraft.net §7!");
		}
		}
	@EventHandler
	public void onJoin(PlayerQuitEvent e){
		@SuppressWarnings("unused")
		Player p= e.getPlayer();
		e.setQuitMessage(null);
	}
	@EventHandler
    public void on(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        
        if (p.hasPermission("Vita.VIP") || p.hasPermission("Vita.VIP+")) {
            e.setMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)e.getMessage()));
        }
        if(p.hasPermission("rank.owner")){
        	e.setCancelled(false);
        	e.setFormat("§4Owner §8• §4" + p.getName() + "§8 » §6" + e.getMessage());
        }else
        if(p.hasPermission("rank.admin")){
        	e.setCancelled(false);
        	e.setFormat("§cAdmin §8• §c" + p.getName() + "§8 » §6" + e.getMessage());
        }else
	        if(p.hasPermission("rank.moderator")){
	        	e.setCancelled(false);
	        	e.setFormat("§2Moderator §8• §2" + p.getName() + "§8 » §f" + e.getMessage());
	    }else
	        if(p.hasPermission("rank.developer")){
	        	e.setCancelled(false);
	        	e.setFormat("§bDeveloper §8• §b" + p.getName() + "§8 » §b" + e.getMessage());
	    }else
	        if(p.hasPermission("rank.universal")){
	        	e.setCancelled(false);
	        	e.setFormat("§l§5Universal §8• §b" + p.getName() + "§8 » §5§l" + e.getMessage());
	    }else
        if(p.hasPermission("rank.helper")){
        	e.setCancelled(false);
        	e.setFormat("§cHelper §8• §c" + p.getName() + "§8 » §f" + e.getMessage());
        }else
        if(p.hasPermission("rank.supporter")){
        	e.setCancelled(false);
        	e.setFormat("§9Supporter §8• §9" + p.getName() + "§8 » §f" + e.getMessage());
        }else
        if(p.hasPermission("rank.tiktok")){
        	e.setCancelled(false);
        	e.setFormat("§5TikTok §8• §5" + p.getName() + "§8 » §f" + e.getMessage());
        }else
        if(p.hasPermission("rank.youtuber")){
        	e.setCancelled(false);
        	e.setFormat("§5YouTuber §8• §5" + p.getName() + "§8 » §f" + e.getMessage());
        }else
        if(p.hasPermission("rank.colossal")){
        	e.setCancelled(false);
        	e.setFormat("§9Colossal §8• §9" + p.getName() + "§8 » §f" + e.getMessage());
        }else 
        if(p.hasPermission("rank.titanic")){
        	e.setCancelled(false);
        	e.setFormat("§bTitanic §8• §b" + p.getName() + "§8 » §f" + e.getMessage());
    }else{
    	e.setCancelled(false);
    	e.setFormat("§7" + e.getPlayer().getName() + "§8 » §f" + e.getMessage());
    }
 }
}
