package lobbysystem.data;

import java.io.File;

import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;

public class Data {

	public static String NoPerm = "§cYou don't have the permission to do this!";
	public static File file = new File("plugins//LobbySystem//spawns.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	public static Location spawn;
	public static Location spawn1;
	public static Location spawn2;
	public static Location spawn3;
	public static Location spawn4;
	public static Location spawn5;
	public static Location spawn6;

}
