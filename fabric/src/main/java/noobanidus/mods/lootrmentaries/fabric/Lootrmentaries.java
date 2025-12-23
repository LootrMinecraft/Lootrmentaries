package noobanidus.mods.lootrmentaries.fabric;

import net.fabricmc.api.ModInitializer;

public class Lootrmentaries implements ModInitializer {
  @Override
  public void onInitialize() {
    LootrmentariesRegistry.register();
  }
}
