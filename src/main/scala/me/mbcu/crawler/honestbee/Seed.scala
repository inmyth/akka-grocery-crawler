package me.mbcu.crawler.honestbee

import me.mbcu.crawler.honestbee.TextCrawl.ReqParams

import scala.collection.mutable

object Seed {

  case class Inner(department: Int, categoryId: Int )

  case class StoreRequest(name: String, storeId: Int, params: Vector[Inner])

  val pasarModernMajestik = StoreRequest(
    "Pasar Modern Majestik", 40234,
    Vector(
      Inner(53426, 282906),
      Inner(53426, 282908),
      Inner(53426, 282905),
      Inner(53426, 282909),
      Inner(53426, 282907),
      Inner(53430, 282920),
      Inner(53430, 282921),
      Inner(53430, 282918),
      Inner(53430, 282915),
      Inner(53430, 282917),
      Inner(53430, 282916),
      Inner(53430, 282923),
      Inner(53430, 282922),
      Inner(53430, 282919),
      Inner(53431, 282924),
      Inner(53431, 282925),
      Inner(53432, 282926),
      Inner(53432, 282927),
      Inner(53432, 282928),
      Inner(53428, 282912),
      Inner(53427, 282911),
      Inner(53427, 282910),
      Inner(53429, 282913),
      Inner(53429, 282914)
    )
  )

  val bbPetshop = StoreRequest(
    "BB Petshop", 38605,
    Vector(
      Inner(51173, 270485),
      Inner(51173, 270484),
      Inner(51173, 270486),
      Inner(51172, 270482),
      Inner(51172, 270483),
      Inner(51172, 270480),
      Inner(51172, 270481),
      Inner(51174, 270487),
    )
  )

  val petRepublic = StoreRequest(
    "Pet Republic", 43322,
    Vector(
      Inner(50531, 266763),
      Inner(50527, 266749),
      Inner(50527, 266748),
      Inner(50527, 266746),
      Inner(50527, 266747),
      Inner(50530, 266762),
      Inner(50530, 266758),
      Inner(50530, 266761),
      Inner(50530, 266757),
      Inner(50530, 266760),
      Inner(50530, 266759),
      Inner(50528, 266751),
      Inner(50528, 266755),
      Inner(50528, 266752),
      Inner(50528, 266753),
      Inner(50528, 266750),
      Inner(50526, 266744),
      Inner(50526, 266745)
    )
  )

  val pediapet = StoreRequest(
    "Pediapet", 32555,
    Vector(
      Inner(40239, 212085),
      Inner(40239, 212086),
      Inner(40240, 212087),
      Inner(40240, 212088)
    )
  )

  val kulturKopi = StoreRequest(
    "Kultur Jaringan Kopi", 32537,
    Vector(
      Inner(16152, 84140)
    )
  )

  val kopiPresiden = StoreRequest(
    "Kopi Presiden", 35285,
    Vector(
      Inner(42445, 223998),
      Inner(42445, 223999)
    )
  )


  val easternHeritage = StoreRequest(
    "Eastern Heritage", 11341,
    Vector(
      Inner(22474, 115891)
    )
  )
  val office2000 = StoreRequest(
    "Office 2000", 3057,
    Vector(
      Inner(10691, 55161),
      Inner(10691, 55162),
      Inner(16243, 84609),
      Inner(16240, 84602),
      Inner(11673, 60637),
      Inner(11673, 60635),
      Inner(11673, 60636),
      Inner(11673, 60634),
      Inner(10690, 60640),
      Inner(10690, 55159),
      Inner(11677, 60645),
      Inner(11677, 114824),
      Inner(53402, 282741),
      Inner(53402, 282740),
      Inner(16239, 84601),
      Inner(16242, 84606),
      Inner(16242, 84608),
      Inner(16242, 84605),
      Inner(16242, 84607),
      Inner(11674, 84599),
      Inner(11674, 60638),
      Inner(10692, 60643),
      Inner(10692, 55165),
      Inner(10692, 55164),
      Inner(10692, 60642),
      Inner(10692, 84600),
      Inner(10693, 55166),
      Inner(16241, 84603),
    )
  )

  val hatikuFlorist = StoreRequest(
    "Hatiku Florist", 41749,
    Vector(
      Inner(55479, 295428),
    )
  )

  val kadoPlus = StoreRequest(
    "Kado Plus", 35460,
    Vector(
      Inner(39300, 207421),
      Inner(25446, 128992),
    )
  )

  val outerBloom = StoreRequest(
    "Outer Bloom", 35637,
    Vector(
      Inner(50582, 267067),
      Inner(47200, 248666),
      Inner(40144, 211691),
      Inner(22204, 248662),
      Inner(22204, 248661),
      Inner(22204, 211689),
      Inner(22204, 248660),
      Inner(22204, 114559)
    )
  )

  val orchidFlorist = StoreRequest(
    "Orchid Florist", 1184,
    Vector(
      Inner(6562, 33392),
      Inner(6562, 33390),
      Inner(6562, 33391)
    )
  )

  val prambananKencana = StoreRequest(
    "Prambanan Kencana", 23920,
    Vector(
      Inner(33898, 179114),
      Inner(54318, 288419),
      Inner(54318, 288422),
      Inner(54318, 288418),
      Inner(54318, 288420),
      Inner(54318, 288421),
      Inner(33912, 288410),
      Inner(33912, 179136),
      Inner(54317, 288411),
      Inner(54317, 288413),
      Inner(54317, 288414),
      Inner(54317, 288415),
      Inner(54317, 288417),
      Inner(54317, 288416),
      Inner(54317, 288412),
      Inner(33906, 179125),
      Inner(33906, 179124)
    )
  )

  val cvAnekaNutrisindo = StoreRequest(
    "CV Aneka Semesta Nutrisindo", 35238,
    Vector(
      Inner(40124, 211628),
      Inner(34641, 183401),
      Inner(34638, 183394),
      Inner(34638, 183395),
      Inner(34632, 183382),
      Inner(34636, 183391),
      Inner(34636, 183390),
      Inner(34630, 183378),
      Inner(34630, 183379),
      Inner(34630, 183377),
      Inner(34626, 183373),
      Inner(34629, 183376),
      Inner(34635, 183388),
      Inner(34635, 183389),
      Inner(34628, 183375),
      Inner(40123, 211627),
      Inner(34631, 183380),
      Inner(34631, 183381),
      Inner(40125, 211632),
      Inner(40125, 211631),
      Inner(40125, 211630),
      Inner(34637, 183392),
      Inner(34637, 183393),
      Inner(34633, 183384),
      Inner(34633, 183386),
      Inner(34633, 211626),
      Inner(34633, 183383),
      Inner(34633, 183385),
      Inner(34639, 183397),
      Inner(34634, 183387),
      Inner(34640, 183399),
      Inner(34640, 183398),
      Inner(34640, 183400),
      Inner(34627, 183374)
    )
  )

  val pazar = StoreRequest(
    "Pazar", 32517,
    Vector(
      Inner(21639, 111919),
      Inner(21638, 111918)
    )
  )

  val pronas = StoreRequest(
    "Pronas", 24465,
    Vector(
      Inner(34647, 183408),
      Inner(34647, 183407),
      Inner(34647, 183406),
      Inner(34648, 183409),
      Inner(34650, 183412),
      Inner(34649, 183411),
      Inner(34649, 183410)
    )
  )

