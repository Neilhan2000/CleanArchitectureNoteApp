package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.utils.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.utils.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase(
    private val repository: NoteRepository
) {

    operator fun invoke(
        orderType: OrderType = OrderType.Date(NoteOrder.Descending)
    ): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when(orderType.noteOrder) {
                is NoteOrder.Descending -> {
                    when(orderType) {
                        is OrderType.Title -> notes.sortedByDescending { it.title }
                        is OrderType.Date -> notes.sortedByDescending { it.timeStamp }
                        is OrderType.Color -> notes.sortedByDescending { it.color }
                    }
                }
                is NoteOrder.Ascending -> {
                    when(orderType) {
                        is OrderType.Title -> notes.sortedBy { it.title }
                        is OrderType.Date -> notes.sortedBy { it.timeStamp }
                        is OrderType.Color -> notes.sortedBy { it.color }
                    }
                }
            }
        }
    }
}