package noobanidus.mods.lootrmentaries.neoforge.gen;

import net.mehvahdjukaar.supplementaries.reg.ModRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import noobanidus.mods.lootr.common.api.LootrTags;
import noobanidus.mods.lootrmentaries.common.LootrmentariesTags;
import noobanidus.mods.lootrmentaries.common.block.LootrUrnBlock;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class LootrmentariesBlockTagProvider extends BlockTagsProvider {
  public LootrmentariesBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
    super(output, lookupProvider, noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID, existingFileHelper);
  }

  @Override
  protected void addTags(HolderLookup.Provider arg) {
    tag(LootrmentariesTags.CONVERT_URN).add(ModRegistry.URN.get());
    tag(LootrmentariesTags.URNS).add(LootrUrnBlock.type.get());
    tag(LootrTags.Blocks.CONVERT_BLOCK).addTag(LootrmentariesTags.CONVERT_URN);
    tag(LootrTags.Blocks.CONTAINERS).addTag(LootrmentariesTags.URNS);
  }
}
