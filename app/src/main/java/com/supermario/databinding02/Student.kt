package com.supermario.databinding02

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class Student{
    var name= ObservableField<String>()
    var age= ObservableInt()
    var imageUrl = ObservableField<String>()
}
