package me.alchemi.al.api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.AnaloguePowerable;
import org.bukkit.block.data.Bisected;
import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Levelled;
import org.bukkit.block.data.Lightable;
import org.bukkit.block.data.MultipleFacing;
import org.bukkit.block.data.Orientable;
import org.bukkit.block.data.Powerable;
import org.bukkit.block.data.Rail;
import org.bukkit.block.data.Rotatable;
import org.bukkit.block.data.Snowable;
import org.bukkit.block.data.Waterlogged;
import org.bukkit.block.data.type.Bamboo;
import org.bukkit.block.data.type.Bed;
import org.bukkit.block.data.type.Bell;
import org.bukkit.block.data.type.BrewingStand;
import org.bukkit.block.data.type.BubbleColumn;
import org.bukkit.block.data.type.Cake;
import org.bukkit.block.data.type.Campfire;
import org.bukkit.block.data.type.Chest;
import org.bukkit.block.data.type.Cocoa;
import org.bukkit.block.data.type.CommandBlock;
import org.bukkit.block.data.type.Comparator;
import org.bukkit.block.data.type.CoralWallFan;
import org.bukkit.block.data.type.DaylightDetector;
import org.bukkit.block.data.type.Dispenser;
import org.bukkit.block.data.type.Door;
import org.bukkit.block.data.type.EndPortalFrame;
import org.bukkit.block.data.type.EnderChest;
import org.bukkit.block.data.type.Farmland;
import org.bukkit.block.data.type.Fence;
import org.bukkit.block.data.type.Fire;
import org.bukkit.block.data.type.Furnace;
import org.bukkit.block.data.type.Gate;
import org.bukkit.block.data.type.GlassPane;
import org.bukkit.block.data.type.Hopper;
import org.bukkit.block.data.type.Jukebox;
import org.bukkit.block.data.type.Ladder;
import org.bukkit.block.data.type.Lantern;
import org.bukkit.block.data.type.Leaves;
import org.bukkit.block.data.type.Lectern;
import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.block.data.type.Observer;
import org.bukkit.block.data.type.Piston;
import org.bukkit.block.data.type.PistonHead;
import org.bukkit.block.data.type.RedstoneRail;
import org.bukkit.block.data.type.RedstoneWallTorch;
import org.bukkit.block.data.type.RedstoneWire;
import org.bukkit.block.data.type.Repeater;
import org.bukkit.block.data.type.Sapling;
import org.bukkit.block.data.type.Scaffolding;
import org.bukkit.block.data.type.SeaPickle;
import org.bukkit.block.data.type.Sign;
import org.bukkit.block.data.type.Slab;
import org.bukkit.block.data.type.Snow;
import org.bukkit.block.data.type.Stairs;
import org.bukkit.block.data.type.StructureBlock;
import org.bukkit.block.data.type.Switch;
import org.bukkit.block.data.type.TNT;
import org.bukkit.block.data.type.TechnicalPiston;
import org.bukkit.block.data.type.TrapDoor;
import org.bukkit.block.data.type.Tripwire;
import org.bukkit.block.data.type.TripwireHook;
import org.bukkit.block.data.type.TurtleEgg;
import org.bukkit.block.data.type.WallSign;
import org.bukkit.inventory.ItemStack;

