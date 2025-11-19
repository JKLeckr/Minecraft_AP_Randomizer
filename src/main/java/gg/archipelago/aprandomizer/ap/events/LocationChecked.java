package gg.archipelago.aprandomizer.ap.events;

import gg.archipelago.aprandomizer.APRandomizer;
import io.github.archipelagomw.events.ArchipelagoEventListener;
import io.github.archipelagomw.events.CheckedLocationsEvent;

public class LocationChecked {

    @ArchipelagoEventListener
    public static void onLocationChecked(CheckedLocationsEvent event) {
        event.checkedLocations.forEach(location -> APRandomizer.getAdvancementManager().addAdvancement(location));

    }
}
