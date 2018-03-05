package com.kreezcraft.betterwithhardersteelrecipe.blocks;

import java.util.Random;

import com.kreezcraft.betterwithhardersteelrecipe.BetterWithHarderSteelRecipe;
import com.kreezcraft.betterwithhardersteelrecipe.client.IHasModel;
import com.kreezcraft.betterwithhardersteelrecipe.items.InitItems;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RotatedBlock extends BlockHorizontal implements IHasModel {
	
	protected String name;
	
	public RotatedBlock(String name) {
		super(Material.ROCK);
		this.name=name;
		setUnlocalizedName(BetterWithHarderSteelRecipe.MODID + "." + name);
		setCreativeTab(BetterWithHarderSteelRecipe.creativeTab);
		setRegistryName(name);
		this.setHardness(1.4F);
		this.setSoundType(SoundType.STONE);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}

	/**
	 * Returns the blockstate with the given rotation from the passed blockstate. If
	 * inapplicable, returns the passed blockstate.
	 */
	public IBlockState withRotation(IBlockState state, Rotation rot) {
		return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
	}

	/**
	 * Returns the blockstate with the given mirror of the passed blockstate. If
	 * inapplicable, returns the passed blockstate.
	 */
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
		return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
	}

	/**
	 * Called by ItemBlocks just before a block is actually set in the world, to
	 * allow for adjustments to the IBlockstate
	 */
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer) {
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	public int getMetaFromState(IBlockState state) {
		int i = 0;
		i = i | ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
		return i;
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}

	public EnumPushReaction getMobilityFlag(IBlockState state) {
		return EnumPushReaction.PUSH_ONLY;
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