package com.example.kotlin3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)

@Composable
fun Layout(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()
    ){
        HeaderSection()
        DetailMhs(
            param = "Nama",
            argu = "Mohammad Zachran Zachary",
        )
        DetailMhs(
            param = "Nim",
            argu = "20220140118"
        )
        DetailMhs(
            param = "Prodi",
            argu = "Teknologi Informasi"
        )
        DetailMhs(
            param = "Universitas",
            argu = "Universitas Muhammadiyah Yogyakarta"
        )
        DetailMhs(
            param = "Alamat",
            argu = "Pondok Sbt Permai Blok CL 01"
        )
        DetailMhs(
            param = "Email",
            argu = "zachran750@gmail.com"
        )
    }
}


@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier.fillMaxWidth().background(Color.LightGray)
    ){
        Row(
         modifier = Modifier.fillMaxWidth().padding(16.dp)
        ){
            Box(
                contentAlignment = Alignment.BottomEnd
            ){
                Image(painter = painterResource(id = R.drawable.umy), contentDescription = null,
                    modifier = Modifier.clip(CircleShape))
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )

            }

            Column (
                modifier = Modifier.padding(14.dp)
            ){
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhamamdiyah Yogyakarta")
            }
        }
    }
}


@Composable
fun DetailMhs(
    param: String, argu:String
){
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = param, modifier = Modifier.weight(0.8f))
            Text(text = ": ", modifier = Modifier.weight(0.2f))
            Text(text = argu, modifier = Modifier.weight(2f))
        }
    }
}