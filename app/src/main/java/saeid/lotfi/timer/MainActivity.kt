package saeid.lotfi.timer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import saeid.lotfi.timer.ui.theme.TimerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    CountDownTimer()
                }
            }
        }
    }
}

@Composable
fun CountDownTimer() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(20.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "00", fontSize = 25.sp)
            Text(text = ":", modifier = Modifier.padding(10.dp))
            Text(text = "00", fontSize = 25.sp)
        }
        Button(modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(50.dp)
            .shadow(0.dp),
            onClick = { }) {
            Icon(
                Icons.Filled.PlayArrow,
                "contentDescription",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TimerTheme {
        CountDownTimer()
    }
}