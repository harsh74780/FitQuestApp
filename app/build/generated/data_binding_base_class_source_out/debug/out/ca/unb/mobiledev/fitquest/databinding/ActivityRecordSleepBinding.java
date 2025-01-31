// Generated by view binder compiler. Do not edit!
package ca.unb.mobiledev.fitquest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ca.unb.mobiledev.fitquest.R;
import com.github.mikephil.charting.charts.BarChart;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import nl.joery.timerangepicker.TimeRangePicker;

public final class ActivityRecordSleepBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout bedtimeLayout;

  @NonNull
  public final TextView duration;

  @NonNull
  public final TextView durationHour;

  @NonNull
  public final TextView durationHourLabel;

  @NonNull
  public final LinearLayout durationLayout;

  @NonNull
  public final TextView durationMinute;

  @NonNull
  public final TextView endTime;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final Button setTimeBtn;

  @NonNull
  public final BarChart sleepChart;

  @NonNull
  public final TextView startTime;

  @NonNull
  public final LinearLayout timeLayout;

  @NonNull
  public final TimeRangePicker timeRangePicker;

  @NonNull
  public final LinearLayout wakeLayout;

  private ActivityRecordSleepBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout bedtimeLayout, @NonNull TextView duration,
      @NonNull TextView durationHour, @NonNull TextView durationHourLabel,
      @NonNull LinearLayout durationLayout, @NonNull TextView durationMinute,
      @NonNull TextView endTime, @NonNull FrameLayout frameLayout, @NonNull Button setTimeBtn,
      @NonNull BarChart sleepChart, @NonNull TextView startTime, @NonNull LinearLayout timeLayout,
      @NonNull TimeRangePicker timeRangePicker, @NonNull LinearLayout wakeLayout) {
    this.rootView = rootView;
    this.bedtimeLayout = bedtimeLayout;
    this.duration = duration;
    this.durationHour = durationHour;
    this.durationHourLabel = durationHourLabel;
    this.durationLayout = durationLayout;
    this.durationMinute = durationMinute;
    this.endTime = endTime;
    this.frameLayout = frameLayout;
    this.setTimeBtn = setTimeBtn;
    this.sleepChart = sleepChart;
    this.startTime = startTime;
    this.timeLayout = timeLayout;
    this.timeRangePicker = timeRangePicker;
    this.wakeLayout = wakeLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRecordSleepBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRecordSleepBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_record_sleep, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRecordSleepBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bedtime_layout;
      LinearLayout bedtimeLayout = ViewBindings.findChildViewById(rootView, id);
      if (bedtimeLayout == null) {
        break missingId;
      }

      id = R.id.duration;
      TextView duration = ViewBindings.findChildViewById(rootView, id);
      if (duration == null) {
        break missingId;
      }

      id = R.id.duration_hour;
      TextView durationHour = ViewBindings.findChildViewById(rootView, id);
      if (durationHour == null) {
        break missingId;
      }

      id = R.id.duration_hour_label;
      TextView durationHourLabel = ViewBindings.findChildViewById(rootView, id);
      if (durationHourLabel == null) {
        break missingId;
      }

      id = R.id.durationLayout;
      LinearLayout durationLayout = ViewBindings.findChildViewById(rootView, id);
      if (durationLayout == null) {
        break missingId;
      }

      id = R.id.duration_minute;
      TextView durationMinute = ViewBindings.findChildViewById(rootView, id);
      if (durationMinute == null) {
        break missingId;
      }

      id = R.id.end_time;
      TextView endTime = ViewBindings.findChildViewById(rootView, id);
      if (endTime == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.setTimeBtn;
      Button setTimeBtn = ViewBindings.findChildViewById(rootView, id);
      if (setTimeBtn == null) {
        break missingId;
      }

      id = R.id.sleepChart;
      BarChart sleepChart = ViewBindings.findChildViewById(rootView, id);
      if (sleepChart == null) {
        break missingId;
      }

      id = R.id.start_time;
      TextView startTime = ViewBindings.findChildViewById(rootView, id);
      if (startTime == null) {
        break missingId;
      }

      id = R.id.time_layout;
      LinearLayout timeLayout = ViewBindings.findChildViewById(rootView, id);
      if (timeLayout == null) {
        break missingId;
      }

      id = R.id.timeRangePicker;
      TimeRangePicker timeRangePicker = ViewBindings.findChildViewById(rootView, id);
      if (timeRangePicker == null) {
        break missingId;
      }

      id = R.id.wake_layout;
      LinearLayout wakeLayout = ViewBindings.findChildViewById(rootView, id);
      if (wakeLayout == null) {
        break missingId;
      }

      return new ActivityRecordSleepBinding((ConstraintLayout) rootView, bedtimeLayout, duration,
          durationHour, durationHourLabel, durationLayout, durationMinute, endTime, frameLayout,
          setTimeBtn, sleepChart, startTime, timeLayout, timeRangePicker, wakeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
