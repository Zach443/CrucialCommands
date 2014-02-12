package me.zach.CrucialCommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHeal implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("heal")) {
			Player player = (Player) sender;
			if(player.hasPermission("crucial.heal")) {
				player.setHealth(20.0);
				player.setFoodLevel(20);
				player.setSaturation(10);
			}else {
				player.sendMessage("You do not have permission to use this command.");
			}
		}
		return false;
	}		
}
