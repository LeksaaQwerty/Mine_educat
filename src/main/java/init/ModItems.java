package init;

import reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import item.ItemLMRB;
import item.ItemMapleLeaf;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	
	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
