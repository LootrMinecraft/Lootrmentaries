package noobanidus.mods.lootrmentaries.common.block.entity;

import net.mehvahdjukaar.moonlight.api.block.ItemDisplayTile;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class LootrUrnBlockEntity extends ItemDisplayTile {
  public static Supplier<BlockEntityType<LootrUrnBlockEntity>> type;

  public LootrUrnBlockEntity(BlockPos pos, BlockState state) {
    super(type.get(), pos, state);
  }
}
