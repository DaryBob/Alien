package slm.aliens.render;

import org.lwjgl.opengl.GL11;

import slm.aliens.models.ModelAlienEgg;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderAlienEgg extends TileEntitySpecialRenderer {
	
	private static final ResourceLocation textures = new ResourceLocation("am:textures/models/AlienEggTexture.png");
	private ModelAlienEgg model;

	@Override
	public void renderTileEntityAt(TileEntity p_147500_1_, double x, double y, double z, float p_147500_8_) {
	    GL11.glPushMatrix();
	    GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
	    GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
	    this.bindTexture(textures);	    
	    GL11.glPushMatrix();
	    this.model.renderModel(0.0625F);
	    GL11.glPopMatrix();
	    GL11.glPopMatrix();
	}

}
