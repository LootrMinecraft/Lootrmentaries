package noobanidus.mods.lootrmentaries.common.mixin;

import net.mehvahdjukaar.supplementaries.common.block.blocks.UrnBlock;
import net.mehvahdjukaar.supplementaries.common.block.tiles.UrnBlockTile;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(UrnBlock.class)
public class MixinUrnBlock {
  /**
   * @author Noobanidus
   * @reason This is necessary because otherwise the urn never creates a block entity and Lootr has no way of finding out that it exists. This isn't problematic because it will be automatically replaced (in theory) by Lootr's block entity ticker.
   */
  @Overwrite
  @Nullable
  public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
    return new UrnBlockTile(pPos, pState);
  }
}
