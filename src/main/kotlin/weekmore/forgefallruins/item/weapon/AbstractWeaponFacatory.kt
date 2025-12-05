package weekmore.forgefallruins.item.weapon

/**
 * @author yuxiangll
 * ForgefallRuins
 * Create by 2025/12/5 21:25
 * 基础武器工厂抽象类
 **/

abstract class AbstractWeaponFactory(override val weaponType: WeaponType) : WeaponFactory {

    override fun validateProperties(attributes: WeaponAttributes): Boolean {
        // 基础验证逻辑
        return attributes.durability > 0 && attributes.baseAttackSpeed < 0
    }

    /**
     * 应用基础武器设置
     */
//    protected fun createBaseSettings(properties: WeaponAttributes): net.minecraft.item.Item.Settings {
//        TODO()
////        return net.minecraft.item.Item.Settings()
////            .maxDamage(properties.durability)
////            .apply {
////                properties.customModelData?.let { customModelData(it) }
////            }
//    }


}