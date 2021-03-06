package com.graduate.a2020_graduateproject.bindingAdapter;


import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.graduate.a2020_graduateproject.Schedule;
import com.graduate.a2020_graduateproject.utils.DateFormat;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class bindingAdapter {


    @BindingAdapter({"setCalendarHeaderText"})
    public static void setCalendarHeaderText(TextView view, Long date) {
        try {
            if (date != null) {
                view.setText(DateFormat.getDate(date, DateFormat.CALENDAR_HEADER_FORMAT));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @BindingAdapter({"setDayText"})
    public static void setDayText(TextView view, Calendar calendar) {
        try {
            if (calendar != null) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
                view.setText(DateFormat.getDate(gregorianCalendar.getTimeInMillis(), DateFormat.DAY_FORMAT));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @BindingAdapter({"setScheduleDayText"})
    public static void setScheduleDayText(TextView view, Schedule schedule) {
        try {
            if (schedule != null) {


                view.setText(schedule.getDay());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
