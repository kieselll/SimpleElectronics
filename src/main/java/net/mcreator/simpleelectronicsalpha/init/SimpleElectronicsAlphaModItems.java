
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simpleelectronicsalpha.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.simpleelectronicsalpha.item.WatchItemItem;
import net.mcreator.simpleelectronicsalpha.item.VariableResistorItem;
import net.mcreator.simpleelectronicsalpha.item.ThermistorItem;
import net.mcreator.simpleelectronicsalpha.item.StepperMotorItem;
import net.mcreator.simpleelectronicsalpha.item.SolderingIronItem;
import net.mcreator.simpleelectronicsalpha.item.SmdButtonItem;
import net.mcreator.simpleelectronicsalpha.item.ServoMotorItem;
import net.mcreator.simpleelectronicsalpha.item.SeedOilBottleItem;
import net.mcreator.simpleelectronicsalpha.item.ScreenItem;
import net.mcreator.simpleelectronicsalpha.item.Resistor220Item;
import net.mcreator.simpleelectronicsalpha.item.Resistor1kItem;
import net.mcreator.simpleelectronicsalpha.item.Resistor10kItem;
import net.mcreator.simpleelectronicsalpha.item.RamItem;
import net.mcreator.simpleelectronicsalpha.item.PowerSupplyItem;
import net.mcreator.simpleelectronicsalpha.item.PlaSpoolItem;
import net.mcreator.simpleelectronicsalpha.item.PlaItem;
import net.mcreator.simpleelectronicsalpha.item.PlaDirtyItem;
import net.mcreator.simpleelectronicsalpha.item.PlaBucketItem;
import net.mcreator.simpleelectronicsalpha.item.PlaBottleItem;
import net.mcreator.simpleelectronicsalpha.item.PhotoresistorItem;
import net.mcreator.simpleelectronicsalpha.item.MotherboardItem;
import net.mcreator.simpleelectronicsalpha.item.MmoryItem;
import net.mcreator.simpleelectronicsalpha.item.MetalBoxItem;
import net.mcreator.simpleelectronicsalpha.item.MagnetItem;
import net.mcreator.simpleelectronicsalpha.item.LedYellowItem;
import net.mcreator.simpleelectronicsalpha.item.LedWhiteItem;
import net.mcreator.simpleelectronicsalpha.item.LedRedItem;
import net.mcreator.simpleelectronicsalpha.item.LedRGBItem;
import net.mcreator.simpleelectronicsalpha.item.LedIRItem;
import net.mcreator.simpleelectronicsalpha.item.LedGreenItem;
import net.mcreator.simpleelectronicsalpha.item.LedBlueItem;
import net.mcreator.simpleelectronicsalpha.item.IsolatedCopperWireItem;
import net.mcreator.simpleelectronicsalpha.item.GlassesItem;
import net.mcreator.simpleelectronicsalpha.item.EmptySpoolItem;
import net.mcreator.simpleelectronicsalpha.item.DiodeItem;
import net.mcreator.simpleelectronicsalpha.item.CordItem;
import net.mcreator.simpleelectronicsalpha.item.CopperWireItem;
import net.mcreator.simpleelectronicsalpha.item.CopperCoilItem;
import net.mcreator.simpleelectronicsalpha.item.CapacitorItem;
import net.mcreator.simpleelectronicsalpha.item.CameraItem;
import net.mcreator.simpleelectronicsalpha.item.CPUItem;
import net.mcreator.simpleelectronicsalpha.item.BoilerItem;
import net.mcreator.simpleelectronicsalpha.item.AntennaItem;
import net.mcreator.simpleelectronicsalpha.item.AccumulatorItem;
import net.mcreator.simpleelectronicsalpha.item.AABatteryItem;
import net.mcreator.simpleelectronicsalpha.block.display.ExtractorDisplayItem;
import net.mcreator.simpleelectronicsalpha.SimpleElectronicsAlphaMod;

public class SimpleElectronicsAlphaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleElectronicsAlphaMod.MODID);
	public static final RegistryObject<Item> RESISTOR_220 = REGISTRY.register("resistor_220", () -> new Resistor220Item());
	public static final RegistryObject<Item> RESISTOR_1K = REGISTRY.register("resistor_1k", () -> new Resistor1kItem());
	public static final RegistryObject<Item> RESISTOR_10K = REGISTRY.register("resistor_10k", () -> new Resistor10kItem());
	public static final RegistryObject<Item> THERMISTOR = REGISTRY.register("thermistor", () -> new ThermistorItem());
	public static final RegistryObject<Item> GLASSES_HELMET = REGISTRY.register("glasses_helmet", () -> new GlassesItem.Helmet());
	public static final RegistryObject<Item> WATCH_ITEM = REGISTRY.register("watch_item", () -> new WatchItemItem());
	public static final RegistryObject<Item> DIODE = REGISTRY.register("diode", () -> new DiodeItem());
	public static final RegistryObject<Item> ANTENNA = REGISTRY.register("antenna", () -> new AntennaItem());
	public static final RegistryObject<Item> BOILER = REGISTRY.register("boiler", () -> new BoilerItem());
	public static final RegistryObject<Item> SMD_BUTTON = REGISTRY.register("smd_button", () -> new SmdButtonItem());
	public static final RegistryObject<Item> CAPACITOR = REGISTRY.register("capacitor", () -> new CapacitorItem());
	public static final RegistryObject<Item> COPPER_COIL = REGISTRY.register("copper_coil", () -> new CopperCoilItem());
	public static final RegistryObject<Item> ISOLATED_COPPER_WIRE = REGISTRY.register("isolated_copper_wire", () -> new IsolatedCopperWireItem());
	public static final RegistryObject<Item> COPPER_WIRE = REGISTRY.register("copper_wire", () -> new CopperWireItem());
	public static final RegistryObject<Item> LED_BLUE = REGISTRY.register("led_blue", () -> new LedBlueItem());
	public static final RegistryObject<Item> LED_GREEN = REGISTRY.register("led_green", () -> new LedGreenItem());
	public static final RegistryObject<Item> LED_IR = REGISTRY.register("led_ir", () -> new LedIRItem());
	public static final RegistryObject<Item> LED_RGB = REGISTRY.register("led_rgb", () -> new LedRGBItem());
	public static final RegistryObject<Item> LED_RED = REGISTRY.register("led_red", () -> new LedRedItem());
	public static final RegistryObject<Item> LED_WHITE = REGISTRY.register("led_white", () -> new LedWhiteItem());
	public static final RegistryObject<Item> LED_YELLOW = REGISTRY.register("led_yellow", () -> new LedYellowItem());
	public static final RegistryObject<Item> MAGNET = REGISTRY.register("magnet", () -> new MagnetItem());
	public static final RegistryObject<Item> METAL_BOX = REGISTRY.register("metal_box", () -> new MetalBoxItem());
	public static final RegistryObject<Item> PHOTORESISTOR = REGISTRY.register("photoresistor", () -> new PhotoresistorItem());
	public static final RegistryObject<Item> PLA_BOTTLE = REGISTRY.register("pla_bottle", () -> new PlaBottleItem());
	public static final RegistryObject<Item> PLA_BUCKET = REGISTRY.register("pla_bucket", () -> new PlaBucketItem());
	public static final RegistryObject<Item> SCREEN = REGISTRY.register("screen", () -> new ScreenItem());
	public static final RegistryObject<Item> SEED_OIL_BOTTLE = REGISTRY.register("seed_oil_bottle", () -> new SeedOilBottleItem());
	public static final RegistryObject<Item> SOLDERING_IRON = REGISTRY.register("soldering_iron", () -> new SolderingIronItem());
	public static final RegistryObject<Item> VARIABLE_RESISTOR = REGISTRY.register("variable_resistor", () -> new VariableResistorItem());
	public static final RegistryObject<Item> PLA = REGISTRY.register("pla", () -> new PlaItem());
	public static final RegistryObject<Item> PLA_DIRTY = REGISTRY.register("pla_dirty", () -> new PlaDirtyItem());
	public static final RegistryObject<Item> AA_BATTERY = REGISTRY.register("aa_battery", () -> new AABatteryItem());
	public static final RegistryObject<Item> TIMER_BOMB = block(SimpleElectronicsAlphaModBlocks.TIMER_BOMB, SimpleElectronicsAlphaModTabs.TAB_SIMPLE_ELECTRONICS_TAB);
	public static final RegistryObject<Item> TABLE = block(SimpleElectronicsAlphaModBlocks.TABLE, SimpleElectronicsAlphaModTabs.TAB_SIMPLE_ELECTRONICS_TAB);
	public static final RegistryObject<Item> EXTRACTOR = REGISTRY.register(SimpleElectronicsAlphaModBlocks.EXTRACTOR.getId().getPath(),
			() -> new ExtractorDisplayItem(SimpleElectronicsAlphaModBlocks.EXTRACTOR.get(), new Item.Properties().tab(SimpleElectronicsAlphaModTabs.TAB_SIMPLE_ELECTRONICS_TAB)));
	public static final RegistryObject<Item> ACCUMULATOR = REGISTRY.register("accumulator", () -> new AccumulatorItem());
	public static final RegistryObject<Item> MOTHERBOARD = REGISTRY.register("motherboard", () -> new MotherboardItem());
	public static final RegistryObject<Item> CAMERA = REGISTRY.register("camera", () -> new CameraItem());
	public static final RegistryObject<Item> CORD = REGISTRY.register("cord", () -> new CordItem());
	public static final RegistryObject<Item> POWER_SUPPLY = REGISTRY.register("power_supply", () -> new PowerSupplyItem());
	public static final RegistryObject<Item> MMORY = REGISTRY.register("mmory", () -> new MmoryItem());
	public static final RegistryObject<Item> CPU = REGISTRY.register("cpu", () -> new CPUItem());
	public static final RegistryObject<Item> RAM = REGISTRY.register("ram", () -> new RamItem());
	public static final RegistryObject<Item> EMPTY_SPOOL = REGISTRY.register("empty_spool", () -> new EmptySpoolItem());
	public static final RegistryObject<Item> PLA_SPOOL = REGISTRY.register("pla_spool", () -> new PlaSpoolItem());
	public static final RegistryObject<Item> SERVO_MOTOR = REGISTRY.register("servo_motor", () -> new ServoMotorItem());
	public static final RegistryObject<Item> STEPPER_MOTOR = REGISTRY.register("stepper_motor", () -> new StepperMotorItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
