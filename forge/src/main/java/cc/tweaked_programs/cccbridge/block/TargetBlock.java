package cc.tweaked_programs.cccbridge.block;

import cc.tweaked_programs.cccbridge.blockEntity.TargetBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.Nullable;

public class TargetBlock extends Block implements EntityBlock {
    public TargetBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL).strength(3.0f).sound(SoundType.METAL));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new TargetBlockEntity(pos, state);
    }
}