public enum MaterialWrapper {
	CACTUS_GREEN,
    DANDELION_YELLOW,
    /**
     * BlockData: {@link Sign}
     */
    SIGN,
    ACACIA_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    ACACIA_BUTTON,
    /**
     * BlockData: {@link Door}
     */
    ACACIA_DOOR,
    /**
     * BlockData: {@link Fence}
     */
    ACACIA_FENCE,
    /**
     * BlockData: {@link Gate}
     */
    ACACIA_FENCE_GATE,
    /**
     * BlockData: {@link Leaves}
     */
    ACACIA_LEAVES,
    /**
     * BlockData: {@link Orientable}
     */
    ACACIA_LOG,
    ACACIA_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    ACACIA_PRESSURE_PLATE,
    /**
     * BlockData: {@link Sapling}
     */
    ACACIA_SAPLING,
    /**
     * BlockData: {@link Sign}
     */
    ACACIA_SIGN,
    /**
     * BlockData: {@link Slab}
     */
    ACACIA_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    ACACIA_STAIRS,
    /**
     * BlockData: {@link TrapDoor}
     */
    ACACIA_TRAPDOOR,
    /**
     * BlockData: {@link WallSign}
     */
    ACACIA_WALL_SIGN,
    /**
     * BlockData: {@link Orientable}
     */
    ACACIA_WOOD,
    /**
     * BlockData: {@link RedstoneRail}
     */
    ACTIVATOR_RAIL,
    AIR,
    ALLIUM,
    ANDESITE,
    /**
     * BlockData: {@link Slab}
     */
    ANDESITE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    ANDESITE_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    ANDESITE_WALL,
    /**
     * BlockData: {@link Directional}
     */
    ANVIL,
    APPLE,
    ARMOR_STAND,
    ARROW,
    /**
     * BlockData: {@link Directional}
     */
    ATTACHED_MELON_STEM,
    /**
     * BlockData: {@link Directional}
     */
    ATTACHED_PUMPKIN_STEM,
    AZURE_BLUET,
    BAKED_POTATO,
    /**
     * BlockData: {@link Bamboo}
     */
    BAMBOO,
    BAMBOO_SAPLING,
    /**
     * BlockData: {@link Directional}
     */
    BARREL,
    BARRIER,
    BAT_SPAWN_EGG,
    BEACON,
    BEDROCK,
    BEEF,
    BEETROOT,
    /**
     * BlockData: {@link Ageable}
     */
    BEETROOTS,
    BEETROOT_SEEDS,
    BEETROOT_SOUP,
    /**
     * BlockData: {@link Bell}
     */
    BELL,
    BIRCH_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    BIRCH_BUTTON,
    /**
     * BlockData: {@link Door}
     */
    BIRCH_DOOR,
    /**
     * BlockData: {@link Fence}
     */
    BIRCH_FENCE,
    /**
     * BlockData: {@link Gate}
     */
    BIRCH_FENCE_GATE,
    /**
     * BlockData: {@link Leaves}
     */
    BIRCH_LEAVES,
    /**
     * BlockData: {@link Orientable}
     */
    BIRCH_LOG,
    BIRCH_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    BIRCH_PRESSURE_PLATE,
    /**
     * BlockData: {@link Sapling}
     */
    BIRCH_SAPLING,
    /**
     * BlockData: {@link Sign}
     */
    BIRCH_SIGN,
    /**
     * BlockData: {@link Slab}
     */
    BIRCH_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    BIRCH_STAIRS,
    /**
     * BlockData: {@link TrapDoor}
     */
    BIRCH_TRAPDOOR,
    /**
     * BlockData: {@link WallSign}
     */
    BIRCH_WALL_SIGN,
    /**
     * BlockData: {@link Orientable}
     */
    BIRCH_WOOD,
    /**
     * BlockData: {@link Rotatable}
     */
    BLACK_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    BLACK_BED,
    BLACK_CARPET,
    BLACK_CONCRETE,
    BLACK_CONCRETE_POWDER,
    BLACK_DYE,
    /**
     * BlockData: {@link Directional}
     */
    BLACK_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    BLACK_SHULKER_BOX,
    BLACK_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    BLACK_STAINED_GLASS_PANE,
    BLACK_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    BLACK_WALL_BANNER,
    BLACK_WOOL,
    /**
     * BlockData: {@link Furnace}
     */
    BLAST_FURNACE,
    BLAZE_POWDER,
    BLAZE_ROD,
    BLAZE_SPAWN_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    BLUE_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    BLUE_BED,
    BLUE_CARPET,
    BLUE_CONCRETE,
    BLUE_CONCRETE_POWDER,
    BLUE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    BLUE_GLAZED_TERRACOTTA,
    BLUE_ICE,
    BLUE_ORCHID,
    /**
     * BlockData: {@link Directional}
     */
    BLUE_SHULKER_BOX,
    BLUE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    BLUE_STAINED_GLASS_PANE,
    BLUE_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    BLUE_WALL_BANNER,
    BLUE_WOOL,
    BONE,
    /**
     * BlockData: {@link Orientable}
     */
    BONE_BLOCK,
    BONE_MEAL,
    BOOK,
    BOOKSHELF,
    BOW,
    BOWL,
    /**
     * BlockData: {@link Waterlogged}
     */
    BRAIN_CORAL,
    BRAIN_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    BRAIN_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    BRAIN_CORAL_WALL_FAN,
    BREAD,
    /**
     * BlockData: {@link BrewingStand}
     */
    BREWING_STAND,
    BRICK,
    BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    BRICK_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    BRICK_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    BRICK_WALL,
    /**
     * BlockData: {@link Rotatable}
     */
    BROWN_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    BROWN_BED,
    BROWN_CARPET,
    BROWN_CONCRETE,
    BROWN_CONCRETE_POWDER,
    BROWN_DYE,
    /**
     * BlockData: {@link Directional}
     */
    BROWN_GLAZED_TERRACOTTA,
    BROWN_MUSHROOM,
    /**
     * BlockData: {@link MultipleFacing}
     */
    BROWN_MUSHROOM_BLOCK,
    /**
     * BlockData: {@link Directional}
     */
    BROWN_SHULKER_BOX,
    BROWN_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    BROWN_STAINED_GLASS_PANE,
    BROWN_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    BROWN_WALL_BANNER,
    BROWN_WOOL,
    /**
     * BlockData: {@link BubbleColumn}
     */
    BUBBLE_COLUMN,
    /**
     * BlockData: {@link Waterlogged}
     */
    BUBBLE_CORAL,
    BUBBLE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    BUBBLE_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    BUBBLE_CORAL_WALL_FAN,
    BUCKET,
    /**
     * BlockData: {@link Ageable}
     */
    CACTUS,
    /**
     * BlockData: {@link Cake}
     */
    CAKE,
    /**
     * BlockData: {@link Campfire}
     */
    CAMPFIRE,
    CARROT,
    /**
     * BlockData: {@link Ageable}
     */
    CARROTS,
    CARROT_ON_A_STICK,
    CARTOGRAPHY_TABLE,
    /**
     * BlockData: {@link Directional}
     */
    CARVED_PUMPKIN,
    CAT_SPAWN_EGG,
    /**
     * BlockData: {@link Levelled}
     */
    CAULDRON,
    CAVE_AIR,
    CAVE_SPIDER_SPAWN_EGG,
    CHAINMAIL_BOOTS,
    CHAINMAIL_CHESTPLATE,
    CHAINMAIL_HELMET,
    CHAINMAIL_LEGGINGS,
    /**
     * BlockData: {@link CommandBlock}
     */
    CHAIN_COMMAND_BLOCK,
    CHARCOAL,
    /**
     * BlockData: {@link Chest}
     */
    CHEST,
    CHEST_MINECART,
    CHICKEN,
    CHICKEN_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    CHIPPED_ANVIL,
    CHISELED_QUARTZ_BLOCK,
    CHISELED_RED_SANDSTONE,
    CHISELED_SANDSTONE,
    CHISELED_STONE_BRICKS,
    /**
     * BlockData: {@link Ageable}
     */
    CHORUS_FLOWER,
    CHORUS_FRUIT,
    /**
     * BlockData: {@link MultipleFacing}
     */
    CHORUS_PLANT,
    CLAY,
    CLAY_BALL,
    CLOCK,
    COAL,
    COAL_BLOCK,
    COAL_ORE,
    COARSE_DIRT,
    COBBLESTONE,
    /**
     * BlockData: {@link Slab}
     */
    COBBLESTONE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    COBBLESTONE_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    COBBLESTONE_WALL,
    COBWEB,
    /**
     * BlockData: {@link Cocoa}
     */
    COCOA,
    COCOA_BEANS,
    COD,
    COD_BUCKET,
    COD_SPAWN_EGG,
    /**
     * BlockData: {@link CommandBlock}
     */
    COMMAND_BLOCK,
    COMMAND_BLOCK_MINECART,
    /**
     * BlockData: {@link Comparator}
     */
    COMPARATOR,
    COMPASS,
    /**
     * BlockData: {@link Levelled}
     */
    COMPOSTER,
    /**
     * BlockData: {@link Waterlogged}
     */
    CONDUIT,
    COOKED_BEEF,
    COOKED_CHICKEN,
    COOKED_COD,
    COOKED_MUTTON,
    COOKED_PORKCHOP,
    COOKED_RABBIT,
    COOKED_SALMON,
    COOKIE,
    CORNFLOWER,
    COW_SPAWN_EGG,
    CRACKED_STONE_BRICKS,
    CRAFTING_TABLE,
    CREEPER_BANNER_PATTERN,
    /**
     * BlockData: {@link Rotatable}
     */
    CREEPER_HEAD,
    CREEPER_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    CREEPER_WALL_HEAD,
    CROSSBOW,
    CUT_RED_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    CUT_RED_SANDSTONE_SLAB,
    CUT_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    CUT_SANDSTONE_SLAB,
    /**
     * BlockData: {@link Rotatable}
     */
    CYAN_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    CYAN_BED,
    CYAN_CARPET,
    CYAN_CONCRETE,
    CYAN_CONCRETE_POWDER,
    CYAN_DYE,
    /**
     * BlockData: {@link Directional}
     */
    CYAN_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    CYAN_SHULKER_BOX,
    CYAN_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    CYAN_STAINED_GLASS_PANE,
    CYAN_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    CYAN_WALL_BANNER,
    CYAN_WOOL,
    /**
     * BlockData: {@link Directional}
     */
    DAMAGED_ANVIL,
    DANDELION,
    DARK_OAK_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    DARK_OAK_BUTTON,
    /**
     * BlockData: {@link Door}
     */
    DARK_OAK_DOOR,
    /**
     * BlockData: {@link Fence}
     */
    DARK_OAK_FENCE,
    /**
     * BlockData: {@link Gate}
     */
    DARK_OAK_FENCE_GATE,
    /**
     * BlockData: {@link Leaves}
     */
    DARK_OAK_LEAVES,
    /**
     * BlockData: {@link Orientable}
     */
    DARK_OAK_LOG,
    DARK_OAK_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    DARK_OAK_PRESSURE_PLATE,
    /**
     * BlockData: {@link Sapling}
     */
    DARK_OAK_SAPLING,
    /**
     * BlockData: {@link Sign}
     */
    DARK_OAK_SIGN,
    /**
     * BlockData: {@link Slab}
     */
    DARK_OAK_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    DARK_OAK_STAIRS,
    /**
     * BlockData: {@link TrapDoor}
     */
    DARK_OAK_TRAPDOOR,
    /**
     * BlockData: {@link WallSign}
     */
    DARK_OAK_WALL_SIGN,
    /**
     * BlockData: {@link Orientable}
     */
    DARK_OAK_WOOD,
    DARK_PRISMARINE,
    /**
     * BlockData: {@link Slab}
     */
    DARK_PRISMARINE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    DARK_PRISMARINE_STAIRS,
    /**
     * BlockData: {@link DaylightDetector}
     */
    DAYLIGHT_DETECTOR,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BRAIN_CORAL,
    DEAD_BRAIN_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BRAIN_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_BRAIN_CORAL_WALL_FAN,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BUBBLE_CORAL,
    DEAD_BUBBLE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BUBBLE_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_BUBBLE_CORAL_WALL_FAN,
    DEAD_BUSH,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_FIRE_CORAL,
    DEAD_FIRE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_FIRE_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_FIRE_CORAL_WALL_FAN,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_HORN_CORAL,
    DEAD_HORN_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_HORN_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_HORN_CORAL_WALL_FAN,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_TUBE_CORAL,
    DEAD_TUBE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_TUBE_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_TUBE_CORAL_WALL_FAN,
    DEBUG_STICK,
    /**
     * BlockData: {@link RedstoneRail}
     */
    DETECTOR_RAIL,
    DIAMOND,
    DIAMOND_AXE,
    DIAMOND_BLOCK,
    DIAMOND_BOOTS,
    DIAMOND_CHESTPLATE,
    DIAMOND_HELMET,
    DIAMOND_HOE,
    DIAMOND_HORSE_ARMOR,
    DIAMOND_LEGGINGS,
    DIAMOND_ORE,
    DIAMOND_PICKAXE,
    DIAMOND_SHOVEL,
    DIAMOND_SWORD,
    DIORITE,
    /**
     * BlockData: {@link Slab}
     */
    DIORITE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    DIORITE_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    DIORITE_WALL,
    DIRT,
    /**
     * BlockData: {@link Dispenser}
     */
    DISPENSER,
    DOLPHIN_SPAWN_EGG,
    DONKEY_SPAWN_EGG,
    DRAGON_BREATH,
    DRAGON_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    DRAGON_HEAD,
    /**
     * BlockData: {@link Directional}
     */
    DRAGON_WALL_HEAD,
    DRIED_KELP,
    DRIED_KELP_BLOCK,
    /**
     * BlockData: {@link Dispenser}
     */
    DROPPER,
    DROWNED_SPAWN_EGG,
    EGG,
    ELDER_GUARDIAN_SPAWN_EGG,
    ELYTRA,
    EMERALD,
    EMERALD_BLOCK,
    EMERALD_ORE,
    ENCHANTED_BOOK,
    ENCHANTED_GOLDEN_APPLE,
    ENCHANTING_TABLE,
    ENDERMAN_SPAWN_EGG,
    ENDERMITE_SPAWN_EGG,
    /**
     * BlockData: {@link EnderChest}
     */
    ENDER_CHEST,
    ENDER_EYE,
    ENDER_PEARL,
    END_CRYSTAL,
    END_GATEWAY,
    END_PORTAL,
    /**
     * BlockData: {@link EndPortalFrame}
     */
    END_PORTAL_FRAME,
    /**
     * BlockData: {@link Directional}
     */
    END_ROD,
    END_STONE,
    END_STONE_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    END_STONE_BRICK_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    END_STONE_BRICK_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    END_STONE_BRICK_WALL,
    EVOKER_SPAWN_EGG,
    EXPERIENCE_BOTTLE,
    /**
     * BlockData: {@link Farmland}
     */
    FARMLAND,
    FEATHER,
    FERMENTED_SPIDER_EYE,
    FERN,
    FILLED_MAP,
    /**
     * BlockData: {@link Fire}
     */
    FIRE,
    FIREWORK_ROCKET,
    FIREWORK_STAR,
    FIRE_CHARGE,
    /**
     * BlockData: {@link Waterlogged}
     */
    FIRE_CORAL,
    FIRE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    FIRE_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    FIRE_CORAL_WALL_FAN,
    FISHING_ROD,
    FLETCHING_TABLE,
    FLINT,
    FLINT_AND_STEEL,
    FLOWER_BANNER_PATTERN,
    FLOWER_POT,
    FOX_SPAWN_EGG,
    /**
     * BlockData: {@link Ageable}
     */
    FROSTED_ICE,
    /**
     * BlockData: {@link Furnace}
     */
    FURNACE,
    FURNACE_MINECART,
    GHAST_SPAWN_EGG,
    GHAST_TEAR,
    GLASS,
    GLASS_BOTTLE,
    /**
     * BlockData: {@link Fence}
     */
    GLASS_PANE,
    GLISTERING_MELON_SLICE,
    GLOBE_BANNER_PATTERN,
    GLOWSTONE,
    GLOWSTONE_DUST,
    GOLDEN_APPLE,
    GOLDEN_AXE,
    GOLDEN_BOOTS,
    GOLDEN_CARROT,
    GOLDEN_CHESTPLATE,
    GOLDEN_HELMET,
    GOLDEN_HOE,
    GOLDEN_HORSE_ARMOR,
    GOLDEN_LEGGINGS,
    GOLDEN_PICKAXE,
    GOLDEN_SHOVEL,
    GOLDEN_SWORD,
    GOLD_BLOCK,
    GOLD_INGOT,
    GOLD_NUGGET,
    GOLD_ORE,
    GRANITE,
    /**
     * BlockData: {@link Slab}
     */
    GRANITE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    GRANITE_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    GRANITE_WALL,
    GRASS,
    /**
     * BlockData: {@link Snowable}
     */
    GRASS_BLOCK,
    GRASS_PATH,
    GRAVEL,
    /**
     * BlockData: {@link Rotatable}
     */
    GRAY_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    GRAY_BED,
    GRAY_CARPET,
    GRAY_CONCRETE,
    GRAY_CONCRETE_POWDER,
    GRAY_DYE,
    /**
     * BlockData: {@link Directional}
     */
    GRAY_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    GRAY_SHULKER_BOX,
    GRAY_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    GRAY_STAINED_GLASS_PANE,
    GRAY_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    GRAY_WALL_BANNER,
    GRAY_WOOL,
    /**
     * BlockData: {@link Rotatable}
     */
    GREEN_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    GREEN_BED,
    GREEN_CARPET,
    GREEN_CONCRETE,
    GREEN_CONCRETE_POWDER,
    GREEN_DYE,
    /**
     * BlockData: {@link Directional}
     */
    GREEN_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    GREEN_SHULKER_BOX,
    GREEN_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    GREEN_STAINED_GLASS_PANE,
    GREEN_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    GREEN_WALL_BANNER,
    GREEN_WOOL,
    /**
     * BlockData: {@link Directional}
     */
    GRINDSTONE,
    GUARDIAN_SPAWN_EGG,
    GUNPOWDER,
    /**
     * BlockData: {@link Orientable}
     */
    HAY_BLOCK,
    HEART_OF_THE_SEA,
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    HEAVY_WEIGHTED_PRESSURE_PLATE,
    /**
     * BlockData: {@link Hopper}
     */
    HOPPER,
    HOPPER_MINECART,
    /**
     * BlockData: {@link Waterlogged}
     */
    HORN_CORAL,
    HORN_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    HORN_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    HORN_CORAL_WALL_FAN,
    HORSE_SPAWN_EGG,
    HUSK_SPAWN_EGG,
    ICE,
    INFESTED_CHISELED_STONE_BRICKS,
    INFESTED_COBBLESTONE,
    INFESTED_CRACKED_STONE_BRICKS,
    INFESTED_MOSSY_STONE_BRICKS,
    INFESTED_STONE,
    INFESTED_STONE_BRICKS,
    INK_SAC,
    IRON_AXE,
    /**
     * BlockData: {@link Fence}
     */
    IRON_BARS,
    IRON_BLOCK,
    IRON_BOOTS,
    IRON_CHESTPLATE,
    /**
     * BlockData: {@link Door}
     */
    IRON_DOOR,
    IRON_HELMET,
    IRON_HOE,
    IRON_HORSE_ARMOR,
    IRON_INGOT,
    IRON_LEGGINGS,
    IRON_NUGGET,
    IRON_ORE,
    IRON_PICKAXE,
    IRON_SHOVEL,
    IRON_SWORD,
    /**
     * BlockData: {@link TrapDoor}
     */
    IRON_TRAPDOOR,
    ITEM_FRAME,
    /**
     * BlockData: {@link Directional}
     */
    JACK_O_LANTERN,
    /**
     * BlockData: {@link Directional}
     */
    JIGSAW,
    /**
     * BlockData: {@link Jukebox}
     */
    JUKEBOX,
    JUNGLE_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    JUNGLE_BUTTON,
    /**
     * BlockData: {@link Door}
     */
    JUNGLE_DOOR,
    /**
     * BlockData: {@link Fence}
     */
    JUNGLE_FENCE,
    /**
     * BlockData: {@link Gate}
     */
    JUNGLE_FENCE_GATE,
    /**
     * BlockData: {@link Leaves}
     */
    JUNGLE_LEAVES,
    /**
     * BlockData: {@link Orientable}
     */
    JUNGLE_LOG,
    JUNGLE_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    JUNGLE_PRESSURE_PLATE,
    /**
     * BlockData: {@link Sapling}
     */
    JUNGLE_SAPLING,
    /**
     * BlockData: {@link Sign}
     */
    JUNGLE_SIGN,
    /**
     * BlockData: {@link Slab}
     */
    JUNGLE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    JUNGLE_STAIRS,
    /**
     * BlockData: {@link TrapDoor}
     */
    JUNGLE_TRAPDOOR,
    /**
     * BlockData: {@link WallSign}
     */
    JUNGLE_WALL_SIGN,
    /**
     * BlockData: {@link Orientable}
     */
    JUNGLE_WOOD,
    /**
     * BlockData: {@link Ageable}
     */
    KELP,
    KELP_PLANT,
    KNOWLEDGE_BOOK,
    /**
     * BlockData: {@link Ladder}
     */
    LADDER,
    /**
     * BlockData: {@link Lantern}
     */
    LANTERN,
    LAPIS_BLOCK,
    LAPIS_LAZULI,
    LAPIS_ORE,
    /**
     * BlockData: {@link Bisected}
     */
    LARGE_FERN,
    /**
     * BlockData: {@link Levelled}
     */
    LAVA,
    LAVA_BUCKET,
    LEAD,
    LEATHER,
    LEATHER_BOOTS,
    LEATHER_CHESTPLATE,
    LEATHER_HELMET,
    LEATHER_HORSE_ARMOR,
    LEATHER_LEGGINGS,
    /**
     * BlockData: {@link Lectern}
     */
    LECTERN,
    /**
     * BlockData: {@link Switch}
     */
    LEVER,
    /**
     * BlockData: {@link Rotatable}
     */
    LIGHT_BLUE_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    LIGHT_BLUE_BED,
    LIGHT_BLUE_CARPET,
    LIGHT_BLUE_CONCRETE,
    LIGHT_BLUE_CONCRETE_POWDER,
    LIGHT_BLUE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_BLUE_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_BLUE_SHULKER_BOX,
    LIGHT_BLUE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    LIGHT_BLUE_STAINED_GLASS_PANE,
    LIGHT_BLUE_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_BLUE_WALL_BANNER,
    LIGHT_BLUE_WOOL,
    /**
     * BlockData: {@link Rotatable}
     */
    LIGHT_GRAY_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    LIGHT_GRAY_BED,
    LIGHT_GRAY_CARPET,
    LIGHT_GRAY_CONCRETE,
    LIGHT_GRAY_CONCRETE_POWDER,
    LIGHT_GRAY_DYE,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_GRAY_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_GRAY_SHULKER_BOX,
    LIGHT_GRAY_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    LIGHT_GRAY_STAINED_GLASS_PANE,
    LIGHT_GRAY_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_GRAY_WALL_BANNER,
    LIGHT_GRAY_WOOL,
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    LIGHT_WEIGHTED_PRESSURE_PLATE,
    /**
     * BlockData: {@link Bisected}
     */
    LILAC,
    LILY_OF_THE_VALLEY,
    LILY_PAD,
    /**
     * BlockData: {@link Rotatable}
     */
    LIME_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    LIME_BED,
    LIME_CARPET,
    LIME_CONCRETE,
    LIME_CONCRETE_POWDER,
    LIME_DYE,
    /**
     * BlockData: {@link Directional}
     */
    LIME_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    LIME_SHULKER_BOX,
    LIME_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    LIME_STAINED_GLASS_PANE,
    LIME_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    LIME_WALL_BANNER,
    LIME_WOOL,
    LINGERING_POTION,
    LLAMA_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    LOOM,
    /**
     * BlockData: {@link Rotatable}
     */
    MAGENTA_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    MAGENTA_BED,
    MAGENTA_CARPET,
    MAGENTA_CONCRETE,
    MAGENTA_CONCRETE_POWDER,
    MAGENTA_DYE,
    /**
     * BlockData: {@link Directional}
     */
    MAGENTA_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    MAGENTA_SHULKER_BOX,
    MAGENTA_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    MAGENTA_STAINED_GLASS_PANE,
    MAGENTA_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    MAGENTA_WALL_BANNER,
    MAGENTA_WOOL,
    MAGMA_BLOCK,
    MAGMA_CREAM,
    MAGMA_CUBE_SPAWN_EGG,
    MAP,
    MELON,
    MELON_SEEDS,
    MELON_SLICE,
    /**
     * BlockData: {@link Ageable}
     */
    MELON_STEM,
    MILK_BUCKET,
    MINECART,
    MOJANG_BANNER_PATTERN,
    MOOSHROOM_SPAWN_EGG,
    /**
     * BlockData: {@link MultipleFacing}
     */
    MOSSY_COBBLESTONE,
    /**
     * BlockData: {@link Slab}
     */
    MOSSY_COBBLESTONE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    MOSSY_COBBLESTONE_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    MOSSY_COBBLESTONE_WALL,
    MOSSY_STONE_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    MOSSY_STONE_BRICK_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    MOSSY_STONE_BRICK_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    MOSSY_STONE_BRICK_WALL,
    /**
     * BlockData: {@link TechnicalPiston}
     */
    MOVING_PISTON,
    MULE_SPAWN_EGG,
    /**
     * BlockData: {@link MultipleFacing}
     */
    MUSHROOM_STEM,
    MUSHROOM_STEW,
    MUSIC_DISC_11,
    MUSIC_DISC_13,
    MUSIC_DISC_BLOCKS,
    MUSIC_DISC_CAT,
    MUSIC_DISC_CHIRP,
    MUSIC_DISC_FAR,
    MUSIC_DISC_MALL,
    MUSIC_DISC_MELLOHI,
    MUSIC_DISC_STAL,
    MUSIC_DISC_STRAD,
    MUSIC_DISC_WAIT,
    MUSIC_DISC_WARD,
    MUTTON,
    /**
     * BlockData: {@link Snowable}
     */
    MYCELIUM,
    NAME_TAG,
    NAUTILUS_SHELL,
    NETHERRACK,
    NETHER_BRICK,
    NETHER_BRICKS,
    /**
     * BlockData: {@link Fence}
     */
    NETHER_BRICK_FENCE,
    /**
     * BlockData: {@link Slab}
     */
    NETHER_BRICK_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    NETHER_BRICK_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    NETHER_BRICK_WALL,
    /**
     * BlockData: {@link Orientable}
     */
    NETHER_PORTAL,
    NETHER_QUARTZ_ORE,
    NETHER_STAR,
    /**
     * BlockData: {@link Ageable}
     */
    NETHER_WART,
    NETHER_WART_BLOCK,
    /**
     * BlockData: {@link NoteBlock}
     */
    NOTE_BLOCK,
    OAK_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    OAK_BUTTON,
    /**
     * BlockData: {@link Door}
     */
    OAK_DOOR,
    /**
     * BlockData: {@link Fence}
     */
    OAK_FENCE,
    /**
     * BlockData: {@link Gate}
     */
    OAK_FENCE_GATE,
    /**
     * BlockData: {@link Leaves}
     */
    OAK_LEAVES,
    /**
     * BlockData: {@link Orientable}
     */
    OAK_LOG,
    OAK_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    OAK_PRESSURE_PLATE,
    /**
     * BlockData: {@link Sapling}
     */
    OAK_SAPLING,
    /**
     * BlockData: {@link Sign}
     */
    OAK_SIGN,
    /**
     * BlockData: {@link Slab}
     */
    OAK_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    OAK_STAIRS,
    /**
     * BlockData: {@link TrapDoor}
     */
    OAK_TRAPDOOR,
    /**
     * BlockData: {@link WallSign}
     */
    OAK_WALL_SIGN,
    /**
     * BlockData: {@link Orientable}
     */
    OAK_WOOD,
    /**
     * BlockData: {@link Observer}
     */
    OBSERVER,
    OBSIDIAN,
    OCELOT_SPAWN_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    ORANGE_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    ORANGE_BED,
    ORANGE_CARPET,
    ORANGE_CONCRETE,
    ORANGE_CONCRETE_POWDER,
    ORANGE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    ORANGE_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    ORANGE_SHULKER_BOX,
    ORANGE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    ORANGE_STAINED_GLASS_PANE,
    ORANGE_TERRACOTTA,
    ORANGE_TULIP,
    /**
     * BlockData: {@link Directional}
     */
    ORANGE_WALL_BANNER,
    ORANGE_WOOL,
    OXEYE_DAISY,
    PACKED_ICE,
    PAINTING,
    PANDA_SPAWN_EGG,
    PAPER,
    PARROT_SPAWN_EGG,
    /**
     * BlockData: {@link Bisected}
     */
    PEONY,
    /**
     * BlockData: {@link Slab}
     */
    PETRIFIED_OAK_SLAB,
    PHANTOM_MEMBRANE,
    PHANTOM_SPAWN_EGG,
    PIG_SPAWN_EGG,
    PILLAGER_SPAWN_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    PINK_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    PINK_BED,
    PINK_CARPET,
    PINK_CONCRETE,
    PINK_CONCRETE_POWDER,
    PINK_DYE,
    /**
     * BlockData: {@link Directional}
     */
    PINK_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    PINK_SHULKER_BOX,
    PINK_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    PINK_STAINED_GLASS_PANE,
    PINK_TERRACOTTA,
    PINK_TULIP,
    /**
     * BlockData: {@link Directional}
     */
    PINK_WALL_BANNER,
    PINK_WOOL,
    /**
     * BlockData: {@link Piston}
     */
    PISTON,
    /**
     * BlockData: {@link PistonHead}
     */
    PISTON_HEAD,
    /**
     * BlockData: {@link Rotatable}
     */
    PLAYER_HEAD,
    /**
     * BlockData: {@link Directional}
     */
    PLAYER_WALL_HEAD,
    /**
     * BlockData: {@link Snowable}
     */
    PODZOL,
    POISONOUS_POTATO,
    POLAR_BEAR_SPAWN_EGG,
    POLISHED_ANDESITE,
    /**
     * BlockData: {@link Slab}
     */
    POLISHED_ANDESITE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_ANDESITE_STAIRS,
    POLISHED_DIORITE,
    /**
     * BlockData: {@link Slab}
     */
    POLISHED_DIORITE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_DIORITE_STAIRS,
    POLISHED_GRANITE,
    /**
     * BlockData: {@link Slab}
     */
    POLISHED_GRANITE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_GRANITE_STAIRS,
    POPPED_CHORUS_FRUIT,
    POPPY,
    PORKCHOP,
    POTATO,
    /**
     * BlockData: {@link Ageable}
     */
    POTATOES,
    POTION,
    POTTED_ACACIA_SAPLING,
    POTTED_ALLIUM,
    POTTED_AZURE_BLUET,
    POTTED_BAMBOO,
    POTTED_BIRCH_SAPLING,
    POTTED_BLUE_ORCHID,
    POTTED_BROWN_MUSHROOM,
    POTTED_CACTUS,
    POTTED_CORNFLOWER,
    POTTED_DANDELION,
    POTTED_DARK_OAK_SAPLING,
    POTTED_DEAD_BUSH,
    POTTED_FERN,
    POTTED_JUNGLE_SAPLING,
    POTTED_LILY_OF_THE_VALLEY,
    POTTED_OAK_SAPLING,
    POTTED_ORANGE_TULIP,
    POTTED_OXEYE_DAISY,
    POTTED_PINK_TULIP,
    POTTED_POPPY,
    POTTED_RED_MUSHROOM,
    POTTED_RED_TULIP,
    POTTED_SPRUCE_SAPLING,
    POTTED_WHITE_TULIP,
    POTTED_WITHER_ROSE,
    /**
     * BlockData: {@link RedstoneRail}
     */
    POWERED_RAIL,
    PRISMARINE,
    PRISMARINE_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    PRISMARINE_BRICK_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    PRISMARINE_BRICK_STAIRS,
    PRISMARINE_CRYSTALS,
    PRISMARINE_SHARD,
    /**
     * BlockData: {@link Slab}
     */
    PRISMARINE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    PRISMARINE_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    PRISMARINE_WALL,
    PUFFERFISH,
    PUFFERFISH_BUCKET,
    PUFFERFISH_SPAWN_EGG,
    PUMPKIN,
    PUMPKIN_PIE,
    PUMPKIN_SEEDS,
    /**
     * BlockData: {@link Ageable}
     */
    PUMPKIN_STEM,
    /**
     * BlockData: {@link Rotatable}
     */
    PURPLE_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    PURPLE_BED,
    PURPLE_CARPET,
    PURPLE_CONCRETE,
    PURPLE_CONCRETE_POWDER,
    PURPLE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    PURPLE_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    PURPLE_SHULKER_BOX,
    PURPLE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    PURPLE_STAINED_GLASS_PANE,
    PURPLE_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    PURPLE_WALL_BANNER,
    PURPLE_WOOL,
    PURPUR_BLOCK,
    /**
     * BlockData: {@link Orientable}
     */
    PURPUR_PILLAR,
    /**
     * BlockData: {@link Slab}
     */
    PURPUR_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    PURPUR_STAIRS,
    QUARTZ,
    QUARTZ_BLOCK,
    /**
     * BlockData: {@link Orientable}
     */
    QUARTZ_PILLAR,
    /**
     * BlockData: {@link Slab}
     */
    QUARTZ_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    QUARTZ_STAIRS,
    RABBIT,
    RABBIT_FOOT,
    RABBIT_HIDE,
    RABBIT_SPAWN_EGG,
    RABBIT_STEW,
    /**
     * BlockData: {@link Rail}
     */
    RAIL,
    RAVAGER_SPAWN_EGG,
    REDSTONE,
    REDSTONE_BLOCK,
    /**
     * BlockData: {@link Lightable}
     */
    REDSTONE_LAMP,
    /**
     * BlockData: {@link Lightable}
     */
    REDSTONE_ORE,
    /**
     * BlockData: {@link Lightable}
     */
    REDSTONE_TORCH,
    /**
     * BlockData: {@link RedstoneWallTorch}
     */
    REDSTONE_WALL_TORCH,
    /**
     * BlockData: {@link RedstoneWire}
     */
    REDSTONE_WIRE,
    /**
     * BlockData: {@link Rotatable}
     */
    RED_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    RED_BED,
    RED_CARPET,
    RED_CONCRETE,
    RED_CONCRETE_POWDER,
    RED_DYE,
    /**
     * BlockData: {@link Directional}
     */
    RED_GLAZED_TERRACOTTA,
    RED_MUSHROOM,
    /**
     * BlockData: {@link MultipleFacing}
     */
    RED_MUSHROOM_BLOCK,
    RED_NETHER_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    RED_NETHER_BRICK_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    RED_NETHER_BRICK_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    RED_NETHER_BRICK_WALL,
    RED_SAND,
    RED_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    RED_SANDSTONE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    RED_SANDSTONE_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    RED_SANDSTONE_WALL,
    /**
     * BlockData: {@link Directional}
     */
    RED_SHULKER_BOX,
    RED_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    RED_STAINED_GLASS_PANE,
    RED_TERRACOTTA,
    RED_TULIP,
    /**
     * BlockData: {@link Directional}
     */
    RED_WALL_BANNER,
    RED_WOOL,
    /**
     * BlockData: {@link Repeater}
     */
    REPEATER,
    /**
     * BlockData: {@link CommandBlock}
     */
    REPEATING_COMMAND_BLOCK,
    /**
     * BlockData: {@link Bisected}
     */
    ROSE_BUSH,
    ROTTEN_FLESH,
    SADDLE,
    SALMON,
    SALMON_BUCKET,
    SALMON_SPAWN_EGG,
    SAND,
    SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    SANDSTONE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    SANDSTONE_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    SANDSTONE_WALL,
    /**
     * BlockData: {@link Scaffolding}
     */
    SCAFFOLDING,
    SCUTE,
    SEAGRASS,
    SEA_LANTERN,
    /**
     * BlockData: {@link SeaPickle}
     */
    SEA_PICKLE,
    SHEARS,
    SHEEP_SPAWN_EGG,
    SHIELD,
    /**
     * BlockData: {@link Directional}
     */
    SHULKER_BOX,
    SHULKER_SHELL,
    SHULKER_SPAWN_EGG,
    SILVERFISH_SPAWN_EGG,
    SKELETON_HORSE_SPAWN_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    SKELETON_SKULL,
    SKELETON_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    SKELETON_WALL_SKULL,
    SKULL_BANNER_PATTERN,
    SLIME_BALL,
    SLIME_BLOCK,
    SLIME_SPAWN_EGG,
    SMITHING_TABLE,
    /**
     * BlockData: {@link Furnace}
     */
    SMOKER,
    SMOOTH_QUARTZ,
    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_QUARTZ_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    SMOOTH_QUARTZ_STAIRS,
    SMOOTH_RED_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_RED_SANDSTONE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    SMOOTH_RED_SANDSTONE_STAIRS,
    SMOOTH_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_SANDSTONE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    SMOOTH_SANDSTONE_STAIRS,
    SMOOTH_STONE,
    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_STONE_SLAB,
    /**
     * BlockData: {@link Snow}
     */
    SNOW,
    SNOWBALL,
    SNOW_BLOCK,
    SOUL_SAND,
    SPAWNER,
    SPECTRAL_ARROW,
    SPIDER_EYE,
    SPIDER_SPAWN_EGG,
    SPLASH_POTION,
    SPONGE,
    SPRUCE_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    SPRUCE_BUTTON,
    /**
     * BlockData: {@link Door}
     */
    SPRUCE_DOOR,
    /**
     * BlockData: {@link Fence}
     */
    SPRUCE_FENCE,
    /**
     * BlockData: {@link Gate}
     */
    SPRUCE_FENCE_GATE,
    /**
     * BlockData: {@link Leaves}
     */
    SPRUCE_LEAVES,
    /**
     * BlockData: {@link Orientable}
     */
    SPRUCE_LOG,
    SPRUCE_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    SPRUCE_PRESSURE_PLATE,
    /**
     * BlockData: {@link Sapling}
     */
    SPRUCE_SAPLING,
    /**
     * BlockData: {@link Sign}
     */
    SPRUCE_SIGN,
    /**
     * BlockData: {@link Slab}
     */
    SPRUCE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    SPRUCE_STAIRS,
    /**
     * BlockData: {@link TrapDoor}
     */
    SPRUCE_TRAPDOOR,
    /**
     * BlockData: {@link WallSign}
     */
    SPRUCE_WALL_SIGN,
    /**
     * BlockData: {@link Orientable}
     */
    SPRUCE_WOOD,
    SQUID_SPAWN_EGG,
    STICK,
    /**
     * BlockData: {@link Piston}
     */
    STICKY_PISTON,
    STONE,
    /**
     * BlockData: {@link Directional}
     */
    STONECUTTER,
    STONE_AXE,
    STONE_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    STONE_BRICK_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    STONE_BRICK_STAIRS,
    /**
     * BlockData: {@link Fence}
     */
    STONE_BRICK_WALL,
    /**
     * BlockData: {@link Switch}
     */
    STONE_BUTTON,
    STONE_HOE,
    STONE_PICKAXE,
    /**
     * BlockData: {@link Powerable}
     */
    STONE_PRESSURE_PLATE,
    STONE_SHOVEL,
    /**
     * BlockData: {@link Slab}
     */
    STONE_SLAB,
    /**
     * BlockData: {@link Stairs}
     */
    STONE_STAIRS,
    STONE_SWORD,
    STRAY_SPAWN_EGG,
    STRING,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_ACACIA_LOG,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_ACACIA_WOOD,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_BIRCH_LOG,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_BIRCH_WOOD,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_DARK_OAK_LOG,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_DARK_OAK_WOOD,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_JUNGLE_LOG,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_JUNGLE_WOOD,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_OAK_LOG,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_OAK_WOOD,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_SPRUCE_LOG,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_SPRUCE_WOOD,
    /**
     * BlockData: {@link StructureBlock}
     */
    STRUCTURE_BLOCK,
    STRUCTURE_VOID,
    SUGAR,
    /**
     * BlockData: {@link Ageable}
     */
    SUGAR_CANE,
    /**
     * BlockData: {@link Bisected}
     */
    SUNFLOWER,
    SUSPICIOUS_STEW,
    SWEET_BERRIES,
    /**
     * BlockData: {@link Ageable}
     */
    SWEET_BERRY_BUSH,
    /**
     * BlockData: {@link Bisected}
     */
    TALL_GRASS,
    /**
     * BlockData: {@link Bisected}
     */
    TALL_SEAGRASS,
    TERRACOTTA,
    TIPPED_ARROW,
    /**
     * BlockData: {@link TNT}
     */
    TNT,
    TNT_MINECART,
    TORCH,
    TOTEM_OF_UNDYING,
    TRADER_LLAMA_SPAWN_EGG,
    /**
     * BlockData: {@link Chest}
     */
    TRAPPED_CHEST,
    TRIDENT,
    /**
     * BlockData: {@link Tripwire}
     */
    TRIPWIRE,
    /**
     * BlockData: {@link TripwireHook}
     */
    TRIPWIRE_HOOK,
    TROPICAL_FISH,
    TROPICAL_FISH_BUCKET,
    TROPICAL_FISH_SPAWN_EGG,
    /**
     * BlockData: {@link Waterlogged}
     */
    TUBE_CORAL,
    TUBE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    TUBE_CORAL_FAN,
    /**
     * BlockData: {@link CoralWallFan}
     */
    TUBE_CORAL_WALL_FAN,
    /**
     * BlockData: {@link TurtleEgg}
     */
    TURTLE_EGG,
    TURTLE_HELMET,
    TURTLE_SPAWN_EGG,
    VEX_SPAWN_EGG,
    VILLAGER_SPAWN_EGG,
    VINDICATOR_SPAWN_EGG,
    /**
     * BlockData: {@link MultipleFacing}
     */
    VINE,
    VOID_AIR,
    /**
     * BlockData: {@link Directional}
     */
    WALL_TORCH,
    WANDERING_TRADER_SPAWN_EGG,
    /**
     * BlockData: {@link Levelled}
     */
    WATER,
    WATER_BUCKET,
    WET_SPONGE,
    /**
     * BlockData: {@link Ageable}
     */
    WHEAT,
    WHEAT_SEEDS,
    /**
     * BlockData: {@link Rotatable}
     */
    WHITE_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    WHITE_BED,
    WHITE_CARPET,
    WHITE_CONCRETE,
    WHITE_CONCRETE_POWDER,
    WHITE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    WHITE_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    WHITE_SHULKER_BOX,
    WHITE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    WHITE_STAINED_GLASS_PANE,
    WHITE_TERRACOTTA,
    WHITE_TULIP,
    /**
     * BlockData: {@link Directional}
     */
    WHITE_WALL_BANNER,
    WHITE_WOOL,
    WITCH_SPAWN_EGG,
    WITHER_ROSE,
    /**
     * BlockData: {@link Rotatable}
     */
    WITHER_SKELETON_SKULL,
    WITHER_SKELETON_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    WITHER_SKELETON_WALL_SKULL,
    WOLF_SPAWN_EGG,
    WOODEN_AXE,
    WOODEN_HOE,
    WOODEN_PICKAXE,
    WOODEN_SHOVEL,
    WOODEN_SWORD,
    WRITABLE_BOOK,
    WRITTEN_BOOK,
    /**
     * BlockData: {@link Rotatable}
     */
    YELLOW_BANNER,
    /**
     * BlockData: {@link Bed}
     */
    YELLOW_BED,
    YELLOW_CARPET,
    YELLOW_CONCRETE,
    YELLOW_CONCRETE_POWDER,
    YELLOW_DYE,
    /**
     * BlockData: {@link Directional}
     */
    YELLOW_GLAZED_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    YELLOW_SHULKER_BOX,
    YELLOW_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    YELLOW_STAINED_GLASS_PANE,
    YELLOW_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    YELLOW_WALL_BANNER,
    YELLOW_WOOL,
    /**
     * BlockData: {@link Rotatable}
     */
    ZOMBIE_HEAD,
    ZOMBIE_HORSE_SPAWN_EGG,
    ZOMBIE_PIGMAN_SPAWN_EGG,
    ZOMBIE_SPAWN_EGG,
    ZOMBIE_VILLAGER_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    ZOMBIE_WALL_HEAD;
	
