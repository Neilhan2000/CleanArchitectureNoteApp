package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.wrapper

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.DeleteNotesUseCase
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.GetNotesUseCase

/**
 *
 * This class contains different use case about note.
 * Each of them will be the business logic implementation of certain functionality.
 */
data class NoteUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNotesUseCase: DeleteNotesUseCase
)
