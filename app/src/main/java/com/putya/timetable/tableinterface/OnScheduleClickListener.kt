package com.putya.timetable.tableinterface

import com.putya.timetable.model.ScheduleEntity

interface OnScheduleClickListener {
    fun scheduleClicked(entity: ScheduleEntity)
}