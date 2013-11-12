package me.Ian.Teleport;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Teleport extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Teleport plugin;
	protected String Chatcolor;

	@Override
	public void onEnable(){
		logger.info("Hub Teleporter Enabled");	
		
		
		
		
	}
	@Override
	public void onDisable(){
		logger.info("Hub Teleporter Disabled");	
	}
	

	
	
	
	
	
	
	
	
	@Override
	public boolean onCommand(final CommandSender sender, Command cmd, final String commandLabel, String[] args){
		
		
		Player player = (Player) sender;	 

    	if(commandLabel.equalsIgnoreCase("hub")){
	
    		
    		
  

   
    		

    		
    		player.sendMessage("Teleporting in 5 seconds, please don't move.");

		final Timer timer = new Timer ();
		TimerTask hourlyTask = new TimerTask () {
			Player player = (Player) sender;	
	
			
		
		    @Override
		    public void run () {
		    	
		   {
	    					
		    	 World p = Bukkit.getWorld("cleanroom");
		    	 player.teleport(new Location(p, -299, 70, 624));
		    	 player.sendMessage("Teleportation Complete");
		    	}

		    }
};		timer.schedule (hourlyTask, 5000);
    		}
		return true;
	
	
	
	}
	
	
	

	}
	
	