  val indofresco = StoreRequest(
    "Indofresco", 35588,
    Vector(
      Inner(19699, 102662),
      Inner(19698, 102661),
      Inner(19698, 102658),
      Inner(19698, 102659),
      Inner(18914, 102655),
      Inner(18914, 98981),
      Inner(18914, 98980),
      Inner(18914, 98979),
      Inner(18914, 98978),
      Inner(18915, 98982),
      Inner(18915, 98983),
      Inner(18915, 98984)
    )
  )
  val ascMart = StoreRequest(
    "ASC Mart", 35340,
    Vector(
      Inner(19359, 101152),
      Inner(19359, 101151),
      Inner(19358, 101150),
      Inner(19358, 101149),
      Inner(19354, 194791),
      Inner(19354, 101140),
      Inner(19354, 101142),
      Inner(22600, 116563),
      Inner(22600, 116561),
      Inner(22600, 116562)
    )
  )
  val bumiFoods = StoreRequest(
    "Bumi Food", 42053,
    Vector(
      Inner(56408, 300284),
      Inner(56408, 300283),
      Inner(56408, 300285)
    )
  )

  val capitalFruit = StoreRequest(
    "Capital Fruit", 29910,
    Vector(
      Inner(51809, 274161),
      Inner(51809, 274162),
      Inner(45110, 237282),
      Inner(45110, 272639),
      Inner(45108, 237277),
      Inner(45108, 237275),
      Inner(45108, 237279),
      Inner(45108, 237278),
      Inner(45108, 237276),
      Inner(45108, 261508),
      Inner(45108, 237280),
      Inner(45105, 237269),
      Inner(45105, 237267),
      Inner(45105, 237270),
      Inner(45105, 237271),
      Inner(45105, 237268),
      Inner(40340, 215502),
      Inner(40340, 237258),
      Inner(40340, 272631),
      Inner(40340, 212595),
      Inner(40340, 237259),
      Inner(40340, 272630),
      Inner(40340, 274157),
      Inner(40341, 274158),
      Inner(40341, 272634),
      Inner(40341, 212596),
      Inner(40341, 272632),
      Inner(40341, 237262),
      Inner(40341, 237260),
      Inner(40341, 272633),
      Inner(40341, 237261),
      Inner(40341, 274159),
      Inner(45104, 237264),
      Inner(45104, 237265),
      Inner(45104, 237263),
      Inner(45104, 237266),
      Inner(45106, 237272),
      Inner(45106, 272635),
      Inner(45107, 272637),
      Inner(45107, 237274),
      Inner(45107, 237273),
      Inner(45107, 272636),
      Inner(45107, 274160),
      Inner(45107, 272638),
      Inner(45109, 237281)
    )
  )

  val ciptaFruitMarket= StoreRequest(
    "Cipta Fruit Market", 35572,
    Vector(
      Inner(40020, 210919),
      Inner(40020, 210920),
      Inner(40024, 210940),
      Inner(40025, 210943),
      Inner(40026, 210944),
      Inner(40026, 210946),
      Inner(40026, 210945),
      Inner(40023, 210935),
      Inner(40022, 210930),
      Inner(40022, 210924),
      Inner(40022, 210927),
      Inner(40022, 210926),

    )
  )

  val anekaBuah = StoreRequest(
    "Aneka Buah", 35176,
    Vector(
      Inner(55077, 293192),
      Inner(55077, 293190),
      Inner(55077, 293191),
      Inner(55078, 293193),
    )
  )
  val jakartaFruitMarket = StoreRequest(
    "Jakarta Fruit Market", 20690,
    Vector(
      Inner(34142, 180777),
      Inner(34142, 180776),
      Inner(34142, 180778),
      Inner(34142, 180773),
      Inner(34142, 180775),
      Inner(34142, 180779),
      Inner(34140, 180763),
      Inner(34140, 180772),
      Inner(34140, 180764),
      Inner(34140, 180771),
      Inner(34140, 180766),
      Inner(34140, 180762),
      Inner(34140, 180769),
      Inner(34140, 180768),
      Inner(34140, 180767),
      Inner(34140, 180765),
      Inner(34140, 180761),
      Inner(34141, 180770)
    )
  )


  val cempakaBuah =StoreRequest(
    "Cempaka Buah", 35159,
    Vector(
      Inner(52180, 275983),
      Inner(52180, 298696),
      Inner(29027, 148836),
      Inner(29027, 148834),
      Inner(29027, 148832),
      Inner(29027, 233166),
      Inner(29027, 148831),
      Inner(29027, 148833),
      Inner(29026, 233161),
      Inner(29026, 233164),
      Inner(29026, 233158),
      Inner(29026, 233159),
      Inner(29026, 233157),
      Inner(29026, 233163),
      Inner(29026, 233160),
      Inner(29026, 148830),
      Inner(29026, 233165),
      Inner(29026, 233162),
      Inner(51451, 306068),
      Inner(51451, 271746),
      Inner(51451, 306069),
      Inner(55127, 306074),
      Inner(55127, 306071),
      Inner(55127, 297300),
      Inner(55127, 293592),
      Inner(55127, 306070),
      Inner(55127, 306072),
      Inner(55127, 306073),
      Inner(55128, 293593),
      Inner(55128, 300873),
      Inner(55128, 297301),
      Inner(55128, 296373),
      Inner(55128, 300874),
      Inner(56410, 300287),
      Inner(56409, 300286)
    )
  )
  val maximFruit = StoreRequest(
    "Maxim Fruit", 35560,
    Vector(
      Inner(31538, 164398),
      Inner(31538, 164397),
      Inner(31542, 164412),
      Inner(31542, 164411),
      Inner(31543, 164413),
      Inner(31543, 164414),
      Inner(31539, 164399),
      Inner(31544, 164415),
      Inner(31541, 164410),
      Inner(31541, 164408),
      Inner(31541, 164409),
      Inner(31540, 164402),
      Inner(31540, 164406),
      Inner(31540, 164405),
      Inner(31540, 164401),
      Inner(31540, 164407),
      Inner(31540, 164403)
    )
  )

  val ucokDurian = StoreRequest(
    "Ucok Durian", 7034,
    Vector(
      Inner(16150, 84138),
      Inner(16151, 84139),
      Inner(53872, 285629)
    )
  )

  val rosalieCheese = StoreRequest(
    "Rosalie Cheese", 33886,
    Vector(
      Inner(45218, 238090),
      Inner(45219, 238091)
    )
  )

  val sajira = StoreRequest(
    "Sajira Farm", 23960,
    Vector(
      Inner(33773, 178349)
    )
  )

  val meatopedia = StoreRequest(
    "Meatopedia", 35469,
    Vector(
      Inner(45133, 237506),
      Inner(45133, 237507),
      Inner(57414, 306066),
      Inner(57414, 306067)
    )
  )
  val jsTokoDaging = StoreRequest(
    "JS Toko Daging", 35470,
    Vector(
      Inner(45131, 237504),
      Inner(45132, 237505)
    )
  )
  val grillMe = StoreRequest(
    "Grill Me", 35430,
    Vector(
      Inner(45939, 241784),
      Inner(45942, 241788),
      Inner(45941, 241787),
      Inner(45940, 241785),
      Inner(45940, 241786)
    )
  )

