package me.tissub.manhunt;

import me.tissub.manhunt.commands.ManhuntCommand;
import me.tissub.manhunt.commands.ManhuntCompleter;
import me.tissub.manhunt.listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginCommand("manhunt").setExecutor(new ManhuntCommand(this));
        getCommand("manhunt").setTabCompleter(new ManhuntCompleter());
        new DeathListener(this);
        new AdvancementListener(this);
        new InteractListener(this);
        new RespawnListener(this);
        new DropListener(this);
        new MoveListener(this);
        new MenuListener(this);
        new DisconnectListener(this);
        new DamageListener(this);
        System.out.println("*********************************************************\n" +
                "Thank you for using this plugin and playing in it! <3\n" +
                "Author: TissuB\n" +
                "If you enjoy this plugin, please take note of contacting me for other plugins:\n" +
                "https://www.tissub.com/\n" +
                "*********************************************************");
    }
}