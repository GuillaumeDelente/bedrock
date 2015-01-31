package com.guillaumedelente.bedrock;

import android.app.Application;

import com.guillaumedelente.bedrock.data.DataModule;
import com.guillaumedelente.bedrock.ui.UiModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
    includes = {
        UiModule.class,
        DataModule.class
    },
    injects = {
        U2020App.class
    }
)
public final class U2020Module {
  private final U2020App app;

  public U2020Module(U2020App app) {
    this.app = app;
  }

  @Provides @Singleton Application provideApplication() {
    return app;
  }
}
