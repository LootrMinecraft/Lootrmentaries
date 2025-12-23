package noobanidus.mods.lootrmentaries.neoforge.gen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import noobanidus.mods.lootr.common.api.LootrTags;
import noobanidus.mods.lootrmentaries.neoforge.LootrmentariesRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class LootrmentariesItemTagProvider extends ItemTagsProvider {
  public LootrmentariesItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockLookup, @Nullable ExistingFileHelper fileHelper) {
    super(output, provider, blockLookup, noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID, fileHelper);
  }

  @Override
  protected void addTags(HolderLookup.Provider arg) {
    tag(LootrTags.Items.CONTAINERS).add(LootrmentariesRegistry.URN_ITEM.get());
  }
}
