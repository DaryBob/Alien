package slm.aliens.blocks;

import slm.aliens.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Meteor extends Block {
	public Meteor(Material mat) {
		super(mat);
		this.setCreativeTab(Main.aliensTab);
	}
}
