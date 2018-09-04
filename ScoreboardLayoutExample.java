package me.activated.uhc.scoreboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Scoreboard implements BoardAdapter, Listener {

    public Scoreboard(JavaPlugin plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @Override
    public String getTitle(Player player) {
        return "Title";
    }

    @Override
    public List<String> getScoreboard(Player player, Board board, Set<BoardCooldown> cooldowns) {
        List<String> strings = new ArrayList<>();
        strings.add("&7&m---------------------");
        strings.add("&aLine 1");
        strings.add("&aLine 2");
        strings.add("&7&m---------------------");

        if (strings.size() == 2) {
            return null;
        }

        return strings;
    }
}