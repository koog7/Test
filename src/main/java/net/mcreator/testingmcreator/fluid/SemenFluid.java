
package net.mcreator.testingmcreator.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.testingmcreator.init.TestingmcreatorModItems;
import net.mcreator.testingmcreator.init.TestingmcreatorModFluids;
import net.mcreator.testingmcreator.init.TestingmcreatorModFluidTypes;
import net.mcreator.testingmcreator.init.TestingmcreatorModBlocks;

public abstract class SemenFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TestingmcreatorModFluidTypes.SEMEN_TYPE.get(), () -> TestingmcreatorModFluids.SEMEN.get(), () -> TestingmcreatorModFluids.FLOWING_SEMEN.get())
			.explosionResistance(100f).tickRate(3).bucket(() -> TestingmcreatorModItems.SEMEN_BUCKET.get()).block(() -> (LiquidBlock) TestingmcreatorModBlocks.SEMEN.get());

	private SemenFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SemenFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SemenFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
