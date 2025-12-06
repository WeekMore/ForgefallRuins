package weekmore.forgefallruins.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.data.DataOutput
import net.minecraft.registry.RegistryWrapper
import weekmore.forgefallruins.ForgeFallRuins
import java.util.concurrent.CompletableFuture

class ForgeFallRuinsZHCNLanguageGenerator(
    output : DataOutput?,
    registryLookup : CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricLanguageProvider(output as FabricDataOutput?, "zh_cn", registryLookup) {
    override fun generateTranslations(
        registryLookup: RegistryWrapper.WrapperLookup?,
        translationBuilder: TranslationBuilder?
    ) {
        translationBuilder?.add(ForgeFallRuins.FOO_SWORD, "FOO剑")
    }
}