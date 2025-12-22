package noobanidus.mods.lootrmentaries.common;

import net.minecraft.resources.ResourceLocation;

public class LootrmentariesIds {
  public static final String MODID = "lootrmentaries";

  public static ResourceLocation rl (String path) {
    return ResourceLocation.fromNamespaceAndPath(MODID, path);
  }

  public static ResourceLocation srl (String path) {
    return ResourceLocation.fromNamespaceAndPath("supplementaries", path);
  }

  public static final ResourceLocation GILDED_CHEST = rl("urn");
}
