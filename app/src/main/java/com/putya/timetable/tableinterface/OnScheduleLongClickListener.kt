package com.putya.timetable.tableinterface

import com.putya.timetable.model.ScheduleEntity

interface OnScheduleLongClickListener {
    fun scheduleLongClicked(entity: ScheduleEntity)
}