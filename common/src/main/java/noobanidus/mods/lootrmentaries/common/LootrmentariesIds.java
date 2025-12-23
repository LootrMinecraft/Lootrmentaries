package noobanidus.mods.lootrmentaries.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.storage.loot.LootTable;

public class LootrmentariesIds {
  public static final String MODID = "lootrmentaries";

  public static ResourceLocation rl(String path) {
    return ResourceLocation.fromNamespaceAndPath(MODID, path);
  }

  public static ResourceLocation srl(String path) {
    return ResourceLocation.fromNamespaceAndPath("supplementaries", path);
  }

  public static final ResourceLocation URN = rl("urn");
  public static final ResourceKey<LootTable> URN_LOOT = ResourceKey.create(Registries.LOOT_TABLE, srl("loot/urn_loot/urn_loot"));

  public static final BlockBehaviour.Properties URN_PROPERTIES = BlockBehaviour.Properties.of()
      .mapColor(MapColor.TERRACOTTA_BROWN)
      .sound(SoundType.DECORATED_POT_CRACKED)
      .strength(2.5f);
}
