package com.project.basic.mapper;

import com.project.basic.entity.FjModul;
import com.project.basic.entity.ParameterMap;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface EntityModelMapper {
	void InsertAndUpdate(@Param("tableName") String tableName, @Param("fieldList") List<String> fieldList, @Param("dataMap") Map<String, Object> dataMap);
	// 根据表名与ID获取详情
	Map<String, Object> selectOneByTableNameAndId(@Param("id") String id, @Param("tableName") String tableName);
	// 根据字段与表名查询数据 （=）
	List<Map<String, Object>> selectByTableNameAndId(@Param("tableName") String tableName, @Param("value") String value,
                                                     @Param("field") String field, @Param("cond") String cond);

	// 通用批量更新，新建
	void batchInsertAndUpdate(ParameterMap parameterMap);

	// 批量新建附件
	void batchInsertAndUpdate_fj(@Param("tableName") String tableName, @Param("fjModulList") List<FjModul> fjModulList);


	// 随字段删除单条 （=）
	int deleteDataByCond(@Param("tableName") String tableName, @Param("value") String value,
                         @Param("field") String field, @Param("cond") String cond);

	// 根据表名 字段 字段值List 获取列表 （in）
	List<Map<String, Object>> selectByTableNameAndFeildAndIdlist(@Param("tableName") String tableName,
                                                                 @Param("idList") List<String> idList, @Param("field") String field, @Param("cond") String cond);

	// 根据表名 字段 字段值List 获取列表 （not in）
	List<Map<String, Object>> selectByTableNameAndFeildAndIdlist2(@Param("tableName") String tableName,
                                                                  @Param("idList") List<String> idList, @Param("field") String field, @Param("cond") String cond);


	// 随字段删除多条 （in）
	void deleteDataByIdlistAndCond(@Param("tableName") String tableName, @Param("idList") List<Object> idList,
                                   @Param("field") String field, @Param("cond") String cond);

	int forDelete(@Param("primaryKey") String primaryKey, @Param("idList") List<String> idList,
                  @Param("tableName") String tableName);


	// 根据字段与表名查询数据 （=）
	Map<String, Object> selectSingByTableNameAndId(@Param("tableName") String tableName, @Param("value") String value,
                                                   @Param("field") String field, @Param("cond") String cond);


	// 统计总数(=)
	int statisticByTableNameAndId(@Param("tableName") String tableName, @Param("value") String value,
                                  @Param("field") String field, @Param("cond") String cond);

	// 根据表名 字段 字段值List 获取列表 （in）
	int statisticByTableNameAndFeildAndIdlist(@Param("tableName") String tableName,
                                              @Param("idList") List<Object> idList, @Param("field") String field, @Param("cond") String cond);

	// 根据表名 字段 字段值List 获取列表 （not in）
	int statisticByTableNameAndFeildAndIdlist2(@Param("tableName") String tableName,
                                               @Param("idList") List<Object> idList, @Param("field") String field, @Param("cond") String cond);

	// 根据表明获取字段类型和对应注释
	List<Map<String, Object>> selectFeildNameAndCommentByTableName(@Param("tableName") String tableName, @Param("tableSchema") String tableSchema);

	// 根据字段与表名查询指定返回字段的数据 （=）
	Map<String, Object> selectSingByTableNameAndIdAndHQfield(@Param("HQfield") String HQfield,
                                                             @Param("tableName") String tableName, @Param("value") String value, @Param("field") String field,
                                                             @Param("cond") String cond);
	List<Map<String, Object>> selectByTableNameAndIdAndHQfield(@Param("HQfield") String HQfield,
                                                               @Param("tableName") String tableName, @Param("value") String value, @Param("field") String field,
                                                               @Param("cond") String cond);
	//根据表名和条件获取对应字段集合
	List<String> getFiledValueByCondTabalename(@Param("tablename") String tablename, @Param("cond") String cond, @Param("filed") String filed);
	//获取单一字段list（=）
		List<String>selectSingFieldListByCondAndHQfield(@Param("HQfield") String HQfield,
                                                        @Param("tableName") String tableName, @Param("value") String value, @Param("field") String field,
                                                        @Param("cond") String cond);
	//根据表注释获取表名
	String selectTableName(@Param("tableComment") String tableComment, @Param("tableSchema") String tableSchema);
	//根据表名获取表的数量(表明统一转小写)
	int getTableNameNum(@Param("tableName") String tableName, @Param("tableSchema") String tableSchema);


	//根据角色名获取用户id
	List<String> getUseridListByRoleName(@Param("roleName")String roleName,@Param("bmid")String bmid,@Param("cond")String cond );

	//根据用户id 角色名 验证用户角色
	Integer testUserRole(@Param("roleName") String roleName, @Param("userid") String userid);
	// userid 所属部门的经理或者父级部门领导
	//根据角色获取用户列表
	List<Map<String, Object>> getBMUserListByUserRole(@Param("roleName") String roleName, @Param("userid") String userid);
	List<Map<String, Object>> getSYBUserListByRoleName(@Param("roleName") String roleName, @Param("userid") String userid);
	//根据leader表获取领导信息
	List<Map<String, Object>> getBMUserListByUserRoleFromLeader( @Param("userid") String userid);
	List<Map<String, Object>> getSYBUserListByRoleNameFromLeader(@Param("userid") String userid);
	List<Map<String, Object>> getUserListByUserRole(@Param("roleName") String roleName);

	//测试使用
  	List<String> sqlByCondReturnListString(@Param("cond") String cond);
	String sqlByCondReturnString(@Param("cond") String cond);
	Double sqlByCondReturnDouble(@Param("cond") String cond);
	int sqlByCondReturnInteger(@Param("cond") String cond);
	List<Map<String, Object>> sqlByCondReturnListMap(@Param("cond") String cond);
	Map<String, Object> sqlByCondReturnMap(@Param("cond") String cond);
	void updateSql(@Param("cond") String cond);
	

		
}