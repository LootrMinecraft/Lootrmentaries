package noobanidus.mods.lootrmentaries.common.impl.replacement;

import com.google.auto.service.AutoService;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import noobanidus.mods.lootr.common.api.replacement.ILootrBlockReplacementProvider;
import noobanidus.mods.lootrmentaries.common.LootrmentariesTags;
import noobanidus.mods.lootrmentaries.common.block.LootrUrnBlock;

@AutoService(ILootrBlockReplacementProvider.class)
public class UrnReplacementProvider implements ILootrBlockReplacementProvider {
  @Override
  public TagKey<Block> getApplicableTag() {
    return LootrmentariesTags.CONVERT_URN;
  }

  @Override
  public Block getBlock() {
    return LootrUrnBlock.type.get();
  }
}
