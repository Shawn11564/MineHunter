package dev.mrshawn.minehunter.item;

import dev.mrshawn.minehunter.MineHunter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

	public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
			new Item(new FabricItemSettings()));
	public static final Item PINK_GARNET = registerItem("pink_garnet",
			new Item(new FabricItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(MineHunter.MOD_ID, name), item);
	}

	private static void itemGroupIngredients(FabricItemGroupEntries entries) {
		entries.add(RAW_PINK_GARNET);
		entries.add(PINK_GARNET);
	}

	public static void registerModItems() {
		MineHunter.LOGGER.info("Registering mod items for " + MineHunter.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
	}

}
