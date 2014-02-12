package me.zach.CrucialCommands.commands;

import me.zach.CrucialCommands.CrucialCommands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("fly")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (player.hasPermission("crucial.fly")) {
					if (args.length == 1) {
						Player cplayer = Bukkit.getServer().getPlayer(args[0]);
						if (cplayer != null) {
							cplayer.setAllowFlight(true);
							cplayer.setFlying(true);
							cplayer.sendMessage(ChatColor.BLUE + "Flymode enabled!");
						} else {
							player.sendMessage(CrucialCommands.incorrectUsage + "Correct usage: /fly [username]");
						}
					} else {
						sender.sendMessage(CrucialCommands.noPermission + "No no no, no fly for you!");
					}
				}
			} else {
				sender.sendMessage("You must be a player to use this command :(");
			}
		}
		return false;
		
	}

}
