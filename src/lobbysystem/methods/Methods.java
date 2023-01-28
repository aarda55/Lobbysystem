package lobbysystem.methods;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
public class Methods {
	public static void setLobbyItems(Player p){
		ItemStack compass = new ItemStack(Material.COMPASS);
		ItemMeta cm = compass.getItemMeta();
		cm.setDisplayName("§eNavigator");
		compass.setItemMeta(cm);
		
		ItemStack spielerverstecken = new ItemStack(Material.BLAZE_ROD);
		ItemMeta sv = spielerverstecken.getItemMeta();
		sv.setDisplayName("§aHide players");
		spielerverstecken.setItemMeta(sv);
		
		ItemStack cos = new ItemStack(Material.CHEST);
		ItemMeta c = cos.getItemMeta();
		c.setDisplayName("§cCosmetics");
		cos.setItemMeta(c);
		
		p.getInventory().clear();
		p.getInventory().setItem(0, compass);
		p.getInventory().setItem(1, spielerverstecken);
		p.getInventory().setItem(8, cos);
		p.updateInventory();
		}
}