  val bulafSosis = StoreRequest(
    "Bulaf Sosis", 35243,
    Vector(
      Inner(35830, 189865),
      Inner(35830, 189868),
      Inner(35830, 189867),
      Inner(35830, 189866),
      Inner(35831, 189869)
    )
  )

  val klikFood = StoreRequest(
    "Klik Food", 35342,
    Vector(
      Inner(45031, 236976),
      Inner(19712, 102693),
      Inner(45030, 236974),
      Inner(45030, 236975),
      Inner(19713, 102695),
      Inner(19713, 102696),
      Inner(19713, 102694),
      Inner(19713, 102697),
      Inner(19714, 102699),
      Inner(19714, 102701),
      Inner(19714, 102700),
      Inner(19714, 102698)
    )
  )


  val apsMeatShop = StoreRequest(
    "APS Meatshop", 8745,
    Vector(
      Inner(19581, 134033),
      Inner(19581, 134029),
      Inner(19581, 134031),
      Inner(19581, 102095),
      Inner(19581, 134035),
      Inner(19581, 102093),
      Inner(19581, 102092),
      Inner(19581, 134030),
      Inner(19581, 134034),
      Inner(19581, 102094),
      Inner(19581, 102091),
      Inner(26340, 134042),
      Inner(26341, 134043),
      Inner(26344, 134046),
      Inner(26342, 134044),
      Inner(19582, 102096),
      Inner(19582, 134036),
      Inner(19583, 102097),
      Inner(19583, 134038),
      Inner(19583, 134037),
      Inner(26338, 134039),
      Inner(26338, 134040),
      Inner(26343, 134045),
      Inner(26339, 134041)
    )
  )


  val vandaSeafood = StoreRequest(
    "Vanda Seafood", 35281,
    Vector(
      Inner(18766, 98301),
      Inner(18766, 98302),

    )
  )

  val depoIkan = StoreRequest(
    "Depo Ikan", 35633,
    Vector(
      Inner(38305, 202673),
      Inner(38307, 202677),
      Inner(38307, 202675),
      Inner(38307, 202676),
    )
  )
  val jatiluwih = StoreRequest(
    "Jatiluwih", 41209,
    Vector(
      Inner(55036, 292933)
    )
  )

  val lifeJuice = StoreRequest(
    "Life Juice", 38198,
    Vector(
      Inner(50569, 266990)
    )
  )

  val superfoodIndonesia = StoreRequest(
    "Superfood Indonesia", 34514,
    Vector(
      Inner(50564, 266975),
      Inner(50564, 266973),
      Inner(50564, 266974),
      Inner(50566, 266978),
      Inner(50565, 266977),
      Inner(50565, 266976)
    )
  )

  val chiayo = StoreRequest(
    "Chia Yo", 35815,
    Vector(
      Inner(47671, 251394),
      Inner(47668, 251391),
      Inner(47669, 251392),
      Inner(47670, 251393)
    )
  )

  val houseOrganix = StoreRequest(
    "House Organix", 34762,
    Vector(
      Inner(46761, 246456),
      Inner(46761, 246453),
      Inner(46761, 246452),
      Inner(46761, 246454),
      Inner(46761, 246455),
      Inner(46762, 246457),
      Inner(46762, 246458),
      Inner(46762, 246460),
      Inner(46762, 246461),
      Inner(46762, 246459),
      Inner(46760, 246449),
      Inner(46760, 246450),
      Inner(46760, 246444),
      Inner(46760, 246446),
      Inner(46760, 246451),
      Inner(46760, 246443),
      Inner(46760, 246448),
      Inner(46760, 246447),
      Inner(46760, 246445),
      Inner(46765, 246478),
      Inner(46765, 246472),
      Inner(46765, 246474),
      Inner(46765, 246471),
      Inner(46765, 246477),
      Inner(46765, 246475),
      Inner(46765, 246473),
      Inner(46765, 246476),
      Inner(46759, 246441),
      Inner(46759, 246442),
      Inner(46763, 246463),
      Inner(46763, 246462),
      Inner(46763, 246464),
      Inner(46764, 246470),
      Inner(46764, 246468),
      Inner(46764, 246466),
      Inner(46764, 246467),
      Inner(46764, 246465),
      Inner(46764, 246469)
    )
  )

  val clubSehat = StoreRequest(
    "Club Sehat", 33861,
    Vector(
      Inner(45211, 238041),
      Inner(45209, 238036),
      Inner(45209, 238034),
      Inner(45209, 238030),
      Inner(45209, 238033),
      Inner(45209, 238037),
      Inner(45209, 238032),
      Inner(45209, 238038),
      Inner(45209, 238031),
      Inner(45209, 238035),
      Inner(45214, 238050),
      Inner(45214, 238049),
      Inner(45214, 238048),
      Inner(45210, 238039),
      Inner(45212, 238043),
      Inner(45213, 238047),
      Inner(45213, 238045),
      Inner(45213, 238044)
    )
  )

  val ecozest = StoreRequest(
    "Ecozest", 35405,
    Vector(
      Inner(43381, 229340),
      Inner(43386, 229346),
      Inner(43378, 229336),
      Inner(43378, 229337),
      Inner(43380, 229339),
      Inner(43384, 229343),
      Inner(43382, 229341),
      Inner(43385, 229344),
      Inner(43387, 229347),
      Inner(43379, 229338),
      Inner(43383, 229342)
    )
  )

  val oridieta = StoreRequest(
    "Oridieta", 10752,
    Vector(
      Inner(22435, 115710)
    )
  )

  val crispySalad = StoreRequest(
    "Crispy Salad", 35421,
    Vector(
      Inner(22256, 114812)
    )
  )
  val theWellnessPantry = StoreRequest(
    "The Wellness Pantry", 3444,
    Vector(
      Inner(11328, 58518),
      Inner(11329, 58519),
      Inner(11329, 58520),
      Inner(21815, 112808),
      Inner(21815, 112807),
      Inner(26842, 136777),
      Inner(26843, 136778)
    )
  )
  val javara = StoreRequest(
    "Javara", 35265,
    Vector(
      Inner(3938, 21957),
      Inner(3936, 21949),
      Inner(3936, 21952),
      Inner(3936, 21951),
      Inner(3936, 21953),
      Inner(3936, 21950),
      Inner(3936, 112793),
      Inner(3937, 21954),
      Inner(3937, 21955),
      Inner(3937, 21956)
    )
  )

