package com.cryptocoinpartners.module.xchangedata;

import com.xeiam.xchange.currency.CurrencyPair;
import com.xeiam.xchange.dto.marketdata.Trades;


public class BitfinexHelper implements XchangeData.Helper
{
    /** Send the lastTradeTime in millis as the first parameter to getTrades() */
    public Object[] getTradeParameters( CurrencyPair pair, long lastTradeTime, long lastTradeId )
    {
        return new Object[] {lastTradeTime};
    }


    public void handleTrades( Trades tradeSpec ) { }
}
