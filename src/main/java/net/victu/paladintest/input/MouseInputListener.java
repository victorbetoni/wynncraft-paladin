package net.victu.paladintest.input;

import net.victu.paladintest.controller.PlayerMouseStreamController;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MouseInputListener implements Listener {

    @EventHandler
    public void handleClick(PlayerInteractEvent event) {
        if(event.getAction() == Action.PHYSICAL) return;
        if(event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
            this.computeInput(event.getPlayer(), 'L');
            return;
        }
        this.computeInput(event.getPlayer(), 'R');
    }

    public void computeInput(Player player, char input) {
        PlayerMouseStreamController controller = PlayerMouseStreamController.INSTANCE;
        controller.getPlayerStream(player).ifPresentOrElse(
                stream -> stream.append(input),
                () -> controller.getStreams().put(player, new MouseInputStream("" + input)));
    }

}