  val michelleOrganic = StoreRequest(
    "Michelle Organic Corner", 35152,
    Vector(
      Inner(3404, 19208),
      Inner(3397, 184950),
      Inner(3397, 46807),
      Inner(3397, 19190),
      Inner(3396, 19187),
      Inner(3396, 19188),
      Inner(3396, 184953),
      Inner(3396, 184951),
      Inner(3396, 19185),
      Inner(3396, 19189),
      Inner(3396, 184952),
      Inner(3405, 19210),
      Inner(3405, 46806),
      Inner(3405, 19209),
      Inner(3405, 19214),
      Inner(3405, 19213),
      Inner(3405, 19215),
      Inner(3405, 19212),
      Inner(3405, 19216),
      Inner(3405, 19211),
      Inner(3399, 19196),
      Inner(3399, 19197),
      Inner(3399, 19198),
      Inner(3399, 19195),
      Inner(3406, 19224),
      Inner(3406, 208297),
      Inner(3406, 19222),
      Inner(3406, 184954),
      Inner(3406, 46815),
      Inner(3406, 19223),
      Inner(3403, 184955),
      Inner(3400, 19201),
      Inner(3400, 19199),
      Inner(3400, 159687),
      Inner(3400, 159686),
      Inner(3402, 19204),
      Inner(3402, 19205),
      Inner(3402, 46812),
      Inner(3402, 19206)
    )
  )

  val mcmCommerce = StoreRequest(
    "MCM Commerce", 36783,
    Vector(
      Inner(48331, 255005),
      Inner(48331, 255002),
      Inner(48331, 255004),
      Inner(48331, 255003),
      Inner(48326, 254994),
      Inner(48326, 254993),
      Inner(48328, 254999),
      Inner(48328, 254996),
      Inner(48328, 254997),
      Inner(48328, 254998),
      Inner(48332, 255007),
      Inner(48332, 255008),
      Inner(48332, 255009),
      Inner(48332, 255006),
      Inner(48338, 255020),
      Inner(48338, 255019),
      Inner(48329, 255000),
      Inner(48334, 255011),
      Inner(48335, 255013),
      Inner(48335, 255014),
      Inner(48335, 255012),
      Inner(48325, 254992),
      Inner(48330, 255001),
      Inner(48336, 255016),
      Inner(48336, 255015),
      Inner(48327, 254995),
      Inner(48333, 255010),
      Inner(48337, 255017),
      Inner(48337, 255018)
    )

  )

  val lunaBabyShop = StoreRequest(
    "Luna Baby Shop", 35439,
    Vector(
      Inner(45970, 241954),
      Inner(45970, 241953),
      Inner(45970, 241952),
      Inner(45970, 241951),
      Inner(45970, 241955),
      Inner(45970, 241956),
      Inner(45970, 241950),
      Inner(45971, 241957),
      Inner(45969, 241948),
      Inner(45969, 241949),
      Inner(45974, 241962),
      Inner(45974, 241961),
      Inner(45972, 241958),
      Inner(45973, 241959),
      Inner(45973, 241960)
    )
  )

  val natracare = StoreRequest(
    "Natracare", 33383,
    Vector(
      Inner(45196, 237952),
      Inner(45196, 237953),
      Inner(45196, 237954),
      Inner(45195, 237951)
    )
  )
  val  palmers = StoreRequest(
    "Palmers", 35300,
    Vector(
      Inner(19402, 101302),
      Inner(19402, 101303),
      Inner(19403, 101306),
      Inner(19403, 101304),
      Inner(19401, 101301)
    )
  )

  val endoraCare = StoreRequest(
    "Endore Care", 33471,
    Vector(
      Inner(44970, 236733),
      Inner(44972, 236740),
      Inner(44972, 236739),
      Inner(44972, 236737),
      Inner(44972, 236738),
      Inner(44971, 236735),
      Inner(44971, 236736),
      Inner(44971, 236734),
      Inner(44977, 236752),
      Inner(44974, 236746),
      Inner(44975, 236747),
      Inner(44975, 236748),
      Inner(44976, 236750),
      Inner(44976, 236749),
      Inner(44976, 236751),
      Inner(44973, 236742),
      Inner(44973, 236744),
      Inner(44973, 236743),
      Inner(44973, 236741),
      Inner(44973, 236745)
    )
  )


  val sensi = StoreRequest(
    "Sensi", 35352,
    Vector(
      Inner(41671, 219601),
      Inner(41673, 219603),
      Inner(41673, 219604),
      Inner(41672, 219602)
    )
  )
  val babyWorld = StoreRequest(
    "Baby World", 35245,
    Vector(
      Inner(14949, 77315),
      Inner(14950, 77320),
      Inner(14950, 139233),
      Inner(14947, 77311),
      Inner(14947, 77312),
      Inner(27244, 139239),
      Inner(14941, 77298),
      Inner(14952, 77325),
      Inner(27239, 139232),
      Inner(27242, 139237),
      Inner(14937, 139227),
      Inner(14935, 77282),
      Inner(14935, 139226),
      Inner(14935, 77280),
      Inner(14935, 77281),
      Inner(27243, 139238),
      Inner(14945, 139231),
      Inner(14934, 77278),
      Inner(27246, 139243),
      Inner(27246, 139242),
      Inner(27241, 139236),
      Inner(14938, 77288),
      Inner(14940, 77296),
      Inner(14944, 139230),
      Inner(27245, 139240),
      Inner(27245, 139241),
      Inner(14953, 77326),
      Inner(14953, 139234),
      Inner(27247, 139244),
      Inner(27240, 139235),
      Inner(14948, 77313),
      Inner(14939, 139229),
      Inner(14939, 77293),
      Inner(14939, 77290),
      Inner(14939, 77294),
      Inner(14939, 77291),
      Inner(14939, 77292),
      Inner(14939, 139228),
      Inner(14951, 77324),
      Inner(14951, 77322)
    )
  )

  val sake = StoreRequest(
    "SakePlus", 42203,
    Vector(
      Inner(55564, 295823)
    )
  )

  val vin = StoreRequest(
    "Vin", 42197,
    Vector(
      Inner(55560, 295810),
      Inner(55560, 295807),
      Inner(55560, 295809),
      Inner(55560, 295808),
      Inner(55559, 295806),
      Inner(55561, 295812),
      Inner(55561, 295813)
    )

  )

  val hattenWines = StoreRequest(
    "Hatten Wines", 430,
    Vector(
      Inner(6268, 32052),
      Inner(4179, 22495),
      Inner(4179, 22492),
      Inner(4179, 32051),
      Inner(4179, 22491)
    )
  )

  val sababayWinery = StoreRequest(
    "Sababay Winery", 35612,
    Vector(
      Inner(3332, 25817),
      Inner(3332, 25815),
      Inner(3332, 32044),
      Inner(3332, 25814)
    )
  )

  val wineCellar = StoreRequest(
    "Wine Cellar", 8995,
    Vector(
      Inner(18967, 99198),
      Inner(18967, 99200),
      Inner(18967, 99199),
      Inner(18967, 99196),
      Inner(18967, 99201),
      Inner(18967, 99197),
      Inner(18966, 99194),
      Inner(18966, 99191),
      Inner(18966, 99192),
      Inner(18966, 99193),
      Inner(18966, 99195)
    )
  )

  val ambroze = StoreRequest(
    "Ambroze", 39071,
    Vector(
      Inner(53424, 282900),
      Inner(53424, 282899),
      Inner(53424, 282898),
      Inner(53424, 282896),
      Inner(53424, 282897),
    )
  )


  val manon = StoreRequest(
    "Manon", 35617,
    Vector(
      Inner(10325, 53342),
      Inner(10325, 53345),
      Inner(10325, 53343),
      Inner(10326, 53347)
    )
  )


  val capitalBakery = StoreRequest(
    "Capital Bakery", 35269,
    Vector(
      Inner(42349, 223524),
      Inner(42349, 223523),
      Inner(42349, 223525),
      Inner(42349, 223526),
    )
  )

