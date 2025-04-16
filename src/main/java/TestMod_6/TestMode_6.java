package TestMod_6;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "am", name = "Aducation mode,", version = "1.0")
public class TestMode_6 {
	
	public static Item itemTable;
	
	 @EventHandler
	  public void preInit(FMLPreInitializationEvent event) {
	    itemTable = new ItemTable().setUnlocalizedName("ItemTables").setTextureName("tm:itemtable");
	  
	    
	    GameRegistry.registerItem(itemTable, itemTable.getUnlocalizedName().substring(5));
	    //GameRegistry.registerItem(itemStul, itemStul.getUnlocalizedName().substring(5));
	  }
	  
	  @EventHandler
	  public void init(FMLInitializationEvent event){
	    
	  }
	  
	  @EventHandler
	  public void postInit(FMLPostInitializationEvent event){
	  
	  }
}
