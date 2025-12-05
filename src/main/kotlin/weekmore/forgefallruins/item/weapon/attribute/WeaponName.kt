package weekmore.forgefallruins.item.weapon.attribute

import java.awt.Color

/**
 * @author yuxiangll
 * ForgefallRuins
 * Create by 2025/12/5 21:31
 **/
data class WeaponName(
    val name: String,      // 显示的名字
    val color: Color,      // 显示的颜色
    val twinkle: Boolean,  // 显示名字是否闪烁
)
