package weekmore.forgefallruins.item.weapon

import net.minecraft.enchantment.Enchantment
import net.minecraft.item.ToolMaterial
import weekmore.forgefallruins.item.weapon.attribute.WeaponEffect
import weekmore.forgefallruins.item.weapon.attribute.WeaponName

/**
 * @author yuxiangll
 * ForgefallRuins
 * Create by 2025/12/5 21:01
 **/
data class WeaponAttributes(
    //val weaponType: WeaponType,
    //val name: WeaponName,                     // 武器名字
    val baseDamage: Float,                    // 基础伤害
    val baseAttackSpeed: Float,               // 攻击速度
    val durability: Int,                  // 耐久度
    val toolMaterial: ToolMaterial,       // 工具材料
    val enchantments: Map<Enchantment, Int> = emptyMap(), // 附魔配置
    val specialEffects: List<WeaponEffect> = emptyList(), // 特殊效果
    val customModelData: Int? = null      // 自定义模型数据
)
