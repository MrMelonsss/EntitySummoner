package org.mrmelon__.entitysummoner;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public class SummonCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length==1){
            return List.of(
                    "MINECART_TNT",
                    "CREEPER",
                    "CREEPER_IGNITE",
                    "TNT_IGNITE",
                    "CREEPER_POWERED",
                    "CREEPER_POWERED_IGNITE"
            );
        }
        return null;
    }
}