  val dianCookies = StoreRequest(
    "Dian de Cookies", 23281,
    Vector(
      Inner(39317, 207509),
      Inner(37798, 200610)
    )
  )

  val lareiaCake = StoreRequest(
    "Lareia Cake", 35653,
    Vector(
      Inner(32254, 169204),
      Inner(32254, 169200),
      Inner(32254, 169203),
      Inner(32254, 169202),
      Inner(32254, 169201),
      Inner(54652, 290667)
    )
  )

  val royce = StoreRequest(
    "Royce", 35387,
    Vector(
      Inner(10457, 54078)
    )
  )

  val kempiDeli = StoreRequest(
    "Kempi Deli" , 21874,
    Vector(
      Inner(31829, 166302),
      Inner(31829, 166303),
      Inner(31831, 166306),
      Inner(31903, 166697),
      Inner(31830, 166304),
      Inner(31830, 166305)
    )
  )

  val pasarModernSenen = StoreRequest(
    "Pasar Modern Senen", 38936,
    Vector(
      Inner(57593, 307235),
      Inner(57593, 307236),
      Inner(57593, 307237),
      Inner(57593, 307238),
      Inner(57593, 307239),
      Inner(57590, 307222),
      Inner(57590, 307221),
      Inner(57590, 307229),
      Inner(57590, 307227),
      Inner(57590, 307224),
      Inner(57590, 307228),
      Inner(57590, 307226),
      Inner(57590, 307230),
      Inner(57590, 307225),
      Inner(57590, 307223),
      Inner(57595, 307245),
      Inner(57595, 307244),
      Inner(57595, 307243),
      Inner(57594, 307242),
      Inner(57594, 307241),
      Inner(57594, 307240),
      Inner(57592, 307233),
      Inner(57592, 307234),
      Inner(57591, 307231),
      Inner(57591, 307232)
    )
  )


  val pasarModernKelapagading = StoreRequest(
    "Pasar Modern Kelapa Gading", 39163,
    Vector(
      Inner(52275, 276550),
      Inner(52275, 276551),
      Inner(52275, 276555),
      Inner(52275, 276553),
      Inner(52275, 276552),
      Inner(52275, 276554),
      Inner(52272, 276538),
      Inner(52272, 276541),
      Inner(52272, 276545),
      Inner(52272, 276536),
      Inner(52272, 276544),
      Inner(52272, 276540),
      Inner(52272, 276542),
      Inner(52272, 276537),
      Inner(52272, 276539),
      Inner(52272, 276543),
      Inner(52277, 276559),
      Inner(52277, 276561),
      Inner(52277, 276560),
      Inner(52276, 276557),
      Inner(52276, 276558),
      Inner(52276, 276556),
      Inner(52274, 276549),
      Inner(52274, 276548),
      Inner(52273, 276547),
      Inner(52273, 276546)
    )
  )

  val pasarModernGondangdia = StoreRequest(
    "Pasar Modern Gondangdia", 39543,
    Vector(
      Inner(52302, 276716),
      Inner(52302, 276713),
      Inner(52302, 276714),
      Inner(52302, 276715),
      Inner(52302, 276717),
      Inner(52299, 276702),
      Inner(52299, 276704),
      Inner(52299, 276708),
      Inner(52299, 276707),
      Inner(52299, 276701),
      Inner(52299, 276700),
      Inner(52299, 276703),
      Inner(52299, 276699),
      Inner(52299, 276706),
      Inner(52299, 276705),
      Inner(52304, 276722),
      Inner(52304, 276721),
      Inner(52303, 276720),
      Inner(52303, 276718),
      Inner(52303, 276719),
      Inner(52305, 276723),
      Inner(52301, 276711),
      Inner(52301, 276712),
      Inner(52300, 276710),
      Inner(52300, 276709)
    )
  )

  val pasarModernCijantung = StoreRequest(
    "Pasar Modern Cijantung", 40162,
    Vector(
      Inner(55320, 294587),
      Inner(55320, 294585),
      Inner(55320, 294583),
      Inner(55320, 294586),
      Inner(55320, 294584),
      Inner(55324, 294597),
      Inner(55324, 294599),
      Inner(55324, 294600),
      Inner(55324, 294596),
      Inner(55324, 294601),
      Inner(55324, 294602),
      Inner(55324, 294595),
      Inner(55324, 294598),
      Inner(55324, 294593),
      Inner(55324, 294594),
      Inner(55325, 294603),
      Inner(55325, 294604),
      Inner(55326, 294605),
      Inner(55326, 294607),
      Inner(55326, 294606),
      Inner(55322, 294590),
      Inner(55321, 294588),
      Inner(55321, 294589),
      Inner(55323, 294591),
      Inner(55323, 294592)
    )
  )


  val pasarModernPuri = StoreRequest(
    "Pasar Modern Puri", 37508,
    Vector(
      Inner(46603, 245587),
      Inner(46603, 245593),
      Inner(46603, 245590),
      Inner(46603, 245589),
      Inner(46603, 245592),
      Inner(46603, 245591),
      Inner(46603, 245588),
      Inner(46599, 245581),
      Inner(46599, 245578),
      Inner(46599, 245574),
      Inner(46599, 261441),
      Inner(46599, 245583),
      Inner(46599, 245577),
      Inner(46599, 245579),
      Inner(46599, 245576),
      Inner(46599, 245582),
      Inner(46599, 245580),
      Inner(46599, 245575),
      Inner(46604, 245943),
      Inner(46604, 245945),
      Inner(46604, 274579),
      Inner(46604, 245944),
      Inner(46671, 261445),
      Inner(46671, 261444),
      Inner(46671, 245942),
      Inner(46602, 245586),
      Inner(46602, 274578),
      Inner(46602, 274577),
      Inner(46600, 261442),
      Inner(46600, 245584),
      Inner(46601, 261443),
      Inner(46601, 245585)
    )
  )

  val pasarModernBintaro = StoreRequest(
    "Pasar Modern Bintaro", 34722,
    Vector(
      Inner(46603, 245587),
      Inner(46603, 245593),
      Inner(46603, 245590),
      Inner(46603, 245589),
      Inner(46603, 245592),
      Inner(46603, 245591),
      Inner(46603, 245588),
      Inner(46599, 245581),
      Inner(46599, 245578),
      Inner(46599, 245574),
      Inner(46599, 261441),
      Inner(46599, 245583),
      Inner(46599, 245577),
      Inner(46599, 245579),
      Inner(46599, 245576),
      Inner(46599, 245582),
      Inner(46599, 245580),
      Inner(46599, 245575),
      Inner(46604, 245943),
      Inner(46604, 245945),
      Inner(46604, 274579),
      Inner(46604, 245944),
      Inner(46671, 261445),
      Inner(46671, 261444),
      Inner(46671, 245942),
      Inner(46602, 245586),
      Inner(46602, 274578),
      Inner(46602, 274577),
      Inner(46600, 261442),
      Inner(46600, 245584),
      Inner(46601, 261443),
      Inner(46601, 245585),
    )
  )

