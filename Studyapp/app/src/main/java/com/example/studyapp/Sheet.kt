package com.example.studyapp

var sheetList = mutableListOf<Sheet>()
val SHEET_ID_EXTRA= "sheetExtra"

class Sheet(
    var cover: Int,
    var title: String,
    var description: String,
    val id: Int? = sheetList.size
)