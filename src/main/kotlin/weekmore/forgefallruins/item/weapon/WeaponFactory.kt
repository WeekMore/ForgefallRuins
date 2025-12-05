package weekmore.forgefallruins.item.weapon

import net.minecraft.item.Item

/**
 * @author yuxiangll
 * ForgefallRuins
 * Create by 2025/12/5 21:24
 **/

interface WeaponFactory {

    val weaponType: WeaponType

    /**
     * 创建武器实例
     */
    //fun createWeapon(attributes: WeaponAttributes): Item

    /**
     * 验证武器属性是否适用于该工厂
     */
    fun validateProperties(attributes: WeaponAttributes): Boolean

    fun createItemSettings(attributes: WeaponAttributes): Item.Settings

}