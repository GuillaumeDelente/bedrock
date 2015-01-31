package com.guillaumedelente.bedrock;

import com.guillaumedelente.bedrock.U2020App;
import com.guillaumedelente.bedrock.U2020Module;

final class Modules {
  static Object[] list(U2020App app) {
    return new Object[] {
        new U2020Module(app)
    };
  }

  private Modules() {
    // No instances.
  }
}
