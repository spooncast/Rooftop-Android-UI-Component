package club.rooftop.raus.components.button

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SolidButton(
    modifier: Modifier = Modifier,
    size: ButtonSize = ButtonSize.L,
    type: ButtonTypes.Solid = ButtonTypes.Solid(),
    @DrawableRes preVectorImgRes: Int? = null,
    @DrawableRes postVectorImgRes: Int? = null,
    text: String,
    onClick: () -> Unit
) {
    BaseButton(
        modifier = modifier,
        size = size,
        type = type,
        preVectorImgRes = preVectorImgRes,
        postVectorImgRes = postVectorImgRes,
        text = text,
        onClick = onClick
    )
}
