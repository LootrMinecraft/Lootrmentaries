package noobanidus.mods.lootrmentaries.neoforge.gen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import noobanidus.mods.lootrmentaries.common.LootrmentariesIds;
import noobanidus.mods.lootrmentaries.neoforge.LootrmentariesRegistry;

public class LootrmentariesBlockstateProvider extends BlockStateProvider {
  public LootrmentariesBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
    super(output, LootrmentariesIds.MODID, exFileHelper);
  }

  @Override
  protected void registerStatesAndModels() {
    this.getVariantBuilder(LootrmentariesRegistry.URN_BLOCK.get()).forAllStates(
        o -> {
          ModelFile model = new ModelFile.UncheckedModelFile(LootrmentariesIds.URN.withPrefix("block/"));
          return new ConfiguredModel[] {
              new ConfiguredModel(model)
          };
        }
    );
  }
}
