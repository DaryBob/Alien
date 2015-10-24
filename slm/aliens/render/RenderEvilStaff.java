package slm.aliens.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import slm.aliens.Main;
import slm.aliens.models.ModelEvilStaff;

public class RenderEvilStaff implements IItemRenderer {

	public static ResourceLocation tex = new ResourceLocation(Main.MODID, "textures/models/evilstafftexture.png");

	private ModelEvilStaff staff;
	
	public RenderEvilStaff() {
		staff = new ModelEvilStaff();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type) {
		
		case EQUIPPED: return true;
		case EQUIPPED_FIRST_PERSON: return true;
		default: return false;
		
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch(type) {
		
		
		
		case EQUIPPED: {
			GL11.glPushMatrix();
			
			Minecraft.getMinecraft().renderEngine.bindTexture(tex);
			
			GL11.glScalef(1.4F, 1.0F, 1.4F);
			
			GL11.glRotatef(90, 0F, 1F, 0F);
			GL11.glRotatef(100, 1F, 0F, 0F);
			GL11.glRotatef(10, 1F, 0F, 1F);
			
			GL11.glTranslatef(0.06F, -1.1F, -0.45F);
			
			this.staff.renderModel(0.0625F);	
			GL11.glPopMatrix();
		}
		case EQUIPPED_FIRST_PERSON: {
			
			GL11.glPushMatrix();
			
			Minecraft.getMinecraft().renderEngine.bindTexture(tex);
			
			GL11.glScalef(1.4F, 1.0F, 1.4F);
			
			GL11.glRotatef(90, 0F, 1F, 0F);
			GL11.glRotatef(100, 1F, 0F, 0F);
			GL11.glRotatef(10, 1F, 0F, 1F);
			
			boolean isFirstPerson = false;
            if(data[1] != null && data[1] instanceof EntityPlayer) {
            	if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F))) {
            		GL11.glTranslatef(0.06F, -1.1F, -0.45F);
            		}else{
            			isFirstPerson = true;
            			
            		}
            	}else{
            		GL11.glTranslatef(0.06F, -1.1F, -0.45F);
            		
            	}
            
            this.staff.renderModel(0.0625F);	
			GL11.glPopMatrix();

		}
		case ENTITY: {
			GL11.glPushMatrix();
			
			Minecraft.getMinecraft().renderEngine.bindTexture(tex);
			
			GL11.glScalef(1.4F, 1.0F, 1.4F);
			
    		GL11.glTranslatef(0.06F, -1.1F, -0.45F);
			
			if(item.isOnItemFrame()) {
				GL11.glScalef(0.7F, 0.5F, 0.7F);
				//GL11.glRotatef(180, 0F, 1F, 0F);
				GL11.glTranslatef(0F, 2.4F, 0.7F);
				this.staff.renderModel(0.0625F);
			}

			GL11.glScalef(0.7F, 0.5F, 0.7F);
			GL11.glRotatef(180, 0F, 1F, 0F);
			GL11.glTranslatef(-2F, 2.4F, 0.7F);
			//this.staff.renderModel(0.0625F);

			GL11.glPopMatrix();
		}
		case INVENTORY: {
			GL11.glPushMatrix();

			GL11.glPopMatrix();
		}
		
		default: 
			break;		
		}
	}

}
