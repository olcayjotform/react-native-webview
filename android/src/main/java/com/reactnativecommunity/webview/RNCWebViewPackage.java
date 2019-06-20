
package com.reactnativecommunity.jotformwebview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;

public class RNCJotFormWebViewPackage implements ReactPackage {

    private RNCJotFormWebViewManager manager;
    private RNCJotFormWebViewModule module;

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      List<NativeModule> modulesList = new ArrayList<>();
      module = new RNCJotFormWebViewModule(reactContext);
      module.setPackage(this);
      modulesList.add(module);
      return modulesList;
    }

    // Deprecated from RN 0.47
    public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      manager = new RNCJotFormWebViewManager();
      manager.setPackage(this);
      return Arrays.<ViewManager>asList(manager);
    }

    public RNCJotFormWebViewModule getModule() {
      return module;
    }
}
