package com.elseytd.theaurorian.Blocks;

import com.elseytd.theaurorian.Registry.BlockRegistry;
import com.elseytd.theaurorian.Registry.ItemRegistry.IUniqueModel;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MoltenAurorianSteelFluidBlock extends BlockFluidClassic implements IUniqueModel {

	public MoltenAurorianSteelFluidBlock() {
		super(BlockRegistry.Fluids.MOLTENAURORIANSTEEL, Material.LAVA);
		this.setRegistryName(MoltenAurorianSteelFluid.FLUIDNAME);
		this.setUnlocalizedName(MoltenAurorianSteelFluid.FLUIDNAME);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
		ModelLoader.setCustomStateMapper(this, new StateMap.Builder().ignore(LEVEL).build());
	}

}