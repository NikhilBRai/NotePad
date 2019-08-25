package com.sxbot.myapplication

import java.util.Date

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
class Note {
    @Id
     var id: Long = 0

     var text: String? = null

     var createdAt: Date? = null

}
