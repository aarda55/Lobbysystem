package lobbysystem.methods;

import java.io.File;
import org.bukkit.configuration.file.YamlConfiguration;

public class Scoreboard {
	 public static String nextevent = "Loading";
	    public static File file = new File("plugins/Lobby", "nexteventfuerfalki.yml");
	    public static YamlConfiguration yamlcfg = YamlConfiguration.loadConfiguration((File)file);
}
