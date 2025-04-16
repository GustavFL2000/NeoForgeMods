package net.BlueSlimeMC.MoreMetals.item;

import net.BlueSlimeMC.MoreMetals.MoreMetals;
import net.BlueSlimeMC.MoreMetals.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreMetals.MOD_ID);

    public static final DeferredItem<Item> SILVERINGOT = ITEMS.register("silveringot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAWSILVER = ITEMS.register("rawsilver",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILVERNUGGET = ITEMS.register("silvernugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
