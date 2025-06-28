
package net.mcreator.thefegrid.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.thefegrid.procedures.AddToCableSystemProcedure;
import net.mcreator.thefegrid.block.entity.SolarPanelFrameWithCableBlockEntity;

public class SolarPanelFrameWithCableBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public SolarPanelFrameWithCableBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 6f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(13, 0, 13, 15, 17, 15), box(1, 0, 13, 3, 12, 15), box(1, 0, -15, 3, 12, -13), box(13, 0, -15, 15, 17, -13), box(13.2, 1, -14, 14.8, 3, 14), box(13.2, 13, -14, 14.8, 15, 14), box(1.2, 1, -14, 2.8, 3, 14),
					box(1.2, 8, -14, 2.8, 10, 14), box(6, 6, 15, 10, 10, 16), box(6, 6, -16, 10, 10, -15), box(3, 6, 13, 13, 10, 15), box(3, 6, -15, 13, 10, -13));
			case NORTH -> Shapes.or(box(1, 0, 1, 3, 17, 3), box(13, 0, 1, 15, 12, 3), box(13, 0, 29, 15, 12, 31), box(1, 0, 29, 3, 17, 31), box(1.2, 1, 2, 2.8, 3, 30), box(1.2, 13, 2, 2.8, 15, 30), box(13.2, 1, 2, 14.8, 3, 30),
					box(13.2, 8, 2, 14.8, 10, 30), box(6, 6, 0, 10, 10, 1), box(6, 6, 31, 10, 10, 32), box(3, 6, 1, 13, 10, 3), box(3, 6, 29, 13, 10, 31));
			case EAST -> Shapes.or(box(13, 0, 1, 15, 17, 3), box(13, 0, 13, 15, 12, 15), box(-15, 0, 13, -13, 12, 15), box(-15, 0, 1, -13, 17, 3), box(-14, 1, 1.2, 14, 3, 2.8), box(-14, 13, 1.2, 14, 15, 2.8), box(-14, 1, 13.2, 14, 3, 14.8),
					box(-14, 8, 13.2, 14, 10, 14.8), box(15, 6, 6, 16, 10, 10), box(-16, 6, 6, -15, 10, 10), box(13, 6, 3, 15, 10, 13), box(-15, 6, 3, -13, 10, 13));
			case WEST -> Shapes.or(box(1, 0, 13, 3, 17, 15), box(1, 0, 1, 3, 12, 3), box(29, 0, 1, 31, 12, 3), box(29, 0, 13, 31, 17, 15), box(2, 1, 13.2, 30, 3, 14.8), box(2, 13, 13.2, 30, 15, 14.8), box(2, 1, 1.2, 30, 3, 2.8),
					box(2, 8, 1.2, 30, 10, 2.8), box(0, 6, 6, 1, 10, 10), box(31, 6, 6, 32, 10, 10), box(1, 6, 3, 3, 10, 13), box(29, 6, 3, 31, 10, 13));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		AddToCableSystemProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SolarPanelFrameWithCableBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof SolarPanelFrameWithCableBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof SolarPanelFrameWithCableBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