    private Material material;
	
	public final void setMaterial(Material material) {
		this.material = material;
	}
    
	public Material getMaterial() {
		return material;
	}
	
	public static MaterialWrapper wrap(Material material) {
		if (valueOf(material.toString()) == null) {
			for (MaterialWrapper wrapper : values()) {
				if (material.toString().equalsIgnoreCase(wrapper.toString()) 
						|| wrapper.toString().contains(material.toString())) {
					return wrapper;
				}
			}
			return MaterialWrapper.AIR;
		}
		return valueOf(material.toString());
	}
	
	public static MaterialWrapper wrap(String in) {
		in = in.toUpperCase();
		
		if (valueOf(in) == null) {
			for (MaterialWrapper wrapper : values()) {
				if (in.equalsIgnoreCase(wrapper.toString()) || wrapper.toString().contains(in)) {
					return wrapper;
				}
			}
			return MaterialWrapper.AIR;
		}
		return valueOf(in);
	}
	
	public static MaterialWrapper wrap(Block block) {
		if (block == null) throw new IllegalArgumentException("Block cannot be null!");
		
		Matcher m = Pattern.compile("(type=[A-z])\\w+").matcher(block.toString());
		if (m.find()) {
			return wrap(m.group().replace("type=", ""));
		}
		return null;
	}
	
