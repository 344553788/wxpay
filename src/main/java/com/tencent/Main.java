package com.tencent;

import java.util.ArrayList;
import java.util.List;

import com.tencent.common.Util;
import com.tencent.protocol.downloadbill_protocol.DownloadBillReqData;
import com.tencent.protocol.pay_query_protocol.ScanPayQueryReqData;
import com.tencent.protocol.pay_query_protocol.ScanPayQueryResData;

public class Main {

    public static void main(String[] args) {

        try {

            //--------------------------------------------------------------------
            //婵犵數鍋為幐鎾疾閻樿櫣浜梻浣告贡缁垶宕濆Δ鍛︽慨妯垮煐閺咁剛锟界櫢鎷烽柨鐔剁矙椤㈡牠宕堕妸褉鏋栭梺璺ㄥ枙濡嫰鍩㈡惔銊ョ伋闁圭粯宸婚弸蹇涙⒑閻戔晛浜鹃柛鏂跨箻椤㈡艾顫㈡繝顨遍梻浣告惈閸燁垶宕曟總鍓叉晪妞ゆ帒瀚粈鍡涙煟瑜忓﹢鎭�.tencent.common.Configure缂傚倷绶￠崑鍕�﹂悜钘夐棷闁绘垼濮らˉ鍫ユ煏韫囥儳鎮肩紒鐘差煼閹泛鈽夊Ο鑲╁姱闂佸憡菧閸婃妲愰弮鍫熸櫢闁跨噦鎷�
            //--------------------------------------------------------------------



            //--------------------------------------------------------------------
            //PART One:闂備胶纭堕弲鐐测枍閿濆锟戒線宕ㄩ婊咃紲闂佸憡娲︽禍婵嬵敃閼恒儳绠鹃柡澶嬪焾閸庢捇鏌ｉ敂鍏煎
            //--------------------------------------------------------------------

            //1闂備焦瀵х粙鎴﹀灳濞擃暁ps闂佽崵濮村ú顓㈠绩闁秵鍎戝ù鍏兼綑閻銇勯弽銊х煁闁哄棗绻橀弻鐔碱敄椤掞拷鐎氼噣濡堕幘顔藉仯闁搞儵鏀辩�氾拷
            //HTTPSPostRquestWithCert.test();

            //2闂備焦瀵х粙鎴λ囬幍顔剧焾閻庨潧鎲＄�氭岸鏌￠崶锝呬壕闁跨喕妫勭粔褰掑箚閸曨垼鏁婇柣鎰靛墯濞堛垽姊洪崨濠傜瑲濠㈢懓妫楅埢鎾诲箞閵栨姲ream缂傚倸鍊风粈浣猴拷姘间簻閳诲酣濮�閵堝棙娅栭柣蹇曞仧閸嬫捇骞忛崡鐑嗘富闁靛牆鎳忕拹鈩冪箾闊厼宓嗙�规洘宀搁崺锟犲礃閳哄倹顓归梺鍝勵槴閺呮粓鎮烽妶澶嬬厒婵犲﹤鎳愮壕濂告煕閺囥劋绨兼い鎰矙閹绠涢幘鏉戠５ava闂佽娴烽弫鎼併�佹繝鍥ㄥ瘶闁告洦鍓氭慨婊勩亜閹哄秶顦﹂幖鏉戯躬閺岀喓锟芥稒锕幏椋庣矙閻犲秹姊烘潪鎷屽厡濠⒀勵殔閻ｅ灚绋夌涵淇縯缂傚倸鍊烽悞锕傗�︾弧娣�
            //XStreamTest.test();


            //--------------------------------------------------------------------
            //PART Two:闂備胶纭堕弲鐐测枍閿濆锟戒線宕ㄩ弶鎴濈彉閻庡箍鍎遍幊搴綖閵堝棛绠鹃柡澶嬪焾閸庢捇鏌ｉ敂鍏煎
            //--------------------------------------------------------------------

            //1闂備焦瀵х粙鎴λ囬幍顔剧焾閻庨潧鎲＄�氭岸鏌￠崶锝嗩潑婵炵厧鐖奸弻鐔封枔閸喕绨奸梺杞扮贰閸犳绮嬮幒鎳虫棃銆佺粋锟�
            //PayServiceTest.test();

            //2闂備焦瀵х粙鎴λ囬幍顔剧焾閻庨潧鎲＄�氭岸鏌￠崶锝嗩潑婵炵厧鐖奸弻鐔封枔閸喕鍑藉銈嗘尭缂嶅﹤鐣烽敓鐘插嵆闁绘柨鎼銊╂煟閻樺弶绁╅柡渚囨憠I
            //PayQueryServiceTest.test();

            //3闂備焦瀵х粙鎴λ囬幍顔剧焾閻庨潧鎲＄�氭岸鏌￠崶鈺佹瀾閻庣數鏁诲娲礌閳╁啫顏禔PI
            //婵犵數鍋為幐鎾疾閻樿櫣浜梻浣告贡缁垶宕濆Δ鍛︽慨妯垮煐閺咁剟鎮橀悙鎻掆挃闁靛牊鎸抽幃褰掑炊閵婏妇顦ㄩ梺杞扮贰閸犳绮嬮幒鎳虫棃銆佺粋婵嬫⒑閻熸壆鎽犻柛鏃�娲橀幈銊モ槈閵忕姷顓奸梺鎸庣箓閹冲酣鎮￠崒鐐粹拺闁芥ê顦紞浣虹磼閻欏懐绉�规洏鍎查幆鏃堫敍濠婂拋妲烽梻浣告啞閻燁垶宕归娑氼洸闁圭儤顨嗛悞缁樻叏濡櫣锛嶇紒鐘崇墵閹湱锟斤綆浜滈弳鐔兼煛娓氬洦顦yQueryServiceTest.test()闂備焦瀵х粙鎴︽嚐椤栫偞鍎嶉柕蹇嬪�曠紒鈺傘亜閺嶃劎鎳呴悽顖涚洴閺岀喓锟芥稒锚婵洤鈹戦鐣屸檨婵炵厧顭峰顒勫箰鎼达綆妲梻浣圭湽閸斿本鏅堕弶娌榥saction_id闂備礁鎲＄划宀勵敊閸х灜_trade_no闂備浇妗ㄩ懗鑸垫櫠濡わ拷閻ｅ灚鎷呴悜妯侯伕缂佺偓鍎抽鍥╃不婵犳碍鐓曟俊顖氭贡娑撹尙绱掓潏銊х畼闁跨喓鏅幊鎾诲嫉椤掑嫬鍨傛慨妯挎硾缁犲鏌曢崼婵愭Ч闁轰焦顭囬敓鍊燁潐閹爼宕曢幍顔剧闁哄啫鐗婇弲顒勬倶閻愭潙鍔ら幆鐔兼⒒娴ｉ鐭欏ù婊冪埣閺佹捇寮妶鍡楊伓闂備焦鎮堕崕鎶藉磻閻愬樊鐒介柨鐕傛嫹 ^_^v
            //ReverseServiceTest.test();

            //4闂備焦瀵х粙鎴λ囬幍顔剧焾閻庨潧鎲＄�氭岸鏌￠崶鑸电窙闁归鍏橀弫鎾绘寠婢跺棙鐎婚梺鍛婃寙閸曨剚顔撻梺鑽ゅТ濞层劑鈥﹂崠鐞�
            //RefundServiceTest.test();

            //5闂備焦瀵х粙鎴λ囬幍顔剧焾閻庨潧鎲＄�氭岸鏌￠崶鑸电窙闁归鍏橀弫鎾绘寠婢跺棙鐎婚梺缁樺姦閸撴盯宕ｉ敓浠嬫煟閻樺弶绁╅柡渚囨憠I
            //RefundQueryServiceTest.test();

            //6闂備焦瀵х粙鎴λ囬幍顔剧焾閻庨潧鎲＄�氭岸鏌￠崶鈺佸壉闁搞倗濞�閹綊骞囬崜浣烘殸閻庤娲滈崕銖処
            //DownloadBillServiceTest.test();


            //闂備礁鎼悧婊堝礈濞嗗骏鑰块柟缁㈠枟閻掔粯鎱ㄥΟ铏癸紞缂佺姵娼穖l闂佸搫顦弲婊呯矙閺嶎厹锟戒線骞堟繅鎵為梻浣芥〃閼宠埖鏅跺Δ锟介悾鍨媴閼叉繄鍠栭崺鍕礃閵娧冭闂備焦鐪归崝宀�锟芥凹鍘奸—鍐磼閻愯尙锛欏┑鐐叉閻熝呯矆婢舵劖鐓曢煫鍥ㄦ尵婢ф盯鎮楅崹顐ょ煉婵☆偂绶氶弫鎾寸鐎ｎ亞顓奸柣搴秵娴滄粏顤勫┑鐑囩到濞村倿宕板Δ鍛瀬缂佸崬銆塴闂備礁鎲￠懝鍓э拷姘间邯閺屽苯顭ㄩ崼鐔锋疅闂佺鏈划灞剧椤栫偞鐓熼柕濞垮劚椤忊晠鏌ㄩ悢鐑樻珪闁靛棗顑囧Σ鎰攽鐎ｎ偄锟藉潡鎮归搹鐟板妺闁稿﹦鏁诲娲敃閿濆嫪瀛╃紓浣筋嚙閸燁垳绮嬮幒妤�唯闁靛牆娲ㄩ幉顕�姊洪崫鍕拷浠嬶綖婢跺本鍏滈柛鎾茬筏閹风兘鎮藉▓鎸庢暞缂備胶绮悧妤冪矙婢舵劦鏁傞柛娑卞枤閸樻劙姊哄Ч鍥у濠⒀屾懏l闂備浇妗ㄩ懗鑸垫櫠濡わ拷閻ｅ灚鎷呯憴鍕唉濠电偞鍨剁划鐘诲绩閻ｅ瞼纾兼繛鎴炵懃閸斻倝鏌熼鑺ョ妞ゆ洏鍎辫灃闁跨喍绮欏畷铏逛沪閸撗�鏋栭梺璺ㄥ枙婵倗绮欐径鎰闁圭儤鎸搁敓濮愬�栫换娑欏緞鐎ｎ偆顦┑鐐茬墛閸ㄥ湱鍒掗悽绋跨畾鐟滃酣宕愰幎鑺ョ叆婵炴垶蓱濠�鐗堢箾閹惧磭鍩ｇ�规洏鍎查幆鏃堝閻樻牑鏅犲鍫曞煛閸屾粍鍣ラ柣鐔告礀濡稓鍒掗悽绋跨畾鐟滃酣宕愰幎鑺ョ厸闁跨喍绮欓獮鍡氼槻闁绘挸鍊垮鍫曞煛閸屾粍鍣ラ梻浣稿级闁叉笗l闂傚倷鐒﹁ぐ鍐儗閸屾凹鐒藉ù鐓庣摠閸庡秹鏌涢幘铏暏gn闂佽瀛╃粙鎺椼�冮崱娑辨晩鐎癸拷閸曨剛鍘掗悗鐧告嫹閻庯綆鍓涢ˇ顕�鏌℃径鍡樻珕闁荤噦绠撻幃褎娼忛妸锔挎唉濠电偞鍨剁划鐘诲绩閼恒儰绻嗘い鏍殔婢ф煡鎮楀顓犳噰闁诡垰鍟村畷鐔碱敆娓氬洦袧闂備胶顭堥敃銉╂偡閵夈儺娼╅柕濞炬櫅閻銇勯弽銊ф噥缂併劋鍗冲娲敃閿濆嫪瀛╃紓浣筋嚙閸熸壆鍒掗悽绋跨畾鐟滃酣宕愰崘鍙傛棃鎮╅懠顒傚姰闂佷紮绠戦ˇ鎵矉瀹ュ鏅搁柨鐕傛嫹
           // Util.log(Signature.getSignFromResponseString(Util.getLocalXMLString("/test/com/tencent/business/refundqueryserviceresponsedata/refundquerysuccess2.xml")));

            //Util.log(new Date().getTime());
            //Util.log(System.currentTimeMillis());

//            ScanPayQueryReqData scanPayQueryReqData = new ScanPayQueryReqData("400204200120170503996345", null);
//        	String result = WXPay.requestScanPayQueryService(scanPayQueryReqData);
//        	ScanPayQueryResData scanPayQueryResData = (ScanPayQueryResData) Util.getObjectFromXML(result, ScanPayQueryResData.class);
//
//        	System.out.println(scanPayQueryResData.getOut_trade_no());
//        	System.out.println(scanPayQueryResData.getTotal_fee());
        	
        	//退款操作
        	//RefundReqData(String transactionID,String outTradeNo,String deviceInfo,String outRefundNo,int totalFee,int refundFee,String opUserID,String refundFeeType){
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	DownloadBillReqData downloadBillReqData = new DownloadBillReqData(null, "20170403", "SUCCESS");
        	String parseContent = WXPay.requestDownloadBillService(downloadBillReqData);
        	String[] split = parseContent.split("\n");
			List<String> batchSql = new ArrayList<String>();
			StringBuffer sb = new StringBuffer();
			for(int i=1;i<split.length-1;i++){
				sb.append("INSERT INTO `hzc_finance`.`payment_wepay_bill`(trade_time,public_id,app_id,sub_app_id,device_id,trade_no,payment_no,user_identify,trade_type,trade_status,bank_name,currency_type,total_fee,red_pack_fee,");
				sb.append("product_name,product_data,commission_fee,commission_rate) VALUES ('");
				sb.append(replacementString(replacementString(split[i],"`",""),",","','")).append("');");
				System.out.println(sb.toString());
				batchSql.add(sb.toString());
				sb.delete(0,sb.length()); 
			}

//        	RefundQueryReqData refundQueryReqData = new RefundQueryReqData(null, "3bd2240eed164364af627fcb7f7e_and", null, null, null);
//        	String result =  WXPay.requestRefundQueryService(refundQueryReqData);
//        	System.out.println(result);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    
    public static String replacementString(String content,String regex,String replacement){
		if(!isEmpty(content)){
			return content.replaceAll(regex, replacement);
		}
		return content;
	}
    
    private static boolean isEmpty(String content){
    	if(null==content || content.isEmpty()){
    		return true;
    	}
    	return false;
    }
}
