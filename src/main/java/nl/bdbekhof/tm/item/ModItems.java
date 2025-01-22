package nl.bdbekhof.tm.item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import nl.bdbekhof.tm.Testingmod;

import java.util.function.Function;

public class ModItems {
    public static final Item RUBY = register("ruby", Item::new, new Item.Settings());
    
    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Testingmod.MOD_ID, name));
        return Items.register(registryKey, factory, settings);
    }

    public static void initiliaze() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) ->itemGroup.add(ModItems.RUBY));
    }
}
