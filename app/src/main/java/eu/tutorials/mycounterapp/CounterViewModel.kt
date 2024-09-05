package eu.tutorials.mycounterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    //_ used to specify that our variable is private
    private val _count = mutableStateOf(0)

    // Expose the count as an immutable state from outside
    val count: MutableState<Int> = _count
    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }

}