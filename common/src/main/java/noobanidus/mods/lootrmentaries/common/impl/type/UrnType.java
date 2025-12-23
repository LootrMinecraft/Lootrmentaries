package noobanidus.mods.lootrmentaries.common.impl.type;

import com.google.auto.service.AutoService;
import net.mehvahdjukaar.supplementaries.common.block.blocks.UrnBlock;
import net.mehvahdjukaar.supplementaries.reg.ModRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import noobanidus.mods.lootr.common.api.ILootrType;
import noobanidus.mods.lootrmentaries.common.LootrmentariesIds;
import org.jetbrains.annotations.Nullable;

@AutoService(ILootrType.class)
public class UrnType implements ILootrType {
  public static UrnType type;

  @Override
  public String getName() {
    return LootrmentariesIds.URN.getPath();
  }

  @Override
  public @Nullable Block getReplacementBlock() {
    return ModRegistry.URN.get();
  }

  @Override
  public @Nullable EntityType<?> getReplacementEntity() {
    return null;
  }

  @Override
  public void callback() {
    type = this;
  }
}
