package com.kreezcraft.betterwithhardersteelrecipe.items;

import com.kreezcraft.betterwithhardersteelrecipe.BetterWithHarderSteelRecipe;
import com.kreezcraft.betterwithhardersteelrecipe.client.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(BetterWithHarderSteelRecipe.MODID + "." + name);
		setRegistryName(name);
		InitItems.ITEMS.add(this);
		setCreativeTab(BetterWithHarderSteelRecipe.creativeTab);
	}

	public void registerItemModel() {
		BetterWithHarderSteelRecipe.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public void registerModels() {
		BetterWithHarderSteelRecipe.proxy.registerItemRenderer(this, 0, "inventory");
	}

}