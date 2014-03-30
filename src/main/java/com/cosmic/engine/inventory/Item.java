package com.cosmic.engine.inventory;

import com.artemis.Component;

/**
 * Created by Carlos on 1/27/14.
 */
public class Item extends Component {
    private String name;
    private String description;

    public Item(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
