package slm.aliens.events;

import slm.aliens.items.EvilStaff;
import slm.aliens.proxy.ClientProxy;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SLMKeyEvent {
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(KeyInputEvent event) {
	    //System.out.println("Key Input Event");
	    KeyBinding[] keyBindings = ClientProxy.keyBindings;

	}

}
