package slm.aliens.items;

import slm.aliens.Main;
import slm.aliens.entity.item.EntityFireAttack;
import slm.aliens.proxy.ClientProxy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class EvilStaff extends ItemSword {

	public EvilStaff(ToolMaterial mat) {
		super(mat);
		this.setCreativeTab(Main.aliensTab);
	}
	
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
    	if(player.isSneaking()) {
    		player.heal(1);
    	}
    	
        return stack;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
    	return true;
    }
	
	public static void shootFire(World world, EntityPlayer player) {

		world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		
		if(!world.isRemote) {
			world.spawnEntityInWorld(new EntitySnowball(world, player));
		}
	}
	
	public static void shootIce(World world, EntityPlayer player) {
		
		world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		
		if(!world.isRemote) {
			world.spawnEntityInWorld(new EntitySnowball(world, player));
		}
	}
	
	public void onUpdate(ItemStack item, World world, Entity entity, int par4, boolean par5) {
		
	    KeyBinding[] keyBindings = ClientProxy.keyBindings;
		
		 if(keyBindings[0].isPressed()) {
			 if(par5 && (entity instanceof EntityPlayer)) {
				 EntityPlayer player = (EntityPlayer)entity;
						world.spawnEntityInWorld(new EntityFireAttack(world, player));
						 System.out.println("Shoot fire");
			 }
			 System.out.println("Key binding ="+keyBindings[1].getKeyDescription());
		 }if(keyBindings[1].isPressed()) {
			 if(par5 && (entity instanceof EntityPlayer)) {
				 EntityPlayer player = (EntityPlayer)entity;
						world.spawnEntityInWorld(new EntitySnowball(world, player));
						 System.out.println("Shoot ice");
			 }
			 System.out.println("Key binding ="+keyBindings[0].getKeyDescription());
		 }
	}

}
