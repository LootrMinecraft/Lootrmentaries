package noobanidus.mods.lootrmentaries.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import noobanidus.mods.lootr.common.api.LootrTags;

public class LootrmentariesTags {
  public static final TagKey<Block> CONVERT_URN = TagKey.create(Registries.BLOCK, LootrmentariesIds.rl("convert/urns"));

  public static final TagKey<Block> URNS = TagKey.create(Registries.BLOCK, LootrmentariesIds.rl("urns"));
}
