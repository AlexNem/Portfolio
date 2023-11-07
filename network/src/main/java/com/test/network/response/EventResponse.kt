package com.test.network.response

import kotlinx.serialization.Serializable

class EventResponse : ArrayList<EventResponseItem>()
@Serializable
data class EventResponseItem(
    val date: String,
    val id: String,
    val imageUrl: String,
    val subtitle: String,
    val title: String,
    val videoUrl: String
)