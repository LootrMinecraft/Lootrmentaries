package noobanidus.mods.lootrmentaries.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(noobanidus.mods.lootrmentaries.common.LootrmentariesIds.MODID)
public class Lootrmentaries {
  public Lootrmentaries(ModContainer container, IEventBus modBus) {
    LootrmentariesRegistry.register(modBus);
  }
}