  val pasarModernBSD = StoreRequest(
    "Pasar Modern BSD", 34720,
      Vector(
        Inner(46603, 245587),
        Inner(46603, 245593),
        Inner(46603, 245590),
        Inner(46603, 245589),
        Inner(46603, 245592),
        Inner(46603, 245591),
        Inner(46603, 245588),
        Inner(46599, 245581),
        Inner(46599, 245578),
        Inner(46599, 245574),
        Inner(46599, 261441),
        Inner(46599, 245583),
        Inner(46599, 245577),
        Inner(46599, 245579),
        Inner(46599, 245576),
        Inner(46599, 245582),
        Inner(46599, 245580),
        Inner(46599, 245575),
        Inner(46604, 245943),
        Inner(46604, 245945),
        Inner(46604, 274579),
        Inner(46604, 245944),
        Inner(46671, 261445),
        Inner(46671, 261444),
        Inner(46671, 245942),
        Inner(46602, 245586),
        Inner(46602, 274578),
        Inner(46602, 274577),
        Inner(46600, 261442),
        Inner(46600, 245584),
        Inner(46601, 261443),
        Inner(46601, 245585)
      )
  )

  val kalbe = StoreRequest(
    "Kalbe", 42032,
    Vector(
      Inner(55316, 294525),
      Inner(55316, 294522),
      Inner(55316, 294524),
      Inner(55316, 294523)
    )
  )

  val happyHour = StoreRequest(
    "Happy Hour", 34544,
    Vector(
      Inner(45810, 241011)
    )
  )

  val mayora = StoreRequest(
    "Mayora Official Store", 39425,
    Vector(
      Inner(53725, 284640),
      Inner(53725, 284637),
      Inner(53725, 284639),
      Inner(53725, 284638),
      Inner(53725, 284636),
      Inner(53724, 284634),
      Inner(53724, 284635),
      Inner(53723, 284633),
      Inner(53723, 284632),
      Inner(53723, 284631)
    )
  )

  val unileverFood = StoreRequest(
    "Unilever Food", 36717,
    Vector(
      Inner(48690, 256658),
      Inner(48689, 256656),
      Inner(48689, 256657)
    )
  )


  val beemart = StoreRequest(
    "Beemart", 5341,
    Vector(
      Inner(9607, 64123),
      Inner(9607, 64124),
      Inner(9607, 49930),
      Inner(9607, 49931),
      Inner(9607, 49929),
      Inner(20407, 106284),
      Inner(20407, 110197),
      Inner(12383, 64128),
      Inner(12383, 64130),
      Inner(12383, 64129),
      Inner(12383, 64132),
      Inner(12383, 226064),
      Inner(12383, 64127),
      Inner(12383, 64131),
      Inner(9608, 49938),
      Inner(9608, 64125),
      Inner(9608, 49937),
      Inner(9608, 49936),
      Inner(9608, 64126),
      Inner(9608, 49932),
      Inner(9608, 49933),
      Inner(9608, 49934),
      Inner(9608, 49935),
      Inner(9610, 49945),
      Inner(9610, 49948),
      Inner(9610, 49947),
      Inner(9610, 49946),
      Inner(9610, 49950),
      Inner(9610, 49949),
      Inner(9610, 106283),
      Inner(9610, 49944),
      Inner(9610, 64137),
      Inner(20408, 106287),
      Inner(12384, 64135),
      Inner(12384, 64134),
      Inner(12384, 64133),
      Inner(9612, 49958),
      Inner(9612, 64139),
      Inner(9612, 49957),
      Inner(9612, 226066),
      Inner(9612, 49956),
      Inner(9612, 49955),
      Inner(9612, 49959),
      Inner(9612, 49960),
      Inner(9612, 110198),
      Inner(9612, 49954),
      Inner(9612, 49961),
      Inner(9609, 49941),
      Inner(9609, 49943),
      Inner(9609, 49940),
      Inner(9609, 49939),
      Inner(9609, 49942),
      Inner(9609, 64136),
      Inner(9611, 49952),
      Inner(9611, 49951),
      Inner(9611, 64138),
      Inner(9611, 49953),
      Inner(9606, 49927),
      Inner(9606, 49925),
      Inner(9606, 49924),
      Inner(9606, 49928),
      Inner(9606, 110196),
      Inner(9606, 49926),
      Inner(21311, 110195)
    )
  )

  val beepoint = StoreRequest(
    "Beepoint", 44600,
    Vector(
      Inner(59341, 317316),
      Inner(59341, 317314),
      Inner(59341, 317315),
      Inner(59341, 317317),
      Inner(59341, 317318),
      Inner(59346, 317336),
      Inner(59346, 317335),
      Inner(59346, 317332),
      Inner(59346, 317333),
      Inner(59346, 317334),
      Inner(59346, 317331),
      Inner(59345, 317330),
      Inner(59345, 317329),
      Inner(59343, 317324),
      Inner(59343, 317323),
      Inner(59343, 317325),
      Inner(59344, 317328),
      Inner(59344, 317327),
      Inner(59344, 317326),
      Inner(59342, 317319),
      Inner(59342, 317321),
      Inner(59342, 317320),
      Inner(59342, 317322)
    )
  )

  val lawson = StoreRequest(
    "Lawson", 41677,
    Vector(
      Inner(55034, 292930),
      Inner(55034, 292929),
      Inner(55034, 292928),
      Inner(55034, 306946),
      Inner(55034, 292932),
      Inner(58931, 314732),
      Inner(55026, 292905),
      Inner(55026, 292906),
      Inner(55033, 292927),
      Inner(55033, 292926),
      Inner(55027, 292911),
      Inner(55027, 292910),
      Inner(55027, 292908),
      Inner(55027, 292909),
      Inner(55027, 292907),
      Inner(55024, 292898),
      Inner(55024, 292893),
      Inner(55024, 292892),
      Inner(55024, 292894),
      Inner(55024, 292891),
      Inner(55024, 292897),
      Inner(55024, 292895),
      Inner(55024, 292890),
      Inner(55024, 292896),
      Inner(55023, 292884),
      Inner(55023, 292886),
      Inner(55023, 292888),
      Inner(55023, 292883),
      Inner(55023, 292887),
      Inner(55023, 292885),
      Inner(55023, 292882),
      Inner(55023, 292889),
      Inner(55031, 292915),
      Inner(55031, 292924),
      Inner(55031, 292921),
      Inner(55031, 292920),
      Inner(55031, 292923),
      Inner(55031, 292917),
      Inner(55031, 292916),
      Inner(55031, 292922),
      Inner(55031, 292919),
      Inner(55031, 292918),
      Inner(55030, 292914),
      Inner(55022, 292881),
      Inner(55025, 292904),
      Inner(55025, 292902),
      Inner(55025, 292900),
      Inner(55025, 292903),
      Inner(55025, 292899),
      Inner(55025, 292901),
      Inner(55029, 292913)
    )
  )

