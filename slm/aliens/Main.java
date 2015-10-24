package slm.aliens;

import org.lwjgl.input.Keyboard;

import slm.aliens.blocks.AlienEgg;
import slm.aliens.blocks.Meteor;
import slm.aliens.events.SLMKeyEvent;
import slm.aliens.events.SLMTickEvent;
import slm.aliens.items.EvilStaff;
import slm.aliens.proxy.ClientProxy;
import slm.aliens.proxy.CommonProxy;
import slm.aliens.render.RenderEvilStaff;
import slm.aliens.render.RenderInvEvilStaff;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid="aliensmod", version="0.0.1")
public class Main {
  public static final String MODID = "aliensmod";
  public static final String VERSION = "0.0.1";
  @SidedProxy(clientSide="slm.aliens.proxy.ClientProxy", serverSide="slm.aliens.proxy.CommonProxy")
  public static CommonProxy SLMProxy;
  @Mod.Metadata
  public static ModMetadata meta;
  
  public static CreativeTabs aliensTab = new CreativeTabs("Aliens") {
	  public Item getTabIconItem() {
		  return Main.evilStaff;
      }
  };

  public static Block meteor;
  public static Block alienEgg;
  public static Item evilStaff;
  public static final Item.ToolMaterial evilStaffToolMaterial = EnumHelper.addToolMaterial("alienStaffMaterial", 0, 100, 0.0F, 3.0F, 30);
  
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    SLMProxy.registerRenderThings();   
    meteor = new Meteor(Material.rock).setBlockName("BlockMeteor").setBlockTextureName("blockNekmunnitOre");
    GameRegistry.registerBlock(meteor, meteor.getUnlocalizedName().substring(5));    
    alienEgg = new AlienEgg(Material.carpet).setBlockName("BlockAlienEgg").setBlockTextureName("aliensmod:Egg16");
    GameRegistry.registerBlock(alienEgg, alienEgg.getUnlocalizedName().substring(5));   
    evilStaff = new EvilStaff(evilStaffToolMaterial).setUnlocalizedName("ItemAlienStaff1").setTextureName("aliensmod:evilstafftexture");
    GameRegistry.registerItem(evilStaff, evilStaff.getUnlocalizedName().substring(5));
  }
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {
	  
	  MinecraftForgeClient.registerItemRenderer(Main.evilStaff, (IItemRenderer)new RenderEvilStaff());

	  ClientProxy.keyBindings = new KeyBinding[4]; 
	  ClientProxy.keyBindings[0] = new KeyBinding("key.evilstaff.ice.desc", Keyboard.KEY_O, "key.aliens.category");
	  ClientProxy.keyBindings[1] = new KeyBinding("key.evilstaff.fire.desc", Keyboard.KEY_Z, "key.aliens.category");
	  ClientProxy.keyBindings[2] = new KeyBinding("key.evilstaff.lightning.desc", Keyboard.KEY_R, "key.aliens.category");
	  ClientProxy.keyBindings[3] = new KeyBinding("key.evilstaff.earth.desc", Keyboard.KEY_L, "key.aliens.category");
	  
	  for (int i = 0; i < ClientProxy.keyBindings.length; ++i) {
		  ClientRegistry.registerKeyBinding(ClientProxy.keyBindings[i]);
	  }
	
    //GameRegistry.addRecipe(new ItemStack(meteor), new Object[] { " I ", " I ", " I ", Character.valueOf('I'), Items.field_151042_j });
    //GameRegistry.addRecipe(new ItemStack(alienEgg), new Object[] { " I ", " I ", " I ", Character.valueOf('I'), Items.field_151043_k });
  }
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {
	  
	  FMLCommonHandler.instance().bus().register(new SLMTickEvent());
	  FMLCommonHandler.instance().bus().register(new SLMKeyEvent());
  }
}
