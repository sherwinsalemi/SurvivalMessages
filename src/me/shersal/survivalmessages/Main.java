package me.shersal.survivalmessages;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
        getLogger().info("Hello");
    }
}
