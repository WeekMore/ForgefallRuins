package weekmore.forgefallruins

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import weekmore.forgefallruins.datagen.ForgeFallRuinsModelGenerator

object ForgeFallRuinsDataGenerator : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack = fabricDataGenerator.createPack()
        pack.addProvider { ForgeFallRuinsModelGenerator(it as FabricDataOutput) }
	}
}