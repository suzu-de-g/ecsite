package jp.co.internos.ecsite.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internos.ecsite.model.domain.MstUser;
import jp.co.internos.ecsite.model.form.LoginForm;

@Mapper
public interface MstUserMapper {
	
	@Select(value="SELECT * FROM mst_user WHERE user_name = #{userName} AND password = #{password}")
	MstUser findByUserNameAndPassword(LoginForm form);
	

}
