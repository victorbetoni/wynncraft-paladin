package net.victu.paladintest;

import net.victu.paladintest.input.MouseInputListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    private static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getPluginManager().registerEvents(new MouseInputListener(), this);
    }

    public static Plugin instance() {
        return instance;
    }
}
