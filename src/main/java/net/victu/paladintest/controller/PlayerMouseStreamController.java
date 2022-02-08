package net.victu.paladintest.controller;

import net.victu.paladintest.input.MouseInputStream;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum PlayerMouseStreamController {
    INSTANCE;

    private final Map<Player, MouseInputStream> STREAMS_MAP = new HashMap<>();

    public Map<Player, MouseInputStream> getStreams() {
        return STREAMS_MAP;
    }

    public Optional<MouseInputStream> getPlayerStream(Player player) {
        return Optional.ofNullable(STREAMS_MAP.get(player));
    }
}
