package noobanidus.mods.lootrmentaries.fabric;

import com.google.common.base.Suppliers;
import net.mehvahdjukaar.supplementaries.common.block.blocks.UrnBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.entity.BlockEntityType;
import noobanidus.mods.lootrmentaries.common.LootrmentariesIds;
import noobanidus.mods.lootrmentaries.common.block.LootrUrnBlock;
import noobanidus.mods.lootrmentaries.common.block.entity.LootrUrnBlockEntity;

public class LootrmentariesRegistry {
  public static final LootrUrnBlock URN = new LootrUrnBlock(LootrmentariesIds.URN_PROPERTIES);
  public static final BlockItem URN_ITEM = new BlockItem(URN, new BlockItem.Properties());
  public static final BlockEntityType<LootrUrnBlockEntity> URN_BLOCK_ENTITY = BlockEntityType.Builder
          .of(LootrUrnBlockEntity::new, URN)
          .build(null);

  public static void register() {
    Registry.register(BuiltInRegistries.BLOCK, LootrmentariesIds.URN, URN);
    Registry.register(BuiltInRegistries.ITEM, LootrmentariesIds.URN, URN_ITEM);
    Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, LootrmentariesIds.URN, URN_BLOCK_ENTITY);

    LootrUrnBlock.type = Suppliers.memoize(() -> URN);
    LootrUrnBlockEntity.type = Suppliers.memoize(() -> URN_BLOCK_ENTITY);
  }
}
