// Generated code from Butter Knife. Do not modify!
package com.khilman.basicstarterpack.Activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.khilman.basicstarterpack.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GaleriActivity_ViewBinding implements Unbinder {
  private GaleriActivity target;

  @UiThread
  public GaleriActivity_ViewBinding(GaleriActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GaleriActivity_ViewBinding(GaleriActivity target, View source) {
    this.target = target;

    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'viewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GaleriActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.viewPager = null;
  }
}
