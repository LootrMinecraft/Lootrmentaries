package noobanidus.mods.lootrmentaries.neoforge;

import com.google.common.base.Suppliers;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import noobanidus.mods.lootrmentaries.common.LootrmentariesIds;
import noobanidus.mods.lootrmentaries.common.block.LootrUrnBlock;
import noobanidus.mods.lootrmentaries.common.block.entity.LootrUrnBlockEntity;

public class LootrmentariesRegistry {
  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID);
  private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID);
  private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID);

  public static final DeferredHolder<Block, LootrUrnBlock> URN_BLOCK = BLOCKS.register(LootrmentariesIds.URN.getPath(), () -> new LootrUrnBlock(LootrmentariesIds.URN_PROPERTIES));
  public static final DeferredHolder<Item, BlockItem> URN_ITEM = ITEMS.register(LootrmentariesIds.URN.getPath(), () -> new BlockItem(URN_BLOCK.get(), new Item.Properties()));
  public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LootrUrnBlockEntity>> URN_BLOCK_ENTITY = BLOCK_ENTITIES.register(LootrmentariesIds.URN.getPath(),
      () -> BlockEntityType.Builder.of(LootrUrnBlockEntity::new, URN_BLOCK.get()).build(null));

  public static void register(IEventBus modBus) {
    BLOCKS.register(modBus);
    ITEMS.register(modBus);
    BLOCK_ENTITIES.register(modBus);
    LootrUrnBlock.type = Suppliers.memoize(URN_BLOCK::get);
    LootrUrnBlockEntity.type = Suppliers.memoize(URN_BLOCK_ENTITY::get);
  }
}
