package de.rembel.autototem.Main;

import de.rembel.autototem.Listeners.DeathListener;
import de.rembel.autototem.bStats.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutoTotemMain extends JavaPlugin {

    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this,  	18866);

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new DeathListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
