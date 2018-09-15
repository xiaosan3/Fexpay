package com.blackpai.otc.fexpay.bean;

import java.util.List;

/**
 * Created by 77 on 2018/8/18.
 * 账单明细
 */

public class BillDetails {
    /**
     * code : 0
     * data : {"rows":[{"afterAvailable":5680149.11600249,"afterFrozen":20.881,"beforeAvailable":5680149.11600249,"beforeFrozen":21.891,"changeAmount":1.01,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866545e8fc01654741f3f30064","note":"用户出售币，冻结减少。变更后理论值：可用=5680149.11600249，冻结=20.88100000","operTime":1534498829299,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0817186374017","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":2222396.06378859,"afterFrozen":0,"beforeAvailable":2222396.06378859,"beforeFrozen":1.01,"changeAmount":1.01,"coin":{"feeDirectionName":"","name":"BTC","showName":"比特币"},"coinId":"1","coinName":"BTC","directionName":"","id":"2c9f9d866545e8fc0165473ff2d90052","note":"用户出售币，冻结减少。变更后理论值：可用=2222396.06378859，冻结=0E-8","operTime":1534498697945,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0817186374015","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9927809.37081114,"afterFrozen":1428,"beforeAvailable":9927809.37081114,"beforeFrozen":1548,"changeAmount":120,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866545e8fc0165473f134e0047","note":"用户出售币，冻结减少。变更后理论值：可用=9927809.37081114，冻结=1428.00000000","operTime":1534498640718,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0817186374014","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680150.22600249,"afterFrozen":20.781,"beforeAvailable":5680150.02600249,"beforeFrozen":20.781,"changeAmount":0.2,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"ADD","directionName":"Add","id":"dc675b44468d4902a085d4aacaf4a7c5","operTime":1534491175339,"optType":0,"serials":"886d48f993b74d9b9de49da91626029f","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.02600249,"afterFrozen":20.781,"beforeAvailable":5680150.01600249,"beforeFrozen":20.781,"changeAmount":0.01,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"ADD","directionName":"Add","id":"092d07d690df498e865ecf960c8b362b","operTime":1534489470864,"optType":0,"serials":"8af52714adf74171a1f356ba51aeb70f","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9927929.37081114,"afterFrozen":1428,"beforeAvailable":9927929.37081114,"beforeFrozen":1551,"changeAmount":123,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866545e8fc016546a69478002a","note":"买家申诉成功，冻结减少。变更后理论值：可用=9927929.37081114，冻结=1428.00000000","operTime":1534488646776,"optType":5,"serials":"0817186374011","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":2222397.07378859,"afterFrozen":0,"beforeAvailable":2222396.07378859,"beforeFrozen":0,"changeAmount":1,"coin":{"feeDirectionName":"","name":"BTC","showName":"比特币"},"coinId":"1","coinName":"BTC","directionName":"","id":"2c9f9d866545e8fc016546a3d11a0022","note":"用户购买币，可用增加。变更后理论值：可用=2222397.07378859，冻结=0E-8","operTime":1534488465690,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":4,"serials":"0817186374013","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9928052.37081114,"afterFrozen":1428,"beforeAvailable":9929052.37081114,"beforeFrozen":1428,"changeAmount":1000,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866542a03a016545c957950970","note":"用户入金，用户可用转冻结。变更后理论值：可用=9928052.3708111400000000，冻结=1428.00000000","operTime":1534474147733,"optType":6,"serials":"E0817188341522","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.01800249,"afterFrozen":20.779,"beforeAvailable":5680150.01800249,"beforeFrozen":21.779,"changeAmount":1,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866542a03a016545bfab57096a","note":"用户出售币，冻结减少。变更后理论值：可用=5680150.01800249，冻结=20.77900000","operTime":1534473513815,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0817188341521","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9929052.37081114,"afterFrozen":1428,"beforeAvailable":9930052.37081114,"beforeFrozen":1428,"changeAmount":1000,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866542a03a016545bb8b3d095f","note":"用户入金，用户可用转冻结。变更后理论值：可用=9929052.3708111400000000，冻结=1428.00000000","operTime":1534473243453,"optType":6,"serials":"E0817188341520","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9930052.37081114,"afterFrozen":1428,"beforeAvailable":9929830.37081114,"beforeFrozen":1428,"changeAmount":222,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866542a03a016545b10b2d0958","note":"用户购买币，可用增加。变更后理论值：可用=9930052.37081114，冻结=1428.00000000","operTime":1534472555309,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":4,"serials":"0817188341519","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680151.01800249,"afterFrozen":20.779,"beforeAvailable":5680150.01800249,"beforeFrozen":20.779,"changeAmount":1,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866542973a01654299220f0012","note":"用户购买币，可用增加。变更后理论值：可用=5680151.01800249，冻结=20.77900000","operTime":1534420656655,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":4,"serials":"0816188341516","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680150.01800249,"afterFrozen":20.779,"beforeAvailable":5680150.01800249,"beforeFrozen":21.779,"changeAmount":1,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866542973a01654297e0550007","note":"用户出售币，冻结减少。变更后理论值：可用=5680150.01800249，冻结=20.77900000","operTime":1534420574293,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0816188341515","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":2222396.07378859,"afterFrozen":0,"beforeAvailable":2222396.07378859,"beforeFrozen":1,"changeAmount":1,"coin":{"feeDirectionName":"","name":"BTC","showName":"比特币"},"coinId":"1","coinName":"BTC","directionName":"","id":"2c9f9d86654250d10165428c2a0b002c","note":"用户出售币，冻结减少。变更后理论值：可用=2222396.07378859，冻结=0E-8","operTime":1534419806731,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0816188341514","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9918719.37081114,"afterFrozen":12539,"beforeAvailable":9918596.37081114,"beforeFrozen":12539,"changeAmount":123,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86654250d10165427560c3001c","note":"商家转账，用户转入可用转冻结。变更后理论值：可用=9918719.37081114，冻结=12539.00000000","operTime":1534418313411,"optType":2,"serials":"T0816188341512","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9929707.37081114,"afterFrozen":1428,"beforeAvailable":9929685.37081114,"beforeFrozen":1428,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86654250d10165425c6bf00006","note":"用户购买币，可用增加。变更后理论值：可用=9929707.37081114，冻结=1428.00000000","operTime":1534416677872,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":4,"serials":"0816188341509","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680151.04000249,"afterFrozen":20.757,"beforeAvailable":5680150.04000249,"beforeFrozen":20.757,"changeAmount":1,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866541f33a0165422c991a001e","note":"商家转账，用户转入可用转冻结。变更后理论值：可用=5680151.04000249，冻结=20.75700000","operTime":1534413543706,"optType":2,"serials":"T0816188341507","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.04000249,"afterFrozen":20.757,"beforeAvailable":5680150.04000249,"beforeFrozen":20.767,"changeAmount":-0.01,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"SUB","directionName":"Reduce","id":"eb7bc696f3cb4eb2a8da8a1697d82bf5","operTime":1534411861425,"optType":1,"serials":"2c9f9d86653d4873016541e27ba50064","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9929704.37081114,"afterFrozen":1409,"beforeAvailable":9929704.37081114,"beforeFrozen":1442,"changeAmount":-33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"SUB","directionName":"Reduce","id":"d1ec4e2ce95c47dc9fe7b5fce08e33e5","operTime":1534411811506,"optType":1,"serials":"2c9f9d86653d4873016541e132850061","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9929704.37081114,"afterFrozen":1442,"beforeAvailable":9929704.37081114,"beforeFrozen":1664,"changeAmount":222,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866541f33a0165420ac8ac000e","note":"用户出售币，冻结减少。变更后理论值：可用=9929704.37081114，冻结=1442.00000000","operTime":1534411327660,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0816188341506","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9929959.37081114,"afterFrozen":1409,"beforeAvailable":9929959.37081114,"beforeFrozen":1532,"changeAmount":123,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86653d4873016541c57d75005c","note":"用户出售币，冻结减少。变更后理论值：可用=9929959.37081114，冻结=1409.00000000","operTime":1534406786421,"optType":5,"serials":"0815188341502","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9929959.37081114,"afterFrozen":1532,"beforeAvailable":9929959.37081114,"beforeFrozen":1544,"changeAmount":-12,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"SUB","directionName":"Reduce","id":"24920ae44ba84a4ba319a1a460e522f5","operTime":1534405283714,"optType":1,"serials":"2c9f9d86653d48730165419ced28004b","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9930427.37081114,"afterFrozen":1076,"beforeAvailable":9930427.37081114,"beforeFrozen":2319,"changeAmount":1243,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86653cf21301653d2675cb0034","note":"用户出售币，冻结减少。变更后理论值：可用=9930427.37081114，冻结=1076.00000000","operTime":1534329255371,"optType":5,"serials":"0815188341501","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931670.37081114,"afterFrozen":1076,"beforeAvailable":9931670.37081114,"beforeFrozen":1199,"changeAmount":123,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86653cf21301653d0214050010","note":"用户出售币，冻结减少。变更后理论值：可用=9931670.37081114，冻结=1076.00000000","operTime":1534326871045,"optType":5,"serials":"0815188341497","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931793.37081114,"afterFrozen":1076,"beforeAvailable":9931793.37081114,"beforeFrozen":1087,"changeAmount":-11,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"SUB","directionName":"Reduce","id":"ffdf512bc45d4f5c8fa826c60ea4847f","operTime":1534321359839,"optType":1,"serials":"2c9f9d86653ca52a01653ca7b49f0000","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9931804.37081114,"afterFrozen":1076,"beforeAvailable":9931692.37081114,"beforeFrozen":1076,"changeAmount":112,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86653c46d101653ca061cc003d","note":"用户购买币，可用增加。变更后理论值：可用=9931804.37081114，冻结=1076.00000000","operTime":1534320468428,"optType":4,"serials":"0815188341495","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931847.37081114,"afterFrozen":921,"beforeAvailable":9931847.37081114,"beforeFrozen":1087,"changeAmount":166,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866527fd0e016531f47e330055","note":"买家申诉成功，冻结减少。变更后理论值：可用=9931847.37081114，冻结=921.00000000","operTime":1534141431346,"optType":5,"serials":"0813188341474","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931847.37081114,"afterFrozen":1087,"beforeAvailable":9931832.9694747,"beforeFrozen":1087,"changeAmount":14.40133644,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866527fd0e016531f03803004d","note":"用户购买币，可用增加。变更后理论值：可用=9931847.37081114，冻结=1087.00000000","operTime":1534141151235,"optType":4,"serials":"0813188341475","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931998.9694747,"afterFrozen":921,"beforeAvailable":9931976.9694747,"beforeFrozen":921,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d8665222192016527ed7dd6010a","note":"买家申诉成功，可用增加。变更后理论值：可用=9931998.96947470，冻结=921.00000000","operTime":1533973200342,"optType":4,"serials":"0811186888529","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931976.9694747,"afterFrozen":921,"beforeAvailable":9931865.9694747,"beforeFrozen":921,"changeAmount":111,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d8665222192016527e7a5b40105","note":"卖家申诉失败，可用增加。变更后理论值：可用=9931976.96947470，冻结=921.00000000","operTime":1533972817332,"optType":4,"serials":"0811186888527","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":2222395.07378859,"afterFrozen":2,"beforeAvailable":2222393.07378859,"beforeFrozen":2,"changeAmount":2,"coin":{"feeDirectionName":"","name":"BTC","showName":"比特币"},"coinId":"1","coinName":"BTC","directionName":"","id":"2c9f9d8665222192016527e4653e00fd","note":"买家申诉成功，可用增加。变更后理论值：可用=2222395.07378859，冻结=2.00000000","operTime":1533972604222,"optType":4,"serials":"0811186888526","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931865.9694747,"afterFrozen":921,"beforeAvailable":9931832.9694747,"beforeFrozen":921,"changeAmount":33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d8665222192016527adf91900d2","note":"用户购买币，可用增加。变更后理论值：可用=9931865.96947470，冻结=921.00000000","operTime":1533969037593,"optType":4,"serials":"0811186888525","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931843.9694747,"afterFrozen":910,"beforeAvailable":9931843.9694747,"beforeFrozen":943,"changeAmount":33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866522219201652704011800c1","note":"用户出售币，冻结减少。变更后理论值：可用=9931843.96947470，冻结=910.00000000","operTime":1533957898520,"optType":5,"serials":"0811186888524","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931876.9694747,"afterFrozen":910,"beforeAvailable":9931876.9694747,"beforeFrozen":932,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86652221920165232d01e4009a","note":"用户出售币，冻结减少。变更后理论值：可用=9931876.96947470，冻结=910.00000000","operTime":1533893476836,"optType":5,"serials":"0810186888522","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931898.9694747,"afterFrozen":910,"beforeAvailable":9931898.9694747,"beforeFrozen":943,"changeAmount":33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86652221920165232a4536008f","note":"用户出售币，冻结减少。变更后理论值：可用=9931898.96947470，冻结=910.00000000","operTime":1533893297461,"optType":5,"serials":"0810186888521","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931931.9694747,"afterFrozen":910,"beforeAvailable":9931909.9694747,"beforeFrozen":910,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866522219201652326b6ae0083","note":"用户购买币，可用增加。变更后理论值：可用=9931931.96947470，冻结=910.00000000","operTime":1533893064366,"optType":4,"serials":"0810186888520","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931847.28076529,"afterFrozen":972.68870941,"beforeAvailable":9931814.28076529,"beforeFrozen":972.68870941,"changeAmount":33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86652221920165228b4b090036","note":"用户购买币，可用增加。变更后理论值：可用=9931847.28076529，冻结=972.68870941","operTime":1533882878729,"optType":4,"serials":"0810186888512","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931887.9694747,"afterFrozen":899,"beforeAvailable":9931865.9694747,"beforeFrozen":899,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e901652205883b0205","note":"用户购买币，可用增加。变更后理论值：可用=9931887.96947470，冻结=899.00000000","operTime":1533874112571,"optType":4,"serials":"0810186888503","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931865.9694747,"afterFrozen":899,"beforeAvailable":9931865.9694747,"beforeFrozen":2010,"changeAmount":1111,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e9016521a5da0b01db","note":"用户出售币，冻结减少。变更后理论值：可用=9931865.96947470，冻结=899.00000000","operTime":1533867842059,"optType":5,"serials":"0810186888499","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9932976.9694747,"afterFrozen":899,"beforeAvailable":9932976.9694747,"beforeFrozen":2010,"changeAmount":1111,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e9016521a4028101cf","note":"用户出售币，冻结减少。变更后理论值：可用=9932976.96947470，冻结=899.00000000","operTime":1533867721345,"optType":5,"serials":"0810186888497","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9934087.9694747,"afterFrozen":899,"beforeAvailable":9932976.9694747,"beforeFrozen":899,"changeAmount":1111,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e90165219e4a8a01b8","note":"用户购买币，可用增加。变更后理论值：可用=9934087.96947470，冻结=899.00000000","operTime":1533867346570,"optType":4,"serials":"0810186888496","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9932976.9694747,"afterFrozen":899,"beforeAvailable":9932976.9694747,"beforeFrozen":943,"changeAmount":44,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e901651e131e1e0004","note":"买家申诉成功，冻结减少。变更后理论值：可用=9932976.96947470，冻结=899.00000000","operTime":1533807894046,"optType":5,"serials":"0801185773842","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9932976.9694747,"afterFrozen":943,"beforeAvailable":9931976.9694747,"beforeFrozen":943,"changeAmount":1000,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651cb1f901651cbf7b4f0007","note":"用户购买币，可用增加。变更后理论值：可用=9932976.96947470，冻结=943.00000000","operTime":1533785635663,"optType":4,"serials":"0809186888495","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680150.65000249,"afterFrozen":20.157,"beforeAvailable":5680150.65000249,"beforeFrozen":20.213,"changeAmount":-0.056,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"SUB","directionName":"Reduce","id":"b6d9a2f2410a458290445ac041cdc1b5","operTime":1533628628826,"optType":1,"serials":"2c9f9d866512bb1f0165135e17bf0066","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9931976.9694747,"afterFrozen":943,"beforeAvailable":9931712.2994747,"beforeFrozen":943,"changeAmount":264.67,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"ADD","directionName":"Add","id":"a6daa62c45c04d80b9d072dd2d042b85","operTime":1533628495441,"optType":0,"serials":"97d35d71caef4d44bb8beeaf5173f7bb","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9931712.2994747,"afterFrozen":943,"beforeAvailable":9931712.2994747,"beforeFrozen":1188,"changeAmount":-245,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"SUB","directionName":"Reduce","id":"ce71a6e1fc4b4df99f70047a61dd5d04","operTime":1533627788718,"optType":1,"serials":"2c9f9d866512bb1f0165135049bc004d","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9931712.2994747,"afterFrozen":1188,"beforeAvailable":9931558.0744747,"beforeFrozen":1188,"changeAmount":154.225,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"ADD","directionName":"Add","id":"92591f27baa94f7f8d45a03a05e1a910","operTime":1533627775462,"optType":0,"serials":"f1ea87a5a6f642c099adcffdb3dfffa3","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.70600249,"afterFrozen":20.157,"beforeAvailable":5680150.70600249,"beforeFrozen":20.17,"changeAmount":-0.013,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"SUB","directionName":"Reduce","id":"5a3bfa7a982842538dc338ad144813c6","operTime":1533627668650,"optType":1,"serials":"2c9f9d866512bb1f0165134ce9ca0045","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.70600249,"afterFrozen":20.17,"beforeAvailable":5680150.67416249,"beforeFrozen":20.17,"changeAmount":0.03184,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"ADD","directionName":"Add","id":"2f50c02b793345d98b1ec4cd6d760dc8","operTime":1533627653721,"optType":0,"serials":"56ecf4388bb84a5aa26b8d6eddb000ae","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.68716249,"afterFrozen":20.157,"beforeAvailable":5680150.68716249,"beforeFrozen":20.17,"changeAmount":-0.013,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"SUB","directionName":"Reduce","id":"4aab229e0e104375966f030021aca14f","operTime":1533627099465,"optType":1,"serials":"2c9f9d866512bb1f01651345e8780041","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"}],"total":164}
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
         * rows : [{"afterAvailable":5680149.11600249,"afterFrozen":20.881,"beforeAvailable":5680149.11600249,"beforeFrozen":21.891,"changeAmount":1.01,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866545e8fc01654741f3f30064","note":"用户出售币，冻结减少。变更后理论值：可用=5680149.11600249，冻结=20.88100000","operTime":1534498829299,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0817186374017","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":2222396.06378859,"afterFrozen":0,"beforeAvailable":2222396.06378859,"beforeFrozen":1.01,"changeAmount":1.01,"coin":{"feeDirectionName":"","name":"BTC","showName":"比特币"},"coinId":"1","coinName":"BTC","directionName":"","id":"2c9f9d866545e8fc0165473ff2d90052","note":"用户出售币，冻结减少。变更后理论值：可用=2222396.06378859，冻结=0E-8","operTime":1534498697945,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0817186374015","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9927809.37081114,"afterFrozen":1428,"beforeAvailable":9927809.37081114,"beforeFrozen":1548,"changeAmount":120,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866545e8fc0165473f134e0047","note":"用户出售币，冻结减少。变更后理论值：可用=9927809.37081114，冻结=1428.00000000","operTime":1534498640718,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0817186374014","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680150.22600249,"afterFrozen":20.781,"beforeAvailable":5680150.02600249,"beforeFrozen":20.781,"changeAmount":0.2,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"ADD","directionName":"Add","id":"dc675b44468d4902a085d4aacaf4a7c5","operTime":1534491175339,"optType":0,"serials":"886d48f993b74d9b9de49da91626029f","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.02600249,"afterFrozen":20.781,"beforeAvailable":5680150.01600249,"beforeFrozen":20.781,"changeAmount":0.01,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"ADD","directionName":"Add","id":"092d07d690df498e865ecf960c8b362b","operTime":1534489470864,"optType":0,"serials":"8af52714adf74171a1f356ba51aeb70f","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9927929.37081114,"afterFrozen":1428,"beforeAvailable":9927929.37081114,"beforeFrozen":1551,"changeAmount":123,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866545e8fc016546a69478002a","note":"买家申诉成功，冻结减少。变更后理论值：可用=9927929.37081114，冻结=1428.00000000","operTime":1534488646776,"optType":5,"serials":"0817186374011","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":2222397.07378859,"afterFrozen":0,"beforeAvailable":2222396.07378859,"beforeFrozen":0,"changeAmount":1,"coin":{"feeDirectionName":"","name":"BTC","showName":"比特币"},"coinId":"1","coinName":"BTC","directionName":"","id":"2c9f9d866545e8fc016546a3d11a0022","note":"用户购买币，可用增加。变更后理论值：可用=2222397.07378859，冻结=0E-8","operTime":1534488465690,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":4,"serials":"0817186374013","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9928052.37081114,"afterFrozen":1428,"beforeAvailable":9929052.37081114,"beforeFrozen":1428,"changeAmount":1000,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866542a03a016545c957950970","note":"用户入金，用户可用转冻结。变更后理论值：可用=9928052.3708111400000000，冻结=1428.00000000","operTime":1534474147733,"optType":6,"serials":"E0817188341522","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.01800249,"afterFrozen":20.779,"beforeAvailable":5680150.01800249,"beforeFrozen":21.779,"changeAmount":1,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866542a03a016545bfab57096a","note":"用户出售币，冻结减少。变更后理论值：可用=5680150.01800249，冻结=20.77900000","operTime":1534473513815,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0817188341521","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9929052.37081114,"afterFrozen":1428,"beforeAvailable":9930052.37081114,"beforeFrozen":1428,"changeAmount":1000,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866542a03a016545bb8b3d095f","note":"用户入金，用户可用转冻结。变更后理论值：可用=9929052.3708111400000000，冻结=1428.00000000","operTime":1534473243453,"optType":6,"serials":"E0817188341520","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9930052.37081114,"afterFrozen":1428,"beforeAvailable":9929830.37081114,"beforeFrozen":1428,"changeAmount":222,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866542a03a016545b10b2d0958","note":"用户购买币，可用增加。变更后理论值：可用=9930052.37081114，冻结=1428.00000000","operTime":1534472555309,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":4,"serials":"0817188341519","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680151.01800249,"afterFrozen":20.779,"beforeAvailable":5680150.01800249,"beforeFrozen":20.779,"changeAmount":1,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866542973a01654299220f0012","note":"用户购买币，可用增加。变更后理论值：可用=5680151.01800249，冻结=20.77900000","operTime":1534420656655,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":4,"serials":"0816188341516","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680150.01800249,"afterFrozen":20.779,"beforeAvailable":5680150.01800249,"beforeFrozen":21.779,"changeAmount":1,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866542973a01654297e0550007","note":"用户出售币，冻结减少。变更后理论值：可用=5680150.01800249，冻结=20.77900000","operTime":1534420574293,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0816188341515","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":2222396.07378859,"afterFrozen":0,"beforeAvailable":2222396.07378859,"beforeFrozen":1,"changeAmount":1,"coin":{"feeDirectionName":"","name":"BTC","showName":"比特币"},"coinId":"1","coinName":"BTC","directionName":"","id":"2c9f9d86654250d10165428c2a0b002c","note":"用户出售币，冻结减少。变更后理论值：可用=2222396.07378859，冻结=0E-8","operTime":1534419806731,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0816188341514","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9918719.37081114,"afterFrozen":12539,"beforeAvailable":9918596.37081114,"beforeFrozen":12539,"changeAmount":123,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86654250d10165427560c3001c","note":"商家转账，用户转入可用转冻结。变更后理论值：可用=9918719.37081114，冻结=12539.00000000","operTime":1534418313411,"optType":2,"serials":"T0816188341512","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9929707.37081114,"afterFrozen":1428,"beforeAvailable":9929685.37081114,"beforeFrozen":1428,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86654250d10165425c6bf00006","note":"用户购买币，可用增加。变更后理论值：可用=9929707.37081114，冻结=1428.00000000","operTime":1534416677872,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":4,"serials":"0816188341509","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680151.04000249,"afterFrozen":20.757,"beforeAvailable":5680150.04000249,"beforeFrozen":20.757,"changeAmount":1,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","directionName":"","id":"2c9f9d866541f33a0165422c991a001e","note":"商家转账，用户转入可用转冻结。变更后理论值：可用=5680151.04000249，冻结=20.75700000","operTime":1534413543706,"optType":2,"serials":"T0816188341507","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.04000249,"afterFrozen":20.757,"beforeAvailable":5680150.04000249,"beforeFrozen":20.767,"changeAmount":-0.01,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"SUB","directionName":"Reduce","id":"eb7bc696f3cb4eb2a8da8a1697d82bf5","operTime":1534411861425,"optType":1,"serials":"2c9f9d86653d4873016541e27ba50064","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9929704.37081114,"afterFrozen":1409,"beforeAvailable":9929704.37081114,"beforeFrozen":1442,"changeAmount":-33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"SUB","directionName":"Reduce","id":"d1ec4e2ce95c47dc9fe7b5fce08e33e5","operTime":1534411811506,"optType":1,"serials":"2c9f9d86653d4873016541e132850061","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9929704.37081114,"afterFrozen":1442,"beforeAvailable":9929704.37081114,"beforeFrozen":1664,"changeAmount":222,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866541f33a0165420ac8ac000e","note":"用户出售币，冻结减少。变更后理论值：可用=9929704.37081114，冻结=1442.00000000","operTime":1534411327660,"opponentId":"ff8081816436c083016436c6b42d0000","opponentName":"bpwallet01","optType":5,"serials":"0816188341506","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9929959.37081114,"afterFrozen":1409,"beforeAvailable":9929959.37081114,"beforeFrozen":1532,"changeAmount":123,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86653d4873016541c57d75005c","note":"用户出售币，冻结减少。变更后理论值：可用=9929959.37081114，冻结=1409.00000000","operTime":1534406786421,"optType":5,"serials":"0815188341502","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9929959.37081114,"afterFrozen":1532,"beforeAvailable":9929959.37081114,"beforeFrozen":1544,"changeAmount":-12,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"SUB","directionName":"Reduce","id":"24920ae44ba84a4ba319a1a460e522f5","operTime":1534405283714,"optType":1,"serials":"2c9f9d86653d48730165419ced28004b","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9930427.37081114,"afterFrozen":1076,"beforeAvailable":9930427.37081114,"beforeFrozen":2319,"changeAmount":1243,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86653cf21301653d2675cb0034","note":"用户出售币，冻结减少。变更后理论值：可用=9930427.37081114，冻结=1076.00000000","operTime":1534329255371,"optType":5,"serials":"0815188341501","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931670.37081114,"afterFrozen":1076,"beforeAvailable":9931670.37081114,"beforeFrozen":1199,"changeAmount":123,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86653cf21301653d0214050010","note":"用户出售币，冻结减少。变更后理论值：可用=9931670.37081114，冻结=1076.00000000","operTime":1534326871045,"optType":5,"serials":"0815188341497","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931793.37081114,"afterFrozen":1076,"beforeAvailable":9931793.37081114,"beforeFrozen":1087,"changeAmount":-11,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"SUB","directionName":"Reduce","id":"ffdf512bc45d4f5c8fa826c60ea4847f","operTime":1534321359839,"optType":1,"serials":"2c9f9d86653ca52a01653ca7b49f0000","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9931804.37081114,"afterFrozen":1076,"beforeAvailable":9931692.37081114,"beforeFrozen":1076,"changeAmount":112,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86653c46d101653ca061cc003d","note":"用户购买币，可用增加。变更后理论值：可用=9931804.37081114，冻结=1076.00000000","operTime":1534320468428,"optType":4,"serials":"0815188341495","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931847.37081114,"afterFrozen":921,"beforeAvailable":9931847.37081114,"beforeFrozen":1087,"changeAmount":166,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866527fd0e016531f47e330055","note":"买家申诉成功，冻结减少。变更后理论值：可用=9931847.37081114，冻结=921.00000000","operTime":1534141431346,"optType":5,"serials":"0813188341474","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931847.37081114,"afterFrozen":1087,"beforeAvailable":9931832.9694747,"beforeFrozen":1087,"changeAmount":14.40133644,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866527fd0e016531f03803004d","note":"用户购买币，可用增加。变更后理论值：可用=9931847.37081114，冻结=1087.00000000","operTime":1534141151235,"optType":4,"serials":"0813188341475","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931998.9694747,"afterFrozen":921,"beforeAvailable":9931976.9694747,"beforeFrozen":921,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d8665222192016527ed7dd6010a","note":"买家申诉成功，可用增加。变更后理论值：可用=9931998.96947470，冻结=921.00000000","operTime":1533973200342,"optType":4,"serials":"0811186888529","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931976.9694747,"afterFrozen":921,"beforeAvailable":9931865.9694747,"beforeFrozen":921,"changeAmount":111,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d8665222192016527e7a5b40105","note":"卖家申诉失败，可用增加。变更后理论值：可用=9931976.96947470，冻结=921.00000000","operTime":1533972817332,"optType":4,"serials":"0811186888527","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":2222395.07378859,"afterFrozen":2,"beforeAvailable":2222393.07378859,"beforeFrozen":2,"changeAmount":2,"coin":{"feeDirectionName":"","name":"BTC","showName":"比特币"},"coinId":"1","coinName":"BTC","directionName":"","id":"2c9f9d8665222192016527e4653e00fd","note":"买家申诉成功，可用增加。变更后理论值：可用=2222395.07378859，冻结=2.00000000","operTime":1533972604222,"optType":4,"serials":"0811186888526","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931865.9694747,"afterFrozen":921,"beforeAvailable":9931832.9694747,"beforeFrozen":921,"changeAmount":33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d8665222192016527adf91900d2","note":"用户购买币，可用增加。变更后理论值：可用=9931865.96947470，冻结=921.00000000","operTime":1533969037593,"optType":4,"serials":"0811186888525","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931843.9694747,"afterFrozen":910,"beforeAvailable":9931843.9694747,"beforeFrozen":943,"changeAmount":33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866522219201652704011800c1","note":"用户出售币，冻结减少。变更后理论值：可用=9931843.96947470，冻结=910.00000000","operTime":1533957898520,"optType":5,"serials":"0811186888524","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931876.9694747,"afterFrozen":910,"beforeAvailable":9931876.9694747,"beforeFrozen":932,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86652221920165232d01e4009a","note":"用户出售币，冻结减少。变更后理论值：可用=9931876.96947470，冻结=910.00000000","operTime":1533893476836,"optType":5,"serials":"0810186888522","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931898.9694747,"afterFrozen":910,"beforeAvailable":9931898.9694747,"beforeFrozen":943,"changeAmount":33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86652221920165232a4536008f","note":"用户出售币，冻结减少。变更后理论值：可用=9931898.96947470，冻结=910.00000000","operTime":1533893297461,"optType":5,"serials":"0810186888521","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931931.9694747,"afterFrozen":910,"beforeAvailable":9931909.9694747,"beforeFrozen":910,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d866522219201652326b6ae0083","note":"用户购买币，可用增加。变更后理论值：可用=9931931.96947470，冻结=910.00000000","operTime":1533893064366,"optType":4,"serials":"0810186888520","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931847.28076529,"afterFrozen":972.68870941,"beforeAvailable":9931814.28076529,"beforeFrozen":972.68870941,"changeAmount":33,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86652221920165228b4b090036","note":"用户购买币，可用增加。变更后理论值：可用=9931847.28076529，冻结=972.68870941","operTime":1533882878729,"optType":4,"serials":"0810186888512","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931887.9694747,"afterFrozen":899,"beforeAvailable":9931865.9694747,"beforeFrozen":899,"changeAmount":22,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e901652205883b0205","note":"用户购买币，可用增加。变更后理论值：可用=9931887.96947470，冻结=899.00000000","operTime":1533874112571,"optType":4,"serials":"0810186888503","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9931865.9694747,"afterFrozen":899,"beforeAvailable":9931865.9694747,"beforeFrozen":2010,"changeAmount":1111,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e9016521a5da0b01db","note":"用户出售币，冻结减少。变更后理论值：可用=9931865.96947470，冻结=899.00000000","operTime":1533867842059,"optType":5,"serials":"0810186888499","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9932976.9694747,"afterFrozen":899,"beforeAvailable":9932976.9694747,"beforeFrozen":2010,"changeAmount":1111,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e9016521a4028101cf","note":"用户出售币，冻结减少。变更后理论值：可用=9932976.96947470，冻结=899.00000000","operTime":1533867721345,"optType":5,"serials":"0810186888497","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9934087.9694747,"afterFrozen":899,"beforeAvailable":9932976.9694747,"beforeFrozen":899,"changeAmount":1111,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e90165219e4a8a01b8","note":"用户购买币，可用增加。变更后理论值：可用=9934087.96947470，冻结=899.00000000","operTime":1533867346570,"optType":4,"serials":"0810186888496","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9932976.9694747,"afterFrozen":899,"beforeAvailable":9932976.9694747,"beforeFrozen":943,"changeAmount":44,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651d38e901651e131e1e0004","note":"买家申诉成功，冻结减少。变更后理论值：可用=9932976.96947470，冻结=899.00000000","operTime":1533807894046,"optType":5,"serials":"0801185773842","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":9932976.9694747,"afterFrozen":943,"beforeAvailable":9931976.9694747,"beforeFrozen":943,"changeAmount":1000,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","directionName":"","id":"2c9f9d86651cb1f901651cbf7b4f0007","note":"用户购买币，可用增加。变更后理论值：可用=9932976.96947470，冻结=943.00000000","operTime":1533785635663,"optType":4,"serials":"0809186888495","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"杨洋一"},{"afterAvailable":5680150.65000249,"afterFrozen":20.157,"beforeAvailable":5680150.65000249,"beforeFrozen":20.213,"changeAmount":-0.056,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"SUB","directionName":"Reduce","id":"b6d9a2f2410a458290445ac041cdc1b5","operTime":1533628628826,"optType":1,"serials":"2c9f9d866512bb1f0165135e17bf0066","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9931976.9694747,"afterFrozen":943,"beforeAvailable":9931712.2994747,"beforeFrozen":943,"changeAmount":264.67,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"ADD","directionName":"Add","id":"a6daa62c45c04d80b9d072dd2d042b85","operTime":1533628495441,"optType":0,"serials":"97d35d71caef4d44bb8beeaf5173f7bb","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9931712.2994747,"afterFrozen":943,"beforeAvailable":9931712.2994747,"beforeFrozen":1188,"changeAmount":-245,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"SUB","directionName":"Reduce","id":"ce71a6e1fc4b4df99f70047a61dd5d04","operTime":1533627788718,"optType":1,"serials":"2c9f9d866512bb1f0165135049bc004d","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":9931712.2994747,"afterFrozen":1188,"beforeAvailable":9931558.0744747,"beforeFrozen":1188,"changeAmount":154.225,"coin":{"feeDirectionName":"","name":"UND","showName":"UND"},"coinId":"3","coinName":"UND","direction":"ADD","directionName":"Add","id":"92591f27baa94f7f8d45a03a05e1a910","operTime":1533627775462,"optType":0,"serials":"f1ea87a5a6f642c099adcffdb3dfffa3","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.70600249,"afterFrozen":20.157,"beforeAvailable":5680150.70600249,"beforeFrozen":20.17,"changeAmount":-0.013,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"SUB","directionName":"Reduce","id":"5a3bfa7a982842538dc338ad144813c6","operTime":1533627668650,"optType":1,"serials":"2c9f9d866512bb1f0165134ce9ca0045","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.70600249,"afterFrozen":20.17,"beforeAvailable":5680150.67416249,"beforeFrozen":20.17,"changeAmount":0.03184,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"ADD","directionName":"Add","id":"2f50c02b793345d98b1ec4cd6d760dc8","operTime":1533627653721,"optType":0,"serials":"56ecf4388bb84a5aa26b8d6eddb000ae","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"},{"afterAvailable":5680150.68716249,"afterFrozen":20.157,"beforeAvailable":5680150.68716249,"beforeFrozen":20.17,"changeAmount":-0.013,"coin":{"feeDirectionName":"","name":"ETH","showName":"以太坊"},"coinId":"2","coinName":"ETH","direction":"SUB","directionName":"Reduce","id":"4aab229e0e104375966f030021aca14f","operTime":1533627099465,"optType":1,"serials":"2c9f9d866512bb1f01651345e8780041","userId":"2c9f9d8664baf3f70164bb2709460015","userName":"15631675108"}]
         * total : 164
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
             * afterAvailable : 5680149.11600249
             * afterFrozen : 20.881
             * beforeAvailable : 5680149.11600249
             * beforeFrozen : 21.891
             * changeAmount : 1.01
             * coin : {"feeDirectionName":"","name":"ETH","showName":"以太坊"}
             * coinId : 2
             * coinName : ETH
             * directionName :
             * id : 2c9f9d866545e8fc01654741f3f30064
             * note : 用户出售币，冻结减少。变更后理论值：可用=5680149.11600249，冻结=20.88100000
             * operTime : 1534498829299
             * opponentId : ff8081816436c083016436c6b42d0000
             * opponentName : bpwallet01
             * optType : 5
             * serials : 0817186374017
             * userId : 2c9f9d8664baf3f70164bb2709460015
             * userName : 杨洋一
             * direction : ADD
             */

