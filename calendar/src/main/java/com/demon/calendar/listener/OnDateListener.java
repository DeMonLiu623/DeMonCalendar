package com.demon.calendar.listener;

import com.demon.calendar.model.CalendarDate;

/**
 * @author DeMon
 * @date 2018/10/29
 * @description
 */
public interface OnDateListener {
    void onSelectDate(CalendarDate date);
    void onPageDateChange(CalendarDate date);
}
