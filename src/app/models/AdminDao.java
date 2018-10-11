package app.models;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
	
	@Autowired
	SqlSessionTemplate template;
	
	public List<Map> getDepart(){
		return template.selectList("depart.getAllDepart");
	}
	public List<Map> getPosition(){
		return template.selectList("depart.getAllPosition");
	}
	public Integer getSeq() {
		return template.selectOne("depart.getSeq");
	}
	public Integer setEmployee(Map map) {
		return template.insert("depart.setEmployee", map);
	}

}
