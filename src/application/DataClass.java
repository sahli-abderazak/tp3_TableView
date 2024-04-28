package application;

import java.util.ArrayList;
import java.util.List;

public class DataClass {
	private List<Person> importList;
	private List<Person> exportList;
	
	public DataClass() {
		importList=new ArrayList<Person>();
		importList.add(new Person("sami","benali","sami@gamil.com"));
		importList.add(new Person("alia","ahmed","alia@gamil.com"));
		importList.add(new Person("ali","mami","ali@gamil.com"));
		exportList=new ArrayList<Person>();
	
	}

	public List<Person> getImportList() {
		return importList;
	}

	public List<Person> getExporteList() {
		return exportList;
	}
	public void setExportList(List<Person>exportList)
	{
		this.exportList.addAll(exportList);
		for(Person p:this.exportList)
			System.out.println(p);
	}
}
