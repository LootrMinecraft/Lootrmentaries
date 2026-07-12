package noobanidus.mods.lootrmentaries.common.block;

import net.mehvahdjukaar.supplementaries.common.block.blocks.UrnBlock;
import net.mehvahdjukaar.supplementaries.common.block.tiles.UrnBlockTile;
import net.mehvahdjukaar.supplementaries.common.entities.FallingUrnEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import noobanidus.mods.lootrmentaries.common.block.entity.LootrUrnBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class LootrUrnBlock extends UrnBlock {
  public static Supplier<LootrUrnBlock> type;

  public LootrUrnBlock(Properties properties) {
    super(properties);
  }


  @Override
  public void tick(BlockState state, ServerLevel pLevel, BlockPos pos, RandomSource pRand) {
    if (isFree(pLevel.getBlockState(pos.below())) && pos.getY() >= pLevel.getMinBuildHeight()) {
      FallingBlockEntity fallingblockentity = FallingUrnEntity.fall(pLevel, pos, state);

      if (pLevel.getBlockEntity(pos) instanceof LootrUrnBlockEntity tile) {
        fallingblockentity.blockData = tile.saveWithoutMetadata(pLevel.registryAccess());
      }

      this.falling(fallingblockentity);
    }
  }

  @Override
  public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
    return new LootrUrnBlockEntity(pPos, pState);
  }
}
