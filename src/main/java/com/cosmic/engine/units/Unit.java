package com.cosmic.engine.units;

import com.artemis.Component;
import com.cosmic.engine.inventory.Equipable;
import com.cosmic.engine.inventory.EquipmentSlot;

import java.util.Map;

public class Unit extends Component {
    private Attributes baseAttributes;
    private CombatStat current;
    private CombatStat maximum;
}
