// Generated code from Butter Knife. Do not modify!
package com.khilman.basicstarterpack.Activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.khilman.basicstarterpack.R;
import com.wang.avi.AVLoadingIndicatorView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RadioActivity_ViewBinding implements Unbinder {
  private RadioActivity target;

  private View view2131624063;

  private View view2131624064;

  @UiThread
  public RadioActivity_ViewBinding(RadioActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RadioActivity_ViewBinding(final RadioActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btnPlay, "field 'btnPlay' and method 'onBtnPlayClicked'");
    target.btnPlay = Utils.castView(view, R.id.btnPlay, "field 'btnPlay'", Button.class);
    view2131624063 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBtnPlayClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnStop, "field 'btnStop' and method 'onBtnStopClicked'");
    target.btnStop = Utils.castView(view, R.id.btnStop, "field 'btnStop'", Button.class);
    view2131624064 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBtnStopClicked();
      }
    });
    target.loader = Utils.findRequiredViewAsType(source, R.id.loader, "field 'loader'", AVLoadingIndicatorView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RadioActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnPlay = null;
    target.btnStop = null;
    target.loader = null;

    view2131624063.setOnClickListener(null);
    view2131624063 = null;
    view2131624064.setOnClickListener(null);
    view2131624064 = null;
  }
}
