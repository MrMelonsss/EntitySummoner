package org.mrmelon__.entitysummoner;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;

public class SummonCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        int count = Integer.parseInt(strings[1]);
            if (strings[0].equalsIgnoreCase("MINECART_TNT")) {
                for (int i = 0 ; i<count ; i++) {
                    player.getWorld().spawnEntity(player.getLocation(), EntityType.MINECART_TNT);
                }
                return true;
            }else if (strings[0].equalsIgnoreCase("CREEPER")) {
                for (int i = 0 ; i<count ; i++) {
                    player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);
                }
                return true;
            }else if (strings[0].equalsIgnoreCase("CREEPER_IGNITE")) {
                for (int i = 0 ; i<count ; i++) {
                    Creeper creeper = (Creeper) player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);
                    creeper.ignite();
                }
                return true;
            }else if (strings[0].equalsIgnoreCase("CREEPER_POWERED")) {
                for (int i = 0 ; i<count ; i++) {
                    Creeper creeper = (Creeper) player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);
                    creeper.setPowered(true);
                }
                return true;
            }else if (strings[0].equalsIgnoreCase("CREEPER_POWERED_IGNITE")) {
                for (int i = 0 ; i<count ; i++) {
                    Creeper creeper = (Creeper) player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);
                    creeper.setPowered(true);
                    creeper.ignite();
                }
                return true;
            }else if (strings[0].equalsIgnoreCase("TNT_IGNITE")) {
                for (int i = 0 ; i<count ; i++) {
                    player.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
                }
                return true;
            }
        return false;
    }
}
