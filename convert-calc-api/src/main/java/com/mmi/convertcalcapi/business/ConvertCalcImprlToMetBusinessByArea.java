package com.mmi.convertcalcapi.business;


import com.mmi.convertcalcapi.dto.ConvertCalcDto;
import com.mmi.convertcalcapi.model.ConvertCalcVO;


/**
 * This Interface ConvertCalcService will handles the functionality of Converting from Metric To Imperial by Length, Area, Mass, Temperature
 *
 * Created by c817105 on 19/03/2020.
 *
 */

public interface ConvertCalcImprlToMetBusinessByArea {

	public ConvertCalcDto convertImperialToMetricBySqIn(ConvertCalcVO calcVO);

	public ConvertCalcDto convertImperialToMetricBySqFt(ConvertCalcVO calcVO);

	public ConvertCalcDto convertImperialToMetricBySqYd(ConvertCalcVO calcVO);

}
