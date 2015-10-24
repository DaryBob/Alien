package slm.aliens.proxy;

import slm.aliens.Main;
import slm.aliens.blocks.tileentity.TileEntityAlienEgg;
import slm.aliens.render.RenderAlienEgg;
import slm.aliens.render.RenderEvilStaff;
import slm.aliens.render.RenderInvEvilStaff;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	
	public static KeyBinding[] keyBindings;
	
	public void registerRenderThings() {
		//Blocks
		TileEntitySpecialRenderer render = new RenderAlienEgg();
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlienEgg.class, render);
	    
	    //Items
	    //MinecraftForgeClient.registerItemRenderer(Main.evilStaff, new RenderInvEvilStaff());
	    //MinecraftForgeClient.registerItemRenderer(Main.evilStaff, (IItemRenderer)new RenderEvilStaff());
	    
	}
	
	public void registerTileEntitySpecialRenderer() {}

}
