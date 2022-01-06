package dsh.soul.craft;

import dsh.soul.craft.block.DIVINE_ORE;
import dsh.soul.craft.item.divine_fragments;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SoulCraft implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("soulcraft");

	// Item Group Builder
	public static final ItemGroup Artifacts = FabricItemGroupBuilder.build(
			new Identifier("soulcraft", "artifacts"),
		() -> new ItemStack(SoulCraft.DIVINE_FRAGMENTS));

	// Item Builder
	public static final divine_fragments DIVINE_FRAGMENTS  = new divine_fragments(new Item.Settings().group((SoulCraft.Artifacts)));

	// Block Builder
	public static final Block DIVINE_ORE = new DIVINE_ORE(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool());

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("soulcraft", "divine_fragments"), DIVINE_FRAGMENTS);
		Registry.register(Registry.BLOCK, new Identifier("soulcraft", "divine_ore"), DIVINE_ORE);
		Registry.register(Registry.ITEM, new Identifier("soulcraft", "divine_ore"), new BlockItem(DIVINE_ORE, new FabricItemSettings().group(SoulCraft.Artifacts)));
		LOGGER.info("Hello Fabric world!");
	}
}