            private double afterAvailable;
            private double afterFrozen;
            private double beforeAvailable;
            private double beforeFrozen;
            private double changeAmount;
            private CoinBean coin;
            private String coinId;
            private String coinName;
            private String directionName;
            private String id;
            private String note;
            private long operTime;
            private String opponentId;
            private String opponentName;
            private int optType;
            private String serials;
            private String userId;
            private String userName;
            private String direction;

            public double getAfterAvailable() {
                return afterAvailable;
            }

            public void setAfterAvailable(double afterAvailable) {
                this.afterAvailable = afterAvailable;
            }

            public double getAfterFrozen() {
                return afterFrozen;
            }

            public void setAfterFrozen(double afterFrozen) {
                this.afterFrozen = afterFrozen;
            }

            public double getBeforeAvailable() {
                return beforeAvailable;
            }

            public void setBeforeAvailable(double beforeAvailable) {
                this.beforeAvailable = beforeAvailable;
            }

            public double getBeforeFrozen() {
                return beforeFrozen;
            }

            public void setBeforeFrozen(double beforeFrozen) {
                this.beforeFrozen = beforeFrozen;
            }

            public double getChangeAmount() {
                return changeAmount;
            }

            public void setChangeAmount(double changeAmount) {
                this.changeAmount = changeAmount;
            }

