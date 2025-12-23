package noobanidus.mods.lootrmentaries.fabric.impl;

import com.google.auto.service.AutoService;
import noobanidus.mods.lootr.common.api.client.ILootrFabricModelProvider;

@AutoService(ILootrFabricModelProvider.class)
public class UrnModelProvider implements ILootrFabricModelProvider {
  @Override
  public void provideModels(Acceptor acceptor) {
    acceptor.acceptBarrelModel();
  }
}
