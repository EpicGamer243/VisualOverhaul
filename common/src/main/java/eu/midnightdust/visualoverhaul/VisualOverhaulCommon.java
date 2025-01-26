package eu.midnightdust.visualoverhaul;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class VisualOverhaulCommon {
    public static final String MOD_ID = "visualoverhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger("VisualOverhaul");
    public static final List<UUID> playersWithMod = new ArrayList<>();
    public static final Map<BlockPos, ItemStack> jukeboxItems = new HashMap<>();

    public static final Identifier HELLO_PACKET = id("hello");
    public static final Identifier UPDATE_ITEMS_PACKET = id("update_items");

    public static final Identifier UPDATE_TYPE_POTION_BOTTLES = id("type_brewingstand");
    public static final Identifier UPDATE_TYPE_RECORD = id("type_record");
    public static final Identifier UPDATE_TYPE_FURNACE_ITEMS = id("type_furnace");

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
