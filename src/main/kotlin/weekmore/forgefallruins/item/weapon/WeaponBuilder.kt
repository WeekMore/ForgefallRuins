package weekmore.forgefallruins.item.weapon

import net.minecraft.enchantment.Enchantment
import net.minecraft.item.ToolMaterial
import weekmore.forgefallruins.item.weapon.attribute.WeaponEffect

/**
 * @author yuxiangll
 * ForgefallRuins
 * Create by 2025/12/5 21:52
 * 武器建造者
 **/

class WeaponBuilder(private val weaponType: WeaponType) {
    //private var damageCalculator: DamageCalculator = DamageCalculators.standardMeleeWeapon(5.0f)
    private var attackDamage: Float = -1f
    private var attackSpeed: Float = -2.4f
    private var durability: Int = 1000
    private var toolMaterial: ToolMaterial = ToolMaterial.IRON
    private val enchantments = mutableMapOf<Enchantment, Int>()
    private val specialEffects = mutableListOf<WeaponEffect>()
    private var customModelData: Int? = null

//    fun withDamageCalculator(calculator: DamageCalculator): WeaponBuilder {
//        this.damageCalculator = calculator
//        return this
//    }

    fun withAttackDamage(damage: Float): WeaponBuilder{
        this.attackDamage = damage
        return this
    }

    fun withAttackSpeed(speed: Float): WeaponBuilder {
        this.attackSpeed = speed
        return this
    }

    fun withDurability(durability: Int): WeaponBuilder {
        this.durability = durability
        return this
    }

    fun withToolMaterial(material: ToolMaterial): WeaponBuilder {
        this.toolMaterial = material
        return this
    }

    fun withEnchantment(enchantment: Enchantment, level: Int = 1): WeaponBuilder {
        this.enchantments[enchantment] = level
        return this
    }

    fun withSpecialEffect(effect: WeaponEffect): WeaponBuilder {
        this.specialEffects.add(effect)
        return this
    }

    fun withCustomModelData(data: Int): WeaponBuilder {
        this.customModelData = data
        return this
    }

    fun build(): WeaponAttributes {
        return WeaponAttributes(
            baseDamage = attackDamage,
            baseAttackSpeed = attackSpeed,
            durability = durability,
            toolMaterial = toolMaterial,
            enchantments = enchantments.toMap(),
            specialEffects = specialEffects.toList(),
            customModelData = customModelData
        )
    }
}