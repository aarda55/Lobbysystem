package lobbysystem.listener;

import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class LobbyProtection implements Listener{
	
	@EventHandler
	public void onEntityDamage(EntityDamageEvent e){
		Entity p = e.getEntity();
		if(p.hasPermission("lobby.area")) {
		e.setCancelled(true);
	}
	}
	@EventHandler
	public void onEntityDamage(EntityDamageByBlockEvent e){
		Entity p = e.getEntity();
		if(p.hasPermission("lobby.area")) {
		e.setCancelled(true);
	}
	}
	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent e){
		Entity p = e.getEntity();
		if(p.hasPermission("lobby.area")) {
		}
	}
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
	Player p = e.getPlayer();
		if(p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			if(p.hasPermission("lobby.area")) {
			e.setCancelled(true);
		}
	}
	}
	@EventHandler
	public void onIn(InventoryClickEvent e){
		Player p = (Player)e.getWhoClicked();
		if(p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			if(p.hasPermission("lobby.area")) {
			e.setCancelled(true);
		}
	}
	}
	@EventHandler
	public void onDro(PlayerDropItemEvent e){
		Player p = e.getPlayer();
		if(p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			if(p.hasPermission("lobby.area")) {
			e.setCancelled(true);
		}
		}
	}
	@EventHandler
	public void onDdd(FoodLevelChangeEvent e){
		e.setCancelled(true);
	}
	@EventHandler
	public void onBlock(BlockPlaceEvent e){
		Player p = e.getPlayer();
		if(p.getGameMode() == GameMode.CREATIVE && p.hasPermission("lobbysystem.build")){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}
	}
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e){
		Player p = e.getPlayer();
		if(p.getGameMode() == GameMode.CREATIVE && p.hasPermission("lobbysystem.build")){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}
	}
}
