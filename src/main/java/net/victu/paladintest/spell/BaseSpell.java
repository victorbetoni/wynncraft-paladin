package net.victu.paladintest.spell;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class BaseSpell {

    private String name;
    private BiConsumer<Player, Location> consumer;

    public BaseSpell(String name, BiConsumer<Player, Location> consumer) {
        this.name = name;
        this.consumer = consumer;
    }

    public String getName() {
        return name;
    }

    public BiConsumer<Player, Location> getConsumer() {
        return consumer;
    }
}
