package com.kreezcraft.betterwithhardersteelrecipe;

import com.kreezcraft.betterwithhardersteelrecipe.proxy.CommonProxy;
import com.kreezcraft.betterwithhardersteelrecipe.recipes.ModRecipes;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BetterWithHarderSteelRecipe.MODID, version = BetterWithHarderSteelRecipe.VERSION, name = BetterWithHarderSteelRecipe.NAME)
public class BetterWithHarderSteelRecipe
{
    public static final String MODID = "betterwithhardersteelrecipe";
    public static final String VERSION = "@VERSION@";
    public static final String NAME = "Better With Harder Steel Recipe";
    
    @Mod.Instance(MODID)
    public static BetterWithHarderSteelRecipe instance;
    
    public static final BetterWithHarderSteelRecipeTab creativeTab = new BetterWithHarderSteelRecipeTab("BWHSR");
    
    @Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@SidedProxy(serverSide = "com.kreezcraft.betterwithhardersteelrecipe.proxy.CommonProxy", clientSide = "com.kreezcraft.betterwithhardersteelrecipe.proxy.ClientProxy")
	public static CommonProxy proxy;

}
