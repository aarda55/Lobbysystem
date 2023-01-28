package lobbysystem.functions;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import lobbysystem.data.Data;
import lobbysystem.methods.FFA_sta;

public class Compass implements Listener{
	static ArrayList<Player> incd = new ArrayList<Player>();
	static int cd;
	static int cdc;
	private lobbysystem.main.Main pl;
	  
	  public Compass(lobbysystem.main.Main Main)
	  {
	    this.pl = Main;
	  }
	  
	  @EventHandler
	  public void onInteract(PlayerInteractEvent e){
		  Player p = e.getPlayer();
		  try {
			  
			  if(e.getItem().getType() == Material.COMPASS){
				  if(incd.isEmpty()){
					  if(!Bukkit.getScheduler().isCurrentlyRunning(cd)){
						  incd.add(p);
						  cdc = 0;
						  Inventory inv = Bukkit.createInventory(null, 3*9, "§6Navigator");
						  ItemStack a = new ItemStack(Material.EXP_BOTTLE);
						  ItemMeta am = a.getItemMeta();
						  am.setDisplayName("§aEvent");
						  a.setItemMeta(am);
						  
						  ItemStack a1 = new ItemStack(Material.DIAMOND_SWORD);
						  ItemMeta am1 = a1.getItemMeta();
						  am1.setDisplayName("§3FFA");
						  a1.setItemMeta(am1);
						  
						  ItemStack a2 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
						  ItemMeta am2 = a2.getItemMeta();
						  am2.setDisplayName("§eComing Soon...");
						  a2.setItemMeta(am2);
						  
						  ItemStack a3 = new ItemStack(Material.ENDER_PEARL);
						  ItemMeta am3 = a3.getItemMeta();
						  am3.setDisplayName("§cComing Soon...");
						  a3.setItemMeta(am3);
						  
						  ItemStack a4 = new ItemStack(Material.GOLDEN_APPLE);
						  ItemMeta am4 = a4.getItemMeta();
						  am4.setDisplayName("§6Coming Soon...");
						  a4.setItemMeta(am4);
						  
						  ItemStack a5 = new ItemStack(Material.FISHING_ROD);
						  ItemMeta am5 = a5.getItemMeta();
						  am5.setDisplayName("§bComing Soon...");
						  a5.setItemMeta(am5);
						  
						  ItemStack a51 = new ItemStack(Material.NETHER_STAR);
						  ItemMeta am51 = a51.getItemMeta();
						  am51.setDisplayName("§6Spawn");
						  a51.setItemMeta(am51);
						  
						  p.openInventory(inv);
						 
						  cd = Bukkit.getScheduler().scheduleSyncRepeatingTask(pl, new Runnable() {
							
							@Override
							public void run() {
								cdc ++;
								p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1, 1);
								if(cdc == 1){
									inv.setItem(9, a4);
									return;
								}
								if(cdc == 2){
									inv.setItem(9, null);
									inv.setItem(10, a4);
									inv.setItem(0, a5);
									inv.setItem(18, a5);
									return;
								}
								if(cdc == 3){
									inv.setItem(10, null);
									inv.setItem(0, null);
									inv.setItem(18, null);
									inv.setItem(11, a4);
									inv.setItem(1, a5);
									inv.setItem(19, a3);
									inv.setItem(9, a51);
									return;
								}
								if(cdc == 4){
									inv.setItem(12, null);
									inv.setItem(2, null);
									inv.setItem(20, null);
									inv.setItem(10, null);
									inv.setItem(12, a4);
									inv.setItem(2, a5);
									inv.setItem(20, a3);
									inv.setItem(10, a51);
									inv.setItem(0, a);
									inv.setItem(18, a2);
									return;
								}
								if(cdc == 5){

									inv.setItem(12, null);
									inv.setItem(2, null);
									inv.setItem(20, null);
									inv.setItem(10, null);
									inv.setItem(0, null);
									inv.setItem(18, null);
									inv.setItem(13, a4);
									inv.setItem(3, a5);
									inv.setItem(21, a3);
									inv.setItem(11, a51);
									inv.setItem(1, a);
									inv.setItem(19, a2);
									inv.setItem(9, a1);
									return;
								}
								if(cdc == 6){
									inv.setItem(13, null);
									inv.setItem(3, null);
									inv.setItem(21, null);
									inv.setItem(11, null);
									inv.setItem(1, null);
									inv.setItem(19, null);
									inv.setItem(9, null);
									inv.setItem(14, a4);
									inv.setItem(4, a5);
									inv.setItem(22, a3);
									inv.setItem(12, a51);
									inv.setItem(2, a);
									inv.setItem(20, a2);
									inv.setItem(10, a1);
									return;
								}
								if(cdc == 7){
									inv.setItem(14, null);
									inv.setItem(4, null);
									inv.setItem(22, null);
									inv.setItem(12, null);
									inv.setItem(2, null);
									inv.setItem(20, null);
									inv.setItem(10, null);
									inv.setItem(15, a4);
									inv.setItem(5, a5);
									inv.setItem(23, a3);
									inv.setItem(13, a51);
									inv.setItem(3, a);
									inv.setItem(21, a2);
									inv.setItem(11, a1);
									Bukkit.getScheduler().cancelTask(cd);
									incd.clear();
									
								}
								if(cdc == 8){
									Bukkit.getScheduler().cancelTask(cd);
									incd.clear();

								}
								
							}
						}, 1, 1);
					  }else{
						  Bukkit.getScheduler().cancelTask(cd);
						  p.sendMessage("§cAn Error appeared! Please reopen the navigator!");
						  p.closeInventory();
					  }
				  }
					
			  }
			  
			  
		  }catch(Exception e1){}
		  
	  }
	  
	  @EventHandler
	  public void onClick(InventoryClickEvent e){
		  Player p = (Player)e.getWhoClicked();
		  if(e.getInventory().getName().equalsIgnoreCase("§6Navigator")){
			  if(e.getCurrentItem().getType() == Material.EXP_BOTTLE){
				 p.teleport(Data.spawn1);
				 p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
				 p.sendMessage("§7You teleported to §eEvent§7!");
				 p.closeInventory();
			  }
			  if(e.getCurrentItem().getType() == Material.FISHING_ROD){
					 p.teleport(Data.spawn2);
					 p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
					 p.sendMessage("§cThis mode isn't available yet§7!");
					 p.closeInventory();
			  }
			  if(e.getCurrentItem().getType() == Material.DIAMOND_SWORD){
					 p.teleport(Data.spawn3);
					 p.getInventory().clear();
					 p.getInventory().clear();
					 FFA_sta.setFFAstartItems(p);
					 p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
					 p.sendMessage("§7You teleported to §4FFA§7!");
					 p.closeInventory();
			  }
			  if(e.getCurrentItem().getType() == Material.GOLDEN_APPLE){
					 p.teleport(Data.spawn4);
					 p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
					 p.sendMessage("§cThis mode isn't available yet§7!");
					 p.closeInventory();
			  }
			  if(e.getCurrentItem().getType() == Material.CHAINMAIL_CHESTPLATE){
					 p.teleport(Data.spawn5);
					 p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
					 p.sendMessage("§cThis mode isn't available yet§7!");
					 p.closeInventory();
			  }
			  if(e.getCurrentItem().getType() == Material.ENDER_PEARL){
					 p.teleport(Data.spawn6);
					 p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
					 p.sendMessage("§cThis mode isn't available yet§7!");
					 p.closeInventory();
			  }
			  if(e.getCurrentItem().getType() == Material.NETHER_STAR){
					 p.teleport(Data.spawn);
					 p.playSound(p.getLocation(), Sound.NOTE_BASS, 1, 1);
					 p.sendMessage("§7You have been §7teleported to the §eSpawn§7!");
					 p.closeInventory();
			  }
		  }
	  }

}
