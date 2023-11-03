package com.test.dazn.event

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.test.dazn.R
import com.test.dazn.event.domain.EventDomain

@Composable
fun TodayEventScreen() {
    val events = EventDomain.mockList
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        content = {
            items(events.size) {
                EventItem(data = events[it])
            }
        })
}

@Composable
fun EventItem(data: EventDomain) {
    val verticalHeight = 154.dp
    Row(
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .background(Color.Blue)
            .wrapContentHeight()
    ) {
        Image(
            modifier = Modifier.size(verticalHeight, verticalHeight),
            painter = painterResource(id = R.drawable.baseline_circle_24), contentDescription = ""
        )
        Column(
            modifier = Modifier
                .background(Color.DarkGray)
                .padding(8.dp)
                .fillMaxHeight()
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .background(Color.Green)
                    .wrapContentSize()
            ) {
                Text(text = data.name)
                Text(text = data.league)
            }
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxWidth()
                    .height(verticalHeight)
            ) {
                Text(text = data.date)
            }
        }
    }
}