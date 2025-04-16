package TestMod_6;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockYAponskiFlag extends BlockEducationMod {
		
	protected BlockYAponskiFlag(Material material) {
		super(material);
		setTickRandomly(true);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random random){	// добавление звука который звучит рандомно когда
		world.playSoundEffect(x, y, z, "mob.enderdragon.wings", 1.0F, random.nextFloat() + 0.5F);
		}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		world.playSoundEffect(x, y, z, "am:flagflap", 1.0F, player.getRNG().nextFloat() + 0.5F); // добавление звука блоку 
		return true;	
	}
}
