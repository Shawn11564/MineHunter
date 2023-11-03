package dev.mrshawn.minehunter.block;

import dev.mrshawn.minehunter.MineHunter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

	public static Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
			new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
	public static Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
			new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(MineHunter.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(MineHunter.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()));
	}

	public static void registerModBlocks() {
		MineHunter.LOGGER.info("Registering mod blocks for " + MineHunter.MOD_ID);
	}

}