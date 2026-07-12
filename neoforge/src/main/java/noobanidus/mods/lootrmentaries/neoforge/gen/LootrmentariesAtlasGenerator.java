package noobanidus.mods.lootrmentaries.neoforge.gen;

import net.minecraft.client.renderer.texture.atlas.sources.SingleFile;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SpriteSourceProvider;

import java.util.concurrent.CompletableFuture;

public class LootrmentariesAtlasGenerator extends SpriteSourceProvider {
  public LootrmentariesAtlasGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper helper) {
    super(output, provider, noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID, helper);
  }

  @Override
  protected void gather() {
  }
}
