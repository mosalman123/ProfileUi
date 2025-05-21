package com.example.profileui.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileui.R

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
            .padding(bottom = 32.dp)
    ) {
        TopAppBar(
            title = { Text("Profile", color = Color.White) },
            navigationIcon = {
                IconButton(onClick = { /* Back action */ }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = null, tint = Color.White)
                }
            },
            actions = {
                Button(
                    onClick = { /* Support action */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF222222))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_message_24),
                        contentDescription = "Message Icon",
                        colorFilter = ColorFilter.tint(Color.White),
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Support", color = Color.White)
                }
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.Black)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.nature),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text("andaz Kumar", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text("member since Dec, 2020", color = Color.Gray, fontSize = 14.sp)
            }
            IconButton(
                onClick = { /* Edit profile */ },
                modifier = Modifier
                    .border(1.dp, Color.White, shape = CircleShape)
                    .clip(CircleShape)
            ) {
                Icon(Icons.Default.Edit, contentDescription = null, tint = Color.White)
            }
        }

        InfoCard(
            icon = Icons.Default.Edit,
            title = "get to know your vehicles, inside out",
            subtitle = "CRED garage →"
        )

        Spacer(modifier = Modifier.height(20.dp))

        InfoItem(
            icon = Icons.Default.Create,
            title = "credit score • REFRESH AVAILABLE",
            value = "757",
            titleColor = Color.White
        )

        Box(
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 16.dp)
                .background(Color.Gray)
        )

        InfoItem(
            icon = Icons.Default.Check,
            title = "lifetime cashback",
            value = "$3",
            titleColor = Color.White
        )

        Box(
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 16.dp)
                .background(Color.Gray)
        )

        InfoItem(
            icon = Icons.Default.Add,
            title = "bank balance",
            value = "check",
            titleColor = Color.White
        )

            SectionHeader("YOUR REWARDS  BENEFITS")

            InfoItem2(
                title = "Cashback Balance",
                value = "$0",
            )

            Box(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 16.dp)
                    .background(Color.Gray)
            )

            InfoItem2(
                title = "coins",
                value = "26,46,583",

            )

            Box(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 16.dp)
                    .background(Color.Gray)
            )

            InfoItem2(
                title = "win upto Rs 1000",
                value = "refer and earn",
            )

            SectionHeader("TRANSACTION SUPPORT")

            itemIcon3(title = "all transaction", color = Color.White)
    }
}

@Composable
fun InfoCard(icon: ImageVector, title: String, subtitle: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .background(Color(0xFF1A1A1A), shape = RoundedCornerShape(5.dp))
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(5.dp)
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(icon, contentDescription = null, tint = Color.White)
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(title, color = Color.Gray, fontSize = 12.sp)
            Text(subtitle, color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun InfoItem(
    icon: ImageVector,
    title: String,
    value: String? = null,
    subtitle: String? = null,
    titleColor: Color = Color.White
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /* Click action */ },
            modifier = Modifier
                .size(20.dp)
                .border(1.dp, Color.White, shape = CircleShape)
                .clip(CircleShape)
        ) {
            Icon(icon, contentDescription = null, tint = Color.White, modifier = Modifier.size(10.dp))
        }

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(title, color = titleColor, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            subtitle?.let {
                Text(it, color = Color.Gray, fontSize = 12.sp)
            }
        }

        if (!value.isNullOrBlank()) {
            Text(value, color = Color.White, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(8.dp))
        }

        Image(
            painter = painterResource(id = R.drawable.baseline_arrow_right_alt_24),
            contentDescription = null,
            colorFilter = ColorFilter.tint(Color.White),
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        color = Color.Gray,
        fontSize = 12.sp,
        modifier = Modifier.padding(start = 16.dp, top = 24.dp)
    )
}

@Composable
fun InfoItem2(
    title: String,
    value: String? = null
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(5.dp))

            value?.let {
                Text(
                    text = it,
                    fontSize = 12.sp,
                    color = Color.White
                )
            }
        }

        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = null,
            tint = Color.White
        )
    }
}

@Composable
fun itemIcon3(title: String, color: Color) {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(start = 16.dp, top = 10.dp)
//    ) {
//        Text(
//            text = title,
//            fontSize = 12.sp,
//            color = color
//        )
//    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 10.dp, end = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            fontSize = 12.sp,
            color = color
        )
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = null,
            tint = Color.White
        )
    }
}
