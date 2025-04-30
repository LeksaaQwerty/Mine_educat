package init;

import cpw.mods.fml.common.registry.GameRegistry;
import item.ItemLMRB;
import item.ItemMapleLeaf;

public class ModItems {
	
	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
