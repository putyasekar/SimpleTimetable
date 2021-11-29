package com.putya.timetable.tableinterface

interface OnTimeCellClickListener {
    fun timeCellClicked(scheduleDay: Int, time: Int)
}