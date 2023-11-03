package com.test.dazn.event.domain

data class EventDomain(
    val name: String,
    val league: String,
    val date: String
) {

    companion object {
        val mockList = listOf<EventDomain>(
            EventDomain("name1", "league1", "data1"),
            EventDomain("name1", "league1", "data1"),
            EventDomain("name1", "league1", "data1"),
            EventDomain("name1", "league1", "data1"),
            EventDomain("name1", "league1", "data1"),
            EventDomain("name1", "league1", "data1"),
            EventDomain("name1", "league1", "data1"),
            EventDomain("name1", "league1", "data1"),
            EventDomain("name1", "league1", "data1"),
            EventDomain("name1", "league1", "data1"),
        )
    }
}