package me.zach.CrucialCommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.zach.CrucialCommands.*;

public class CommandWorkBench implements CommandExecutor { 
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
		Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("workbench") || (cmd.getName().equalsIgnoreCase("wb"))) {
				if(player.hasPermission("perm.workbech")) {
					player.openWorkbench(null, true);
				} else {
					player.sendMessage(CrucialCommands.noPermission + "You can't do that. What a shame :("); 
				}
			}
		} else {
			sender.sendMessage("You must be a player to use this command :(");
		}
		return false;
	}
}
