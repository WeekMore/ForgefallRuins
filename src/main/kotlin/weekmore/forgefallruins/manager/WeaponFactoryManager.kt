package weekmore.forgefallruins.manager

import weekmore.forgefallruins.item.weapon.WeaponAttributes
import weekmore.forgefallruins.item.weapon.WeaponFactory
import weekmore.forgefallruins.item.weapon.WeaponType
import weekmore.forgefallruins.item.weapon.factory.SwordWeaponFactory

/**
 * @author yuxiangll
 * ForgefallRuins
 * Create by 2025/12/5 21:40
 * 武器工厂管理器
 **/
object WeaponFactoryManager {
    private val factories = mutableMapOf<WeaponType, WeaponFactory>()

    init {
        registerFactory(WeaponType.SWORD, SwordWeaponFactory)
//        registerFactory(WeaponType.AXE, AxeWeaponFactory())
//        registerFactory(WeaponType.BOW, BowWeaponFactory())
    }

    fun registerFactory(weaponType: WeaponType, factory: WeaponFactory) {
        factories[weaponType] = factory
    }
//    fun getFactory(weaponType: WeaponType): WeaponFactory {
//        return factories[weaponType] ?: throw IllegalArgumentException("No factory registered for weapon type: $weaponType")
//    }

//    fun createWeapon(weaponType: WeaponType, properties: WeaponAttributes): net.minecraft.item.Item {
//        val factory = getFactory(weaponType)
//        if (!factory.validateProperties(properties)) {
//            throw IllegalArgumentException("Invalid properties for weapon type: $weaponType")
//        }
//        return factory.createWeapon(properties)
//    }

}