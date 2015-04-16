package com.example.element;

import java.util.ArrayList;
import java.util.List;

import com.yueyericardo.element.R;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends ActionBarActivity {
	private List<Element> ElementList = new ArrayList<Element>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initElements();
		ElementAdapter adapter = new ElementAdapter(MainActivity.this,
				R.layout.element_item, ElementList);
		ListView listView = (ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Element element = ElementList.get(position);
				MediaPlayer mediaPlayer = null;

				mediaPlayer = MediaPlayer.create(MainActivity.this,
						element.getmp3());
				mediaPlayer.start();

			}
		});
	}

	private void initElements() {
		Element hydrogen = new Element("hydrogen", R.raw.hydrogen,R.drawable.hydrogen);
		ElementList.add(hydrogen);
		Element helium = new Element("helium", R.raw.helium,R.drawable.helium);
		ElementList.add(helium);
		Element lithium = new Element("lithium", R.raw.lithium,R.drawable.lithium);
		ElementList.add(lithium);
		Element beryllium = new Element("beryllium", R.raw.beryllium,R.drawable.beryllium);
		ElementList.add(beryllium);
		Element boron = new Element("boron", R.raw.boron,R.drawable.boron);
		ElementList.add(boron);
		Element carbon = new Element("carbon", R.raw.carbon,R.drawable.carbon);
		ElementList.add(carbon);
		Element nitrogen = new Element("nitrogen", R.raw.nitrogen,R.drawable.nitrogen);
		ElementList.add(nitrogen);
		Element oxygen = new Element("oxygen", R.raw.oxygen,R.drawable.oxygen);
		ElementList.add(oxygen);
		Element fluorine = new Element("fluorine", R.raw.fluorine,R.drawable.fluorine);
		ElementList.add(fluorine);
		Element neon = new Element("neon", R.raw.neon,R.drawable.neon);
		ElementList.add(neon);
		Element sodium = new Element("sodium", R.raw.sodium,R.drawable.sodium);
		ElementList.add(sodium);
		Element magnesium = new Element("magnesium", R.raw.magnesium,R.drawable.magnesium);
		ElementList.add(magnesium);
		Element aluminum = new Element("aluminum", R.raw.aluminum,R.drawable.aluminum);
		ElementList.add(aluminum);
		Element silicon = new Element("silicon", R.raw.silicon,R.drawable.silicon);
		ElementList.add(silicon);
		Element phosphorus = new Element("phosphorus", R.raw.phosphorus,R.drawable.phosphorus);
		ElementList.add(phosphorus);
		Element sulfur = new Element("sulfur", R.raw.sulfur,R.drawable.sulfur);
		ElementList.add(sulfur);
		Element chlorine = new Element("chlorine", R.raw.chlorine,R.drawable.chlorine);
		ElementList.add(chlorine);
		Element argon = new Element("argon", R.raw.argon,R.drawable.argon);
		ElementList.add(argon);
		Element potassium = new Element("potassium", R.raw.potassium,R.drawable.potassium);
		ElementList.add(potassium);
		Element calcium = new Element("calcium", R.raw.calcium,R.drawable.calcium);
		ElementList.add(calcium);
		Element scandium = new Element("scandium", R.raw.scandium,R.drawable.scandium);
		ElementList.add(scandium);
		Element titanium = new Element("titanium ", R.raw.titanium,R.drawable.titanium);
		ElementList.add(titanium);
		Element vanadium = new Element("vanadium ", R.raw.vanadium,R.drawable.vanadium);
		ElementList.add(vanadium);
		Element chromium = new Element("chromium ", R.raw.chromium,R.drawable.chromium);
		ElementList.add(chromium);
		Element manganese = new Element("manganese ", R.raw.manganese,R.drawable.chromium);
		ElementList.add(manganese);
		Element iron = new Element("iron ", R.raw.iron,R.drawable.iron);
		ElementList.add(iron);
		Element cobalt = new Element("cobalt ", R.raw.cobalt,R.drawable.cobalt);
		ElementList.add(cobalt);
		Element nickel = new Element("nickel ", R.raw.nickel,R.drawable.nickel);
		ElementList.add(nickel);
		Element copper = new Element("copper ", R.raw.copper,R.drawable.copper);
		ElementList.add(copper);
		Element zinc = new Element("zinc", R.raw.zinc,R.drawable.zinc);
		ElementList.add(zinc);
		Element gallium = new Element("gallium ", R.raw.gallium,R.drawable.gallium);
		ElementList.add(gallium);
		Element germanium = new Element("germanium ", R.raw.germanium,R.drawable.germanium);
		ElementList.add(germanium);
		Element arsenic = new Element("arsenic ", R.raw.arsenic,R.drawable.arsenic);
		ElementList.add(arsenic);
		Element selenium = new Element("selenium ", R.raw.selenium,R.drawable.selenium);
		ElementList.add(selenium);
		Element bromine = new Element("bromine ", R.raw.bromine,R.drawable.bromine);
		ElementList.add(bromine);
		Element krypton = new Element("krypton ", R.raw.krypton,R.drawable.krypton);
		ElementList.add(krypton);
		Element rubidium = new Element("rubidium ", R.raw.rubidium,R.drawable.rubidium);
		ElementList.add(rubidium);
		Element strontium = new Element("strontium", R.raw.strontium,R.drawable.strontium);
		ElementList.add(strontium);
		Element yttrium = new Element("yttrium ", R.raw.yttrium,R.drawable.yttrium);
		ElementList.add(yttrium);
		Element zirconium = new Element("zirconium ", R.raw.zirconium,R.drawable.zirconium);
		ElementList.add(zirconium);
		Element niobium = new Element("niobium ", R.raw.niobium,R.drawable.niobium);
		ElementList.add(niobium);
		Element molybdenum = new Element("molybdenum", R.raw.molybdenum,R.drawable.molybdenum);
		ElementList.add(molybdenum);
		Element technetium = new Element("technetium ", R.raw.technetium,R.drawable.technetium);
		ElementList.add(technetium);
		Element ruthenium = new Element("ruthenium ", R.raw.ruthenium,R.drawable.ruthenium);
		ElementList.add(ruthenium);
		Element rhodium = new Element("rhodium ", R.raw.rhodium,R.drawable.rhodium);
		ElementList.add(rhodium);
		Element palladium = new Element("palladium ", R.raw.palladium,R.drawable.palladium);
		ElementList.add(palladium);
		Element silver = new Element("silver ", R.raw.silver,R.drawable.silver);
		ElementList.add(silver);
		Element cadmium = new Element("cadmium  ", R.raw.cadmium,R.drawable.cadmium);
		ElementList.add(cadmium);
		Element indium = new Element("indium   ", R.raw.indium,R.drawable.indium);
		ElementList.add(indium);
		Element tin = new Element("tin  ", R.raw.tin,R.drawable.tin);
		ElementList.add(tin);
		Element antimony = new Element("antimony ", R.raw.antimony,R.drawable.antimony);
		ElementList.add(antimony);
		Element tellurium = new Element("tellurium  ", R.raw.tellurium,R.drawable.tellurium);
		ElementList.add(tellurium);
		Element iodine = new Element("iodine  ", R.raw.iodine,R.drawable.iodine);
		ElementList.add(iodine);
		Element xenon = new Element("xenon ", R.raw.xenon,R.drawable.xenon);
		ElementList.add(xenon);
		Element caesium = new Element("caesium  ", R.raw.caesium,R.drawable.caesium);
		ElementList.add(caesium);
		Element barium = new Element("barium  ", R.raw.barium,R.drawable.barium);
		ElementList.add(barium);
		Element lanthanum = new Element("lanthanum  ", R.raw.lanthanum,R.drawable.lanthanum);
		ElementList.add(lanthanum);
		Element cerium = new Element("cerium  ", R.raw.cerium,R.drawable.cerium);
		ElementList.add(cerium);
		Element praseodymium = new Element("praseodymium  ", R.raw.praseodymium,R.drawable.praseodymium);
		ElementList.add(praseodymium);
		Element neodymium = new Element("neodymium  ", R.raw.neodymium,R.drawable.neodymium);
		ElementList.add(neodymium);
		Element promethium = new Element("promethium  ", R.raw.promethium,R.drawable.promethium);
		ElementList.add(promethium);
		Element samarium = new Element("samarium ", R.raw.samarium,R.drawable.samarium);
		ElementList.add(samarium);
		Element europium = new Element("europium  ", R.raw.europium,R.drawable.europium);
		ElementList.add(europium);
		Element gadolinium = new Element("gadolinium  ", R.raw.gadolinium,R.drawable.gadolinium);
		ElementList.add(gadolinium);
		Element terbium = new Element("terbium  ", R.raw.terbium,R.drawable.terbium);
		ElementList.add(terbium);
		Element dysprosium = new Element("dysprosium  ", R.raw.dysprosium,R.drawable.dysprosium);
		ElementList.add(dysprosium);
		Element holmium = new Element("holmium  ", R.raw.holmium,R.drawable.holmium);
		ElementList.add(holmium);
		Element erbium = new Element("erbium  ", R.raw.erbium,R.drawable.erbium);
		ElementList.add(erbium);
		Element thulium = new Element("thulium  ", R.raw.thulium,R.drawable.thulium);
		ElementList.add(thulium);
		Element ytterbium = new Element("ytterbium  ", R.raw.ytterbium,R.drawable.ytterbium);
		ElementList.add(ytterbium);
		Element lutetium = new Element("lutetium  ", R.raw.lutetium,R.drawable.lutetium);
		ElementList.add(lutetium);
		Element hafnium = new Element("hafnium ", R.raw.hafnium,R.drawable.hafnium);
		ElementList.add(hafnium);
		Element tantalum = new Element("tantalum  ", R.raw.tantalum,R.drawable.tantalum);
		ElementList.add(tantalum);
		Element tungsten = new Element("tungsten  ", R.raw.tungsten,R.drawable.tungsten);
		ElementList.add(tungsten);
		Element rhenium = new Element("rhenium  ", R.raw.rhenium,R.drawable.rhenium);
		ElementList.add(rhenium);
		Element osmium = new Element("osmium  ", R.raw.osmium,R.drawable.osmium);
		ElementList.add(osmium);
		Element iridium = new Element("iridium  ", R.raw.iridium,R.drawable.iridium);
		ElementList.add(iridium);
		Element platinum = new Element("platinum  ", R.raw.platinum,R.drawable.platinum);
		ElementList.add(platinum);
		Element gold = new Element("gold  ", R.raw.gold,R.drawable.gold);
		ElementList.add(gold);
		Element mercury = new Element("mercury  ", R.raw.mercury,R.drawable.mercury);
		ElementList.add(mercury);
		Element thallium = new Element("thallium  ", R.raw.thallium,R.drawable.thallium);
		ElementList.add(thallium);
		Element lead = new Element("lead", R.raw.lead,R.drawable.lead);
		ElementList.add(lead);
		Element bismuth = new Element("bismuth  ", R.raw.bismuth,R.drawable.bismuth);
		ElementList.add(bismuth);
		Element polonium = new Element("polonium  ", R.raw.polonium,R.drawable.polonium);
		ElementList.add(polonium);
		Element astatine = new Element("astatine  ", R.raw.astatine,R.drawable.astatine);
		ElementList.add(astatine);
		Element radon = new Element("radon  ", R.raw.radon,R.drawable.radon);
		ElementList.add(radon);
		Element francium = new Element("francium  ", R.raw.francium,R.drawable.francium);
		ElementList.add(francium);
		Element radium = new Element("radium  ", R.raw.radium,R.drawable.radium);
		ElementList.add(radium);
		Element actinium = new Element("actinium  ", R.raw.actinium,R.drawable.actinium);
		ElementList.add(actinium);
		Element thorium = new Element("thorium  ", R.raw.thorium,R.drawable.thorium);
		ElementList.add(thorium);
		Element protactinium = new Element("protactinium  ", R.raw.protactinium,R.drawable.protactinium);
		ElementList.add(protactinium);
		Element uranium = new Element("uranium ", R.raw.uranium,R.drawable.uranium);
		ElementList.add(uranium);
		Element neptunium = new Element("neptunium  ", R.raw.neptunium,R.drawable.neptunium);
		ElementList.add(neptunium);
		Element plutonium = new Element("plutonium  ", R.raw.plutonium,R.drawable.plutonium);
		ElementList.add(plutonium);
		Element americium = new Element("americium  ", R.raw.americium,R.drawable.americium);
		ElementList.add(americium);
		Element curium = new Element("curium  ", R.raw.curium,R.drawable.curium);
		ElementList.add(curium);
		Element berkelium = new Element("berkelium  ", R.raw.berkelium,R.drawable.berkelium);
		ElementList.add(berkelium);
		Element californium = new Element("californium  ", R.raw.californium,R.drawable.californium);
		ElementList.add(californium);
		Element einsteinium = new Element("einsteinium  ", R.raw.einsteinium,R.drawable.einsteinium);
		ElementList.add(einsteinium);
		Element fermium = new Element("fermium ", R.raw.fermium,R.drawable.fermium);
		ElementList.add(fermium);
		Element mendelevium = new Element("mendelevium  ", R.raw.mendelevium,R.drawable.mendelevium);
		ElementList.add(mendelevium);
		Element nobelium = new Element("nobelium  ", R.raw.nobelium,R.drawable.nobelium);
		ElementList.add(nobelium);
		Element lawrencium = new Element("lawrencium  ", R.raw.lawrencium,R.drawable.lawrencium);
		ElementList.add(lawrencium);
		Element rutherfordium = new Element("rutherfordium  ",R.raw.rutherfordium,R.drawable.rutherfordium);
		ElementList.add(rutherfordium);
		Element dubnium = new Element("dubnium  ", R.raw.dubnium,R.drawable.dubnium);
		ElementList.add(dubnium);
		Element seaborgium = new Element("seaborgium  ", R.raw.seaborgium,R.drawable.seaborgium);
		ElementList.add(seaborgium);
		Element bohrium = new Element("bohrium  ", R.raw.bohrium,R.drawable.bohrium);
		ElementList.add(bohrium);
		Element hassium = new Element("hassium  ", R.raw.hassium,R.drawable.hassium);
		ElementList.add(hassium);
		Element meitnerium = new Element("meitnerium ", R.raw.meitnerium,R.drawable.meitnerium);
		ElementList.add(meitnerium);
		Element darmstadtium = new Element("darmstadtium  ", R.raw.darmstadtium,R.drawable.darmstadtium);
		ElementList.add(darmstadtium);
		Element roentgenium = new Element("roentgenium  ", R.raw.roentgenium,R.drawable.roentgenium);
		ElementList.add(roentgenium);
		Element copernicium = new Element("copernicium ", R.raw.copernicium,R.drawable.copernicium);
		ElementList.add(copernicium);
		Element ununtrium = new Element("ununtrium ", R.raw.ununtrium,R.drawable.ununtrium);
		ElementList.add(ununtrium);
		Element flerovium = new Element("flerovium ", R.raw.flerovium,R.drawable.flerovium);
		ElementList.add(flerovium);
		Element ununpentium = new Element("ununpentium ", R.raw.ununpentium,R.drawable.ununpentium);
		ElementList.add(ununpentium);
		Element livermorium = new Element("livermorium ", R.raw.livermorium,R.drawable.livermorium);
		ElementList.add(livermorium);
		Element ununseptium = new Element("ununseptium ", R.raw.ununseptium,R.drawable.ununseptium);
		ElementList.add(ununseptium);
		Element ununoctium = new Element("ununoctium ", R.raw.ununoctium,R.drawable.ununoctium);
		ElementList.add(ununoctium);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Intent intent= new Intent("com.example.element.ABOUT");
			startActivity(intent);
			
		}
		return true;
	}
}
