package com.realz.moretotems;

import com.realz.moretotems.init.ModBlocks;
import com.realz.moretotems.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("rmtotems")
public class MoreTotems {
    public static Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rmtotems";

    public MoreTotems() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final CreativeModeTab ESSENCETAB = new CreativeModeTab("essencetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHICKEN_ESSENCE.get());
        }
    };

    public static final CreativeModeTab TOTEMTAB = new CreativeModeTab("totemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHICKEN_TOTEM.get());
        }
    };

}
