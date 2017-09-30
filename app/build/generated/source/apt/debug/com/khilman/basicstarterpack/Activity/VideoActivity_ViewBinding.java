// Generated code from Butter Knife. Do not modify!
package com.khilman.basicstarterpack.Activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.VideoView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.khilman.basicstarterpack.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VideoActivity_ViewBinding implements Unbinder {
  private VideoActivity target;

  @UiThread
  public VideoActivity_ViewBinding(VideoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VideoActivity_ViewBinding(VideoActivity target, View source) {
    this.target = target;

    target.videPlayer = Utils.findRequiredViewAsType(source, R.id.videPlayer, "field 'videPlayer'", VideoView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VideoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.videPlayer = null;
  }
}
