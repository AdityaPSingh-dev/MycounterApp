package eu.tutorials.mycounterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private val _repository : CounterRepository= CounterRepository()
    //_ used to specify that our variable is private
    private val _count = mutableStateOf(_repository.getCounter().count)

    // Expose the count as an immutable state from outside
    val count: MutableState<Int> = _count
    fun increment() {
        _repository.incrementCounter()
        _count.value= _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrementCounter()
        _count.value= _repository.getCounter().count
    }

}