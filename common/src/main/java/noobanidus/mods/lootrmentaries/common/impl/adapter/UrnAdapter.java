package noobanidus.mods.lootrmentaries.common.impl.adapter;

import com.google.auto.service.AutoService;
import net.mehvahdjukaar.supplementaries.common.block.blocks.UrnBlock;
import net.mehvahdjukaar.supplementaries.common.block.tiles.UrnBlockTile;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;
import noobanidus.mods.lootr.common.api.adapter.ILootrDataAdapter;
import noobanidus.mods.lootrmentaries.common.LootrmentariesIds;
import org.jetbrains.annotations.Nullable;

@AutoService(ILootrDataAdapter.class)
public class UrnAdapter implements ILootrDataAdapter<UrnBlockTile> {
  @Override
  public Class<UrnBlockTile> getAssignableClass() {
    return UrnBlockTile.class;
  }

  @Override
  public @Nullable ResourceKey<LootTable> getLootTable(UrnBlockTile entity) {
    if (entity.getBlockState().getValue(UrnBlock.TREASURE)) {
      return LootrmentariesIds.URN_LOOT;
    }
    return entity.getLootTable();
  }

  @Override
  public long getLootSeed(UrnBlockTile entity) {
    if (entity.getBlockState().getValue(UrnBlock.TREASURE)) {
      return entity.getLevel().getRandom().nextLong();
    }
    return entity.getLootTableSeed();
  }

  @Override
  public void setLootTable(UrnBlockTile entity, ResourceKey<LootTable> table, long seed) {
    if (!entity.getBlockState().getValue(UrnBlock.TREASURE)) {
      entity.setLootTable(table, seed);
    }
  }
}
