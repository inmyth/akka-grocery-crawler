package me.mbcu.crawler.honestbee

object CategoryParser  extends App{

  val c =
    """
      |URL,Domain,Anchor
      |/en/groceries/stores/pasar-mayestik/departments/53426,en,Fresh Fruits
      |/en/groceries/stores/pasar-mayestik/departments/53426,en,Fresh Fruits
      |/en/groceries/stores/pasar-mayestik/departments/53426/categories/282906,en,Apples & Pears 3
      |/en/groceries/stores/pasar-mayestik/departments/53426/categories/282908,en,Avocados 1
      |/en/groceries/stores/pasar-mayestik/departments/53426/categories/282905,en,Citrus 5
      |/en/groceries/stores/pasar-mayestik/departments/53426/categories/282909,en,Melons & Papayas 4
      |/en/groceries/stores/pasar-mayestik/departments/53426/categories/282907,en,Tropical Fruits 7
      |/en/groceries/stores/pasar-mayestik/departments/53430,en,Fresh Vegetables
      |/en/groceries/stores/pasar-mayestik/departments/53430,en,Fresh Vegetables
      |/en/groceries/stores/pasar-mayestik/departments/53430/categories/282920,en,Beans 9
      |/en/groceries/stores/pasar-mayestik/departments/53430/categories/282921,en,Broccoli & Cauliflower 1
      |/en/groceries/stores/pasar-mayestik/departments/53430/categories/282918,en,Capsicum & Chillies 7
      |/en/groceries/stores/pasar-mayestik/departments/53430/categories/282915,en,Herbs & Spices 11
      |/en/groceries/stores/pasar-mayestik/departments/53430/categories/282917,en,Leafy Vegetables 21
      |/en/groceries/stores/pasar-mayestik/departments/53430/categories/282916,en,"Leeks, Onions & Garlic 4"
      |/en/groceries/stores/pasar-mayestik/departments/53430/categories/282923,en,Root Vegetables 7
      |/en/groceries/stores/pasar-mayestik/departments/53430/categories/282922,en,Squash 7
      |/en/groceries/stores/pasar-mayestik/departments/53430/categories/282919,en,"Tomatoes, Corn & Eggplants 4"
      |/en/groceries/stores/pasar-mayestik/departments/53431,en,Fresh Meat
      |/en/groceries/stores/pasar-mayestik/departments/53431,en,Fresh Meat
      |/en/groceries/stores/pasar-mayestik/departments/53431/categories/282924,en,Beef 9
      |/en/groceries/stores/pasar-mayestik/departments/53431/categories/282925,en,Chicken 8
      |/en/groceries/stores/pasar-mayestik/departments/53432,en,Fresh Seafood
      |/en/groceries/stores/pasar-mayestik/departments/53432,en,Fresh Seafood
      |/en/groceries/stores/pasar-mayestik/departments/53432/categories/282926,en,Fish 19
      |/en/groceries/stores/pasar-mayestik/departments/53432/categories/282927,en,"Shellfish, Squid & Octopus 2"
      |/en/groceries/stores/pasar-mayestik/departments/53432/categories/282928,en,"Shrimp, Lobsters & Crabs 2"
      |/en/groceries/stores/pasar-mayestik/departments/53428,en,Frozen Food
      |/en/groceries/stores/pasar-mayestik/departments/53428,en,Frozen Food
      |/en/groceries/stores/pasar-mayestik/departments/53428/categories/282912,en,Convenience Food 2
      |/en/groceries/stores/pasar-mayestik/departments/53427,en,"Dairy, Eggs & Chilled Food"
      |/en/groceries/stores/pasar-mayestik/departments/53427,en,"Dairy, Eggs & Chilled Food"
      |/en/groceries/stores/pasar-mayestik/departments/53427/categories/282911,en,Chilled Ready To Eat 3
      |/en/groceries/stores/pasar-mayestik/departments/53427/categories/282910,en,Eggs 6
      |/en/groceries/stores/pasar-mayestik/departments/53429,en,Food Cupboard
      |/en/groceries/stores/pasar-mayestik/departments/53429,en,Food Cupboard
      |/en/groceries/stores/pasar-mayestik/departments/53429/categories/282913,en,Cooking Ingredients 20
      |/en/groceries/stores/pasar-mayestik/departments/53429/categories/282914,en,Preserved & Dried Goods 7
      |
    """.stripMargin

  parse(c).foreach(println)

  def parse(in: String): Seq[String] = {
    in.split("\\r?\\n")
      .filter(p => p.contains("departments") && p.contains("categories"))
      .map(p => {
        val ela = p.split(",")
        val els = ela(0).split("/")
        (els(6), els(8))
      })
      .map(p => s"Inner(${p._1}, ${p._2}),")
  }
}
