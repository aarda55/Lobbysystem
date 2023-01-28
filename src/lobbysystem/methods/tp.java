package lobbysystem.methods;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import lobbysystem.data.Data;

public class tp implements Listener {
	
 @EventHandler
 public void onj(PlayerMoveEvent e) {
	 Player p = e.getPlayer();
	 Location loc = p.getLocation();
	 int y = loc.getBlockY();
	 int x = loc.getBlockX();
	 int z = loc.getBlockZ();
	 if(p.hasPermission("lobby.area")) {
		if(!p.hasPermission("lobby.forcearea")) {
	 if(y < 45) {
			p.teleport(Data.spawn);
	 }
	 if(y > 100) {
			p.teleport(Data.spawn);
	 }
	 if(x > 100) {
		 p.teleport(Data.spawn);
	 }
	 if(x < -100) {
		 p.teleport(Data.spawn);
	 }
	 if(z > 150) {
		 p.teleport(Data.spawn);
	 }
	 if(z < -150) {
		 p.teleport(Data.spawn);
	 }
	 }
 }
}
}
