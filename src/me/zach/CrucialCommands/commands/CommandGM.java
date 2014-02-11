package me.zach.CrucialCommands.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.zach.CrucialCommands.*;

//Hello random Bukkit staff :)

public class CommandGM implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if((cmd.getName().equalsIgnoreCase("gamemode")) || (cmd.getName().equalsIgnoreCase("gm"))) {
				if(player.hasPermission("perm.gm")) {
					if(args.length == 1) {
						if(args[0].equalsIgnoreCase("c") || (args[0].equalsIgnoreCase("1"))) {
							player.setGameMode(GameMode.CREATIVE);
						} else if(args[0].equalsIgnoreCase("s") || (args[0].equalsIgnoreCase("0"))) {
							player.setGameMode(GameMode.SURVIVAL);
						} else {
							player.sendMessage(CrucialCommands.incorrectUsage + "Correct usage: /gm [gamemode]");
						}
					}
				} else {
					player.sendMessage(CrucialCommands.noPermission + "You do not have permission to do that.");
				}
			}
		} else {
			sender.sendMessage("You must be a player to do this.");
		}
		return false;
	}
}
