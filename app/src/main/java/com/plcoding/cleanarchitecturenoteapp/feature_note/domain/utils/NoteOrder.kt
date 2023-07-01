package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.utils

sealed class NoteOrder {

    object Ascending : NoteOrder()
    object Descending: NoteOrder()
}
