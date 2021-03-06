package cn.wolfcode.wms.query;

import cn.wolfcode.wms.domain.BaseBillItem;
import cn.wolfcode.wms.util.DateUtil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
public class StockIncomeBillQueryObject extends BaseBillQueryObject {
    private long depotId = -1;
}

