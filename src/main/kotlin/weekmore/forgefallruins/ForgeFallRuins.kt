package weekmore.forgefallruins

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory
import weekmore.forgefallruins.item.weapon.sword
import weekmore.forgefallruins.utils.ItemRegister

object ForgeFallRuins : ModInitializer {
	const val MOD_ID = "forge_fall_ruins"

	//@JvmStatic
	//val CUSTOM_ITEM = ItemRegister.registerItem("custom_item", ::Item,Item.Settings())

	//@JvmStatic
	val FOO_SWORD = ItemRegister.registerWeapon(
        path = "foo_sword",
		type = sword {
            withAttackDamage(100f)
            withAttackSpeed(0f)
        },
    )

    private val logger = LoggerFactory.getLogger("ForgeFallRuins")

	override fun onInitialize() {

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
	}
}