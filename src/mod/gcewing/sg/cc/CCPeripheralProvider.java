//------------------------------------------------------------------------------------------------
//
//   SG Craft - Computercraft tile entity peripheral provider
//
//------------------------------------------------------------------------------------------------

package gcewing.sg.cc;

import net.minecraft.block.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.minecraft.util.*;
import dan200.computercraft.api.peripheral.*;

import gcewing.sg.*;

public class CCPeripheralProvider implements IPeripheralProvider {

    @Override
    public IPeripheral getPeripheral(World world, BlockPos pos, EnumFacing side) {
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof CCInterfaceTE)
            return new CCSGPeripheral((CCInterfaceTE)te);
        else
            return null;
    }

}
