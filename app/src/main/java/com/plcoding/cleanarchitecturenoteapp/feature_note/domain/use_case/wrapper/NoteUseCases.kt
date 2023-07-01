package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.wrapper

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.DeleteNotesUseCase
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.GetNotesUseCase

data class NoteUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNotesUseCase: DeleteNotesUseCase
)
