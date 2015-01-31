package com.guillaumedelente.bedrock.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.guillaumedelente.bedrock.R;
import com.guillaumedelente.bedrock.U2020App;

import javax.inject.Inject;

public class MainActivity extends Activity {
  @Inject AppContainer appContainer;

  private ViewGroup container;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    U2020App app = U2020App.get(this);
    app.inject(this);

    container = appContainer.get(this);

    getLayoutInflater().inflate(R.layout.main_layout, container);
  }
}
