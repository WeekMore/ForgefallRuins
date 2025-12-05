package weekmore.forgefallruins.item.weapon.attribute

/**
 * @author yuxiangll
 * ForgefallRuins
 * Create by 2025/12/5 21:02
 **/
interface WeaponEffect {
    fun onAttack(target: Any, attacker: Any) // 攻击时触发
    fun onEquip(holder: Any)                 // 装备时触发
}