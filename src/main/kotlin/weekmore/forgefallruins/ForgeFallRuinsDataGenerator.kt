package weekmore.forgefallruins

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import weekmore.forgefallruins.datagen.ForgeFallRuinsModelGenerator
import weekmore.forgefallruins.datagen.ForgeFallRuinsZHCNLanguageGenerator

object ForgeFallRuinsDataGenerator : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack = fabricDataGenerator.createPack()
        pack.addProvider { ForgeFallRuinsModelGenerator(it) }
        pack.addProvider { output, registryLookup -> ForgeFallRuinsZHCNLanguageGenerator(output, registryLookup) }
	}
}