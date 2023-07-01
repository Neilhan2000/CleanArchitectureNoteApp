package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.utils

sealed class OrderType(val noteOrder: NoteOrder) {

    class Title(noteOrder: NoteOrder) : OrderType(noteOrder)
    class Date(noteOrder: NoteOrder) : OrderType(noteOrder)
    class Color(noteOrder: NoteOrder) : OrderType(noteOrder)
}
