// Generated by view binder compiler. Do not edit!
package com.project.engg.movieticketbooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.project.engg.movieticketbooking.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMtbViewMoviesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final HorizontalScrollView hsv;

  @NonNull
  public final ScrollView sv;

  @NonNull
  public final TableLayout tablelayout;

  private ActivityMtbViewMoviesBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout2, @NonNull HorizontalScrollView hsv,
      @NonNull ScrollView sv, @NonNull TableLayout tablelayout) {
    this.rootView = rootView;
    this.constraintLayout2 = constraintLayout2;
    this.hsv = hsv;
    this.sv = sv;
    this.tablelayout = tablelayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMtbViewMoviesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMtbViewMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_mtb_view_movies, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMtbViewMoviesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      id = R.id.hsv;
      HorizontalScrollView hsv = ViewBindings.findChildViewById(rootView, id);
      if (hsv == null) {
        break missingId;
      }

      id = R.id.sv;
      ScrollView sv = ViewBindings.findChildViewById(rootView, id);
      if (sv == null) {
        break missingId;
      }

      id = R.id.tablelayout;
      TableLayout tablelayout = ViewBindings.findChildViewById(rootView, id);
      if (tablelayout == null) {
        break missingId;
      }

      return new ActivityMtbViewMoviesBinding((ConstraintLayout) rootView, constraintLayout2, hsv,
          sv, tablelayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
