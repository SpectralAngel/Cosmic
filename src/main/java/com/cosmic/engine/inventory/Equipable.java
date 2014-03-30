package com.cosmic.engine.inventory;

import com.cosmic.engine.battle.EffectType;
import com.cosmic.engine.battle.Element;
import com.cosmic.engine.units.Attributes;
import com.cosmic.engine.units.CombatStat;

/**
 * Created by Carlos on 1/27/14.
 */
public class Equipable extends Item {
    private EquipmentSlot slot;
    private Attributes attributes;

    public Equipable(String name, String description, EquipmentSlot slot,
                     Attributes attributes)
    {
        super(name,description);
        this.slot = slot;
        this.attributes = attributes;
    }

    public EquipmentSlot getSlot() {
        return slot;
    }

    public void setSlot(EquipmentSlot slot) {
        this.slot = slot;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
