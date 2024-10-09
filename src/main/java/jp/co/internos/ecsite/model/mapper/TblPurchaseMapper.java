package jp.co.internos.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.internos.ecsite.model.dto.HistoryDto;

@Mapper
public interface TblPurchaseMapper {
	List<HistoryDto> findHistory(int userId);
	
	int insert(int userId, int goodsId, String goodsName, int itemCount, int total);

}
