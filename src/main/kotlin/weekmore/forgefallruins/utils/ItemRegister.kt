package weekmore.forgefallruins.utils

import net.fabricmc.fabric.api.item.v1.FabricItem
import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier
import weekmore.forgefallruins.ForgeFallRuins
import weekmore.forgefallruins.item.weapon.WeaponAttributes
import weekmore.forgefallruins.item.weapon.WeaponFactory

/**
 * @author yuxiangll
 * Forge fall Ruins
 * Create by 2025/12/5 13:25
 **/
object ItemRegister {

    fun registerItem(path: String, factory:(Item.Settings)-> Item, settings: Item.Settings): Item {
        val registerKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ForgeFallRuins.MOD_ID, path))
        return Items.register(registerKey, factory, settings)
    }


    /**
     * 注册武器的扩展方法
     */
    fun registerWeapon(
        path: String,
        type: Pair<WeaponFactory, WeaponAttributes>,
    ): Item {
        val weaponFactory = type.first
        val attributes = type.second
        return registerItem(path,::Item,weaponFactory.createItemSettings(attributes))


    }


}