            public CoinBean getCoin() {
                return coin;
            }

            public void setCoin(CoinBean coin) {
                this.coin = coin;
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

            public String getDirectionName() {
                return directionName;
            }

            public void setDirectionName(String directionName) {
                this.directionName = directionName;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getNote() {
                return note;
            }

            public void setNote(String note) {
                this.note = note;
            }

            public long getOperTime() {
                return operTime;
            }

            public void setOperTime(long operTime) {
                this.operTime = operTime;
            }

            public String getOpponentId() {
                return opponentId;
            }

            public void setOpponentId(String opponentId) {
                this.opponentId = opponentId;
            }

            public String getOpponentName() {
                return opponentName;
            }

            public void setOpponentName(String opponentName) {
                this.opponentName = opponentName;
            }

            public int getOptType() {
                return optType;
            }

            public void setOptType(int optType) {
                this.optType = optType;
            }

            public String getSerials() {
                return serials;
            }

            public void setSerials(String serials) {
                this.serials = serials;
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

            public String getDirection() {
                return direction;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public static class CoinBean {
                /**
                 * feeDirectionName :
                 * name : ETH
                 * showName : 以太坊
                 */

                private String feeDirectionName;
                private String name;
                private String showName;

                public String getFeeDirectionName() {
                    return feeDirectionName;
                }

                public void setFeeDirectionName(String feeDirectionName) {
                    this.feeDirectionName = feeDirectionName;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getShowName() {
                    return showName;
                }

                public void setShowName(String showName) {
                    this.showName = showName;
                }
            }
        }
    }
}
