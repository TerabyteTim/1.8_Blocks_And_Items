package com.jim.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockBarrier extends Block {
    private static final String name = "barrier";

    public BlockBarrier() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setBlockUnbreakable();
        this.setHardness(-1);
        this.setResistance(18000003);
        this.setLightOpacity(0);
    }
}
