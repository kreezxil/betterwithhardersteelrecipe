package com.kreezcraft.betterwithhardersteelrecipe.recipes;

import com.kreezcraft.betterwithhardersteelrecipe.items.InitItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
	//	GameRegistry.addSmelting(InitBlocks.DIAMOND_SAND, new ItemStack(InitBlocks.DIAMOND_GLASS), 10f);
		GameRegistry.addSmelting(InitItems.UNFIREDSTONEBUTTON, new ItemStack(Blocks.STONE_BUTTON), 0.02f);
		GameRegistry.addSmelting(InitItems.UNFIREDPRESSUREPLATE, new ItemStack(Blocks.STONE_PRESSURE_PLATE), 0.02f);
	}

}
