package lobbysystem.methods;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Dye;

public class FFA_sta {
	public static void setFFAstartItems(Player p){
	ItemStack compass = new ItemStack(Material.INK_SACK);
	Dye dye = new Dye();
	dye.setColor(DyeColor.RED);
	compass.setData(dye);
	ItemMeta cm = compass.getItemMeta();
	cm.setDisplayName("§4Leave");
	cm.spigot().setUnbreakable(true);
	compass.setItemMeta(cm);
	
	p.getInventory().setItem(8, compass);
	}
}
