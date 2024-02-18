package io.wzieba.fund

import App
import DefaultRootComponent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.defaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(DefaultRootComponent(defaultComponentContext()))
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App(DefaultRootComponent(
        DefaultComponentContext(
            lifecycle = LifecycleRegistry()
        )
    ))
}
