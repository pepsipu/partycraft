package pepsipu.partycraft;

import org.bukkit.plugin.java.JavaPlugin;
import pepsipu.partycraft.commands.SetBirthdayPlayer;
import pepsipu.partycraft.commands.WelcomeBirthdayPlayer;

import java.util.Objects;

public final class PartyCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(getCommand("setBirthdayPlayer")).setExecutor(new SetBirthdayPlayer());
        Objects.requireNonNull(getCommand("welcomeBirthdayPlayer")).setExecutor(new WelcomeBirthdayPlayer());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
