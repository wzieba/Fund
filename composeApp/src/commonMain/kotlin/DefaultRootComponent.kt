
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.DefaultComponentContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

interface RootComponent {
    val model: StateFlow<Int>
}

class DefaultRootComponent(
    componentContext: DefaultComponentContext
) : RootComponent, ComponentContext by componentContext {

    override val model: StateFlow<Int> =
        MutableStateFlow(123)
}
