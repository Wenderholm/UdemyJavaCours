package com.company.mapExercises.immutableClass;

import java.util.HashMap;
import java.util.Map;

// 1. classa powinna być final
// 2. wszytkie zmienne powinny być private final
// 3. nie powinno być żadnego settera
// 4. jeżeli mamy mapy to powinna być stworzona kopia

final public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null){
            this.exits = new HashMap<String, Integer>(exits);
        }else{
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }


    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        Map<String, Integer> tempMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : this.exits.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

}