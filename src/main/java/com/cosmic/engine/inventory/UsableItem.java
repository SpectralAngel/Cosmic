package com.cosmic.engine.inventory;

/**
 * Created by Carlos on 1/27/14.
 */
public class UsableItem extends Item implements IUsable {
    @Override
    public void use() {
        throw new UnsupportedOperationException();
    }
}
