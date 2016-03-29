<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="terms_of_service_title" /></title>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/i18n/jquery-ui-i18n.min.js"></script>
<script type="text/javascript">
	$(function() {
		$.datepicker.setDefaults($.datepicker.regional['ja']);
		$('#date').datepicker({
			dateFormat : 'yy/mm/dd'
		});
	});
</script>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1>利用規約</h1>
	<p>インターノウス株式会社（以下「弊社」といいます。）の利用について、以下のとおり本規約を定めます。</p>

	<p>第１条 本規約の範囲</p>
	<p>本規約は本サイトが提供するサービスについて規定したものです。</p>

	<p>第２条 会員</p>
	<p>1．本規約を承認の上、規定の入会手続きを完了後、弊社で承認した方を「会員」とします。</p>
	<p>2．弊社が会員として承認することを不適当と判断した場合、入会の承認を行えない場合があります。</p>
	<p>3．「１会員」に対し１件のみ会員登録ができるものとします。</p>

	<p>第３条 パスワードの管理</p>
	<p>1．本サイトに登録したパスワードの管理と、その使用に関しての責任は全て会員が負うものとします。
	<p>2．パスワードの譲渡、売買、貸与等の行為は一切禁止します。</p>
	<p>3．弊社は、会員によるパスワードの使用上の過失及び第三者の利用に伴う損害の一切の責任を負わないものとします。パスワードを用いて会社に対して行われた意思表示は、このパスワードに該当する有効な会員の意思表示とみなします。</p>

	<p>第４条 会員の登録情報</p>
	<p>1．会員登録情報は、弊社が所有するものとし、個人が特定できる情報（氏名・住所・電話番号・メールアドレス）については、本サービス提供に必要な範囲内での委託先への預託の他、会員本人による開示の承諾があるものを除き、原則として、社外への提供は行わないこととします。


	<p>2．前項に関わらず、以下の場合については、当該会員の同意なく会員登録情報の一部（氏名・住所）を開示することがあります。
	<p>(1)弊社及び他の会員もしくは第三者に不利益を及ぼすと判断した場合、警察または関連諸機関に開示する場合</p>
	<p>(2)警察、裁判所、検察庁、弁護士会、消費者センター又はこれらに準じた権限を有する機関から、登録情報の開示を求められた場合、弊社がこれに応じることを判断した場合


	<p>(3)その他弊社が開示を相当であると判断した場合</p>


	<p>3．弊社は、入会の際に会員の申告する登録情報の全ての項目に関して如何なる虚偽の申告も認めないものとします。</p>
	<p>4．会員の登録情報に変更が生じた場合、会員は速やかに所定の手続き行うものとします。</p>


	<p>第５条 私的利用の範囲外の利用禁止</p>
	<p>会員は、弊社が承認した場合（当該情報に関して権利を持つ第三者がいる場合には、弊社を通じ当該第三者の承諾を取得することを含む）を除き、弊社を通じて入手した如何なる情報も複製、販売、出版その他私的利用の範囲を超えて使用をすることができないものとします。</p>

	<p>第６条 会員の禁止事項</p>
	<p>1．弊社は、会員の以下に該当する、又はその恐れのある行為は禁止します。</p>
	<p>(1)公序良俗に反する行為</p>
	<p>(2)犯罪行為に結びつく行為</p>
	<p>(3)法令等に違反する行為</p>
	<p>(4)弊社及び他の会員もしくは第三者の著作権その他の知的財産権を侵害する行為</p>
	<p>(5)弊社及び他の会員もしくは第三者の財産、プライバシー等を侵害する行為</p>
	<p>(6)弊社及び他の会員もしくは第三者に不利益を与える行為</p>
	<p>(7)弊社及び他の会員もしくは第三者を誹謗、中傷する行為</p>
	<p>(8)弊社の本サイト等の運営を妨害、或いは弊社の信頼を毀損するような行為</p>
	<p>(9)弊社の承認を得ないで行う当会員の身分を利用した全ての営業行為</p>
	<p>(10)選挙運動もしくはこれに類似される行為、又は公職選挙法などの法令に違反する行為</p>
	<p>(11)入会手続きを含めた弊社が行う全てのアンケートに対し、虚偽の回答を行う行為</p>
	<p>(12)有害なコンピュータープログラム等を送信又は書き込む行為</p>
	<p>(13)ＩＤ及びパスワードを不正に使用する行為</p>
	<p>(14)その他弊社が当該会員の行為として不適切であると認めた行為</p>

	<p>第７条 会員資格の抹消</p>
	<p>1.以下の項目に該当する場合、弊社は、当該会員への事前通知、承諾なしに会員資格を抹消することができるものとします。</p>
	<p>(1)第６条に定める禁止事項その他本規約の各条項に違反した場合</p>
	<p>(2)入会時及びその後のアンケートによるメンバーの申告情報が故意による虚偽の申告と弊社が認めた場合</p>
	<p>(3)パスワードを不正に使用し、又は使用させた場合</p>
	<p>(4)弊社が、認めない不正な行為があった場合</p>
	<p>(5)その他弊社が不適切と判断した行為があった場合</p>
	<p>2．資格を抹消する場合、その会員が弊社に対して保有する全ての権利を抹消するものとします。</p>

	<p>第８条 退会</p>
	<p>会員が弊社から退会する場合、所定の手続きに従い弊社に届け出るものとし、弊社での退会手続き終了後、退会となります。</p>

	<p>第９条 規約の変更</p>
	<p>弊社は、会員への事前通知、承諾なしに本規約を随時変更することができるものとします。変更の内容については、本サイト上に１ヶ月表示した時点で、全ての会員が了承したものとみなします。但し、第三者に不利益を及ぼす恐れのある場合等不測の事態が予想される場合は、上記期間を待たずに規約変更が実施されたものとします。</p>

	<p>第１０条 サービスの中断、停止</p>
	<p>1．弊社は以下に該当する場合、会員への事前通知、承諾なしに弊社のサービス内容の一部又は、全部を停止または中断する場合があります。</p>
	<p>(1)本サイトの定期保守、更新ならびに緊急事態発生の場合</p>
	<p>(2)火災、停電、天災等の不可抗力その他不測の事態により、本サイト運営継続が困難になった場合</p>
	<p>2．上記事態などに伴い、会員に不利益、損害が生じた場合であっても、弊社は、その責任を免れるものとします。</p>

	<p>第１１条 サービス内容の変更、中止</p>
	<p>1．弊社は、会員への事前通知、承諾なしに本サイトのサービス内容を変更、又は中止する場合があります。</p>
	<p>2．前項に基づき、サービス内容を変更・中止した場合といえども、会員に不利益、損害が生じた場合、弊社は、その責任を免れるものとします。</p>

	<p>第１２条 サービスの停止</p>
	<p>弊社は、一定の予告期間をもって本サイトのサービス停止を行う場合があります。</p>

	<p>第１３条 個人情報の取扱い</p>
	<p>弊社の収集した個人情報は以下のように取扱います。お客様が弊社に個人情報をご提供下さる際には、以下の取扱いについてご同意くださいますよう宜しくお願い申し上げます。</p>
	<p>1．この個人情報の使用目的は以下の通りです。</p>
	<p>(1)会員管理</p>
	<p>(2)商品及びサービスの販売</p>
	<p>(3)商品等の梱包・発送業務</p>
	<p>(4)保証及びアフターサービス（お客様からの問い合わせ等含む）の提供</p>
	<p>(5)情報分析（購入者層の分析など）</p>
	<p>(6)新製品および新サービスに関する情報のご案内ならびにお客様へのアンケートの実施</p>
	<p>2．上記の個人情報を弊社が第三者に開示、漏洩することはございません。ただし、以下の場合はこの限りではございませんので、あらかじめご了承ください。</p>
	<p>(1)配送業者に対するお客様の氏名及び住所の開示、オリジナル商品への氏名等の情報入力等、弊社および業務委託会社が、お客様に対する契約上の義務を履行する為に必要である場合</p>
	<p>(2)法令に基づき裁判所その他の司法機関及び行政機関からお客様に関する情報の開示を要求された場合</p>
	<p>(3)弊社、弊社関連会社、お客様又は第三者の権利および財産を保護する必要がある場合</p>
	<p>(4)お客様と他のお客様もしくは第三者との紛争により、弊社または弊社関連会社が迷惑もしくは損害を被ることを回避する場合</p>
	<p>(5)お客様が弊社にお名前、住所等の情報を提供するか否かは、お客様ご自身に任意にご判断いただけます。ただし、お客様からお名前、住所等の情報をご提供いただけない場合には、弊社はお客様に本サービスをご提供できなく点を予めご了承下さい。</p>
	<p>(6)お客様は、弊社に対して、当該個人情報を入力された以後、氏名・住所・お電話番号等について個人情報を開示するよう求めることができます。また、開示の結果、当該個人情報に誤りがある場合は、お客様は弊社に対して当該個人情報の訂正または削除を要求することができます。開示、訂正または削除を要求される場合は、次項のお客様の個人情報に関する担当者又は相談窓口までご連絡ください。</p>
	<p>(7)ご提供頂く個人情報の管理者及びお問い合わせ先</p>

	<p>第１４条 免責</p>
	<p>1．弊社は、理由の如何を問わず本サイトのサービス提供が遅延し、又は中断したことに起因して会員又は第三者が被った被害について、一切の責任を負わないものとします。</p>
	<p>2．弊社は、本サイトのサービスの利用を通じて得た情報等の正確性、特定の目的への適合性等について、一切の責任を負わないものとします。</p>
	<p>3．弊社は、本サイトのサービスの利用を通じて得た情報等に起因して損害が生じた場合、一切の責任を負わないものとします。</p>
	<p>4．本サイトを通じて提供される情報・サービスに関し、会員と他の会員あるいは第三者と紛争が生じた場合は、会員は、自己の費用と責任においてこれを解決するものとし、弊社に損害を与えないものとします。</p>
	<p>5．弊社は、本サイトを通じて行われた会員と第三者との物品売買等の取引に関連する債務の履行、及びその他の取引に関して生じた紛争については一切の責任を負わないものとします。</p>
	<p>6．弊社は、第４条第２項および第３項に基づく会員の登録情報開示に伴い、そこから発生する問題について一切の責任を負わないものとします。</p>


	<p>第１５条 本サービス提供について</p>
	<p>1．申し込み方法</p>
	<p>当サイトより本サービスの利用申込みをするものとします。</p>
	<p>2．お申し込み時間
	<p>「商品のお申し込みは２４時間お受け致しますが、サーバのメンテナンス等により、お申し込みをお受けできない場合があります。この場合でも、弊社は一切の責任を負わないものとします。</p>
	<p>3．表示価格</p>
	<p>価格表示は税込み表示とします。</p>
	<p>4．配送料及び代引手数料</p>
	<p>配送料は、それぞれの商品や、お送りする地域によって異なるため、会員は各商品詳細ページを必ず確認するものとします。また、本サービスをご利用いただいた会員には、代引手数料をご負担いただきます。</p>
	<p>5．お支払い方法</p>
	<p>本サービス利用により生じる代金の支払方法は、代引決済によるものとします。代引決済とは、商品お届け時に、商品の引渡と引換えに代金をお支払いいただく決済方法です。</p>
	<p>6．契約の成立時点</p>
	<p>「注文確認メール」が弊社からお客様に送信された時点で、ご注文いただいた商品に関して、お客様と弊社の間で売買契約が成立するものとします。</p>
	<p>7．お買い上げ伝票</p>
	<p>弊社から会員宛に電子メールにて送信致する「注文確メール」をもって「お買い上げ伝票」に代えさせていただきますので、大切に保管してください。</p>
	<p>8．お届け先</p>
	<p>お届け先は、日本国内に限らせて頂きます。</p>
	<p>9．お届け日</p>
	<p>通常、ご注文を受けてから１～２週間以内に発送いたします。但し、在庫の問題で遅れる場合もございますので、あらかじめご了承ください。</p>
	<p>10．キャンセル・返品・交換</p>
	<p>(1)ご注文日時より24時間以内であればキャンセルができます。契約のキャンセルをご希望される場合は、当サイトお問い合わせ窓口にご連絡ください。</p>
	<p>(2)商品お届け後のキャンセル等発送した商品が不良品もしくはご注文商品と異なる場合のみ受け付けさせていただきます。（商品の到着より７日以内にご連絡を頂いた場合に限ります。）お客様都合によるキャンセル・返品はお受けしておりませんので、ご注文の際には慎重にお選びください。</p>
	<p>(3)前項にかかわらず、下記の商品についてはキャンセル、返品、交換をお受けすることができません。</p>
	<p>・開封された商品およびご使用になられた商品</p>
	<p>・商品到着後８日以上経過した商品</p>
	<p>・お客様のもとで、キズや汚れが生じた商品</p>
	<p>・飲食品（健康食品を含みます）、花卉その他なま物</p>
	<p>・パッケージ（袋・ケース）のない商品</p>
	<p>・オーダー商品・ネーム入り商品など、お客様の為に加工された商品</p>
	<p>・その他、商品紹介ページに返品できない旨が明記されている商品（詳細は、お問い合わせ窓口までご連絡下さい）</p>
	<p>(4)商品に明らかな欠陥がある場合又は品違いの場合、返品等にかかる送料は弊社が負担致します。商品がお気に召さない場合等、お客様のご都合による返品・交換の場合は、送料はお客様の負担とさせていただきます。</p>
	<p>11．保証</p>
	<p>前条で述べた場合を除き、弊社は販売した商品の欠陥等について、一切の保証をいたしません。</p>
	<p>12．その他の注意事項</p>
	<p>(1)商品につきましては販売数量に限りがあるものがあり、売り切れによりお届けできない場合がございます。</p>
	<p>(2)お届けする商品の一部が、メーカーによる仕様変更等により、ホームページ上でご案内している商品と若干異なることがございます。</p>
	<p>(3)ホームページ上に掲載されている商品写真は実物を撮影したものですが、モニターを通してご覧になった場合、色調が実物を直接ご覧になった場合と異なることがございます。</p>
	<p>(4)弊社は、弊社よりお客様へお届けする電子メールおよびお客様から弊社に送付される電子メールの不到着、文字化けに起因する問題に関しては、いかなる責任も負いかねますので、ご了承下さい。</p>
	<p>(5)複数の商品をご注文された場合で一部商品が在庫切れの時は、弊社の裁量により、ご注文された商品の全てが揃ってからのお届けとなる場合があります。</p>

	<p>第１６条 合意管轄</p>
	<p>本サイトに関して、弊社と会員との間、訴訟の必要性が生じた場合は、東京地方裁判所を専属的合意管轄裁判所とします。</p>

	<p>第１７条 準拠法</p>
	<p>本規約の成立、効力、履行および解釈に関しては日本法が適用されるものとします。</p>

	<p>以上</p>
	<p>お問い合わせ窓口</p>

	<p>住所：東京都文京区湯島3-2-12</p>
	<p>会社名：インターノウス株式会社</p>
	<p>個人情報相談窓口担当 山田 太郎</p>
	<p>E-mail:tarou@gmail.com</p>

	<p>平成28年2月4日制定</p>
	<jsp:include page="footer.jsp" />
</body>
</html>