package me.zach.CrucialCommands;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import me.zach.CrucialCommands.commands.*;

public class CrucialCommands extends JavaPlugin{

	public static final String noPermission = ChatColor.RED.toString() + ChatColor.ITALIC.toString();
	public static final String incorrectUsage = ChatColor.GREEN.toString() + ChatColor.BOLD.toString();
	@Override
	public void onEnable() {
		
		//Not in use, as of v1.0. Saving for next version
		//Updater updater = new Updater(this, 71194, this.getFile(), Updater.UpdateType.DEFAULT, false);
		
		getLogger().info("I am Zach443, and I approve this plugin!");
		getCommand("fly").setExecutor(new CommandFly());
		getCommand("heal").setExecutor(new CommandHeal());
		getCommand("ping").setExecutor(new CommandPing());
		getCommand("gamemode").setExecutor(new CommandGM());
		getCommand("workbench").setExecutor(new CommandWorkBench());
		
	}
	@Override
	public void onDisable() {
		getLogger().info("BYE BYE!");
	}
	
}

