package lobbysystem.main;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import kits.Kits_methods;
import lobbysystem.commands.SetSpawn;
import lobbysystem.data.Data;
import lobbysystem.functions.Compass;
import lobbysystem.functions.PlayerHider;
import lobbysystem.functions.admin_mv;
import lobbysystem.listener.LobbyProtection;
import lobbysystem.listener.MainListener;
import lobbysystem.methods.tp;

public class Main extends JavaPlugin{
	static int i;
	public static ItemStack OnlineLobby;
	public static ItemStack OfflineLobby;
	public void onEnable(){
		i = 0;
		Bukkit.getConsoleSender().sendMessage("§6LobbySystem activates...");
		Bukkit.getPluginManager().registerEvents(new Compass(this), this);
		Bukkit.getPluginManager().registerEvents(new PlayerHider(), this);
		Bukkit.getPluginManager().registerEvents(new admin_mv(), this);
		Bukkit.getPluginManager().registerEvents(new tp(), this);
		Bukkit.getPluginManager().registerEvents(new LobbyProtection(), this);
		Bukkit.getPluginManager().registerEvents(new Kits_methods(), this);
		
		Bukkit.getPluginManager().registerEvents(new MainListener(), this);
		Bukkit.getPluginManager().registerEvents(new SetSpawn(), this);
		loadLocations();

        load1();
        load2();
        load3();
        load4();
        load5();
        load6();
	
	}
	public void onDisable(){
		
		Bukkit.getConsoleSender().sendMessage("§6LobbySystem deactivates...");
		
	}
	public void loadLocations(){
		File file = new File("plugins//LobbySystem//spawns.yml");
		YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        String w = cfg.getString("Spawn.WeltName");
        double x = cfg.getDouble("Spawn.X");
        double y = cfg.getDouble("Spawn.Y");
        double z = cfg.getDouble("Spawn.Z");
        double yaw = cfg.getDouble("Spawn.Yaw");
        double pitch = cfg.getDouble("Spawn.Pitch");
        Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        Data.spawn = loc;

	}
	public void load1(){
		File file = new File("plugins//LobbySystem//spawns.yml");
		YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        String w = cfg.getString("1.WeltName");
        double x = cfg.getDouble("1.X");
        double y = cfg.getDouble("1.Y");
        double z = cfg.getDouble("1.Z");
        double yaw = cfg.getDouble("1.Yaw");
        double pitch = cfg.getDouble("1.Pitch");
        Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
        loc.setYaw((float)yaw);
        loc.setPitch((float)pitch);
        Data.spawn1 = loc;
	}
public void load2(){
	File file = new File("plugins//LobbySystem//spawns.yml");
	YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    String w = cfg.getString("2.WeltName");
    double x = cfg.getDouble("2.X");
    double y = cfg.getDouble("2.Y");
    double z = cfg.getDouble("2.Z");
    double yaw = cfg.getDouble("2.Yaw");
    double pitch = cfg.getDouble("2.Pitch");
    Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
    loc.setYaw((float)yaw);
    loc.setPitch((float)pitch);
    Data.spawn2 = loc;
	}
public void load3(){
	File file = new File("plugins//LobbySystem//spawns.yml");
	YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    String w = cfg.getString("3.WeltName");
    double x = cfg.getDouble("3.X");
    double y = cfg.getDouble("3.Y");
    double z = cfg.getDouble("3.Z");
    double yaw = cfg.getDouble("3.Yaw");
    double pitch = cfg.getDouble("3.Pitch");
    Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
    loc.setYaw((float)yaw);
    loc.setPitch((float)pitch);
    Data.spawn3 = loc;
}
public void load4(){
	File file = new File("plugins//LobbySystem//spawns.yml");
	YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    String w = cfg.getString("4.WeltName");
    double x = cfg.getDouble("4.X");
    double y = cfg.getDouble("4.Y");
    double z = cfg.getDouble("4.Z");
    double yaw = cfg.getDouble("4.Yaw");
    double pitch = cfg.getDouble("4.Pitch");
    Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
    loc.setYaw((float)yaw);
    loc.setPitch((float)pitch);
    Data.spawn4 = loc;
}
public void load5(){
	File file = new File("plugins//LobbySystem//spawns.yml");
	YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    String w = cfg.getString("5.WeltName");
    double x = cfg.getDouble("5.X");
    double y = cfg.getDouble("5.Y");
    double z = cfg.getDouble("5.Z");
    double yaw = cfg.getDouble("5.Yaw");
    double pitch = cfg.getDouble("5.Pitch");
    Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
    loc.setYaw((float)yaw);
    loc.setPitch((float)pitch);
    Data.spawn5 = loc;
}
public void load6(){
	File file = new File("plugins//LobbySystem//spawns.yml");
	YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    String w = cfg.getString("6.WeltName");
    double x = cfg.getDouble("6.X");
    double y = cfg.getDouble("6.Y");
    double z = cfg.getDouble("6.Z");
    double yaw = cfg.getDouble("6.Yaw");
    double pitch = cfg.getDouble("6.Pitch");
    Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
    loc.setYaw((float)yaw);
    loc.setPitch((float)pitch);
    Data.spawn6 = loc;
}



}
