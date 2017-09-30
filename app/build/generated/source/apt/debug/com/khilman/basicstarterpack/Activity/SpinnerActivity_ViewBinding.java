// Generated code from Butter Knife. Do not modify!
package com.khilman.basicstarterpack.Activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.khilman.basicstarterpack.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SpinnerActivity_ViewBinding implements Unbinder {
  private SpinnerActivity target;

  private View view2131624067;

  @UiThread
  public SpinnerActivity_ViewBinding(SpinnerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SpinnerActivity_ViewBinding(final SpinnerActivity target, View source) {
    this.target = target;

    View view;
    target.spinner = Utils.findRequiredViewAsType(source, R.id.spinner, "field 'spinner'", Spinner.class);
    target.txtbuah = Utils.findRequiredViewAsType(source, R.id.txtbuah, "field 'txtbuah'", TextView.class);
    view = Utils.findRequiredView(source, R.id.gambar, "field 'gambar' and method 'onViewClicked'");
    target.gambar = Utils.castView(view, R.id.gambar, "field 'gambar'", ImageView.class);
    view2131624067 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SpinnerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinner = null;
    target.txtbuah = null;
    target.gambar = null;

    view2131624067.setOnClickListener(null);
    view2131624067 = null;
  }
}
