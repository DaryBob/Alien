package slm.aliens.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.settings.KeyBinding;
import slm.aliens.Main;
import slm.aliens.items.EvilStaff;
import slm.aliens.proxy.ClientProxy;

public class SLMTickEvent {
	
    KeyBinding[] keyBindings = ClientProxy.keyBindings;
	
	//Called when the player ticks.
	 @SubscribeEvent
	 public void onPlayerTick(TickEvent.PlayerTickEvent event) {}
	 
	 //Called when the client ticks. 
	 @SubscribeEvent
	 public void onClientTick(TickEvent.ClientTickEvent event) {}
	 
	 //Called when the server ticks. Usually 20 ticks a second. 
	 @SubscribeEvent
	 public void onServerTick(TickEvent.ServerTickEvent event) {}
	 
	 //Called when a new frame is displayed (See fps) 
	 @SubscribeEvent
	 public void onRenderTick(TickEvent.RenderTickEvent event) {}
	 
	 //Called when the world ticks
	 @SubscribeEvent
	 public void onWorldTick(TickEvent.WorldTickEvent event) {}

}