  val papaya = StoreRequest(
    "Papaya", 36503,
    Vector(
      Inner(48671, 256559),
      Inner(48671, 256563),
      Inner(48671, 256562),
      Inner(48671, 256557),
      Inner(48671, 256560),
      Inner(48671, 256558),
      Inner(47521, 256552),
      Inner(47521, 256551),
      Inner(47521, 250352),
      Inner(47521, 256548),
      Inner(47521, 250353),
      Inner(47521, 250357),
      Inner(47521, 250354),
      Inner(47521, 250355),
      Inner(47521, 250356),
      Inner(47521, 256549),
      Inner(47521, 256550),
      Inner(48673, 256568),
      Inner(48673, 256570),
      Inner(48673, 256569),
      Inner(48672, 256564),
      Inner(48672, 256565),
      Inner(48672, 256566),
      Inner(48672, 256567),
      Inner(48674, 256573),
      Inner(48674, 256574),
      Inner(48674, 256571),
      Inner(48674, 256572),
      Inner(47529, 250387),
      Inner(47529, 250388),
      Inner(47529, 250385),
      Inner(47529, 250386),
      Inner(48675, 256575),
      Inner(47524, 250377),
      Inner(47524, 250371),
      Inner(47524, 250374),
      Inner(47524, 250369),
      Inner(47524, 250375),
      Inner(47524, 250370),
      Inner(47524, 250372),
      Inner(47524, 250376),
      Inner(47524, 250373),
      Inner(47530, 250394),
      Inner(47530, 250397),
      Inner(47530, 250391),
      Inner(47530, 250390),
      Inner(47530, 250395),
      Inner(47530, 250389),
      Inner(47530, 250396),
      Inner(47530, 250392),
      Inner(47530, 250393),
      Inner(47522, 250359),
      Inner(47522, 250365),
      Inner(47522, 250366),
      Inner(47522, 250363),
      Inner(47522, 250362),
      Inner(47522, 250361),
      Inner(47522, 250364),
      Inner(47522, 250358),
      Inner(47522, 250360),
      Inner(47527, 250380),
      Inner(47527, 256554),
      Inner(47527, 250381),
      Inner(47527, 250382),
      Inner(47534, 250415),
      Inner(47534, 250413),
      Inner(47534, 250416),
      Inner(47534, 250417),
      Inner(47534, 250419),
      Inner(47534, 250421),
      Inner(47534, 250422),
      Inner(47534, 250418),
      Inner(47534, 256556),
      Inner(47534, 250414),
      Inner(47534, 250420),
      Inner(47528, 250383),
      Inner(47528, 250384),
      Inner(47523, 256553),
      Inner(47523, 250367),
      Inner(47523, 250368),
      Inner(47531, 250400),
      Inner(47531, 250398),
      Inner(47531, 250399),
      Inner(47531, 250403),
      Inner(47531, 250402),
      Inner(47531, 250401),
      Inner(47526, 250379),
      Inner(47532, 250407),
      Inner(47532, 250405),
      Inner(47532, 250406),
      Inner(47532, 250408),
      Inner(47532, 265381),
      Inner(47532, 250404),
      Inner(47532, 250409),
      Inner(47532, 250410),
      Inner(47525, 250378),
      Inner(47533, 250412),
      Inner(47533, 250411),
      Inner(47533, 256555)
    )
  )

  val maybankAeon = StoreRequest(
    "Maybank Aeon", 44770,
    Vector (
      Inner(59412, 317696),
      Inner(59412, 317697),
      Inner(59412, 317698),
      Inner(59418, 317710),
      Inner(59418, 317709),
      Inner(59414, 317700),
      Inner(59414, 317702),
      Inner(59414, 317701),
      Inner(59411, 317694),
      Inner(59411, 317695),
      Inner(59411, 317727),
      Inner(59411, 317726),
      Inner(59409, 317688),
      Inner(59409, 317687),
      Inner(59409, 317685),
      Inner(59409, 317686),
      Inner(59409, 318270),
      Inner(59409, 317689),
      Inner(59409, 317690),
      Inner(59413, 317699),
      Inner(59413, 318956),
      Inner(59413, 317728),
      Inner(59413, 318955),
      Inner(59413, 318957),
      Inner(59416, 317704),
      Inner(59416, 317705),
      Inner(59415, 317703),
      Inner(59666, 318958),
      Inner(59666, 318960),
      Inner(59666, 318961),
      Inner(59666, 318959),
      Inner(59421, 318271),
      Inner(59421, 318851),
      Inner(59421, 317729),
      Inner(59644, 318829),
      Inner(59644, 318830),
      Inner(59644, 318832),
      Inner(59644, 318831),
      Inner(59644, 318828),
      Inner(59417, 317706),
      Inner(59417, 317708),
      Inner(59417, 318202),
      Inner(59417, 317707),
      Inner(59417, 318203),
      Inner(59410, 317691),
      Inner(59410, 317693),
      Inner(59410, 317692)
    )
  )

  val transmartCarrefour = StoreRequest(
    "Transmart Carrefour", 7056,
    Vector(
      Inner(40709, 214485),
      Inner(40709, 214491),
      Inner(40709, 214492),
      Inner(40709, 214486),
      Inner(40709, 214482),
      Inner(40709, 214489),
      Inner(40709, 214481),
      Inner(40709, 214488),
      Inner(40709, 214490),
      Inner(7056, 36240),
      Inner(7056, 40029),
      Inner(7056, 40030),
      Inner(7056, 40031),
      Inner(7056, 176299),
      Inner(7056, 40032),
      Inner(7055, 40027),
      Inner(7055, 40026),
      Inner(7055, 40025),
      Inner(7055, 36221),
      Inner(7055, 36222),
      Inner(7055, 40024),
      Inner(7055, 36218),
      Inner(7055, 36219),
      Inner(7055, 36220),
      Inner(7055, 36223),
      Inner(7055, 40028),
      Inner(7057, 36241),
      Inner(7057, 36244),
      Inner(7057, 36243),
      Inner(7057, 36242),
      Inner(33342, 176300),
      Inner(5137, 26879),
      Inner(5137, 26889),
      Inner(5137, 26878),
      Inner(5137, 26880),
      Inner(5137, 26886),
      Inner(5137, 26881),
      Inner(5137, 26885),
      Inner(5137, 26882),
      Inner(5137, 26884),
      Inner(5133, 26857),
      Inner(5133, 26856),
      Inner(5133, 26854),
      Inner(5133, 36238),
      Inner(5133, 26859),
      Inner(5133, 36237),
      Inner(5133, 26853),
      Inner(5133, 36236),
      Inner(5133, 26851),
      Inner(5140, 26900),
      Inner(5140, 26898),
      Inner(5140, 36246),
      Inner(5140, 26899),
      Inner(5140, 136186),
      Inner(5140, 26894),
      Inner(5140, 26901),
      Inner(5140, 26893),
      Inner(5140, 36245),
      Inner(5140, 26904),
      Inner(5140, 26903),
      Inner(5140, 26895),
      Inner(5132, 26844),
      Inner(5132, 26845),
      Inner(5132, 26839),
      Inner(5132, 26840),
      Inner(5132, 26847),
      Inner(5132, 26848),
      Inner(5132, 26838),
      Inner(5132, 26841),
      Inner(5132, 136184),
      Inner(5132, 26842),
      Inner(5141, 26905),
      Inner(5141, 97487),
      Inner(5141, 287286),
      Inner(5143, 26908),
      Inner(5143, 26909),
      Inner(5143, 26911),
      Inner(5143, 26910),
      Inner(5143, 38391),
      Inner(5143, 26913),
      Inner(5143, 26912),
      Inner(5143, 287284),
      Inner(5135, 26870),
      Inner(5135, 26871),
      Inner(5135, 26872),
      Inner(5135, 26868),
      Inner(5131, 59341),
      Inner(5131, 26833),
      Inner(5131, 26835),
      Inner(5131, 26834),
      Inner(5131, 26837),
      Inner(5136, 26877),
      Inner(5136, 26875),
      Inner(5136, 26876),
      Inner(5136, 26873),
      Inner(5136, 26874),
      Inner(5136, 59339),
      Inner(21480, 111174),
      Inner(11474, 59338),
      Inner(11474, 59337),
      Inner(5129, 26828),
      Inner(5138, 26890),
      Inner(5138, 26891),
      Inner(5138, 135603)
    )

  )

