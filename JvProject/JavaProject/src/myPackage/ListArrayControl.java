package myPackage;

import java.awt.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ListArrayControl {

	JSONArray ar;
	List li;

	public ListArrayControl(JSONArray ar, List li) {

		this.ar = ar;
		this.li = li;

	}

	public void addJSON(CharactorVO c) {

		ar.add(c.getJSON());
		li.add(c.getName());

	}

	public void removeJSON(int index) {

		ar.remove(index);
		li.remove(index);

	}

	public JSONObject getJSONIndex(int index) {
		return (JSONObject) ar.get(index);

	}

	public void changeJSON(CharactorVO c, int index) {
		
		

		ar.set(index, c.getJSON());
		li.replaceItem(c.getName(), index);

	}

	public CharactorVO getCharactorVO(int index) {

		return new CharactorVO((JSONObject) ar.get(index));

	}
	
	public void initSyncList(JSONArray inar) {
		
		this.ar = inar;
		int size = ar.size();
		li.removeAll();
		
		for(int i=0; i<size;i++) {
			CharactorVO tmp = new CharactorVO((JSONObject)ar.get(i));
			li.add(tmp.getName());
		}
			
	}

}
