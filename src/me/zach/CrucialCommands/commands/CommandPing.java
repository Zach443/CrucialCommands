package me.zach.CrucialCommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandPing implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("ping")) {
			Player player = (Player) sender;
			player.sendMessage(ChatColor.YELLOW + "Pong!");
			
		}
		return false;
	}

}
