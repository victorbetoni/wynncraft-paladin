package net.victu.paladintest.spell;

import net.victu.paladintest.spell.instance.CrusadeRunnable;
import net.victu.paladintest.spell.instance.DaybreakRunnable;
import net.victu.paladintest.spell.instance.DevotionRunnable;
import net.victu.paladintest.spell.instance.LightbindRunnable;

import java.util.HashMap;
import java.util.Map;

public class SpellRegistry {

    private static Map<String, BaseSpell> spellRegistry;

    public static Map<String, BaseSpell> getSpellRegistry() {
        return spellRegistry;
    }

    static {
        spellRegistry = new HashMap<>();
        spellRegistry.put("RLL", new BaseSpell("Daybreak", new DaybreakRunnable())); //Sunlight Chamber
        spellRegistry.put("RRL", new BaseSpell("Devotion", new DevotionRunnable())); //Divine Sanctuary's Bless
        spellRegistry.put("RLR", new BaseSpell("Lightbind", new LightbindRunnable())); //Holy Sun Guardian
        spellRegistry.put("RRR", new BaseSpell("Crusade", new CrusadeRunnable())); //Freedom Sense
    }

}
