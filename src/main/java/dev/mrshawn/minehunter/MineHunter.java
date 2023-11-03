package dev.mrshawn.minehunter;

import dev.mrshawn.minehunter.block.ModBlocks;
import dev.mrshawn.minehunter.item.ModItemGroups;
import dev.mrshawn.minehunter.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MineHunter implements ModInitializer {

	public static final String MOD_ID = "minehunter";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}