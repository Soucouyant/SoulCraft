package dsh.soul.craft.item;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class divine_fragments extends Item {
    public divine_fragments(Settings settings) {
        super(settings);
    }
    // https://www.reddit.com/r/PixelArt/comments/9p1h7z/crystals/
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.soulcraft.divine_fragments.tooltip"));
    }
    // Sounds on equip and usage go here:

}
