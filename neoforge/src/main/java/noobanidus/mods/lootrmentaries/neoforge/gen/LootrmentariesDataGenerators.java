package noobanidus.mods.lootrmentaries.neoforge.gen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import noobanidus.mods.lootr.neoforge.gen.*;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid= noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID)
public class LootrmentariesDataGenerators {
  @SubscribeEvent
  public static void gatherData (GatherDataEvent event) {
    DataGenerator generator = event.getGenerator();
    PackOutput output = event.getGenerator().getPackOutput();
    CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
    ExistingFileHelper helper = event.getExistingFileHelper();

    LootrmentariesBlockTagProvider blocks;
    generator.addProvider(event.includeServer(), blocks = new LootrmentariesBlockTagProvider(output, provider, helper));
    generator.addProvider(event.includeServer(), new LootrmentariesItemTagProvider(output, provider, blocks.contentsGetter(), helper));
    generator.addProvider(event.includeClient(), new LootrmentariesAtlasGenerator(output, provider, helper));
    generator.addProvider(event.includeClient(), new LootrmentariesLangProvider(output));
  }
}
