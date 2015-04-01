package edu.hku.sdb.crypto;

import java.math.BigInteger;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.parse.BasicFieldLiteral;
import edu.hku.sdb.parse.Expr;
import edu.hku.sdb.parse.FieldLiteral;
import edu.hku.sdb.parse.StringLiteral;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Crypto functions.
 */
public class CryptoTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public CryptoTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(CryptoTest.class);
	}


	public void testgeneratePositiveRandPrimeShouldNotEqual() {
		BigInteger firstPrime = Crypto.generateRandPrime();
		BigInteger secondPrime = Crypto.generateRandPrime();
		assertTrue(!firstPrime.equals(secondPrime));
	}

	public void testevaluateTotient1() {
		BigInteger totient = Crypto.evaluateTotient(new BigInteger("5"),
				new BigInteger("7"));
		assertEquals(totient, new BigInteger("24"));
	}

	public void testevaluateTotient2() {
		BigInteger totient = Crypto.evaluateTotient(new BigInteger("107"),
				new BigInteger("17"));
		assertEquals(totient, new BigInteger("1696"));
	}

	public void testevaluateTotient3() {
		BigInteger totient = Crypto.evaluateTotient(new BigInteger(
				"20686139707"), new BigInteger("25458163831"));

		assertEquals(totient, new BigInteger("526631133645616033980"));
	}

	public void testevaluateTotient4() {
		BigInteger totient = Crypto.evaluateTotient(new BigInteger(
				"-4294967296122"), new BigInteger("3949673333612"));
		assertEquals(totient, new BigInteger("-16963717798228352405890153"));
	}

	public void testgeneratePositiveRandShouldNotEqual() {
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
		BigInteger firstRand = Crypto.generatePositiveRand(p, q);
		BigInteger secondRand = Crypto.generatePositiveRand(p, q);
		assertTrue(!firstRand.equals(secondRand));
	}

	public void testGenerateItemKey1() {
		assertEquals(new BigInteger("32"), Crypto.generateItemKey(
				new BigInteger("2"), new BigInteger("2"), new BigInteger("8"),
				new BigInteger("2"), new BigInteger("5"), new BigInteger("7")));
	}

	public void testGenerateItemKey2() {
		assertEquals(new BigInteger("8"), Crypto.generateItemKey(
				new BigInteger("2"), new BigInteger("2"), new BigInteger("1"),
				new BigInteger("2"), new BigInteger("5"), new BigInteger("7")));
	}

	public void testGenerateItemKey3() {

		BigInteger itemKey = Crypto
				.generateItemKey(
						new BigInteger("20686139707"),
						new BigInteger("3949673333612"),
						new BigInteger("25458163831"),
						new BigInteger("526631133645616033980"),
						new BigInteger(
								"13381418623214727587437247106170095945191359410765179156151809065341458743599113643820767819224626539634002433392648336651723690747518211610218927601568823"),
						new BigInteger(
								"6804688895422554648792548642105479511973881515271617258279580587887409482982376538544184457823535138084697746276682826853000739663322061212950993288918457"));

		assertEquals(
				new BigInteger(
						"83427039086531613950882788147752476627307818700941480670093277899983359358750093285864139780015418480875478864487353680538884707146952770317837584060671765712859895657238437094602688125304900948957685837161651074583841799591158986315889810089701095550001261353548918894922731831119513865758249750755090462588"),
				itemKey);
	}

	public void testEncrypt1() {

		BigInteger cipherText = Crypto.encrypt(new BigInteger("4"),
				new BigInteger("32"), new BigInteger("35"));
		assertEquals(new BigInteger("22"), cipherText);
	}

	public void testEncrypt2() {

		BigInteger cipherText = Crypto.encrypt(new BigInteger("2"),
				new BigInteger("8"), new BigInteger("35"));
		assertEquals(new BigInteger("9"), cipherText);
	}

	public void testEncrypt3() {
		BigInteger cipherText = Crypto
				.encrypt(
						new BigInteger("20686139707"),
						new BigInteger(
								"83427039086531613950882788147752476627307818700941480670093277899983359358750093285864139780015418480875478864487353680538884707146952770317837584060671765712859895657238437094602688125304900948957685837161651074583841799591158986315889810089701095550001261353548918894922731831119513865758249750755090462588"),
						new BigInteger(
								"91056390710389826661362945896125780562083120966028947466819744421480611063788891569681707503066914102268385452352368991831195586814279365402707955380475412720505658218035093486944255102433792593309438648993776412638716311098144165230321872380587410143867387942045612725519865341003363677330210531214120466111"));
		assertEquals(
				new BigInteger(
						"40870081171282830036419899383381257632049978678992607574997430529949742823087577192233511408144692015947301475184502467724150762868280683517282246740392304400281975465348931710599462200475793078032465916373673267276591714688255352812876413139242500075515787843517783389449586351104283866307778172508927390700"),
				cipherText);
	}

	public void testDecrypt1() {
		BigInteger plainText = Crypto.decrypt(new BigInteger("22"),
				new BigInteger("32"), new BigInteger("35"));

		assertEquals(new BigInteger("4"), plainText);
	}

	public void testDecrypt2() {
		BigInteger plainText = Crypto.decrypt(new BigInteger("9"),
				new BigInteger("8"), new BigInteger("35"));

		assertEquals(new BigInteger("2"), plainText);
	}

	public void testDecrypt3() {
		BigInteger plainText = Crypto.decrypt(new BigInteger("34"),
				new BigInteger("32"), new BigInteger("35"));
		assertEquals(new BigInteger("3"), plainText);
	}

	public void testDecrypt4() {
		BigInteger plainText = Crypto
				.decrypt(
						new BigInteger(
								"40870081171282830036419899383381257632049978678992607574997430529949742823087577192233511408144692015947301475184502467724150762868280683517282246740392304400281975465348931710599462200475793078032465916373673267276591714688255352812876413139242500075515787843517783389449586351104283866307778172508927390700"),
						new BigInteger(
								"83427039086531613950882788147752476627307818700941480670093277899983359358750093285864139780015418480875478864487353680538884707146952770317837584060671765712859895657238437094602688125304900948957685837161651074583841799591158986315889810089701095550001261353548918894922731831119513865758249750755090462588"),
						new BigInteger(
								"91056390710389826661362945896125780562083120966028947466819744421480611063788891569681707503066914102268385452352368991831195586814279365402707955380475412720505658218035093486944255102433792593309438648993776412638716311098144165230321872380587410143867387942045612725519865341003363677330210531214120466111"));
		assertEquals(new BigInteger("20686139707"), plainText);
	}

	public void testPailierEncryptDecrypt() {
		BigInteger p = Crypto.generateRandPrime();
		BigInteger q = Crypto.generateRandPrime();
    BigInteger plainText = Crypto.generatePositiveRand(p, q);
		BigInteger cipherText = Crypto.PaillierEncrypt(plainText, p, q);
		assertEquals(plainText, Crypto.PaillierDecrypt(cipherText, p, q));
	}

  public void testSDBEncryptDecrypt(){
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger r = Crypto.generatePositiveRand(p, q);
    BigInteger g = Crypto.generatePositiveRand(p, q);

    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    BigInteger plaintext = Crypto.generatePositiveRand(p, q);
    BigInteger ak = Crypto.generateItemKey(ma,xa,r,g,p,q);
    BigInteger ae = Crypto.encrypt(plaintext,ak, n);
    assertEquals(plaintext, Crypto.decrypt(ae,ak,n));
  }

  public void testKeyUpdateAdd(){
    BigInteger p = Crypto.generateRandPrime();
    BigInteger q = Crypto.generateRandPrime();
    BigInteger n = p.multiply(q);
    BigInteger r = Crypto.generatePositiveRand(p, q);
    BigInteger g = Crypto.generatePositiveRand(p, q);

    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    BigInteger mb = Crypto.generatePositiveRand(p, q);
    BigInteger xb = Crypto.generatePositiveRand(p, q);

    BigInteger ms = Crypto.generatePositiveRand(p, q);
    BigInteger xs = Crypto.generatePositiveRand(p, q);

    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);

    BigInteger ak = Crypto.generateItemKey(ma, xa, r, g, p, q);
    BigInteger bk = Crypto.generateItemKey(mb, xb, r, g, p, q);
    BigInteger ck = Crypto.generateItemKey(mc, xc, r, g, p, q);
    BigInteger sk = Crypto.generateItemKey(ms, xs, r, g, p, q);

    BigInteger a = Crypto.encrypt(new BigInteger("400"),ak, n);
    BigInteger b = Crypto.encrypt(new BigInteger("9"),bk, n);
    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);

    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pq_b[] = Crypto.keyUpdateClient(mb, mc, ms, xb, xc, xs, p, q);

    BigInteger aPlusB = UDFHandler.add(a, b, s, pq_a[0], pq_a[1], pq_b[0], pq_b[1], n);
    assertEquals(Crypto.decrypt(aPlusB, ck, n), new BigInteger("409"));
  }

  public void testKeyUpdateClient(){
    //A prime number p
    BigInteger p = new BigInteger("5");
    //A prime number q
    BigInteger q = new BigInteger("7");

    //column key for column A
    BigInteger ma = new BigInteger("2");
    BigInteger xa = new BigInteger("2");

    //column key for additional column S
    BigInteger ms = new BigInteger("4");
    BigInteger xs = new BigInteger("5");

    //new column key C for key update operation
    BigInteger mc = new BigInteger("6");
    BigInteger xc = new BigInteger("4");

    //generate new p, q for column A's keyUpdate operation, target column key is columnKey C
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);

    //p = 5 * ( 4 - 2 ) | mod 24 = 5 * 2 | mod 24 = 10 mod 24 = 10
    //q = 2 * 4^10 * 6 | mod 35 = (2 mod 35) * (11) * (6 mod 35) | mod 35 = 132 mod 35 = 27
    assertEquals(new BigInteger("10"), pq_a[0]);
    assertEquals(new BigInteger("27"), pq_a[1]);
  }

  public void testKeyUpdateClientLarge(){
    //A prime number p
    BigInteger p = Crypto.generateRandPrime();
    //A prime number q
    BigInteger q = Crypto.generateRandPrime();
    //n = p * q
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p,q);

    //column key for column A
    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    //column key for additional column S
    BigInteger ms = Crypto.generatePositiveRand(p, q);
    BigInteger xs = Crypto.generatePositiveRand(p, q);

    //new column key C for key update operation
    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);

    //generate new p, q for column A's keyUpdate operation, target column key is columnKey C
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);

    assertEquals(xs.modInverse(totient).multiply( (xc.subtract(xa)).mod(totient) ).mod(totient) , pq_a[0]);
    assertEquals(((ma.mod(n)).multiply(  ms.modPow(pq_a[0],n) ).multiply( mc.modInverse(n) )).mod(n), pq_a[1]);
  }

  public void testKeyUpdateSimple(){
    //A big prime number
    BigInteger p = new BigInteger("7");
    //Another big prime number
    BigInteger q = new BigInteger("13");
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p, q);
    BigInteger r = new BigInteger("2");
    BigInteger g = new BigInteger("2");

    //column key for column A
    BigInteger ma = new BigInteger("3");
    BigInteger xa = new BigInteger("17");

    //column key for additional column S
    BigInteger ms = new BigInteger("5");
    BigInteger xs = new BigInteger("19");

    //new column key C for key update operation
    BigInteger mc = new BigInteger("11");
    BigInteger xc = new BigInteger("11");

    //item key for A,C,S
    BigInteger ak = Crypto.generateItemKey(ma, xa, r, g, p, q);
    BigInteger ck = Crypto.generateItemKey(mc, xc, r, g, p, q);
    BigInteger sk = Crypto.generateItemKey(ms, xs, r, g, p, q);

    //Encrypt S column
    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);

    //generate new p, q for column A's keyUpdate operation, target column key is columnKey C
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);

    for (int i = 1; i < 35; i++){
      //Encrypt A column
      BigInteger a = Crypto.encrypt(new BigInteger(String.valueOf(i)),ak, n);
      //the new encrypted value with C's columnKey
      BigInteger aUpdated = UDFHandler.keyUpdate(a, s, pq_a[0], pq_a[1], n);
      assertEquals(Crypto.decrypt(a, ak, n), Crypto.decrypt(aUpdated, ck, n));
    }
  }


  public void testAddEESimple() throws Exception{
    //A big prime number
    BigInteger p = new BigInteger("7");
    //Another big prime number
    BigInteger q = new BigInteger("13");
    BigInteger n = p.multiply(q);
    BigInteger totient = Crypto.evaluateTotient(p, q);
    BigInteger r = new BigInteger("2");
    BigInteger g = new BigInteger("2");

    //column key for column A
    BigInteger ma = new BigInteger("3");
    BigInteger xa = new BigInteger("17");

    //column key for additional column S
    BigInteger ms = new BigInteger("5");
    BigInteger xs = new BigInteger("19");

    //new column key C for key update operation
    BigInteger mc = new BigInteger("11");
    BigInteger xc = new BigInteger("11");

    //item key for A,C,S
    BigInteger ak = Crypto.generateItemKey(ma, xa, r, g, p, q);
    BigInteger ck = Crypto.generateItemKey(mc, xc, r, g, p, q);
    BigInteger sk = Crypto.generateItemKey(ms, xs, r, g, p, q);

    //Encrypt A, S column
    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);
    BigInteger a = Crypto.encrypt(new BigInteger("9"),ak, n);


    BigInteger mb = ms;
    BigInteger xb = xs;

    //execute key update client protocol
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pq_b[] = Crypto.keyUpdateClient(mb, mc, ms, xb, xc, xs, p, q);

    //prepare parameter for sdb_add
    StringLiteral p_a = new StringLiteral(pq_a[0].toString());
    StringLiteral q_a = new StringLiteral(pq_a[1].toString());
    StringLiteral p_b = new StringLiteral(pq_b[0].toString());
    StringLiteral q_b = new StringLiteral(pq_b[1].toString());

    BigInteger cUpdated = UDFHandler.add(a, s, s, pq_a[0], pq_a[1], pq_b[0], pq_b[1], n);
    BigInteger cDerypted = Crypto.decrypt(cUpdated, ck, n);
    System.out.print(cUpdated);
    System.out.print(cDerypted);
    assertEquals(new BigInteger("10"), cDerypted);
  }

  public void testAddEELarge() throws Exception{
//    A prime number p
    BigInteger p = Crypto.generateRandPrime();
    //BigInteger p = new BigInteger( "108305886586923656282885439496701604527807585700802941291984158176731774318559922302650399168384292946532982976308846847454848372617873985192356708618779021061351905120669483794663670722165716539221899575406491337361342757808232408976845166871740828194049412320882061899941245512568285056752126713587792824823");
    //A prime number q
    BigInteger q = Crypto.generateRandPrime();
    //BigInteger q = new BigInteger( "170243105156000882338170972569851699890461302302949931263980746967784993550651282692100709267606479033887461141092017609269862716854010622067948725653928307025152784518693735975177301256366600407937655802398220152395753846761046337947261173738226581371352438518035786538781458921510816541203660099142571200533");
    //n = p * q
    BigInteger n = p.multiply(q);
    //BigInteger n = new BigInteger( "18438330439231549513529142628143117394418342202020171376233012956640089743986678409384517152022038470054861321971108803797884602331065944334646151798229981121103361380880357451110624012488483312426617021876680489526589949854077195522584334968265738179543740043014879048867823722275680896346102438564154329711579947695029931889935453636356784518999651911256687757172613155747874310515981087585662737793679915426678463006699215828128939178188686128981735380458596738946398276793835852111394832393343019132107744887726094542929862672603952176570125410293301088030560047475363288468855712215653072495093304205698473230659");

    BigInteger totient = Crypto.evaluateTotient(p,q);
    BigInteger r = Crypto.generatePositiveRand(p, q);
    BigInteger g = Crypto.generatePositiveRand(p, q);
    //BigInteger g = new BigInteger( "3589709890606198139886061666879631399039087930242458533454116790611266775028262116235651864886577428510563945386136206951357381432522712877576718544657286475543594030982395143131150615548293742778330655661950369009242748344146141491098617081592935923821583124760277682345823196377138033041366689621581905256743899155759647503830053329175774873092502304114579676762134664655671244387806478862190554172584629711662669389925162813964772655061766676305382905782958411698816561455569780166271547385436085297027728532569574240081358588380903929845503877998327801409673048322856988736551207751479826099150026704205863351131");

    //column key for column A
    BigInteger ma = Crypto.generatePositiveRand(p, q);
    BigInteger xa = Crypto.generatePositiveRand(p, q);

    //column key for additional column S
    BigInteger ms = Crypto.generatePositiveRand(p, q);
    BigInteger xs = Crypto.generatePositiveRand(p, q);
    //BigInteger ms = new BigInteger( "1045585175076788779631571318166324970185217563544470516343837811429917711117743799988231392340912225150510105666587076941638955544121480225714918477205447030168117018059164039245233689744188024258432920446383840395351970574772304040657825405621544085215933531116308425412199100380962097039368237313801414214984143729282848608579082960380242358192473571703312984103793823312556076720183594026777136946480290122223298414517245685386662986667042700295750750705222325085909259087616016789330308243547696352103447408158176863564720040376231653679133009473258565535855730888311138890510866842528102018638622940025890685697");
    //BigInteger xs = new BigInteger( "11224524279357903815029501157042762891361567320385734620933610685525227598683974369899934193955654661664285908319575261212016638533871562269898860117999055406527793401795268864967395548651527296536361240124176263536457220577975284299707306419185385675355820024944682104933040889174447647984522267900445233156014520052819478262936758113352629237892507106696099562403317292248715697274631834007311575904493868330353174642634136516504793897896629676091679803029805320294505735401304506479538013085216984050230716731886392558131996744745321894464237853874541854885319368903621607324998989837351775010539088775467226849729");

    //new column key C for key update operation
    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);

    //item key for A,C,S
    BigInteger ak = Crypto.generateItemKey(ma, xa, r, g, p, q);
    BigInteger ck = Crypto.generateItemKey(mc, xc, r, g, p, q);
    BigInteger sk = Crypto.generateItemKey(ms, xs, r, g, p, q);

    //Encrypt A, S column
    BigInteger s = Crypto.encrypt(new BigInteger("1"),sk, n);
    BigInteger a = Crypto.encrypt(new BigInteger("9"),ak, n);

    BigInteger mb = ms;
    BigInteger xb = xs;

    //execute key update client protocol
    BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pq_b[] = Crypto.keyUpdateClient(mb, mc, ms, xb, xc, xs, p, q);

    BigInteger cUpdated = UDFHandler.add(a, s, s, pq_a[0], pq_a[1], pq_b[0], pq_b[1], n);
    BigInteger cDerypted = Crypto.decrypt(cUpdated, ck, n);
    System.out.println(cUpdated);
    System.out.println(cDerypted);
    assertEquals(new BigInteger("10"), cDerypted);
  }
}