package lobbysystem.functions;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerHider implements Listener{
	static ArrayList<Player> hidden = new ArrayList<Player>();
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		Player p = e.getPlayer();
		try{

			if(e.getItem().getType() == Material.BLAZE_ROD){
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
				Inventory inv = Bukkit.createInventory(null, InventoryType.HOPPER,"§eHide players");
				ItemStack i = new ItemStack(Material.INK_SACK, 1, (short)10);
				ItemMeta im = i.getItemMeta();
				im.setDisplayName("§aShow players");
				i.setItemMeta(im);
				
				ItemStack a = new ItemStack(Material.INK_SACK, 1, (short)1);
				ItemMeta am = a.getItemMeta();
				am.setDisplayName("§cHide players");
				a.setItemMeta(am);
				
				inv.setItem(1, i);
				inv.setItem(3, a);
				p.openInventory(inv);
			}
			
		}catch(Exception e1){}
	}
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClic(InventoryClickEvent e){
		Player p = (Player)e.getWhoClicked();
		if(e.getInventory().getName().equalsIgnoreCase("§eHide players")){
		if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aShow players")){
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 999999));
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 5, 999999));
			Location loc = p.getLocation();
			Location ent = p.getLocation();
			ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
			String command = "lp user " + p.getName() + " parent remove hideplayers";
			Bukkit.dispatchCommand(console, command);
			ent.setX(loc.getX() + 2);
			ent.setX(loc.getZ() + 2);
			loc.setY(loc.getY() + 2);
			p.playEffect(ent, Effect.LAVA_POP, 11);
			p.teleport(loc);
			for(Player all : Bukkit.getOnlinePlayers()){
				p.showPlayer(all);
				hidden.remove(p);
			}
			p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
			p.sendMessage("§7All player are §avisible§7 now!");
			p.closeInventory();
			return;
		}
		if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cHide players")){
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 999999));
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 5, 999999));
			Location loc = p.getLocation();
			Location ent = p.getLocation();
			ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
			String command = "lp user " + p.getName() + " parent add hideplayers";
			Bukkit.dispatchCommand(console, command);
			ent.setX(loc.getX() + 2);
			ent.setX(loc.getZ() + 2);
			loc.setY(loc.getY() + 2);
			p.playEffect(ent, Effect.LAVA_POP, 11);
			p.teleport(loc);
			for(Player all : Bukkit.getOnlinePlayers()){
				hidden.add(p);
				p.hidePlayer(all);
			}
			p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
			p.sendMessage("§7All player are §cinvisible§7 now!");
			p.closeInventory();
		}
	}
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		for(Player all : Bukkit.getOnlinePlayers()){
			if(hidden.contains(all)){
				all.hidePlayer(p);
			}
		}
		if(p.hasPermission("p.hide")) {
			for(Player all : Bukkit.getOnlinePlayers()){
			hidden.add(p);
			p.hidePlayer(all);
		}
		}
	}
}
