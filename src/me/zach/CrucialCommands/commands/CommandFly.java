package me.zach.CrucialCommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] ags) {
		if(cmd.getName().equalsIgnoreCase("fly")) {
			Player player = (Player) sender;
			 if (player.isFlying() == false) {
				player.setAllowFlight(true);
				player.setFlying(true);
			} else {
				player.setAllowFlight(false);
				player.setFlying(false);
			}
		}
		return false;
	}

}