package com.test.dazn.event.domain

data class EventData(
    val name: String,
    val league: String,
    val date: String
) {

    companion object {
        val mockList = listOf<EventData>(
            EventData("name1", "league1", "data1"),
            EventData("name1", "league1", "data1"),
            EventData("name1", "league1", "data1"),
            EventData("name1", "league1", "data1"),
            EventData("name1", "league1", "data1"),
            EventData("name1", "league1", "data1"),
            EventData("name1", "league1", "data1"),
            EventData("name1", "league1", "data1"),
            EventData("name1", "league1", "data1"),
            EventData("name1", "league1", "data1"),
        )
    }
}