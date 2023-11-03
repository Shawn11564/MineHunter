package dev.mrshawn.minehunter.item;

import dev.mrshawn.minehunter.MineHunter;
import dev.mrshawn.minehunter.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

	public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier(MineHunter.MOD_ID, "pink_garnet_group"),
			FabricItemGroup.builder()
					.displayName(Text.translatable("itemgroup.pink_garnet_group"))
					.icon(() -> new ItemStack(ModItems.PINK_GARNET))
					.entries((displayContext, entries) -> {
						entries.add(ModItems.PINK_GARNET);
						entries.add(ModItems.RAW_PINK_GARNET);

						entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
						entries.add(ModBlocks.PINK_GARNET_BLOCK);
					}).build());

	public static void registerItemGroups() {
		MineHunter.LOGGER.info("Registering item groups for " + MineHunter.MOD_ID);
	}

}
