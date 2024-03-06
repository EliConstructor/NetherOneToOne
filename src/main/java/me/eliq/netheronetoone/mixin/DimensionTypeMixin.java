package me.eliq.netheronetoone.mixin;

import net.minecraft.world.level.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DimensionType.class)
public class DimensionTypeMixin {
    /**
     * @author EliConstructor
     * @reason hahahihi i dont understand mixin
     */
    @Overwrite
    public static double getTeleportationScale(DimensionType p_63909_, DimensionType p_63910_) {
        return 1;
    }
}
