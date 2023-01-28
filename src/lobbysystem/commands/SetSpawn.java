package lobbysystem.commands;

import java.io.IOException;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import lobbysystem.data.Data;

public class SetSpawn implements Listener{

	@EventHandler
	public void onPlayer(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("lobbysystem.setspawn")){
			if(e.getMessage().equalsIgnoreCase("/setspawn")){
				Location loc = p.getLocation();
				Data.cfg.set("Spawn.X", loc.getX());
				Data.cfg.set("Spawn.Y", loc.getY());
				Data.cfg.set("Spawn.Z", loc.getZ());
				Data.cfg.set("Spawn.Yaw", loc.getYaw());
				Data.cfg.set("Spawn.Pitch", loc.getPitch());
				Data.cfg.set("Spawn.WeltName", loc.getWorld().getName());
				try {
					Data.cfg.save(Data.file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Data.spawn = loc;
				p.sendMessage("§6You set spawn 1!");
			}
			if(e.getMessage().equalsIgnoreCase("/setspawn1")){
				Location loc = p.getLocation();
				Data.cfg.set("1.X", loc.getX());
				Data.cfg.set("1.Y", loc.getY());
				Data.cfg.set("1.Z", loc.getZ());
				Data.cfg.set("1.Yaw", loc.getYaw());
				Data.cfg.set("1.Pitch", loc.getPitch());
				Data.cfg.set("1.WeltName", loc.getWorld().getName());
				try {
					Data.cfg.save(Data.file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Data.spawn1 = loc;
				p.sendMessage("§6You set spawn 1!");
			}
			if(e.getMessage().equalsIgnoreCase("/setspawn2")){
				Location loc = p.getLocation();
				Data.cfg.set("2.X", loc.getX());
				Data.cfg.set("2.Y", loc.getY());
				Data.cfg.set("2.Z", loc.getZ());
				Data.cfg.set("2.Yaw", loc.getYaw());
				Data.cfg.set("2.Pitch", loc.getPitch());
				Data.cfg.set("2.WeltName", loc.getWorld().getName());
				try {
					Data.cfg.save(Data.file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Data.spawn2 = loc;
				p.sendMessage("§6You set spawn 2!");
			}
			if(e.getMessage().equalsIgnoreCase("/setspawnFFA")){
				Location loc = p.getLocation();
				Data.cfg.set("3.X", loc.getX());
				Data.cfg.set("3.Y", loc.getY());
				Data.cfg.set("3.Z", loc.getZ());
				Data.cfg.set("3.Yaw", loc.getYaw());
				Data.cfg.set("3.Pitch", loc.getPitch());
				Data.cfg.set("3.WeltName", loc.getWorld().getName());
				try {
					Data.cfg.save(Data.file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Data.spawn3 = loc;
				p.sendMessage("§6You set the spawn for FFA!");
			}
			if(e.getMessage().equalsIgnoreCase("/setspawn4")){
				Location loc = p.getLocation();
				Data.cfg.set("4.X", loc.getX());
				Data.cfg.set("4.Y", loc.getY());
				Data.cfg.set("4.Z", loc.getZ());
				Data.cfg.set("4.Yaw", loc.getYaw());
				Data.cfg.set("4.Pitch", loc.getPitch());
				Data.cfg.set("4.WeltName", loc.getWorld().getName());
				try {
					Data.cfg.save(Data.file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Data.spawn4 = loc;
				p.sendMessage("§6You set spawn 4!");
			}
			if(e.getMessage().equalsIgnoreCase("/setspawn5")){
				Location loc = p.getLocation();
				Data.cfg.set("5.X", loc.getX());
				Data.cfg.set("5.Y", loc.getY());
				Data.cfg.set("5.Z", loc.getZ());
				Data.cfg.set("5.Yaw", loc.getYaw());
				Data.cfg.set("5.Pitch", loc.getPitch());
				Data.cfg.set("5.WeltName", loc.getWorld().getName());
				try {
					Data.cfg.save(Data.file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Data.spawn5 = loc;
				p.sendMessage("§6You set spawn 5!");
			}
			if(e.getMessage().equalsIgnoreCase("/setspawn6")){
				Location loc = p.getLocation();
				Data.cfg.set("6.X", loc.getX());
				Data.cfg.set("6.Y", loc.getY());
				Data.cfg.set("6.Z", loc.getZ());
				Data.cfg.set("6.Yaw", loc.getYaw());
				Data.cfg.set("6.Pitch", loc.getPitch());
				Data.cfg.set("6.WeltName", loc.getWorld().getName());
				try {
					Data.cfg.save(Data.file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Data.spawn6 = loc;
				p.sendMessage("§6You set spawn 6!");
			}	
		}
	}
	

}
