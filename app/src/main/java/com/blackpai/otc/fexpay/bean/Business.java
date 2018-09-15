package com.blackpai.otc.fexpay.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 77 on 2018/8/8.
 */

public class Business implements Serializable {

    /**
     * code : 0
     * data : {"rows":[{"address":"CN","coinId":"1","coinName":"BTC","createTime":1532140942023,"dealAmount":0,"floatPrice":"btc_usd*usd_cny*0.99","id":"2c9f9d8664bab0dc0164bab772c70005","limitNum":111,"maxTrade":1111111,"minTrade":111,"money":"CNY","onlineBefore":22,"payMethod":"ali,wechat","praise":97.98,"premium":"1","price":43825.5234,"priceType":"FLOAT_PRICE","remainAmount":111,"startMaxTrade":1111111,"state":"OPEN","stateName":"Active","tradeAdvertSafe":{"tradeAdvertId":"2c9f9d8664bab0dc0164bab772c70005"},"tradeCounts":116,"tradeNums":113,"type":"ONLINE_BUYING","typeName":"Buy online","userId":"ff8081816436c083016436c6b42d0000","userName":"bpwallet01"},{"address":"CN","coinId":"1","coinName":"BTC","createTime":1532140979559,"dealAmount":0,"floatPrice":"btc_usd*usd_cny*0.99","id":"2c9f9d8664bab0dc0164bab805670006","limitNum":111,"maxTrade":1111111,"minTrade":111,"money":"CNY","onlineBefore":22,"payMethod":"ali,bank,wechat","praise":97.98,"premium":"1","price":43825.5234,"priceType":"FLOAT_PRICE","remainAmount":111,"startMaxTrade":1111111,"state":"OPEN","stateName":"Active","tradeAdvertSafe":{"tradeAdvertId":"2c9f9d8664bab0dc0164bab805670006"},"tradeCounts":116,"tradeNums":113,"type":"ONLINE_BUYING","typeName":"Buy online","userId":"ff8081816436c083016436c6b42d0000","userName":"bpwallet01"}],"total":2}
     * message : success
     */


    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * rows : [{"address":"CN","coinId":"1","coinName":"BTC","createTime":1532140942023,"dealAmount":0,"floatPrice":"btc_usd*usd_cny*0.99","id":"2c9f9d8664bab0dc0164bab772c70005","limitNum":111,"maxTrade":1111111,"minTrade":111,"money":"CNY","onlineBefore":22,"payMethod":"ali,wechat","praise":97.98,"premium":"1","price":43825.5234,"priceType":"FLOAT_PRICE","remainAmount":111,"startMaxTrade":1111111,"state":"OPEN","stateName":"Active","tradeAdvertSafe":{"tradeAdvertId":"2c9f9d8664bab0dc0164bab772c70005"},"tradeCounts":116,"tradeNums":113,"type":"ONLINE_BUYING","typeName":"Buy online","userId":"ff8081816436c083016436c6b42d0000","userName":"bpwallet01"},{"address":"CN","coinId":"1","coinName":"BTC","createTime":1532140979559,"dealAmount":0,"floatPrice":"btc_usd*usd_cny*0.99","id":"2c9f9d8664bab0dc0164bab805670006","limitNum":111,"maxTrade":1111111,"minTrade":111,"money":"CNY","onlineBefore":22,"payMethod":"ali,bank,wechat","praise":97.98,"premium":"1","price":43825.5234,"priceType":"FLOAT_PRICE","remainAmount":111,"startMaxTrade":1111111,"state":"OPEN","stateName":"Active","tradeAdvertSafe":{"tradeAdvertId":"2c9f9d8664bab0dc0164bab805670006"},"tradeCounts":116,"tradeNums":113,"type":"ONLINE_BUYING","typeName":"Buy online","userId":"ff8081816436c083016436c6b42d0000","userName":"bpwallet01"}]
         * total : 2
         */

        private int total;
        private List<RowsBean> rows;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * address : CN
             * coinId : 1
             * coinName : BTC
             * createTime : 1532140942023
             * dealAmount : 0
             * floatPrice : btc_usd*usd_cny*0.99
             * id : 2c9f9d8664bab0dc0164bab772c70005
             * limitNum : 111
             * maxTrade : 1111111
             * minTrade : 111
             * money : CNY
             * onlineBefore : 22
             * payMethod : ali,wechat
             * praise : 97.98
             * premium : 1
             * price : 43825.5234
             * priceType : FLOAT_PRICE
             * remainAmount : 111
             * startMaxTrade : 1111111
             * state : OPEN
             * stateName : Active
             * tradeAdvertSafe : {"tradeAdvertId":"2c9f9d8664bab0dc0164bab772c70005"}
             * tradeCounts : 116
             * tradeNums : 113
             * type : ONLINE_BUYING
             * typeName : Buy online
             * userId : ff8081816436c083016436c6b42d0000
             * userName : bpwallet01
             */

