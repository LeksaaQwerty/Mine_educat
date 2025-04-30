package init;

import block.BlockFlag;
import block.BlockLMRB;
import item.ItemLMRB;
import item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

public static final BlockLMRB flag = new BlockFlag();
	
	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
	}
}
