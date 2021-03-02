package pepsipu.partycraft;

import org.bukkit.entity.Player;

public class BirthdayPlayer {
    static public Player player = null;

    public static void setPlayer(Player player) {
        BirthdayPlayer.player = player;
    }
}
