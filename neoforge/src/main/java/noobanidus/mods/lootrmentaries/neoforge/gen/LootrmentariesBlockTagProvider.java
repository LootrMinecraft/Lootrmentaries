package noobanidus.mods.lootrmentaries.neoforge.gen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class LootrmentariesBlockTagProvider extends BlockTagsProvider {
  public LootrmentariesBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
    super(output, lookupProvider, noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID, existingFileHelper);
  }

  @Override
  protected void addTags(HolderLookup.Provider arg) {
  }
}
