package nl.bdbekhof.tm.item;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import nl.bdbekhof.tm.Testingmod;

import java.util.function.Function;

public class ModItems {
    private static net.minecraft.component.type.FoodComponent FoodComponent;

    public static final Item RUBY = register("ruby", Item::new, new Item.Settings());
    public static final Item ROTTEN_APPLE = register("rotten_apple", Item::new, new Item.Settings().food(FoodComponent, ModFoodComponents.ROTTEN_APPLE));

    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Testingmod.MOD_ID, name));
        return Items.register(registryKey, factory, settings);
    }

    private static void customItems(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(ROTTEN_APPLE);
    }

    public static void initiliaze() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customItems);
    }
}
