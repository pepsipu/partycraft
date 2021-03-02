package pepsipu.partycraft.commands;
import org.bukkit.ChatColor;
import pepsipu.partycraft.BirthdayPlayer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.Bukkit;

public class SetBirthdayPlayer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length < 1) {
            sender.sendMessage("not good args");
            return false;
        }
        BirthdayPlayer.setPlayer(Bukkit.getPlayer(args[0]));
        sender.sendMessage(ChatColor.AQUA + "added " + ChatColor.RED + args[0] + ChatColor.AQUA + " as the birthday player!");
        return true;
    }
}
