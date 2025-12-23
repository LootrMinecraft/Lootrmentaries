package noobanidus.mods.lootrmentaries.neoforge.gen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import noobanidus.mods.lootrmentaries.neoforge.LootrmentariesRegistry;

public class LootrmentariesLangProvider extends LanguageProvider {

  public LootrmentariesLangProvider(PackOutput output) {
    super(output, noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID, "en_us");
  }

  @Override
  protected void addTranslations() {
    add(LootrmentariesRegistry.URN_BLOCK.get(), "Loot Urn");
  }
}
