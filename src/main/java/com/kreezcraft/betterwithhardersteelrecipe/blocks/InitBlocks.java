package com.kreezcraft.betterwithhardersteelrecipe.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class InitBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block UNFIREDCLAYTILE = new BlockBase(Material.CLAY, "_unfiredclaytile");
	public static final Block UNFIREDSTONEBUTTON = new BlockBase(Material.CLAY, "_unfiredstonebutton");
	public static final Block CLAYTILE = new RotatedBlock("_claytile");
	public static final Block UNFIREDSTONEPRESSUREPLATE = new BlockBase(Material.CLAY,"_unfiredstonepressureplate");
	
}