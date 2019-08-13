package co.mz.schoolCtrl.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import co.mz.schoolCtrl.model.Grade;

public class GradeConverter implements Converter<String, Grade> {

	@Override
	public Grade convert(String id) {
		if (!StringUtils.isEmpty(id)) {
			Grade grade = new Grade();
			grade.setId(Long.valueOf(id));
			return grade;
		}
		
		return null;
	}

}
