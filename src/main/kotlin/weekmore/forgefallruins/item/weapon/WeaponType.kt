package weekmore.forgefallruins.item.weapon

import weekmore.forgefallruins.item.weapon.factory.SwordWeaponFactory

/**
 * @author yuxiangll
 * ForgefallRuins
 * Create by 2025/12/5 21:20
 **/
enum class WeaponType {
    SWORD,      // 剑
    AXE,        // 斧
    BOW,        // 弓
    CROSSBOW,   // 弩
    DAGGER,     // 匕首
    SPEAR,      // 长矛
    HAMMER,     // 锤
    STAFF,      // 法杖
    CUSTOM      // 自定义类型
}

/**
 * 武器建造者扩展函数
 */
fun sword(block: WeaponBuilder.() -> Unit): Pair<WeaponFactory, WeaponAttributes> {
    return Pair(SwordWeaponFactory,WeaponBuilder(WeaponType.SWORD).apply(block).build())
}
