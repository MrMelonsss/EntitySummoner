package org.mrmelon__.entitysummoner;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("PLUGIN IN ENABLED");
        getCommand("spawnentity").setExecutor(new SummonCMD());
        getCommand("spawnentity").setTabCompleter(new SummonCompleter());
    }

    @Override
    public void onDisable() {
        System.out.println("PLUGIN IN DISABLED");
    }
}
