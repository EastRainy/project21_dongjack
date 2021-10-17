package myPackage;

import org.json.simple.JSONObject;

public class CharactorVO {

	private int age;
	private String name, id;

	public CharactorVO() {
		setName("이름을 입력해주세요");
		setAge(0);
		setId("ID를 입력해주세요.");
	}

	public CharactorVO(JSONObject jo) {
		setJSON(jo);
	}

	public JSONObject getJSON() {

		JSONObject jo = new JSONObject();

		jo.put("name", this.name);
		jo.put("age", this.age);
		jo.put("id", this.id);

		return jo;

	}

	public void setJSON(JSONObject jo) {

		this.name = (String) jo.get("name");
		try {
			this.age = (int) jo.get("age");
		} catch (ClassCastException e) {
			if (jo.get("age").getClass() == String.class) {
				this.age = Integer.parseInt((String) jo.get("age"));
			}

			else if (jo.get("age").getClass() == Long.class) {
				this.age = Math.toIntExact((long) jo.get("age"));
			}
		}

		this.id = (String) jo.get("id");

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
