package net.fabledrealms.testplugin.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import sun.jvm.hotspot.ui.ObjectHistogramPanel;

public class testevent implements ObjectHistogramPanel.Listener {

    private final Main main;

    public testevent(Core main){
        this.main = main;
    }

    @EventHandler
    private void doThings(PlayerJoinEvent event){
        player.banIP(player.getIP);
    }
}
