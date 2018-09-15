package com.blackpai.otc.fexpay.bean;

/**
 * Created by 77 on 2018/8/13.
 */

public class Login {
    /**
     * code : 0
     * data : {"needGoogleAuth":false,"user":{"certifiedBusiness":true,"certifiedBusinessApplyTime":1532314308983,"certifiedBusinessStatus":2,"countryCode":"86","id":"2c9f9d8664baf3f70164bb2709460015","lastLoginIp":"218.189.28.120","lastLoginTime":1534153842521,"levelId":"ff808181646f340901647e6d23c5007c","loginErrorTimes":0,"merchantBusiness":false,"nickName":"杨洋一","payPwdErrorTime":1533884003086,"payPwdErrorTimes":0,"paySalt":"BQdrU","realAuditing":2,"receiveBusinessApplyTime":1532761788464,"receiveBusinessStatus":1,"registerTime":1532148255046,"state":"NORMAL","userName":"15631675108"}}
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
         * needGoogleAuth : false
         * user : {"certifiedBusiness":true,"certifiedBusinessApplyTime":1532314308983,"certifiedBusinessStatus":2,"countryCode":"86","id":"2c9f9d8664baf3f70164bb2709460015","lastLoginIp":"218.189.28.120","lastLoginTime":1534153842521,"levelId":"ff808181646f340901647e6d23c5007c","loginErrorTimes":0,"merchantBusiness":false,"nickName":"杨洋一","payPwdErrorTime":1533884003086,"payPwdErrorTimes":0,"paySalt":"BQdrU","realAuditing":2,"receiveBusinessApplyTime":1532761788464,"receiveBusinessStatus":1,"registerTime":1532148255046,"state":"NORMAL","userName":"15631675108"}
         */

        private boolean needGoogleAuth;
        private UserBean user;

        public boolean isNeedGoogleAuth() {
            return needGoogleAuth;
        }

        public void setNeedGoogleAuth(boolean needGoogleAuth) {
            this.needGoogleAuth = needGoogleAuth;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * certifiedBusiness : true
             * certifiedBusinessApplyTime : 1532314308983
             * certifiedBusinessStatus : 2
             * countryCode : 86
             * id : 2c9f9d8664baf3f70164bb2709460015
             * lastLoginIp : 218.189.28.120
             * lastLoginTime : 1534153842521
             * levelId : ff808181646f340901647e6d23c5007c
             * loginErrorTimes : 0
             * merchantBusiness : false
             * nickName : 杨洋一
             * payPwdErrorTime : 1533884003086
             * payPwdErrorTimes : 0
             * paySalt : BQdrU
             * realAuditing : 2
             * receiveBusinessApplyTime : 1532761788464
             * receiveBusinessStatus : 1
             * registerTime : 1532148255046
             * state : NORMAL
             * userName : 15631675108
             */

            private boolean certifiedBusiness;
            private long certifiedBusinessApplyTime;
            private int certifiedBusinessStatus;
            private String countryCode;
            private String id;
            private String lastLoginIp;
            private long lastLoginTime;
            private String levelId;
            private int loginErrorTimes;
            private boolean merchantBusiness;
            private String nickName;
            private long payPwdErrorTime;
            private int payPwdErrorTimes;
            private String paySalt;
            private int realAuditing;
            private long receiveBusinessApplyTime;
            private int receiveBusinessStatus;
            private long registerTime;
            private String state;
            private String userName;

            public boolean isCertifiedBusiness() {
                return certifiedBusiness;
            }

            public void setCertifiedBusiness(boolean certifiedBusiness) {
                this.certifiedBusiness = certifiedBusiness;
            }

            public long getCertifiedBusinessApplyTime() {
                return certifiedBusinessApplyTime;
            }

            public void setCertifiedBusinessApplyTime(long certifiedBusinessApplyTime) {
                this.certifiedBusinessApplyTime = certifiedBusinessApplyTime;
            }

            public int getCertifiedBusinessStatus() {
                return certifiedBusinessStatus;
            }

            public void setCertifiedBusinessStatus(int certifiedBusinessStatus) {
                this.certifiedBusinessStatus = certifiedBusinessStatus;
            }

            public String getCountryCode() {
                return countryCode;
            }

            public void setCountryCode(String countryCode) {
                this.countryCode = countryCode;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLastLoginIp() {
                return lastLoginIp;
            }

            public void setLastLoginIp(String lastLoginIp) {
                this.lastLoginIp = lastLoginIp;
            }

            public long getLastLoginTime() {
                return lastLoginTime;
            }

            public void setLastLoginTime(long lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
            }

            public String getLevelId() {
                return levelId;
            }

            public void setLevelId(String levelId) {
                this.levelId = levelId;
            }

            public int getLoginErrorTimes() {
                return loginErrorTimes;
            }

            public void setLoginErrorTimes(int loginErrorTimes) {
                this.loginErrorTimes = loginErrorTimes;
            }

            public boolean isMerchantBusiness() {
                return merchantBusiness;
            }

            public void setMerchantBusiness(boolean merchantBusiness) {
                this.merchantBusiness = merchantBusiness;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public long getPayPwdErrorTime() {
                return payPwdErrorTime;
            }

            public void setPayPwdErrorTime(long payPwdErrorTime) {
                this.payPwdErrorTime = payPwdErrorTime;
            }

            public int getPayPwdErrorTimes() {
                return payPwdErrorTimes;
            }

            public void setPayPwdErrorTimes(int payPwdErrorTimes) {
                this.payPwdErrorTimes = payPwdErrorTimes;
            }

            public String getPaySalt() {
                return paySalt;
            }

            public void setPaySalt(String paySalt) {
                this.paySalt = paySalt;
            }

            public int getRealAuditing() {
                return realAuditing;
            }

            public void setRealAuditing(int realAuditing) {
                this.realAuditing = realAuditing;
            }

            public long getReceiveBusinessApplyTime() {
                return receiveBusinessApplyTime;
            }

            public void setReceiveBusinessApplyTime(long receiveBusinessApplyTime) {
                this.receiveBusinessApplyTime = receiveBusinessApplyTime;
            }

            public int getReceiveBusinessStatus() {
                return receiveBusinessStatus;
            }

            public void setReceiveBusinessStatus(int receiveBusinessStatus) {
                this.receiveBusinessStatus = receiveBusinessStatus;
            }

            public long getRegisterTime() {
                return registerTime;
            }

            public void setRegisterTime(long registerTime) {
                this.registerTime = registerTime;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }
        }
    }
}
