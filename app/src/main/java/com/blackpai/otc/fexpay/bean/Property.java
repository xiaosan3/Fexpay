package com.blackpai.otc.fexpay.bean;

import java.util.List;

/**
 * Created by 77 on 2018/8/13.
 */

public class Property {
    /**
     * code : 0
     * data : {"rows":[{"available":2222397.07378859,"canRecharge":true,"canTransfer":true,"canWithdraw":true,"coinId":"1","coinName":"BTC","coinShowName":"Bitcoin (BTC)","createTime":1532148255048,"error":0,"frozen":0,"id":"2c9f9d8664baf3f70164bb2709480016","lastUpdateTime":1533973474116,"userId":"2c9f9d8664baf3f70164bb2709460015"},{"available":5680150.65000249,"canRecharge":true,"canTransfer":true,"canWithdraw":true,"coinId":"2","coinName":"ETH","coinShowName":"ETH (ETH)","createTime":1532148255048,"error":0,"frozen":20.157,"id":"2c9f9d8664baf3f70164bb2709480017","lastUpdateTime":1533628628826,"userId":"2c9f9d8664baf3f70164bb2709460015","walletAddress":"0xdbfd21b018b88d4cfa49ef4b104c6f9c06029604"},{"available":9931692.37081114,"canRecharge":true,"canTransfer":false,"canWithdraw":true,"coinId":"3","coinName":"UND","coinShowName":"UND (UND)","createTime":1532148255048,"error":0,"frozen":1076,"id":"2c9f9d8664baf3f70164bb2709480018","lastUpdateTime":1534147070095,"userId":"2c9f9d8664baf3f70164bb2709460015","walletAddress":"0xdbfd21b018b88d4cfa49ef4b104c6f9c06029604"}],"total":3}
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
         * rows : [{"available":2222397.07378859,"canRecharge":true,"canTransfer":true,"canWithdraw":true,"coinId":"1","coinName":"BTC","coinShowName":"Bitcoin (BTC)","createTime":1532148255048,"error":0,"frozen":0,"id":"2c9f9d8664baf3f70164bb2709480016","lastUpdateTime":1533973474116,"userId":"2c9f9d8664baf3f70164bb2709460015"},{"available":5680150.65000249,"canRecharge":true,"canTransfer":true,"canWithdraw":true,"coinId":"2","coinName":"ETH","coinShowName":"ETH (ETH)","createTime":1532148255048,"error":0,"frozen":20.157,"id":"2c9f9d8664baf3f70164bb2709480017","lastUpdateTime":1533628628826,"userId":"2c9f9d8664baf3f70164bb2709460015","walletAddress":"0xdbfd21b018b88d4cfa49ef4b104c6f9c06029604"},{"available":9931692.37081114,"canRecharge":true,"canTransfer":false,"canWithdraw":true,"coinId":"3","coinName":"UND","coinShowName":"UND (UND)","createTime":1532148255048,"error":0,"frozen":1076,"id":"2c9f9d8664baf3f70164bb2709480018","lastUpdateTime":1534147070095,"userId":"2c9f9d8664baf3f70164bb2709460015","walletAddress":"0xdbfd21b018b88d4cfa49ef4b104c6f9c06029604"}]
         * total : 3
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
             * available : 2222397.07378859
             * canRecharge : true
             * canTransfer : true
             * canWithdraw : true
             * coinId : 1
             * coinName : BTC
             * coinShowName : Bitcoin (BTC)
             * createTime : 1532148255048
             * error : 0
             * frozen : 0
             * id : 2c9f9d8664baf3f70164bb2709480016
             * lastUpdateTime : 1533973474116
             * userId : 2c9f9d8664baf3f70164bb2709460015
             * walletAddress : 0xdbfd21b018b88d4cfa49ef4b104c6f9c06029604
             */

            private double available;
            private boolean canRecharge;
            private boolean canTransfer;
            private boolean canWithdraw;
            private String coinId;
            private String coinName;
            private String coinShowName;
            private long createTime;
            private int error;
            private double frozen;
            private String id;
            private long lastUpdateTime;
            private String userId;
            private String walletAddress;

            public double getAvailable() {
                return available;
            }

            public void setAvailable(double available) {
                this.available = available;
            }

            public boolean isCanRecharge() {
                return canRecharge;
            }

            public void setCanRecharge(boolean canRecharge) {
                this.canRecharge = canRecharge;
            }

            public boolean isCanTransfer() {
                return canTransfer;
            }

            public void setCanTransfer(boolean canTransfer) {
                this.canTransfer = canTransfer;
            }

            public boolean isCanWithdraw() {
                return canWithdraw;
            }

            public void setCanWithdraw(boolean canWithdraw) {
                this.canWithdraw = canWithdraw;
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

            public String getCoinShowName() {
                return coinShowName;
            }

            public void setCoinShowName(String coinShowName) {
                this.coinShowName = coinShowName;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public int getError() {
                return error;
            }

            public void setError(int error) {
                this.error = error;
            }

            public double getFrozen() {
                return frozen;
            }

            public void setFrozen(double frozen) {
                this.frozen = frozen;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public long getLastUpdateTime() {
                return lastUpdateTime;
            }

            public void setLastUpdateTime(long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getWalletAddress() {
                return walletAddress;
            }

            public void setWalletAddress(String walletAddress) {
                this.walletAddress = walletAddress;
            }
        }
    }
}
