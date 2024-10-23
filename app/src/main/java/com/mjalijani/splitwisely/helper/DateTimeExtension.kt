package com.mjalijani.splitwisely.helper

import android.os.Build
import saman.zamani.persiandate.PersianDate
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

fun Long.getDateTime(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    val date = Date(this * 1000)
    return sdf.format(date)
}

fun Int.getSolarMonthName() = when (this) {
    1 -> "فرودین"
    2 -> "اردیبهشت"
    3 -> "خرداد"
    4 -> "تیر"
    5 -> "مرداد"
    6 -> "شهریور"
    7 -> "مهر"
    8 -> "آبان"
    9 -> "آذر"
    10 -> "دی"
    11 -> "بهمن"
    else -> "اسفند"
}

fun convertUtcToGregorian(utc: String): List<Int> {
    return if (utc.isNotEmpty()) {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)
        var formattedDate = ""
        val date: MutableList<Int> = ArrayList()
        trying {
            val convertedDate = dateFormat.parse(utc.replace("T", " "))
            formattedDate = SimpleDateFormat("yyyy,MM,dd", Locale.US).format(convertedDate!!)
        }
        val values = formattedDate.split(",")
        for (value in values) {
            date.add(value.toInt())
        }
        date
    } else emptyList()
}

fun String.getDate(): String {
    var date = "-"
    trying {
        if (this.isNotEmpty()) {
            val grogDate = convertUtcToGregorian(this)
            if (grogDate.isNotEmpty()) {
                val persianDate = PersianDate()
                val jalali = persianDate.gregorian_to_jalali(grogDate[0], grogDate[1], grogDate[2])

                // Format month and day with two digits
                val formattedMonth = String.format("%02d", jalali[1])
                val formattedDay = String.format("%02d", jalali[2])

                date = "${jalali[0]}-$formattedMonth-$formattedDay"
            }
        }
    }
    return date
}

fun String.getDay(): Int {
    val jalali = this.getDate()
    return Integer.parseInt(jalali.split("-")[2])
}

fun String.getMonth(): Int {
    val jalali = this.getDate()
    return Integer.parseInt(jalali.split("-")[1])
}

fun String.getYear(): Int {
    val jalali = this.getDate()
    return Integer.parseInt(jalali.split("-")[0])

}

fun String.getDayName(): String {
    return if (this.isNull()) ""
    else {
        val grogDate = convertUtcToGregorian(this)
        val persianDate = PersianDate()
        val jalali = persianDate.gregorian_to_jalali(grogDate[0], grogDate[1], grogDate[2])
        persianDate.shYear = jalali[0]
        persianDate.shMonth = jalali[1]
        persianDate.shDay = jalali[2]
        persianDate.dayName()
    }
}

fun String.getMonthName(): String {
    return if (this.isNull()) ""
    else {
        val grogDate = convertUtcToGregorian(this)
        val persianDate = PersianDate()
        val jalali = persianDate.gregorian_to_jalali(grogDate[0], grogDate[1], grogDate[2])
        persianDate.shMonth = jalali[1]
        persianDate.monthName()
    }
}

fun String.getTime(): String {
    return if (this.isNull()) ""
    else
        this.split("T")[1].replaceRange(5..7, "")
}

fun String.getFormattedPersianDateTime(): String {
    return if (this.contains("T"))
        this.getDate() + " " + this.getTime()
    else
        "نامشخص"
}

fun getToday(): String {

    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val currentDateTime = LocalDateTime.now()
        // Define the desired format
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        currentDateTime.format(formatter)
    } else {
        val currentDate = Date()
        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        formatter.format(currentDate)
    }


}
