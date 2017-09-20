package com.kreezcraft.betterwithhardersteelrecipe;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class BetterWithHarderSteelRecipeTab extends CreativeTabs {

	public BetterWithHarderSteelRecipeTab(String label) {
		super(BetterWithHarderSteelRecipe.MODID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Blocks.STONE_BUTTON);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	
}
