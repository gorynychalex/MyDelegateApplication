package ru.popovichab.myapplication

class Example {
    var delegate = TrimDelegate()
    var param: String
        get() = delegate.getValue(this, ::param)
        set(value) {
            delegate.setValue(this, ::param, value)
        }
}

fun main(){
    var example = Example()
    example.param = ""
}