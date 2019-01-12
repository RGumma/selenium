package factory;

import dataprovider.ConfigDataProvider;
import dataprovider.Exceldataprovider;

public class DataproviderFactory {

	public static ConfigDataProvider getcongig() {

		ConfigDataProvider cf = new ConfigDataProvider();

		return cf;

	}

	public static Exceldataprovider getExcel() {

		Exceldataprovider excel = new Exceldataprovider();

		return excel;

	}

}