            private String address;
            private String coinId;
            private String coinName;
            private long createTime;
            private double dealAmount;
            private String floatPrice;
            private String id;
            private BigDecimal limitNum;
            private double maxTrade;
            private int minTrade;
            private String money;
            private int onlineBefore;
            private String payMethod;
            private double praise;
            private String premium;
            private double price;
            private String priceType;
            private double remainAmount;
            private double startMaxTrade;
            private String state;
            private String stateName;
            private TradeAdvertSafeBean tradeAdvertSafe;
            private int tradeCounts;
            private int tradeNums;
            private String type;
            private String typeName;
            private String userId;
            private String userName;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getCoinId() {
                return coinId;
            }

            public void setCoinId(String coinId) {
                this.coinId = coinId;
            }

            public String getCoinName() {
                return coinName;
            }

            public void setCoinName(String coinName) {
                this.coinName = coinName;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public double getDealAmount() {
                return dealAmount;
            }

            public void setDealAmount(int dealAmount) {
                this.dealAmount = dealAmount;
            }

            public String getFloatPrice() {
                return floatPrice;
            }

            public void setFloatPrice(String floatPrice) {
                this.floatPrice = floatPrice;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public BigDecimal getLimitNum() {
                return limitNum;
            }

            public void setLimitNum(BigDecimal limitNum) {
                this.limitNum = limitNum;
            }

            public double getMaxTrade() {
                return maxTrade;
            }

            public void setMaxTrade(int maxTrade) {
                this.maxTrade = maxTrade;
            }

            public int getMinTrade() {
                return minTrade;
            }

            public void setMinTrade(int minTrade) {
                this.minTrade = minTrade;
            }

            public String getMoney() {
                return money;
            }

            public void setMoney(String money) {
                this.money = money;
            }

            public int getOnlineBefore() {
                return onlineBefore;
            }

            public void setOnlineBefore(int onlineBefore) {
                this.onlineBefore = onlineBefore;
            }

            public String getPayMethod() {
                return payMethod;
            }

            public void setPayMethod(String payMethod) {
                this.payMethod = payMethod;
            }

            public double getPraise() {
                return praise;
            }

            public void setPraise(double praise) {
                this.praise = praise;
            }

            public String getPremium() {
                return premium;
            }

            public void setPremium(String premium) {
                this.premium = premium;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public String getPriceType() {
                return priceType;
            }

            public void setPriceType(String priceType) {
                this.priceType = priceType;
            }

            public double getRemainAmount() {
                return remainAmount;
            }

            public void setRemainAmount(int remainAmount) {
                this.remainAmount = remainAmount;
            }

            public double getStartMaxTrade() {
                return startMaxTrade;
            }

            public void setStartMaxTrade(int startMaxTrade) {
                this.startMaxTrade = startMaxTrade;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getStateName() {
                return stateName;
            }

            public void setStateName(String stateName) {
                this.stateName = stateName;
            }

            public TradeAdvertSafeBean getTradeAdvertSafe() {
                return tradeAdvertSafe;
            }

            public void setTradeAdvertSafe(TradeAdvertSafeBean tradeAdvertSafe) {
                this.tradeAdvertSafe = tradeAdvertSafe;
            }

            public int getTradeCounts() {
                return tradeCounts;
            }

            public void setTradeCounts(int tradeCounts) {
                this.tradeCounts = tradeCounts;
            }

            public int getTradeNums() {
                return tradeNums;
            }

            public void setTradeNums(int tradeNums) {
                this.tradeNums = tradeNums;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public static class TradeAdvertSafeBean {
                /**
                 * tradeAdvertId : 2c9f9d8664bab0dc0164bab772c70005
                 */

                private String tradeAdvertId;

                public String getTradeAdvertId() {
                    return tradeAdvertId;
                }

                public void setTradeAdvertId(String tradeAdvertId) {
                    this.tradeAdvertId = tradeAdvertId;
                }
            }
        }
    }
}
