package com.voximplant.reactnative;

import android.util.Log;
import javax.annotation.Nullable;
import android.content.Context;
import com.facebook.react.uimanager.*;
import com.facebook.react.uimanager.annotations.ReactProp;

public class VoxImplantViewManager extends SimpleViewManager<VoxImplantRendererView>
{

  public static final String REACT_CLASS = "RCTVoxImplantRendererView";

  @Override public String getName() {
      return REACT_CLASS;
  }

  @Override public VoxImplantRendererView createViewInstance(ThemedReactContext context) {
      return new VoxImplantRendererView(context);
  }

  @ReactProp(name = "preview")
  public void setPreviewStatus(VoxImplantRendererView view, Boolean preview) {
    view.setPreviewStatus(preview);
    view.requestLayout();
  }

  @ReactProp(name = "callId")
  public void setCallId(VoxImplantRendererView view, @Nullable String callId) {
    view.setCallId(callId != null ? callId : "");
  }
}
