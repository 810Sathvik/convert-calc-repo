package com.mmi.convertcalcapi.service;


import com.mmi.convertcalcapi.dto.ConvertCalcDto;
import com.mmi.convertcalcapi.model.ConvertCalcVO;


/**
 * This Interface ConvertCalcService will handles the functionality of Converting from Metric To Imperial by Length, Area, Mass, Temperature
 *
 * Created by c817105 on 19/03/2020.
 *
 */

public interface ConvertCalcService {

	public ConvertCalcDto convertMetricToImperialByLen(ConvertCalcVO metricToImperialVO);

	public ConvertCalcDto convertImperialToMetricByLen(ConvertCalcVO imperialToMetricVO);

	public ConvertCalcDto convertMetricToImperialByArea(ConvertCalcVO metricToImperialVO);

	public ConvertCalcDto convertImperialToMetricByArea(ConvertCalcVO imperialToMetricVO);

	public ConvertCalcDto convertMetricToImperialByMass(ConvertCalcVO metricToImperialVO);

	public ConvertCalcDto convertImperialToMetricByMass(ConvertCalcVO imperialToMetricVO);

	public ConvertCalcDto convertTemp(ConvertCalcVO tempVO);


}
