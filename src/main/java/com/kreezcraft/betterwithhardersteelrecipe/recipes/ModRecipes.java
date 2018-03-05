package com.kreezcraft.betterwithhardersteelrecipe.recipes;

import com.kreezcraft.betterwithhardersteelrecipe.blocks.InitBlocks;
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
//		GameRegistry.addSmelting(InitItems.UNFIREDSTONEBUTTON, new ItemStack(Blocks.STONE_BUTTON), 0.02f);
//		GameRegistry.addSmelting(InitItems.UNFIREDPRESSUREPLATE, new ItemStack(Blocks.STONE_PRESSURE_PLATE), 0.02f);

		GameRegistry.addSmelting(InitBlocks.UNFIREDCLAYTILE, new ItemStack(InitBlocks.CLAYTILE), 0.02f);
		GameRegistry.addSmelting(InitBlocks.UNFIREDSTONEBUTTON, new ItemStack(Blocks.STONE_BUTTON), 0.02f);
		GameRegistry.addSmelting(InitBlocks.UNFIREDSTONEPRESSUREPLATE, new ItemStack(Blocks.STONE_PRESSURE_PLATE), 0.02f);
	}

}
