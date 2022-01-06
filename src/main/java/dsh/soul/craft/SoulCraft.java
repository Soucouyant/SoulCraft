package dsh.soul.craft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SoulCraft implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("soulcraft");
	public static final ItemGroup Artifacts = FabricItemGroupBuilder.build(
			new Identifier("soulcraft", "artifacts"),
		() -> new ItemStack(SoulCraft.DIVINE_FRAGMENTS));

	public static final divine_fragments DIVINE_FRAGMENTS  = new divine_fragments(new Item.Settings().group((SoulCraft.Artifacts)));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("soulcraft", "divine_fragments"), DIVINE_FRAGMENTS);
		LOGGER.info("Hello Fabric world!");
	}
}
