package pepsipu.partycraft.commands;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import pepsipu.partycraft.BirthdayPlayer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.Bukkit;

public class WelcomeBirthdayPlayer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.getOnlinePlayers().forEach((Player p) -> {
            p.sendTitle("yo", "awesome", 1, 1, 1);
        });
        return true;
    }
}
