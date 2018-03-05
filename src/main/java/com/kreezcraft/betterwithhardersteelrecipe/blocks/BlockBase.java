package com.kreezcraft.betterwithhardersteelrecipe.blocks;

import java.util.Random;

import com.kreezcraft.betterwithhardersteelrecipe.BetterWithHarderSteelRecipe;
import com.kreezcraft.betterwithhardersteelrecipe.client.IHasModel;
import com.kreezcraft.betterwithhardersteelrecipe.items.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBase extends Block implements IHasModel {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(BetterWithHarderSteelRecipe.MODID + "." + name);
		setCreativeTab(BetterWithHarderSteelRecipe.creativeTab);
		setRegistryName(name);
		setHardness(material);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	private void setHardness(Material material) {
		float hardness;
		if(material == Material.CLAY) {
			hardness = 0.02f;
		} else {
			hardness = 1f;
		}
		this.setHardness(hardness);
	}

	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
				return 1;
	}

	@Override
	public void registerModels() {
		BetterWithHarderSteelRecipe.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
		return true;
	}

}