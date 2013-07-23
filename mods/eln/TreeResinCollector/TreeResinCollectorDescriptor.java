package mods.eln.TreeResinCollector;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import mods.eln.node.SixNodeDescriptor;

public class TreeResinCollectorDescriptor extends SixNodeDescriptor {

	public TreeResinCollectorDescriptor(String name) {
		super(name, TreeResinCollectorElement.class, TreeResinCollectorRender.class);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer,
			List list, boolean par4) {
		// TODO Auto-generated method stub
		super.addInformation(itemStack, entityPlayer, list, par4);
		list.add("Product tree resin over time");
		list.add("when placed on tree");
		list.add("The production is slow");
	}
}