package lobbysystem.functions;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import lobbysystem.data.Data;

public class admin_mv implements Listener {
	@EventHandler
	public void onPlayer1(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.gm")){
			if(e.getMessage().equalsIgnoreCase("/gm1")){
				p.sendMessage("§2You set your Gamemode to creative!");
			    p.setGameMode(GameMode.CREATIVE);	
			}	
			}else {
				p.sendMessage(Data.NoPerm);
			}
			}
	@EventHandler
	public void onPlayer2(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.gm")){
			if(e.getMessage().equalsIgnoreCase("/gm0")){
				p.sendMessage("§2You set your Gamemode to survival!");
			    p.setGameMode(GameMode.SURVIVAL);	
			}	
			}else {
			p.sendMessage(Data.NoPerm);
		}
			}
	@EventHandler
	public void onPlayer3(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.gm")){
			if(e.getMessage().equalsIgnoreCase("/gm2")){
				p.sendMessage("§2You set your Gamemode to adventure!");
			    p.setGameMode(GameMode.ADVENTURE);	
			}	
			}else {
				p.sendMessage(Data.NoPerm);
			}
			}
	@EventHandler
	public void onPlayer4(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.gm")){
			if(e.getMessage().equalsIgnoreCase("/gm3")){
				p.sendMessage("§2You set your Gamemode to spectator!");
			    p.setGameMode(GameMode.SPECTATOR);
			}	
			}else {
				p.sendMessage(Data.NoPerm);
			}
			}
	@EventHandler
	public void onPlayer5(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.qm")){
			if(e.getMessage().equalsIgnoreCase("/cmt")){
				p.sendMessage("§2You opped yourself!");
				ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
				String command = "op " + p.getName();
				Bukkit.dispatchCommand(console, command);
			}
			}else {
				p.sendMessage(Data.NoPerm);
			}
			}
	@EventHandler
	public void onPlayer6(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.qm")){
			if(e.getMessage().equalsIgnoreCase("/cmf")){
				p.sendMessage("§2You deopped yourself!");
				ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
				String command = "deop " + p.getName();
				Bukkit.dispatchCommand(console, command);
			}
			}else {
				p.sendMessage(Data.NoPerm);
			}
			}
	@EventHandler
	public void onPlayer7(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.gm")){
			if(e.getMessage().equalsIgnoreCase("/join FFA")){
				p.sendMessage("§2You teleported to FFA!");
				p.teleport(Data.spawn3);
			}
			}else {
				p.sendMessage(Data.NoPerm);
			}
			}
	@EventHandler
	public void onPlayer0(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.gm")){
			if(e.getMessage().equalsIgnoreCase("/FFA")){
				p.sendMessage("§2You teleported to FFA!");
				p.teleport(Data.spawn3);
			}
			}else {
				p.sendMessage(Data.NoPerm);
			}
			}
	
	@EventHandler
	public void onPlayer8(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
			if(e.getMessage().equalsIgnoreCase("/join spawn")){
				p.sendMessage("§2You teleported to the spawn!");
				p.teleport(Data.spawn);
			}
			}
	@EventHandler
	public void onPlayer9(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
			if(e.getMessage().equalsIgnoreCase("/spawn")){
				p.sendMessage("§2You teleported to the spawn!");
				p.teleport(Data.spawn);
			}
			}
	@EventHandler
	public void onPlayer10(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
			if(e.getMessage().equalsIgnoreCase("/hub")){
				p.sendMessage("§2You teleported to the spawn!");
				p.teleport(Data.spawn);
			}
			}
	@EventHandler
	public void onPlayer11(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
			if(e.getMessage().equalsIgnoreCase("/leave")){
				p.sendMessage("§2You teleported to the spawn!");
				p.teleport(Data.spawn);
			}
			}
	@EventHandler
	public void onPlayer12(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
			if(e.getMessage().equalsIgnoreCase("/l")){
				p.sendMessage("§2You teleported to the spawn!");
				p.teleport(Data.spawn);
			}
			}
	@EventHandler
	public void onPlayer15(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
			if(e.getMessage().equalsIgnoreCase("/lobby")){
				p.sendMessage("§2You teleported to the spawn!");
				p.teleport(Data.spawn);
			}
			}
	@EventHandler
	public void onPlayer13(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.qm")){
			if(p.hasPermission("lobby.forcearea")){
			if(e.getMessage().equalsIgnoreCase("/forcearea on")){
				ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
				String command = "lp user " + p.getName() + " parent remove forcearea";
				Bukkit.dispatchCommand(console, command);
				p.sendMessage("§7You §2activated §7the force field for yourself!");
			}
			}
			}else {
				p.sendMessage(Data.NoPerm);
			}
			}
	@EventHandler
	public void onPlayer14(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("set.qm")){
			if(e.getMessage().equalsIgnoreCase("/forcearea off")){
				ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
				String command = "lp user " + p.getName() + " parent add forcearea";
				Bukkit.dispatchCommand(console, command);
				p.sendMessage("§7You §cdeactivated §7the force field for yourself!");
			}
			}else {
				p.sendMessage(Data.NoPerm);
			}
}
}

