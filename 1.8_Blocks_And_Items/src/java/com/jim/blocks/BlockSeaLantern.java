package com.jim.blocks;

import java.util.Random;

import com.jim.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockSeaLantern extends Block {
	
    private static final String name = "sea_lantern";

    public BlockSeaLantern() {
        super(Material.glass);
        GameRegistry.registerBlock(this, name);
        
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightLevel(1.0f);
        this.setHardness(0.3f);
        this.setResistance(1.5f);
        this.stepSound = Block.soundTypeGlass;
        this.opaque = false;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
    	return ModItems.prismarine_crystals;
    }
    
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(2);
    }

    /**
     * Get the quantity dropped based on the given fortune level
     */
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 5);
    }
}
