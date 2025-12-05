package weekmore.forgefallruins.item.weapon.factory

import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.item.ToolMaterial
import weekmore.forgefallruins.item.weapon.AbstractWeaponFactory
import weekmore.forgefallruins.item.weapon.WeaponAttributes
import weekmore.forgefallruins.item.weapon.WeaponType

/**
 * @author yuxiangll
 * ForgefallRuins
 * Create by 2025/12/5 21:58
 **/
object SwordWeaponFactory: AbstractWeaponFactory(WeaponType.SWORD) {


    override fun createItemSettings(attributes: WeaponAttributes): Item.Settings {
        //TODO("Not yet implemented")
        return Item.Settings().sword(ToolMaterial.WOOD,attributes.baseDamage,attributes.baseAttackSpeed)
    }
}