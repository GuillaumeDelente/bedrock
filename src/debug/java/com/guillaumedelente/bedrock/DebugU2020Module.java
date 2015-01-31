package com.guillaumedelente.bedrock;

import com.guillaumedelente.bedrock.data.DebugDataModule;
import com.guillaumedelente.bedrock.ui.DebugUiModule;
import dagger.Module;

@Module(
    addsTo = U2020Module.class,
    includes = {
        DebugUiModule.class,
        DebugDataModule.class
    },
    overrides = true
)
public final class DebugU2020Module {
}
