package TestMod_6;

import init.ModBlocks;
import init.ModItems;
import handler.ConfigurationHandler;
import proxy.IProxy;
import reference.Reference;
import utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS) // а вот с референс 
public class EducationMode {
	
	public static Item itemTable;
	public static Block blockYAponskiFlag;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy; // разберись что это и зачем 
		
	@Mod.Instance("EducationMode")
	public static EducationMode instance; // создали экземпляр нашего мода как я понял , а вот зачем  пока не понял
	
	 @EventHandler
	  public void preInit(FMLPreInitializationEvent event) {
		itemTable = new ItemTable().setUnlocalizedName("ItemTables");
	  
	    blockYAponskiFlag = new BlockYAponskiFlag(Material.cloth).setBlockName("BlockFlag").setBlockTextureName("am:whiteflag");
	    
	    GameRegistry.registerItem(itemTable, itemTable.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(blockYAponskiFlag, blockYAponskiFlag.getUnlocalizedName().substring(5));
	    
	    ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	    FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
	    LogHelper.info("Pre initialization Complete!");
	    
	    ModItems.init();
	    
	    ModBlocks.init();
	  }
	  
	  @EventHandler
	  public void init(FMLInitializationEvent event){
		  LogHelper.info("Initialization Complete!");
	  }
	  
	  @EventHandler
	  public void postInit(FMLPostInitializationEvent event){
		  LogHelper.info("Post initialization Complete!");
	  }
}
