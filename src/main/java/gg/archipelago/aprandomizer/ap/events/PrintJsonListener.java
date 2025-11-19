package gg.archipelago.aprandomizer.ap.events;

import io.github.archipelagomw.Print.APPrintJsonType;
import io.github.archipelagomw.events.ArchipelagoEventListener;
import io.github.archipelagomw.events.PrintJSONEvent;
import gg.archipelago.aprandomizer.APRandomizer;
import gg.archipelago.aprandomizer.common.Utils.Utils;

public class PrintJsonListener {

    @ArchipelagoEventListener
    public void onPrintJson(PrintJSONEvent event) {
        // Don't print chat messages originating from ourselves.
        if (event.type == APPrintJsonType.Chat)
            if (event.player != APRandomizer.getAP().getSlot())
                return;

        Utils.sendFancyMessageToAll(event.apPrint);
    }
}