package com.example.mediccard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mediccard.ui.theme.MedicCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MedicCardTheme {
                AppointmentCard()
            }
        }
    }
}
@Preview
@Composable
fun AppointmentCard() {
    Box(
        modifier = Modifier
            .height(136.dp)
            .width(327.dp)
            .background(Color(0xFF4894FE), shape = RoundedCornerShape(15.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                )
                {
//                    Row(
//                        modifier = Modifier
//                            .height(1.dp)
//                            .fillMax
//                            .background(Color.White, shape = RoundedCornerShape(15.dp))
//                    ) {
//
//                    }
                    Image(
                        painter = painterResource(id = R.drawable.medic),
                        contentDescription = null,
                        modifier = Modifier
                            .size(48.dp)
                            .padding(5.dp),
                        contentScale = ContentScale.Fit
                    )
                    Column(
                        modifier = Modifier
                    ) {
                        Text(
                            text = "Екатерина Верхова",
                            fontSize = 16.sp,
                            color = Color.White
                        )
                        Text(
                            text = "Стоматолог",
                            fontSize = 14.sp,
                            color = (Color(0xFFCBE1FF))
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp),
                    Color.White

                )
            }
        }
    }
}