	public static Material getWrapper(String in) {
		in = in.toUpperCase();
		
		if (valueOf(in) == null) {
			for (MaterialWrapper wrapper : values()) {
				if (in.equalsIgnoreCase(wrapper.toString()) || wrapper.toString().contains(in)) {
					return wrapper.getMaterial();
				}
			}
			return MaterialWrapper.AIR.getMaterial();
		}
		return valueOf(in).getMaterial();
	}
	
	public static Material getWrapper(ItemStack stack) {
		if (stack == null) throw new IllegalArgumentException("Stack cannot be null!");
		String input = stack.toString().replace("ItemStack", "");
		Matcher m = Pattern.compile("([A-Z])\\w+").matcher(input);
		if (m.find()) {
			return getWrapper(m.group());
		}
		return null;
	}
	
	public static Material getWrapper(Block block) {
		if (block == null) throw new IllegalArgumentException("Block cannot be null!");
		
		Matcher m = Pattern.compile("(type=[A-z])\\w+").matcher(block.toString());
		if (m.find()) {
			return getWrapper(m.group().replace("type=", ""));
		}
		return null;
	}
	
	public static MaterialWrapper wrap(ItemStack stack) {
		if (stack == null) throw new IllegalArgumentException("Stack cannot be null!");
		String input = stack.toString().replace("ItemStack", "");
		Matcher m = Pattern.compile("([A-Z])\\w+").matcher(input);
		if (m.find()) {
			return wrap(m.group());
		}
		return null;
	}
    
	/*
	 * Any class implementing this interface should have a public static void setWrapper() method!
	 * This method should set all the MaterialWrapper enum constants Materials.
	 */
	public static interface IMaterialWrapper {
		
		Material getMaterial();
		
		static Iterator<Material> getMaterials() {
			return Arrays.asList(values()).stream()
					.map(MaterialWrapper -> MaterialWrapper.getMaterial())
					.collect(Collectors.toList()).iterator();
		}
		
	}
	
}
