package kits;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Kits_methods implements Listener {
	@EventHandler
	public void onInt(PlayerInteractEvent e) {
	Player p = e.getPlayer();
	try{
			if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Kits")){
			Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST,"§5Kits");
			
			ItemStack a = new ItemStack(Material.STICK);
			ItemMeta im = a.getItemMeta();
			im.setDisplayName("§7Default");
			a.setItemMeta(im);
			
			ItemStack b = new ItemStack(Material.STONE_AXE);
			ItemMeta am = b.getItemMeta();
			am.setDisplayName("§cBerserker");
			b.setItemMeta(am);
			
			ItemStack c = new ItemStack(Material.STONE_AXE);
			ItemMeta amg = c.getItemMeta();
			amg.setDisplayName("§3Assasin");
			c.setItemMeta(amg);
			
			ItemStack d = new ItemStack(Material.BOW);
			ItemMeta amt = d.getItemMeta();
			amt.setDisplayName("§9Archer");
			d.setItemMeta(amt);
			
			ItemStack e2= new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta amf = e2.getItemMeta();
			amf.setDisplayName("§gTank");
			e2.setItemMeta(amf);
			
			ItemStack e3= new ItemStack(Material.STAINED_GLASS_PANE);
			ItemMeta amz = e3.getItemMeta();
			amz.setDisplayName("");
			e3.setItemMeta(amz);
			
			inv.setItem(1, e3);
			inv.setItem(2, a);
			inv.setItem(3, b);
			inv.setItem(4, c);
			inv.setItem(5, d);
			inv.setItem(6, e2);
			inv.setItem(7, e3);
			inv.setItem(8, e3);
			inv.setItem(9, e3);
			inv.setItem(10, e3);
			inv.setItem(11, e3);
			inv.setItem(12, e3);
			inv.setItem(13, e3);
			inv.setItem(14, e3);
			inv.setItem(15, e3);
			inv.setItem(16, e3);
			inv.setItem(17, e3);
			inv.setItem(18, e3);
			inv.setItem(19, e3);
			inv.setItem(20, e3);
			inv.setItem(21, e3);
			inv.setItem(22, e3);
			inv.setItem(23, e3);
			inv.setItem(24, e3);
			inv.setItem(25, e3);
			inv.setItem(26, e3);
			inv.setItem(27, e3);
			p.openInventory(inv);
		}
	}catch(Exception e1){}
	}
}
