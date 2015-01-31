package com.guillaumedelente.bedrock;

final class Modules {
  static Object[] list(U2020App app) {
    return new Object[] {
        new U2020Module(app),
        new DebugU2020Module()
    };
  }

  private Modules() {
    // No instances.
  }
}
