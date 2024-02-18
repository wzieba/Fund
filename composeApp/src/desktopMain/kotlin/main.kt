import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Fund") {
        App(
            DefaultRootComponent(
                componentContext = DefaultComponentContext(lifecycle = LifecycleRegistry()),
            )
        )
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App(
        DefaultRootComponent(
            componentContext = DefaultComponentContext(lifecycle = LifecycleRegistry()),
        )
    )
}
