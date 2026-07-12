package noobanidus.mods.lootrmentaries.common.block.entity;

import com.google.auto.service.AutoService;
import net.mehvahdjukaar.moonlight.api.block.ItemDisplayTile;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootTable;
import noobanidus.mods.lootr.common.api.ILootrBlockEntityConverter;
import noobanidus.mods.lootr.common.api.ILootrType;
import noobanidus.mods.lootr.common.api.data.LootrBlockType;
import noobanidus.mods.lootr.common.api.data.SimpleLootrInstance;
import noobanidus.mods.lootr.common.api.data.blockentity.ILootrBlockEntity;
import noobanidus.mods.lootrmentaries.common.impl.type.UrnType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.UUID;
import java.util.function.Supplier;

public class LootrUrnBlockEntity extends ItemDisplayTile implements ILootrBlockEntity {
  private final SimpleLootrInstance instance = new SimpleLootrInstance(this::getVisualOpeners, 1);

  public static Supplier<BlockEntityType<LootrUrnBlockEntity>> type;

  public LootrUrnBlockEntity(BlockPos pos, BlockState state) {
    super(type.get(), pos, state);
  }

  @Override
  public void saveAdditional(CompoundTag compound, HolderLookup.Provider registries) {
    super.saveAdditional(compound, registries);
    instance.saveAdditional(compound, registries, getLevel() != null && getLevel().isClientSide());
  }

  @Override
  protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
    super.loadAdditional(tag, registries);
    instance.loadAdditional(tag, registries);
  }

  @Override
  public void saveToItem(ItemStack itemStack, HolderLookup.Provider provider) {
    instance.setSavingToItem(true);
    super.saveToItem(itemStack, provider);
    instance.setSavingToItem(false);
  }

  @Override
  public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
    var result = super.getUpdateTag(registries);
    instance.saveAdditional(result, registries, getLevel() != null && getLevel().isClientSide());
    return result;
  }

  @Override
  public void unpackLootTable(@Nullable Player player) {
    // NO-OP
  }

  @Override
  public @Nullable Set<UUID> getClientOpeners() {
    return instance.getClientOpeners();
  }

  @Override
  public boolean isClientOpened() {
    return instance.isClientOpened();
  }

  @Override
  public void setClientOpened(boolean opened) {
    instance.setClientOpened(opened);
  }

  @Override
  public void markChanged() {
    this.setChanged();
    markDataChanged();
  }

  @Override
  @Deprecated
  public LootrBlockType getInfoBlockType() {
    return null;
  }

  @Override
  public ILootrType getInfoNewType() {
    return UrnType.type;
  }

  @Override
  public @NotNull UUID getInfoUUID() {
    return instance.getInfoUUID();
  }

  @Override
  public String getInfoKey() {
    return instance.getInfoKey();
  }

  @Override
  public boolean hasBeenOpened() {
    return instance.hasBeenOpened();
  }

  @Override
  public boolean isPhysicallyOpen() {
    return false;
  }

  @Override
  public @NotNull BlockPos getInfoPos() {
    return getBlockPos();
  }

  @Override
  public @Nullable Component getInfoDisplayName() {
    return null;
  }

  @Override
  public @NotNull ResourceKey<Level> getInfoDimension() {
    return getLevel().dimension();
  }

  @Override
  public int getInfoContainerSize() {
    return 1;
  }

  @Override
  public @Nullable NonNullList<ItemStack> getInfoReferenceInventory() {
    return null;
  }

  @Override
  public boolean isInfoReferenceInventory() {
    return false;
  }

  @Override
  public @Nullable ResourceKey<LootTable> getInfoLootTable() {
    return lootTable;
  }

  @Override
  public long getInfoLootSeed() {
    return lootTableSeed;
  }

  @AutoService(ILootrBlockEntityConverter.class)
  public static class DefaultBlockEntityConverter implements ILootrBlockEntityConverter<LootrUrnBlockEntity> {

    @Override
    public ILootrBlockEntity apply(LootrUrnBlockEntity blockEntity) {
      return blockEntity;
    }

    @Override
    public BlockEntityType<?> getBlockEntityType() {
      return type.get();
    }
  }
}
