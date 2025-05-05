package init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));  // форменный рецепт
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf)); // без форменный рецепт
		
		/*GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), "stickWood", new ItemStack(ModItems.mapleLeaf)));*/ // это два форменных и без форменных рецепта , в нижних двух можно использовать как бы любой стик вуд например из другого мода , а в тех рецептах что выше можно использовать только конкретную палку
	}
}
