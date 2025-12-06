package weekmore.forgefallruins.datagen

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.client.data.BlockStateModelGenerator
import net.minecraft.client.data.ItemModelGenerator
import net.minecraft.client.data.Models
import net.minecraft.data.DataOutput
import weekmore.forgefallruins.ForgeFallRuins

class ForgeFallRuinsModelGenerator(output: DataOutput?) : FabricModelProvider(output as FabricDataOutput?) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator?) {
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator?) {
        itemModelGenerator?.register(ForgeFallRuins.FOO_SWORD,Models.HANDHELD)
    }
}