  val aeon = StoreRequest(
    "Aeon",  32369, Vector (
      Inner( 46509, 245138),
      Inner( 46509, 245136),
      Inner( 46509, 245139),
      Inner( 46509, 245137),
      Inner( 46509, 254887),
      Inner( 45842, 241148),
      Inner( 45842, 241824),
      Inner( 45842, 242211),
      Inner( 45842, 242209),
      Inner( 45842, 242210),
      Inner( 45842, 242212),
      Inner( 45830, 241818),
      Inner( 45830, 241049),
      Inner( 45830, 241819),
      Inner( 45830, 241817),
      Inner( 45830, 241050),
      Inner( 45830, 242207),
      Inner( 45830, 241051),
      Inner( 45830, 241052),
      Inner( 45830, 242208),
      Inner( 45830, 242206),
      Inner( 45830, 241816),
      Inner( 46235, 243467),
      Inner( 46235, 243856),
      Inner( 46235, 243468),
      Inner( 46366, 244533),
      Inner( 46366, 244531),
      Inner( 46366, 244532),
      Inner( 46365, 244530),
      Inner( 49267, 259629),
      Inner( 49267, 259627),
      Inner( 49267, 259628),
      Inner( 46060, 242462),
      Inner( 46060, 242464),
      Inner( 46060, 242463),
      Inner( 45835, 241081),
      Inner( 45835, 241080),
      Inner( 45835, 241082),
      Inner( 45835, 241079),
      Inner( 45835, 241078),
      Inner( 45835, 242671),
      Inner( 45835, 242672),
      Inner( 45843, 241149),
      Inner( 45843, 241150),
      Inner( 45843, 270573),
      Inner( 45843, 241151),
      Inner( 45843, 242461),
      Inner( 45831, 241060),
      Inner( 45831, 241056),
      Inner( 45831, 241054),
      Inner( 45831, 241061),
      Inner( 45831, 241058),
      Inner( 45831, 241055),
      Inner( 45831, 241057),
      Inner( 45831, 241053),
      Inner( 45831, 241059),
      Inner( 45836, 241105),
      Inner( 45836, 241102),
      Inner( 45836, 241103),
      Inner( 45836, 241106),
      Inner( 45836, 241107),
      Inner( 45836, 241100),
      Inner( 45836, 241099),
      Inner( 45836, 241101),
      Inner( 45836, 241104),
      Inner( 45836, 241098),
      Inner( 45840, 241144),
      Inner( 45832, 241065),
      Inner( 45832, 241066),
      Inner( 45832, 241067),
      Inner( 45832, 241062),
      Inner( 45832, 241064),
      Inner( 45832, 241069),
      Inner( 45832, 241070),
      Inner( 45832, 241063),
      Inner( 45832, 241068),
      Inner( 45834, 241072),
      Inner( 45834, 241074),
      Inner( 45834, 241073),
      Inner( 45844, 241163),
      Inner( 45844, 241153),
      Inner( 45844, 241157),
      Inner( 45844, 241160),
      Inner( 45844, 241159),
      Inner( 45844, 241161),
      Inner( 45844, 241162),
      Inner( 45844, 241154),
      Inner( 45844, 241155),
      Inner( 45844, 241152),
      Inner( 45844, 241156),
      Inner( 45844, 241158),
      Inner( 45844, 277912),
      Inner( 45838, 241131),
      Inner( 45838, 241129),
      Inner( 45838, 241135),
      Inner( 45838, 241132),
      Inner( 45838, 241133),
      Inner( 45838, 241134),
      Inner( 45838, 241130),
      Inner( 45837, 241126),
      Inner( 45837, 241122),
      Inner( 45837, 241127),
      Inner( 45837, 241125),
      Inner( 45837, 241123),
      Inner( 45837, 241124),
      Inner( 45837, 241128),
      Inner( 45837, 277910),
      Inner( 45839, 241140),
      Inner( 45839, 241143),
      Inner( 45839, 241141),
      Inner( 45839, 241137),
      Inner( 45839, 241138),
      Inner( 45839, 241139),
      Inner( 45839, 241136),
      Inner( 45839, 241142),
      Inner( 45839, 273179),
      Inner( 45833, 241071),
      Inner( 45841, 241146),
      Inner( 45841, 241147),
      Inner( 45841, 241145),
      Inner( 51054, 269573),
      Inner( 51054, 269574),
      Inner( 51054, 269571),
      Inner( 51054, 269572),
      Inner( 51645, 277914),
      Inner( 51645, 277915),
      Inner( 51645, 277913)
    )
  )



  val all = Seq(
//    maybankAeon,
//    transmartCarrefour,
//    papaya,
//    lawson
    beepoint,
    beemart,
    unileverFood,
    mayora,
    happyHour,
    kalbe,
    pasarModernBSD,
    pasarModernBintaro,
    pasarModernPuri,
    pasarModernCijantung,
    pasarModernMajestik,
    pasarModernGondangdia,
    pasarModernKelapagading,
    pasarModernSenen,
    kempiDeli,
    royce,
    lareiaCake,
    dianCookies,
    capitalBakery,
    manon,
    ambroze,
    wineCellar,
    sababayWinery,
    hattenWines,
    vin,
    sake,
    babyWorld,
    sensi,
    endoraCare,
    palmers,
    natracare,
    lunaBabyShop,
    mcmCommerce,
    michelleOrganic,
    javara,
    theWellnessPantry,
    crispySalad,
    oridieta,
    ecozest,
    clubSehat,
    houseOrganix,
    chiayo,
    superfoodIndonesia,
    lifeJuice,
    jatiluwih,
    depoIkan,
    vandaSeafood,
    apsMeatShop,
    klikFood,
    bulafSosis,
    grillMe,
    jsTokoDaging,
    meatopedia,
    sajira,
    rosalieCheese,
    ucokDurian,
    maximFruit,
    cempakaBuah,
    jakartaFruitMarket,
    anekaBuah,
    ciptaFruitMarket,
    capitalFruit,
    bumiFoods,
    ascMart,
    indofresco,
    pronas,
    pazar,
    cvAnekaNutrisindo,
    prambananKencana,
    orchidFlorist,
    outerBloom,
    kadoPlus,
    hatikuFlorist,
    office2000,
    easternHeritage,
    kopiPresiden,
    kulturKopi,
    pediapet,
    petRepublic,
    bbPetshop
  )

  val departmentMap =  Map(
    46509 -> "Ready to Eat",
    45842 -> "Fresh Fruits",
    45830 -> "Fresh Vegetables"


  )

}
