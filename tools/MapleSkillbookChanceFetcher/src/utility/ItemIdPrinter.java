package utility;

import provider.*;

import java.io.File;

public class ItemIdPrinter {

    public static void main(String[] args) {
        MapleDataProvider stringDataWZ = MapleDataProviderFactory.getDataProvider(new File("C:\\Nexon\\MapleStory" + "/String.wz"));
        MapleData data = stringDataWZ.getData("Consume.img");

        for (MapleData item : data.getChildren()) {
            if (item.getChildren().size() == 1) {
                System.out.println("itemid: " + item.getName() + " name: " + item.getChildren().get(0).getData());
            } else {
                System.out.println("itemid: " + item.getName() + " name: " + item.getChildren().get(0).getData() + " description: " + item.getChildren().get(1).getData());
            }
        }
    }
}

/*
itemid: 2023000 name: Sharenian Grounds : Fortitude description: From the ancient remains, an unknown blessing grants you fortitude. Increases Weapon Attack & Weapon Defense.
itemid: 2023001 name: Sharenian Grounds : Intellect description: From the ancient remains, an unknown blessing grants you intellect. Increases Magic Attack & Magic Defense.
itemid: 2023002 name: Sharenian Grounds : Endurance description: From the ancient remains, an unknown blessing grants you endurance. Increases Weapon Defense & Magic Defense.
itemid: 2023003 name: Sharenian Grounds : Swiftness description: From the ancient remains, an unknown blessing grants you swiftness. Increases Accuracy & Avoidability.
itemid: 2000004 name: Elixir description: A legendary potion.\nRecovers 50% HP and 50% MP.
itemid: 2000005 name: Power Elixir description: A legendary potion.\nRecovers all HP and MP.
itemid: 2000006 name: Mana Elixir description: A legendary potion.\nRecovers around 300 MP.
itemid: 2000007 name: Red Pill description: A pill of concentrated red potion, which restores 50 HP. You can carry more pills than potions because they're smaller.
itemid: 2000008 name: Orange Pill description: A pill of concentrated orange potion, which restores 150 HP. You can carry more pills than potions because they're smaller.
itemid: 2000009 name: White Pill description: A pill of concentrated white potion, which restores 300 HP. You can carry more pills than potions because they're smaller.
itemid: 2000010 name: Blue Pill description: A pill of concentrated blue potion, which restores 100 MP. You can carry more pills than potions because they're smaller.
itemid: 2000011 name: Mana Elixir Pill description: A pill of concentrated Mana Elixir, which restores 300 MP. You can carry more pills than potions because they're smaller.
itemid: 2000012 name: Elixir description: A legendary secret potion.\nRecovers 50% of HP and MP.
itemid: 2000013 name: Red Potion for Beginners description: A potion made out of red herbs made especially for beginners.\nRecovers 40 HP.
itemid: 2000014 name: Blue Potion for Beginners description: A potion made out of blue herbs made especially for beginners.\nRecovers 80 MP.
itemid: 2000015 name: Orange Potion for Beginners description: A concentrated potion made out of red herbs.\nRecovers 150 HP.
itemid: 2000016 name: White Potion description: A highly-concentrated potion made out of red herbs.\nRecovers 300 HP.
itemid: 2000017 name: Blue Potion description: A potion made out of blue herbs.\nRecovers 100 MP.
itemid: 2000018 name: Mana Elixir description: A legendary potion.\nRecovers around 300 MP.
itemid: 2000019 name: Power Elixir description: A legendary potion.\nRecovers all HP and MP.
itemid: 2001000 name: Watermelon description: A very ripe watermelon.\nRecovers about 1000 HP and 1000 MP.
itemid: 2001001 name: Ice Cream Pop description: A tasty ice cream pop.\nRecovers around 2000 HP.
itemid: 2001002 name: Red Bean Sundae description: Definitely lets you forget about the hot hot summer.\nRecovers around 2000 MP.
itemid: 2002000 name: Dexterity Potion description: Adds quickness.\nAvoidability +5 for 3 min.
itemid: 2002001 name: Speed Potion description: Increases speed.\nSpeed +8 for 3 min.
itemid: 2002002 name: Magic Potion description: Increases magic attack.\nMagic Attack +5 for 3 min.
itemid: 2002003 name: Wizard Potion description: Increases magic attack.\nMagic Attack +10 for 3 min.
itemid: 2002004 name: Warrior Potion description: Increases attacking ability.\nAttack +5 for 3 min.
itemid: 2002005 name: Sniper Potion description: Increases accuracy.\nAccuracy +5 for 5 min.
itemid: 2002006 name: Warrior Pill description: A pill of concentrated warrior potion. Attack +5 for 10 minutes.
itemid: 2002007 name: Magic Pill description: A pill of concentrated magic potion. Magic Attack +5 for 10 minutes.
itemid: 2002008 name: Sniper Pill description: A pill of concentrated sniper potion. Accuracy +10 for 10 minutes.
itemid: 2002009 name: Dexterity Pill description: A pill of concentrated dexterity potion. Avoidability +10 for 10 minutes.
itemid: 2002010 name: Speed Pill description: A pill of concentrated speed potion. Increased speed for 10 minutes.
itemid: 2002011 name: Pain Reliever description: A special pain reliever created in Omega Sector.\nWeapon Def +30 for 30 min.
itemid: 2002015 name: Elpam Elixir description: A rare, powerful elixir from Versal. Restores 90% HP & MP, and gives a boost of +5 Att and +40 Def for a duration of 15 minutes.
itemid: 2002016 name: Thief Elixir description: A special elixir for Thieves. Gives +9 Accuracy and +15 Avoidability for 8 minutes.
itemid: 2002017 name: Warrior Elixir description: A special elixir for Warriors. Gives +12 W.Att for 8 minutes.
itemid: 2002018 name: Wizard Elixir description: A special elixir for Magicians. Gives +20 M.Att for 8 minutes.
itemid: 2002019 name: Archer Elixir description: A special elixir for Bowmen. Gives +20 Avoidability for 8 minutes.
itemid: 2002020 name: Mana Bull description: A special potion made in New Leaf City, recovers 60% MP.
itemid: 2002021 name: Honster description: A special potion made in New Leaf City, recovers 60% HP.
itemid: 2002022 name: Ginseng Root description: Pure ginseng extract that recovers 40% of HP and MP.
itemid: 2002023 name: Ginger Ale description: Strong brewed Ginger Ale. Recovers 75% of HP and MP.
itemid: 2002024 name: Sorcerer Elixir description: A rare potion perfect for Magicians. Recovers 1500 MP.
itemid: 2002025 name: Barbarian Elixir description: A volatile potion mixed on the battlefield. Recovers 1500 HP.
itemid: 2002026 name: Ginger Ale description: Strong brewed Ginger Ale. Recovers 75% of HP and MP.
itemid: 2002027 name: Stirge Signal description: A makeshift device that looks like it's been duct-taped together. Can be used to distract enemies... slightly.\n[Avoidability +5, lasts for 20 minutes.]
itemid: 2002028 name: T-1337 Supercharger description: A charger for an advanced model cyborg. Looks like it would give quite a shock to the system!\n[Weapon Attack +25, Magic Attack +60, lasts for 20 minutes.]
itemid: 2002029 name: Ridley's Scroll of Defense description: Why wear cumbersome armor when Ridley can provide the same protection, weightlessly and more comfortably! (Legal Disclaimer: Effect is temporary)\n[Weapon Defense +100, Magic Defense +100, lasts for 10 minutes.]
itemid: 2010000 name: Apple description: A red, ripe, and tasty apple.\nRecovers around 30 HP.
itemid: 2010001 name: Meat description: A tasty-looking meat.\nRecovers around 100 HP.
itemid: 2010002 name: Egg description: A nutritious egg.\nImproves around 50 HP.
itemid: 2010003 name: Orange description: A sweet, tasty orange.\nRecovers around 50 MP.
itemid: 2010004 name: Lemon description: Very sour.\nRecovers around 150 MP.
itemid: 2010005 name: Honey description: Fresh honey extracted from the beehive.\nRecovers around 30% of both HP and MP.
itemid: 2010006 name: Pot of Honey description: A pot full of fresh honey.\nRecovers 50% of both HP and MP.
itemid: 2010007 name: Roger's Apple description: A ripe, red apple.\nRecovers HP 30.\n\n#cTo eat Roger's Apple, simply double-click on it in your use inventory#.
itemid: 2010009 name: Green Apple description: Sour and crunchy green apple.\nRecovers MP +30.
itemid: 2011000 name: Poisonous Mushroom description: A very poisonous mushroom.
itemid: 2012000 name: Drake's Blood description: Drake's blood.\nAttack +8 for 5 min.
itemid: 2012001 name: Fairy's Honey description: It's honey, the fairies' favorite.\nAvoidability +10 for 5 min.
itemid: 2012002 name: Sap of Ancient Tree description: Sap of a thousands-of-years-old tree.\nMagic Attack +10 for 5 min.
itemid: 2012003 name: Drake's Meat description: Drake's meat.\nWeapon Def. +10 for 5 min.
itemid: 2020000 name: Salad description: Made out of fresh vegetable.\nRecovers 200 MP.
itemid: 2020001 name: Fried Chicken description: Well-fried chicken.\nRecovers around 200 HP.
itemid: 2020002 name: Cake description: A cake full of sweetness. Recovers 100 for both HP and MP.
itemid: 2020003 name: Pizza description: A freshly-baked pizza. Recovers 400 HP.
itemid: 2020004 name: Hamburger description: A hamburger with bulgogi in it. Recovers 400 HP.
itemid: 2020005 name: Hot Dog description: A hotdog with ketchup on it. Recovers 300 HP.
itemid: 2020006 name: Hot Dog Supreme description: A huge hot dog. Recovers 500 HP.
itemid: 2020007 name: Dried Squid description: Well-dried. Recovers 600 HP.
itemid: 2020008 name: Fat Sausage description: Tastes great, and is quite nutritious.\nAllows you to recover about 1200 HP.
itemid: 2020009 name: Orange Juice description: Pure OJ... Recovers around 450 MP.
itemid: 2020010 name: Grape Juice description: Used real grapes for this. Recovers around 900 MP.
itemid: 2020011 name: W Ramen description: A cup ramen with awesome soup.\nRecovers 40% of HP and MP.
itemid: 2020012 name: Melting Cheese description: A mouth-watering cheese made out of fresh milk.\nRecovers around 4000 HP.
itemid: 2020013 name: Reindeer Milk description: Fresh milk squeezed out of a goat.\nRecovers around 5000 HP.
itemid: 2020014 name: Sunrise Dew description: Dew collected out of the early-morning shower.\nRecovers 4050 MP
itemid: 2020015 name: Sunset Dew description: Dew collected late in the afternoon.\nRecovers 5000 MP.
itemid: 2020016 name: Cheesecake description: MapleStory's 4th Anniversary Cake. Recovers 1200 HP and MP.
itemid: 2020017 name: Strawberry Cream Cake description: MapleStory 4th Anniversary Cake. Recovers 1400 HP and MP.
itemid: 2020018 name: Chocolate Cream Cake description: MapleStory 4th Anniversary Cake. Recovers 1600 HP and MP.
itemid: 2020019 name: Chocolate Cake description: MapleStory 4th Anniversary Cake. Recovers 1800 HP and MP.
itemid: 2020020 name: Wedding Cake description: A Wedding cake that coming. Recovers 2000 HP and MP.
itemid: 2020021 name: Nemi's Lunch Box description: A fresh-made lunch box made by Nemi of Ludibrium for her dad, Kaho of the Toy Factory. Recovers 10 HP.
itemid: 2020022 name: White Chocolate description: A very delicious, home-made white chocolate. Attack +5 for 30 minutes.
itemid: 2020023 name: Dark Chocolate description: A very delicious, home-made dark chocolate. Magic Attack +5 for 30 minutes.
itemid: 2020024 name: Chocolate Basket description: A basket full of delicious, home-made chocolate decorated with ribbons and marbles. Avoidability, speed and accuracy +10 each for 30 minutes.
itemid: 2020025 name: Pineapple Candy description: A very sweet, home-made pineapple candy. Attack +5 for 30 minutes.
itemid: 2020026 name: Strawberry Candy description: A very sweet, home-made strawberry candy. Magic Attack +5 for 30 minutes.
itemid: 2020027 name: Candy Basket description: A basket full of sweet home-made fruit candies decorated with ribbons and marbles. Avoidability, speed and accuracy +10 each for 30 minutes.
itemid: 2020028 name: Chocolate description: Milk chocolate that has a strong sweet scent. This is used to make the chocolate-dipped cookie stick.\nRecovers each of HP and MP by 1000.
itemid: 2020029 name: Corn description: A fresh corn plucked right off the stalk.\nRecovers 100 MP.
itemid: 2020030 name: Roasted Turkey description: A well roasted turkey enough to feed the whole family.\nRecovers 100 HP.
itemid: 2020031 name: Coca_Cola description: Sweet refreshing #cCoca-Cola#.\nRecovers HP and MP by 30%.
itemid: 2020032 name: Birthday Cake description: A tasty-looking cake full of whipped cream and fruit toppings.\nRecovers 365 MP and HP.
itemid: 2022000 name: Pure Water description: Very clean water.\nRecovers up to 800 MP.
itemid: 2022001 name: Red Bean Porridge description: A hot steamy porridge made out of red beans. At a HP-decreasing map, whenever such map damage is dealt, 10 HP will be protected.
itemid: 2022002 name: Cider description: A cold soft drink.\nIncreases weapon attack for 5 min.\nAccuracy -5 for 5 min., though.
itemid: 2022003 name: Unagi description: Well-seasoned eel.\nRecovers 1000 HP.
itemid: 2022004 name: Song Pyun description: Filled with royal jelly.\nRecovers around 1500 HP.
itemid: 2022005 name: Han Gwa description: A traditional Korean snack.\nRecovers around 1500 MP.
itemid: 2022006 name: Rice-Cake Soup description: Just got done boiling.\nRecovers 500 for both HP and MP.
itemid: 2022007 name: Triangular Sushi(plum) description: A nice triangular sushi with plum in it.\nRecovers 20% of both HP and MP.
itemid: 2022008 name: Triangular Sushi(salmon) description: A nice triangular sushi with salmon in it.\nRecovers 30% of both HP and MP.
itemid: 2022009 name: Triangular Sushi(bonito) description: A nice triangular sushi with bonito in it.\nRecovers 40% of both HP and MP.
itemid: 2022010 name: Triangular Sushi(pollack) description: A nice triangular sushi with pollack in it.\nRecovers 50% of both HP and MP.
itemid: 2022011 name: Triangular Sushi(mushroom) description: A nice triangular sushi with mushroom in it.\nRecovers 60% of both HP and MP.
itemid: 2022012 name: Sushi(tuna) description: Sushi made out of fresh fish near Victoria Island.\nRecovers 1000 HP.
itemid: 2022013 name: Sushi(salmon) description: Sushi made out of fresh fish near Victoria Island.\nRecovers 500 HP.
itemid: 2022014 name: Dango description: Taste the sweetness of this dango.\nRecovers 200 HP and 200 MP.
itemid: 2022015 name: Mushroom Miso Ramen description: Only the finest ingredients are used to make this Miso Ramen.\nRecovers 80% for both HP and MP.
itemid: 2022016 name: Maple Special Bento description: A special bento with meat and mushroom.\nRecovers 500 HP and 500 MP.
itemid: 2022017 name: Ramen description: A bowl of ramen cooked with Robo's special recipe.\nRecovers HP 1000.
itemid: 2022018 name: Kinoko Ramen(roasted pork) description: A bowl of ramen cooked with roasted pork in the soup.\nRecovers HP 1500.
itemid: 2022019 name: Kinoko Ramen(pig head) description: A bowl of ramen cooked with pig head in the soup.\nRecovers HP 800.
itemid: 2022020 name: Kinoko Ramen(salt) description: A bowl of ramen cooked with salt in the soup. Tastes a little peculiar...\nRecovers HP 500.
itemid: 2022021 name: Fish Cake(skewer) description: A Fish Cake skewer which also includes a bunch of vegetables.\nRecovers MP 250.
itemid: 2022022 name: Fish Cake(dish) description: A dish full of tasty Fish Cake.\nRecovers MP 500.
itemid: 2022023 name: Tri-colored Dango description: A tri-colored dango that includes a handful of tasty dango.\nRecovers each of HP and MP by 400.
itemid: 2022024 name: Takoyaki (Octopus Ball) description: A hot, tasty-looking Takoyaki.\nAttack +8 for 5 minutes.
itemid: 2022025 name: Takoyaki (jumbo) description: Two servings worth of Takoyaki.\nAttack +8 for 10 minutes.
itemid: 2022026 name: Yakisoba description: A bowl of Yakisoba which includes vegetable, seafood, and noodles mixed with a delicious sauce.\nMagic Attack +10 for 5 minutes.
itemid: 2022027 name: Yakisoba (x2) description: Double the serving of a normal bowl of Yakisoba which includes vegetable, seafood, and noodles mixed with a delicious sauce.\nMagic Attack +10 for 10 minutes.
itemid: 2022028 name: Valentine Chocolate (Dark) description: A rich, dark chocolate for your special someone on Valentine's Day. Recovers 50% of HP and MP.
itemid: 2022029 name: Valentine Chocolate (Strawberry) description: A rich, dark chocolate for your special someone on Valentine's Day. Recovers 100% of HP and MP.
itemid: 2022030 name: Valentine Chocolate (White) description: A tasty white chocolate for your special someone on Valentine's Day. Accuracy +10 for 5 minutes.
itemid: 2022031 name: Cookie description: Crispy on the cover and soft inside, this cookie is definitely worth a bite.
itemid: 2022032 name: Marshmallow description: A mushy, yummy-looking marshmallow.
itemid: 2022033 name: Candy description: A sparkling candy with a scent of tropical fruit.
itemid: 2022035 name: Maple Cola description: none
itemid: 2022037 name: Pink Rice Cake description: Recovers 500 HP and MP.
itemid: 2022038 name: Rice Cookie description: Recovers 1500 for both HP and MP.
itemid: 2022039 name: Nependeath's Honey description: Both HP and MP will be recovered by 1000.
itemid: 2022040 name: Air Bubble description: Air bubble enables breathing in the water for 15 minutes.
itemid: 2022041 name: Fried shrimp description: A fried shrimp that can be quite nutritious.\nRecovers 500 HP and MP.
itemid: 2022042 name: Cookie description: Crispy on the outside, marshmellow-soft on the inside, this cookie can be traced from afar by its sweet smell.\nWeapon & Magic Attack +20 for 30 minutes.
itemid: 2022043 name: Fruity Candy description: Multi-colored, fruity-flavored candies.\nSpeed +10 for 30 minutes.
itemid: 2022044 name: New Year Rice Cake description: Attack +20 for 10 min.
itemid: 2022045 name: New Year Lunchbox description: Recovers 2000 HP & MP
itemid: 2022047 name: Cooked Sea Bream description: Magic Attack +35 for 10 min.
itemid: 2022048 name: New Year Rice Soup description: Accuracy +30 for 5 min.
itemid: 2022049 name: Steamed Crab description: Weapon Def. +100 for 5 min.
itemid: 2022050 name: Roasted pork description: A piece of roasted pork that is favorite of Yellow King Goblin. Marinated just right, and it even looks delicious enough for one to salivate over it. Recovers 800 HP.
itemid: 2022051 name: Buckwheat paste description: A buckwheat paste that is the favorite of Green King Goblin. Bouncy like jelly, yet very nutritious. Recovers 800 MP.
itemid: 2022052 name: Rice Wine description: A cup of wine made out of fermented rice that is the favorite of Blue King Goblin. An aroma of a combination of vinegar-like spike and smoothness of a tea tickles the nose of those near it. Recovers 400 each of HP and MP.
itemid: 2022053 name: Jujube description: A ripe, red jujube.\nRecovers 30 HP.
itemid: 2022054 name: Pear description: A big, juicy-looking pear.\nRecovers 30 HP.
itemid: 2022055 name: Persimmon description: A ripe, orangy Persimmon.\nRecovers 30 HP.
itemid: 2022056 name: Chestnut description: A ripe, brown chestnut just picked out of a tree.\nRecovers 30 HP.
itemid: 2022057 name: Tofu description: Made out of soy beans, it is one healthy food recommended for everyone.\nRecovers 50 HP.
itemid: 2022058 name: Dumpling description: A mixture of pork and vegetable wrapped up in a thin layer of wheat.\nRecovers 1500 HP.
itemid: 2022060 name: Lotus Perfume description: A perfume that contains power-boosting aroma.\nAttack, Defense, Magic Attack +10 for 20 min.
itemid: 2022061 name: Oriental Perfume description: A perfume that contains power-boosting aroma.\nAttack, Defense, Magic Attack +15 for 20 min.
itemid: 2022062 name: Chrysanthemum Perfume description: A perfume that contains power-boosting aroma.\nAttack, Defense, Magic Attack +20 for 20 min.
itemid: 2022063 name: Corn Stick description: A roasted corn on a skewer. Very delicious looking.\nRecovers HP 800.
itemid: 2022064 name: Fruit Stick description: A snackery with fruity-flavored candies on the skewer.\nRecovers MP 800.
itemid: 2022065 name: Yellow Easter Egg description: A freshly boiled egg colored in yellow.\nRecovers 100 HP and MP.
itemid: 2022066 name: Green Easter Egg description: A freshly boiled egg colored in green.\nRecovers 200 HP and MP.
itemid: 2022068 name: Yellow Cider description: A cold soft-drink. Magic Attack +35 for 5 min.
itemid: 2022069 name: Red Cider description: A cold soft-drink. Attack +34 for 5 min.
itemid: 2022070 name: Congrats from GM description: A mystical spell that can only be cast by a GM as a sign of congratulation. Weapon & Magic Attack +20, Defense +100, Accuracy & Avoidability +50, Speed & Jump +10 for 1 HOUR.
itemid: 2022071 name: Korean Warrior description: Weapon Attack +20, Magic Attack +20 for 10 min.
itemid: 2022072 name: Forza Corea description: Gives +50 Weapon Defense and +50 Magic Defense for 10 minutes.
itemid: 2022073 name: A Prayer for Victory description: Increases Jump +10, Speed +20 for 20 minutes.
itemid: 2022074 name: Oolleung Squid description: Dried squid from Oolleung renowned for its taste.\nRecovers 500 HP & MP.
itemid: 2022075 name: Mini Coke description: A sweet, tasty, carbonated Coke featured in a Mini Can.\nAttack +8, Magic Attack +8 for 20 minutes.
itemid: 2022076 name: Coke Pill description: A pill made out of a sweet, tasty, carbonated Coke.\nAttack +10, Magic Attack +10, Defense +10 for 15 minutes.
itemid: 2022077 name: Coke Lite Pill description: A pill made out of a sweet, tasty, carbonated Coke.\nAttack +12, Magic Attack +12, Defense +12 for 15 minutes.
itemid: 2022078 name: Coke Zero Pill description: A pill made out of a sweet, tasty, carbonated Coke.\nAttack +15, Magic Attack +15, Defense +15 for 15 minutes.
itemid: 2022079 name: Barbecue description: A fresh Barbecue meat.\nRecovers 1000 HP.
itemid: 2022086 name: Red Fruit description: A curious-looking fruit that increases Attack by 8 for 10 minutes. Kicks in as soon as the first bite is taken.
itemid: 2022087 name: Black Fruit description: A curious-looking fruit that increases Defense by 15 for 10 minutes. Kicks in as soon as the first bite is taken.
itemid: 2022088 name: Blue Fruit description: A curious-looking fruit that increases Magic Attack by 10 for 10 minutes. Kicks in as soon as the first bite is taken.
itemid: 2022089 name: Baby Dragon Food description: A delicious bowl of baby food for the baby dragon. Attack +7 for 20 minutes.
itemid: 2022090 name: Blessing from Wonky the Fairy description: A blessing from Wonky the Fairy. Increases attack & magic attack.
itemid: 2022091 name: Blessing from Wonky the Fairy description: A blessing from Wonky the Fairy. Increases weapon defense & magic defense.
itemid: 2022092 name: Blessing from Wonky the Fairy description: A blessing from Wonky the Fairy. Increases accuracy and avoidability.
itemid: 2022093 name: Blessing from Wonky the Fairy description: A blessing from Wonky the Fairy. Increases speed and jump.
itemid: 2022094 name: Chicken Soup description: Weapon Attack +20, Magic Attack +30 for 15 minutes.
itemid: 2022096 name: Fried Chicken description: Crispy on the outside, soft on the inside.\nRecovers HP 400.
itemid: 2022097 name: Chun Gwon description: A dish full of renowned Chun Gwon.\nRecovers MP 400.
itemid: 2022098 name: Bubble Gum description: A fruity bubble gum that can make a huge bubble.\nJump +5 for 20 minutes.
itemid: 2022099 name: HP up description: HP up
itemid: 2022100 name: Song Pyun description: Weapon Attack +20, Magic Attack +30 for 15 minutes.
itemid: 2022101 name: Han Gwa description: Weapon Attack +20, Magic Attack +30 for 15 minutes.
itemid: 2022102 name: Massage Oil description: A massage oil used for the Thai Body Massage session. Attack +8 for 10 minutes.
itemid: 2022103 name: Thai Cookie description: A sweet, Thai treat.\nRecovers HP 150.
itemid: 2022105 name: Green Malady's Candy description: A magical concoction bewitched for wellness by Malady.\nRecovers 50% of the HP. Also recovers 50% of MP.
itemid: 2022106 name: Red Malady's Candy description: An enticing piece of candy straight from Malady's finest pot.\nRecovers around 300 MP.
itemid: 2022107 name: Blue Malady's Candy description: This delicious candy holds a special blessing from Malady.\nRecovers all HP and MP.
itemid: 2022108 name: Horntail Squad : Victory description: Weapon Attack +30, Magic Attack +40, Weapon Defense +200, Magic Defense +200 for one hour.
itemid: 2022109 name: The Breath of Nine Spirit description: Weapon Attack +25, Magic Attack +35, Weapon Defense +150, Magic Defense +150 for one hour.
itemid: 2022112 name: Baby Witch description: Weapon Attack +20, Magic Attack +30 for 15 minutes.
itemid: 2022113 name: Pumpkin Pie description: A piping hot, delicious pie right from Grandma Benson's oven. Eat up!\nRecovers 700 HP, 400 MP, Weapon def. +50 for 10 minutes.
itemid: 2022116 name: Peach description: Recovers a set amount of HP and MP. Only obtainable in Mu Lung.
itemid: 2022117 name: Maple Syrup description: A mystical syrup from maple tree. Weapon & Magic Attack +20, Defense +50, Accuracy & Avoidability +30, Speed & Jump +10 for 20 MINUTES.
itemid: 2022118 name: Admin's Congrats description: A mysterious form of bless given by the administrator. Attack +10, Magic Attack +10, Defense+ 30, Accuracy +20, Avoidability +20, Speed +3 and Jump +3 for 20 minutes.
itemid: 2022119 name: Tree Ornament description: Weapon Attack +20, Magic Attack +30 for 15 minutes.
itemid: 2022120 name: Christmas Melon description: A special melon imbued with Holiday blessings. Delicious!\nRecovers 2000 HP and 1000 MP.
itemid: 2022121 name: Gelt Chocolate description: A special piece of tasty chocolate given out at the Festival of Lights.\nRecovers 100 HP & MP, and +120 Attack +120 Weapon Def. +30 Accuracy +30 Avoidability + 10 Speed +10 Jump for 10 minutes.
itemid: 2022123 name: Banana Graham Pie description: This scrumptious pie is sure to lighten your spirits!\nRecovers 400 HP & 500 MP, and +120 Magic +120 Magic Def. +30 Accuracy +30 Avoidability + 10 Speed +10 Jump for 10 minutes.
itemid: 2022124 name: Magic of Kasandra description: Double the meso drop rate.
itemid: 2022125 name: Increase in Weapon Defense description: An increase in weapon defense with a little help from a Dark Spirit.
itemid: 2022126 name: Increase in Magic Defense description: An increase in magic defense with a little help from a Dark Spirit.
itemid: 2022127 name: Increase in Accuracy description: An increase in accuracy with a little help from a Dark Spirit.
itemid: 2022128 name: Increase in Avoidablility description: An increase in avoidability with a little help from a Dark Spirit.
itemid: 2022129 name: Increase in Attack description: An increase in attack with a little help from a Dark Spirit.
itemid: 2022130 name: Blossom Juice description: A special energy drink made from crushed Cherry Blossoms and other mystic ingredients.\nRecovers 1200 HP, 900 MP, and +12 to Def. for 20 minutes.
itemid: 2022131 name: Ginseng Concentrate description: A ginseng concentrate. Recovers both HP and MP by 400.
itemid: 2022132 name: Bellflower Concentrate description: A Bellflower concentrate. Recovers both HP and MP by 200.
itemid: 2022142 name: Mind & Heart Medicine description: A hot, soup-like medicine made out of bear paws. Drinking this will revitalize the brain to the tune of Accuracy +10 for 15 minutes.
itemid: 2022143 name: Mastery Medicine description: A hot, soup-like medicine that allegedly turns students into bona-fide Masters. Magic Attack +10 for 15 minutes.
itemid: 2022144 name: Body & Physics Medicine description: A hot, soup-like medicine made out of snake tails. Drinking this will revitalize the body to the tune of Attack +8 for 15 minutes.
itemid: 2022145 name: Canned Peach description: Homemade canned peach made by the weird pharmacist in Mu Lung, Dr. Do.\nRecovers around 1000 HP.
itemid: 2022146 name: Peach Juice description: Peach juice made by the weird pharmacist in Mu Lung, Dr. Do.\nRecovers around 500 MP.
itemid: 2022147 name: Bellflower Medicine Soup description: A herb medicine made from bellflowers and snake.\nAttack +6 for 10 minutes.
itemid: 2022148 name: Pill of Tunnel Vision description: A pill of acorn powder. The marksman's liquid medicine. Increases +12 Accuracy for 10 minutes.
itemid: 2022149 name: Pill of Intelligence description: A pill of powdered deer antler and wild ginseng. Increases Magic Attack by +10 for 10 minutes.
itemid: 2022150 name: Slithering Balm description: Ointment medicine made from Mr. Alli's skin. Gives +12 Avoidability for 10 minutes.
itemid: 2022151 name: Cassandra's Magic description: A mysterious spell cast by Cassandra. Gives +20 Att and Magic, +100 Defense, +50 accuracy and avoidability, and +10 speed and jump for 1 hour.
itemid: 2022152 name: Cassandra's Magic description: A mysterious spell cast by Cassandra. Gives +10 Att and Magic, +30 Defense, +20 accuracy and avoidability, and +3 speed and jump for 20 minutes.
itemid: 2022153 name: Happy birthday description: Gives +20 W. Att, +30 M. Att for 15 minutes to all the characters in the map when item was used.
itemid: 2022154 name: Petit Rose description: Gives +20 Weapon Attack, +30 Magic Attack for 15 minutes.
itemid: 2022155 name: Desert Mist description: Pure water extracted from Katuse roots. Recovers 200 MP.
itemid: 2022156 name: Black Bean Noodle description: Nothing like a hot bowl of noodles to cap off a great day. Increases Weapon Attack and Magic Attack by +13 for 30 minutes.
itemid: 2022160 name: Party Mana Elixir description: Recovers 300 MP for all members of your party.
itemid: 2022161 name: Party Elixir description: Recovers 50% of HP and MP for all members of your party.
itemid: 2022162 name: Party Power Elixir description: Recovers all HP and HP for all members of your party.
itemid: 2022163 name: Party All Cure Potion description: Cures any abnormal state affecting any members of your party.
itemid: 2022164 name: Mini Cube of Darkness description: One of the members in the opposing party will have their buffs nullified.
itemid: 2022165 name: Cube of Darkness description: Everyone in the opposing party will have their buffs nullified.
itemid: 2022166 name: Stunner description: One of the members of the opposing party will be stunned.
itemid: 2022174 name: White Potion description: A highly concentrated potion made out of red herbs.\nRecovers 300 HP.
itemid: 2022179 name: Onyx Apple description: A rare, ripe apple imbued with power. Recovers 90% HP & MP, and provides +100 W.Att, +100 M.Att, +20 Def for 10 minutes.
itemid: 2022180 name: Amorian Rice Cookie description: A special Rice Cookie from Amos. Recovers 3000 HP and MP.
itemid: 2022181 name: Victoria's Amorian Basket description: Victoria's special basket, made just for Amos. Provides a boost of +40 to Avoidability, speed and accuracy for 10 minutes
itemid: 2022182 name: Crystalized Pineapple Chew description: A very sweet, home-made pineapple chew. Provides a bonus of +20 ATT for 7 minutes.
itemid: 2022183 name: Flower Shower description: Increases physical attack by 20, Magic attack by 30 for 15 minutes.
itemid: 2022184 name: Maple BBQ description: Delicious, succulent BBQ meat. Take a big bite--you know you want to. Weapon Attack +13, Magic Attack +13 for 20 min.
itemid: 2022185 name: Fireworks description: The fireworks for celebrating MV's defeat. Attack +20, Magic Attack +20 for 10 min.
itemid: 2022186 name: Soft White Bun description: Freshly baked bread, hot from the oven! Makes you warm inside and prevents HP loss for 30 minutes in the El Nath region.
itemid: 2022187 name: Cassandra's Magic description: Breathe comfortably underwater for 30 minutes with Cassandra's magic. Prevents the constant HP damage you receive for every 10 seconds underwater.
itemid: 2022189 name: Grilled Cheese description: A tasty, golden brown, grilled cheese sandwich. Recovers 500 HP & MP and gives a boost of +20 Def for 30 mins.
itemid: 2022190 name: Cherry Pie description: A piping hot pie that warrants eating. Recovers 2000 HP/MP and has a bonus of +2 ATT for 8 minutes.
itemid: 2022191 name: Supreme Pizza description: A piping hot pizza with all toppings. Recovers 900 HP and 600 MP.
itemid: 2022192 name: Waffle description: A hot, buttery waffle that's ready to eat. Recovers 300 HP and MP
itemid: 2022193 name: Merlin Orb description: A majestic orb said to have been the property of a powerful mage. Gives a boost of +40 M. Att for 15 mins.
itemid: 2022194 name: Leaf Crystal description: An uncommon crystal formed by the leaves of an Ellinian vine. Provides a boost of +12 W. Att, +20 M. Att, +20 DEF/M. DEF, +8 Avoidability/Accuracy for 20 minutes. May only be used 5 times before it vanishes.
itemid: 2022195 name: Mapleade description: Refreshing drink for thirsty travelers! Recovers 80% HP, 90% MP and gives a boost of +2 Att for 30 mins.
itemid: 2022196 name: Wedding Bouquet description: A special wedding bouquet. Gives +5 Weapon Attack and +3 Magic Attack for 5 minutes.
itemid: 2022197 name: Wedding Bouquet description: A special wedding bouquet. Gives +8 Weapon Attack and +5 Magic Attack for 5 minutes.
itemid: 2022198 name: Russellon's Pills description: A pill made by Russellon from Magatia. The actual effects of this pill remain a mystery...
itemid: 2022199 name: Russellon's Potion description: A potion made by Russellon from Magatia. The actual effects of this potion remain a mystery...
itemid: 2022200 name: Wedding Bouquet description: A special wedding bouquet. Gives +10 Weapon Attack and +8 Magic Attack for 5 minutes.
itemid: 2022203 name: Laksa description: Singapore local speciality spicy noodle. It triggers one to sweat after consuming it.\nRecovers 800 HP.
itemid: 2022204 name: Hokkien Mee description: Singapore's local speciality prawn noodles. It is normally served with prawns, chili & lime.\nRecovers 1200 HP.
itemid: 2022205 name: Carrot Cake description: A delicious local traditional food. It is made up of carrot extracts & secret recipes.\nRecovers 1800 HP.
itemid: 2022206 name: Chicken Rice description: A delicious Singapore local traditional food. The rice is covered with the fragrant secret recipes of chicken extracts.\nRecovers 2200 HP.
itemid: 2022207 name: Satay description: A delicious Singapore local traditional BBQ food. It is normally served with curry sauces. Its fragrance can be sensed a distance away.\nRecovers 2600 HP.
itemid: 2022208 name: Guava description: A fruit that is hard & sour. Its nutritional value improves our digestive system.\nRecovers 500 MP.
itemid: 2022209 name: Rambutan description: A fruit that is delicious & juicy. It is so sweet that it attracts ants if they are not well attended to.\nRecovers 800 MP
itemid: 2022210 name: Dragon Fruit description: Another fruit that is delicious & juicy, similar to Rambutan, it will attract unwanted pests if they are not attended.\nRecovers 1600 MP.
itemid: 2022211 name: Durian description: The fruit is nominated as the King of Fruits around the region. Despite having a hard & thorny shell, the fruit that lies within is extremely fragrant, and it tastes great!\nRecovers 3200 MP.
itemid: 2022212 name: Nasi Lemak description: A popular Malay Traditional Dish mainly made up of rice, egg & cucumber, soaked with pandan fragrant.\nImproves Magic Attack +8 for 5 minutes.
itemid: 2022213 name: Roti Prata description: A popular Indian Traditional Dish made up of flour. It is normally served with sugar & curry sauces.\nImproves Magic Attack +8 for 10 Minutes.
itemid: 2022214 name: Pepper Crab description: A popular Chinese traditional dish made of up fresh steam crab, pepper, egg & secret recipes.\nImproves Weapon Attack +8 for 5 minutes.
itemid: 2022215 name: Chili Crab description: A popular Chinese traditional dish made of up fresh steam crab, chili power, egg & secret recipes.\nImproves Weapon Attack +8 for 10 minutes.
itemid: 2022224 name: Russellon's Potion description: A potion made by Russellon from Magatia. The actual effects of this potion remain a mystery...
itemid: 2022225 name: Russellon's Potion description: A potion made by Russellon from Magatia. The actual effects of this potion remain a mystery...
itemid: 2022226 name: Russellon's Potion description: A potion made by Russellon from Magatia. The actual effects of this potion remain a mystery...
itemid: 2022227 name: Russellon's Potion description: A potion made by Russellon from Magatia. The actual effects of this potion remain a mystery...
itemid: 2022228 name: Russellon's Potion description: A potion made by Russellon from Magatia. The actual effects of this potion remain a mystery...
itemid: 2022238 name: MesoGears Ring description: An ancient ring of wondrous power. There appears to be a faded inscription along the side..."Subani". Provides a boost of +8 W. Att, +15 M. Att, +12 Def/M. Def. for 8 minutes.
itemid: 2022239 name: Cassandra's Magic description: A special magic spell cast by Cassandra. For 30 minutes, Attack +10, Magic Attack +10, DEF +30, Accuracy +20, Avoidability +20, Speed +7, and Jump +5.
itemid: 2022240 name: Cassandra's Magic description: A special magic spell cast by Cassandra. For 1 hour, Attack +10, Magic Attack +10, DEF +30, Accuracy +20, Avoidability +20, Speed +7, and Jump +5.
itemid: 2022242 name: Edmund's Special Brew description: A healing tonic made with Edmund's secret recipe. Just the thing when you're feeling under the weather! [Restores 50% of HP and MP, also gives +14 W. Att + 30 M.Att, for 10 minutes.]
itemid: 2022243 name: Sophilia's Necklace description: A jewel crafted by Prendergast for his daughter, intended as a protective gift for her 16th birthday.
itemid: 2022244 name: Smore description: A tasty, hot smore. Perfect for a toasty Halloween night!\n[Restores 25% HP/MP and gives a boost of +10 to Avoidability, Jump and Speed for 10 minutes.]
itemid: 2022245 name: Heartstopper description: Just one taste of this spicy candy and it'll feel like your heart's on fire!\n[Gives +60 Weapon Attack, +60 Speed, +60 Avoidability for 1 minute]
itemid: 2022246 name: Pumpkin Taffy description: Sweetened pumpkin taffy on a candy cane stick. [Gives +15 Weapon Defense, +15 Magic Defense for 5 minutes]
itemid: 2022247 name: Red Gummy Slime description: Super-chewy gummy slimes. This one is cherry-flavored. If only real Slimes tasted this good. [Restores 1200 HP, 1200 MP]
itemid: 2022248 name: Green Gummy Slime description: Super-chewy gummy slimes. This one is lime-flavored. If only real Slimes tasted this good. [Restores 600 HP]
itemid: 2022249 name: Purple Gummy Slime description: Super-chewy gummy slimes. This one is grape-flavored. If only real Slimes tasted this good. [Restores 600 MP]
itemid: 2022250 name: Orange Gummy Slime description: Super-chewy gummy slimes. This one is orange-flavored. If only real Slimes tasted this good. [Restores 600 HP, 600 MP]
itemid: 2022251 name: Maple Pop description: A mouth-watering, delectable sweet treat! [Gives +100 Accuracy for 1 minute]
itemid: 2022252 name: Tae Roon's Note description: A small note written by Tae Roon. This note is enchanted, so it boosts weapon attack and magic attack by 3 for 1 minute.
itemid: 2022253 name: Mushroom Candy description: Delicious mushroom candy from Sen. This candy makes anyone feel good about themselves. So good, that it boosts Jump +3 for 3 minutes.
itemid: 2022255 name: Pumpkin Pieces description: Pieces of pumpkin left over from making Halloween Jack-o'-Lanterns. The pumpkin, perfectly ripe, has an aroma that is sweeter than ever. Each piece recovers 50 HP and 50 MP.
itemid: 2022256 name: Halloween Candy description: A candy wrapped in stripes. Kids love it. Recovers 20 HP and MP.
itemid: 2022257 name: Power of the Glowing Rock description: Received a mysterious power from the Glowing Rock. Boosts the weapon attack and magic attack slightly for 10 minutes.
itemid: 2022258 name: Coconut Juice description: A small hole is up on the top of the Coconut, where the straw goes in. Drink the juice with the straw for maximum refreshment. Recovers 100 HP.
itemid: 2022259 name: Attack Crystal description: A red crystal with a mysterious power packed in. Attack +5 for 5 minutes.
itemid: 2022260 name: Accuracy Crystal description: A blue crystal with a mysterious power packed in. Accuracy +5 for 5 minutes.
itemid: 2022261 name: Stuffing Scoop description: A delicious scoop of stuffing. This treat comes around only once in a while so eat it up before it gets cold.\n[Restores 600 HP/ 600 MP]
itemid: 2022262 name: Cranberry Sauce description: This delicious cranberry sauce complements almost any meal!\n[Gives + 30 Magic Attack for 3 minutes]
itemid: 2022263 name: Mashed Potato description: It looks like someone dropped this potato.\n[Restores 800 HP]
itemid: 2022264 name: Gravy description: The only thing better than a gravy boat is a gravy train.\n[Restores 800 MP]
itemid: 2022265 name: Snowing Fishbread description: Increases Physical Attack Power by 20 and Magic Attack Power by 30 for 15 minutes.
itemid: 2022266 name: Power Punch description: A fist used during the Hunting Tournament. Boosts weapon and magic attack.
itemid: 2022267 name: Wing of the Wind description: A set of wings used during the Hunting Tournament. Boosts speed and jump.
itemid: 2022268 name: Crazy Skull description: An eyeball-rotating skull used during the Hunting Tournament. Inverts directions.
itemid: 2022269 name: Shield description: A shield used during the Hunting Tournament. Protects the owner from the bomb once.
itemid: 2022271 name: Maplemas Ham description: A delicious-looking Christmas Ham with a sprig of mistletoe on top.\nRecovers 3000 HP and MP.
itemid: 2022272 name: Smoken Salmon description: The traditional Versalmas dinner. Smells... like fish.\nRecovers 2385 HP and 3791 MP.
itemid: 2022273 name: Ssiws Cheese description: Cheese from the alternate dimension of Versal. Looks funny but smells quite nice.\nGives +220 Magic Attack for 2 minutes
itemid: 2022274 name: Sugar-Coated Olives description: Olives frosted with pink sugar -- a special treat beloved by children from Versal!\nGives +40 Speed and +25 Jump for 5 minutes.
itemid: 2022275 name: Caramel Onion description: O-Pongo's favorite treat! Creamy caramel with a crunchy onion center!\nRestores 800 HP and MP.
itemid: 2022276 name: Chocolate Wafers description: A crispy wafer layered with chocolate creme.\nGives +40 Weapon Attack for 3 minutes
itemid: 2022277 name: Sunblock description: SPF 1000. Blocks all harmful rays, including magical ones.\nGives +200 Magic Defense for 10 minutes.
itemid: 2022278 name: Lump of Coal description: Restores 1 HP and 1 MP.
itemid: 2022279 name: Snow Cake Piece description: A piece of cake that consists of snow-white whipped cream and cherry. Recovers 300 HP and MP.
itemid: 2022280 name: A Flurry of Snow description: Increases Physical Attack Power by 20 and Magic Attack Power by 30 for 15 minutes.
itemid: 2022281 name: Chinese Firecrackers description: A string of Chinese firecrackers known to scare away ghoulish spirits.
itemid: 2022282 name: Naricain's Demon Elixir description: A fiery black liquid that gives the user the power of a thousand demons when consumed.\n[Gives +140 Weapon Attack for 8 minutes]
itemid: 2022283 name: Subani's Mystic Cauldron description: Drinking the swirling blue liquid within this small iron pot fills the user with an energy that emanates a protective aura.\n[Gives +100 Overall Defense, +200 Magic Attack for 10 minutes]
itemid: 2022284 name: Barricade Booster description: John Barricade's special concoction, used to get him out of tight jams. For use in emergencies!\n[Gives +50 Avoidability, +50 Accuracy, +10 Jump for 5 minutes]
itemid: 2022285 name: Sweet Heart description: Weapon attack +20, Magic attack +30 for 15 minutes.
itemid: 2022296 name: Power Scream description: A power scream from Maple Admin. Weapon attack +8, Magic attack +12 for 30 minutes.
itemid: 2022302 name: Party Bear description: Weapon attack +20, Magic attack +30 for 15 minutes.
itemid: 2022305 name: Taru Face Paint description: This mystical camouflage allows the user to blend into his or her surroundings. [Gives +100 Avoidability for 5 minutes.]
itemid: 2022306 name: Primal Brew description: A mixture made from an ancient Taru shaman recipe. Instills warriors with the primal strength of the Jungle Spirit.\n[Gives +35 Weapon Attack, +10 Accuracy for 20 minutes.]
itemid: 2022307 name: Spirit Herbs description: Special incense used by ancient Taru shamans for communion rituals with the Jungle Spirit.\n[Gives +90 Magic Attack for 20 minutes.]
itemid: 2022308 name: Jungle Juice description: A delicious natural beverage made from a secret blend of jungle fruits, flowers, roots, and vines. The perfect thing to fuel a Taru brave through a long jungle trek!\n[Restores 1000 HP and 2000 MP.]
itemid: 2022309 name: Treasure Hunt Note description: Spread all over the Maple World for the 4th anniversary of MapleStory, this note contains the prizes that you'll win when this is found.
itemid: 2022310 name: Chocolate Cream Cupcake description: A delicious chocolate cupcake with vanilla cream filling. One taste and you'll be hooked! [Restores 300 HP & MP, and gives +30 Accuracy, +30 Speed, and +30 Jump for 3 minutes.]
itemid: 2022311 name: Big Cream Puff description: A rare, tasty dessert. Known as the 'Warrior's Dessert' to some and the 'Fattening Treat' to others. [Gives +30 Weapon Attack for 3 minutes.]
itemid: 2022332 name: Agent O's Encouragement description: An encouraging message from Agent O. Jump rate will be increased by 20 for 30 minutes.
itemid: 2022333 name: Agent O's Encouragement description: An encouraging message from Agent O. Speed will be increased by 40 for 30 minutes.
itemid: 2022335 name: Baby Chick Cookie description: This is a cookie shaped like a baby chick. Recovers 1000 HP and MP.
itemid: 2022336 name: Secret Box description: Secret Box
itemid: 2022337 name: Sorcerer's Potion description: This is a potion that you can buy from Sorcerer. It's potent, but its side-effects are equally strong. It's also very expensive, so be careful with it.
itemid: 2022338 name: VitroJuice description: A futuristic power pack full of liquid fuel synthesized by T-1337. Looks suspiciously like an energy drink. Drink at your own risk! [Gives +14 Weapon Attack for 15 minutes]
itemid: 2022339 name: NitroJuice description: A futuristic power pack full of liquid fuel synthesized by T-1337. Looks suspiciously like an energy drink. Drink at your own risk! [Gives +22 Weapon Attack for 10 minutes]
itemid: 2022340 name: BlastroJuice description: A futuristic power pack full of liquid fuel synthesized by T-1337. Looks suspiciously like an energy drink. Drink at your own risk! [Gives +90 Weapon Attack for 1 minute]
itemid: 2022341 name: ElectroJuice description: A futuristic power pack full of liquid fuel synthesized by T-1337. Looks suspiciously like an energy drink, but drink at your own risk! [Gives +50 Magic Attack for 10 minutes.]
itemid: 2022342 name: MegaJuice description: A futuristic power pack full of liquid fuel synthesized by T-1337. Looks suspiciously like an energy drink, but drink at your own risk! [Gives +200 Magic Attack for 30 seconds.]
itemid: 2022343 name: GigaJuice description: A futuristic power pack full of liquid fuel synthesized by T-1337. Tasty and strong enough to dissolve rust from machinery! Drink at your own risk! [Gives +700 Magic Attack for 10 seconds.]
itemid: 2022344 name: JigaJuice description: A futuristic power pack full of liquid fuel synthesized by T-1337. Drink at your own risk! Gives the user a sudden jolting surge of energy, so use it or lose it! [Gives +1000 Magic Attack for 5 seconds.]
itemid: 2022345 name: The Energizer Drink description: An energizing drink packed with electrolytes. For 30 minutes, you will receive a boost of: Attack +25, Magic Attack +30, Defense +30
itemid: 2022354 name: Tick-Tock's Egg description: This is Tick-Tock's egg. There must be something inside.
itemid: 2022355 name: Cronos' Egg description: This is Cronos' egg. There must be something inside.
itemid: 2022436 name: Holiday Buff description: A Holiday present from the Snow Spirit. For 15 min., Jump +5.
itemid: 2022437 name: Holiday Buff description: A Holiday present from the Snow Spirit. For 15 min., Speed +7.
itemid: 2022438 name: Holiday Buff description: A Holiday present from the Snow Spirit. For 15 min., Speed and Jump +10.
itemid: 2022439 name: Elixir of Darkness description: A mysterious concoction of herbs brewed deep within the mountains of El Nath. [Gives +200 Magic Attack, -25 Defense for 5 minutes.]
itemid: 2022440 name: Gold Dust description: Ancient dust found long ago by the miners in El Nath. [Gives +20 Defense for 5 minutes.]
itemid: 2022441 name: Adonis Cauldron description: A rather clumsy attempt at potion creation by Adonis. Still useful in the hands of a skilled warrior. [Gives +40 Weapon Attack, +50 Avoidability, -30 Defense for 10 minutes.]
itemid: 2022443 name: Fireworks description: The fireworks for celebrating MV's defeat. Speed +5, Physical & Magic Attack +5 for 20 min.
itemid: 2022444 name: Mihile's Blessing description: Once I used the 'Torn Cygnus' Book', a mysterious power covered me and blessed me.
itemid: 2022445 name: Oz's Blessing description: Once I used the 'Torn Cygnus' Book', a mysterious power covered me and blessed me.
itemid: 2022446 name: Irena's Blessing description: Once I used the 'Torn Cygnus' Book', a mysterious power covered me and blessed me.
itemid: 2022447 name: Eckhart's Blessing description: Once I used the 'Torn Cygnus' Book', a mysterious power covered me and blessed me.
itemid: 2022448 name: Hawkeye's Blessing description: Once I used the 'Torn Cygnus' Book', a mysterious power covered me and blessed me.
itemid: 2022449 name: Pink Bean Squad : Victory description: Weapon Attack +35, Magic Attack +45, Weapon Defense +250, Magic Defense +250 for one hour.
itemid: 2022453 name: Fireworks description: The fireworks for celebrating MV's defeat. Speed +5, Physical & Magic Attack +5 for 20 min.
itemid: 2022454 name: Cygnus's Blessing description: Once I completed Cygnus' Book, the spirit's power covered me and blessed me. It increased my Attack Rate by 10, Physical Defense Rate by 80 and Speed by 5 for 10 minutes.
itemid: 2022538 name: Red Easter Egg description: A freshly boiled egg colored in red. Recovers 400 HP and MP.
itemid: 2030000 name: Return Scroll - Nearest Town description: Returns you to the closest town from where you are. Once used, it disappears.
itemid: 2030001 name: Return Scroll to Lith Harbor description: Returns you to Lith Harbor. It disappears once it's used.
itemid: 2030002 name: Return Scroll to Ellinia description: Returns you to Ellinia. It disappears once it's used.
itemid: 2030003 name: Return Scroll to Perion description: Returns you to Perion. It disappears once it's used.
itemid: 2030004 name: Return Scroll to Henesys description: Returns you to Henesys, the peaceful town. It disappears once it's used.
itemid: 2030005 name: Return Scroll to Kerning City description: Returns you to the dark Kerning City. It disappears once it's used.
itemid: 2030006 name: Return Scroll to Sleepywood description: Returns you to Sleepywood, a quiet and dark forest-town. It disappears once it's used.
itemid: 2030007 name: Return Scroll to Dead Mine description: Returns you to the dead mine at the higher ground of El Nath. It disappears once it's used.\nCan only be used in Orbis and El Nath.
itemid: 2030008 name: Coffee Milk description: Returns you to the nearest town.
itemid: 2030009 name: Strawberry Milk description: Returns you to Mushroom Shrine.
itemid: 2030010 name: Fruit Milk description: Returns you to Showa Town.
itemid: 2030011 name: Command Center Warp Capsule description: A warp capsule that allows the owner of the capsule to warp to the Command Center of Omega Sector.
itemid: 2030012 name: Ludibrium Warp Capsule description: A warp capsule that returns you to Ludibrium.
itemid: 2030016 name: Phyllia's Warp Powder description: Warp powder made by fairy Phyllia. Teleports you to Magatia when used inside the Nihal desert region.
itemid: 2030019 name: Return Scroll to Nautilus description: This scroll enables you to return to the Pirate village, Nautilus. This is a one-use item and will disappear after use.
itemid: 2031000 name: Masked Man's Invitation description: An invitation from the Masked Man to the Halloween Party at the Haunted Mansion. Double-click to move straight to the mansion.
itemid: 2031001 name: Studio Invitation description: An invitation to the studio for the event "For Guild Only".
itemid: 2040000 name: Scroll for Helmet for DEF description: Improves DEF on headwear.\nSuccess rate:100%, weapon def.+1
itemid: 2040001 name: Scroll for Helmet for DEF description: Improves DEF on headwear.\nSuccess rate:60%, weapon def.+2, magic def.+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040002 name: Scroll for Helmet for DEF description: Improves DEF on headwear.\nSuccess rate:10%, weapon def.+5, magic def.+3, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040003 name: Scroll for Helmet for HP description: Improves MaxHP on headwear.\nSuccess rate:100%, MaxHP+5
itemid: 2040004 name: Scroll for Helmet for HP description: Improves MaxHP on headwear.\nSuccess rate:60%, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040005 name: Scroll for Helmet for HP description: Improves MaxHP on headwear.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040006 name: Scroll for Helmet for DEF description: Improves DEF on headwear.\nSuccess rate:100%, weapon def.+5, magic def.+3, accuracy+1
itemid: 2040007 name: Scroll for Helmet for HP description: Improves MaxHP on headwear.\nSuccess rate:100%, MaxHP+30
itemid: 2040008 name: Dark scroll for Helmet for DEF description: Improves DEF on headwear.\nSuccess rate:70%, weapon def.+2, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040009 name: Dark Scroll for Helmet for DEF description: Improves DEF on headwear.\nSuccess rate:30%, weapon def.+5, magic def.+3, accuracy+1.\nIf failed, the item will be destroyed in a 50% rate.
itemid: 2040010 name: Scroll for Helmet for HP description: Improves MaxHP on headwear.\nSuccess rate:70%, MaxHP+10.\nIf failed, the item will be destroyed in a 50% rate.
itemid: 2040011 name: Dark Scroll for Helmet for HP description: Improves MaxHP on headwear.\nSuccess rate:30%, MaxHP+30.\nIf failed, the item will be destroyed in a 50% rate.
itemid: 2040012 name: Dark Scroll for Helmet for INT description: Improves INT on headwear.\nSuccess rate:70%, INT+2.\nIf failed, the item will be destroyed in a 50% rate.
itemid: 2040013 name: Dark Scroll for Helmet for INT description: Improves INT on headwear.\nSuccess rate:30%, INT+3.\nIf failed, the item will be destroyed in a 50% rate.
itemid: 2040014 name: Dark Scroll for Helmet for Accuracy description: Improves accuracy on headwear.\nSuccess rate:70%, DEX+1, accuracy+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040015 name: Dark Scroll for Helmet for Accuracy description: Improves accuracy on headwear.\nSuccess rate:30%, DEX+2, accuracy+4.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040016 name: Scroll for Helmet for Accuracy description: Improves accuracy on headwear.\nSuccess rate:10%, DEX+2, accuracy+4. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040017 name: Scroll for Helmet for Accuracy description: Improves accuracy on headwear.\nSuccess rate:60%, DEX+1, accuracy+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040018 name: Scroll for Helmet for Accuracy description: Improves accuracy on headwear.\nSuccess rate:100%, accuracy+1
itemid: 2040019 name: Scroll for Helmet for DEF description: Improves DEF on headwear.\nSuccess rate:65%, weapon def.+2, magic def.+1
itemid: 2040020 name: Scroll for Helmet for DEF description: Improves DEF on headwear.\nSuccess rate:15%, weapon def.+5, magic def.+3, accuracy+1
itemid: 2040021 name: Scroll for Helmet for MaxHP description: Improves MaxHP on headwear.\nSuccess rate:65%, MaxHP+10
itemid: 2040022 name: Scroll for Helmet for MaxHP description: Improves MaxHP on headwear.\nSuccess rate:15%, MaxHP+30
itemid: 2040023 name: Scroll for Rudolph's Horn 60% description: Increases the weapon attack and magic attack of Rudolph's Horn.\nSuccess rate:60%, weapon attack+1, magic attack+1
itemid: 2040024 name: Scroll for Helmet for INT 100% description: Improves INT on headwear.\nSuccess rate:100%, INT+1
itemid: 2040025 name: Scroll for Helmet for INT 60% description: Improves INT on headwear.\nSuccess rate:60%, INT+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040026 name: Scroll for Helmet for INT 10% description: Improves INT on headwear.\nSuccess rate:10%, INT+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040027 name: Scroll for Helmet for DEX 100% description: Improves DEX on headwear.\nSuccess rate:100%, DEX+1
itemid: 2040028 name: Scroll for Helmet for DEX 70% description: Improves DEX on headwear.\nSuccess rate:70%, DEX+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040029 name: Scroll for Helmet for DEX 60% description: Improves DEX on headwear.\nSuccess rate:60%, DEX+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040030 name: Scroll for Helmet for DEX 30% description: Improves DEX on headwear.\nSuccess rate:30%, DEX+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040031 name: Scroll for Helmet for DEX 10% description: Improves DEX on headwear.\nSuccess rate:10%, DEX+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040100 name: Scroll for Face Accessory for HP description: Improves MaxHP on face accessories.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040101 name: Scroll for Face Accessory for HP description: Improves MaxHP on face accessories.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040102 name: Scroll for Face Accessory for HP description: Improves MaxHP on face accessories.\nSuccess rate:100%, MaxHP+5
itemid: 2040103 name: Dark Scroll for Face Accessory for HP description: Improves MaxHP on face accessories.\nSuccess rate:30%, MaxHP+30.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040104 name: Dark Scroll for Face Accessory for HP description: Improves MaxHP on face accessories.\nSuccess rate:70%, MaxHP+15.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040105 name: Scroll for Face Accessory for Avoidability description: Improves avoidability on face accessories.\nSuccess rate:10%, avoidability+2, DEX+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040106 name: Scroll for Face Accessory for Avoidability description: Improves avoidability on face accessories.\nSuccess rate:60%, avoidability+1, DEX+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040107 name: Scroll for Face Accessory for Avoidability description: Improves avoidability on face accessories.\nSuccess rate:100%, avoidability+1
itemid: 2040108 name: Dark Scroll for Face Accessory for Avoidability description: Improves avoidability on face accessories.\nSuccess rate:30%, avoidability+2, DEX+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040109 name: Dark Scroll for Face Accessory for Avoidability description: Improves avoidability on face accessories.\nSuccess rate:70%, avoidability+1, DEX+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040200 name: Scroll for Eye Accessory for Accuracy description: Improves accuracy on eye accessories.\nSuccess rate:10%, accuracy+3, DEX+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040201 name: Scroll for Eye Accessory for Accuracy description: Improves accuracy on eye accessories.\nSuccess rate:60%, accuracy+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040202 name: Scroll for Eye Accessory for Accuracy description: Improves accuracy on eye accessories.\nSuccess rate:100%, accuracy+1
itemid: 2040203 name: Dark Scroll for Eye Accessory for Accuracy description: Improves accuracy on eye accessories.\nSuccess rate:30%, accuracy+3, DEX+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040204 name: Dark Scroll for Eye Accessory for Accuracy description: Improves accuracy on eye accessories.\nSuccess rate:70%, accuracy+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040205 name: Scroll for Eye Accessory for INT description: Improves INT on eye accessories.\nSuccess rate:10%, INT+3, magic def.+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040206 name: Scroll for Eye Accessory for INT description: Improves INT on eye accessories.\nSuccess rate:60%, INT+1, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040207 name: Scroll for Eye Accessory for INT description: Improves INT on eye accessories.\nSuccess rate:100%, INT+1
itemid: 2040208 name: Dark Scroll for Eye Accessory for INT description: Improves INT on eye accessories.\nSuccess rate:30%, INT+3, magic def.+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040209 name: Dark Scroll for Eye Accessory for INT description: Improves INT on eye accessories.\nSuccess rate:70%, INT+1, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040300 name: Scroll for Earring for INT description: Improves INT on earrings.\nSuccess rate:100%, magic attack+1
itemid: 2040301 name: Scroll for Earring for INT description: Improves INT on earrings.\nSuccess rate:60%, magic attack+2, INT+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040302 name: Scroll for Earring for INT description: Improves INT on earrings.\nSuccess rate:10%, magic attack+5, INT+3, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040303 name: Scroll for Earring for INT description: Improves INT on earrings.\nSuccess rate:30%, magic attack+5, INT+3, magic def.+1
itemid: 2040304 name: Dark scroll for Earring for INT description: Improves INT on earrings.\nSuccess rate:70%, magic attack+2, INT+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040305 name: Dark scroll for Earring for INT description: Improves INT on earrings.\nSuccess rate:30%, magic attack+5, INT+3, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040306 name: Dark scroll for Earring for DEX description: Improves DEX on earrings.\nSuccess rate:70%, DEX+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040307 name: Dark scroll for Earring for DEX description: Improves DEX on earrings.\nSuccess rate:30%, DEX+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040308 name: Dark Scroll for Earring for DEF description: Improves DEF on earrings.\nSuccess rate:70%, weapon def.+1, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040309 name: Dark Scroll for Earring for DEF description: Improves DEF on earrings.\nSuccess rate:30%, weapon def.+3, magic def.+3, accuracy+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040310 name: Scroll for Earring for DEF description: Improves DEF on earrings.\nSuccess rate:10%, weapon def.+3, magic def.+3, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040311 name: Scroll for Earring for DEF description: Improves DEF on earrings.\nSuccess rate:60%, weapon def.+1, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040312 name: Scroll for Earring for DEF description: Improves DEF on earrings.\nSuccess rate:100%, weapon def.+1
itemid: 2040313 name: Scroll for Earring for INT description: Improves INT on earrings.\nSuccess rate:65%, magic attack+2, INT+1
itemid: 2040314 name: Scroll for Earring for INT description: Improves INT on earrings.\nSuccess rate:15%, magic attack+5, INT+3, magic def.+1
itemid: 2040315 name: [4yrAnniv]Scroll for Earring for INT description: Improves INT on Maple Earring.\nSuccess rate:40%, magic attack+3, INT+2.\nIf failed, the item has a 30% chance of being destroyed.
itemid: 2040316 name: Scroll for Earring for DEX 100% description: Improves DEX on earrings.\nSuccess rate:100%, DEX+1
itemid: 2040317 name: Scroll for Earring for DEX 60% description: Improves DEX on earrings.\nSuccess rate:60%, DEX+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040318 name: Scroll for Earring for DEX 10% description: Improves DEX on earrings.\nSuccess rate:10%, DEX+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040319 name: Scroll for Earring for LUK 100% description: Improves LUK on earrings.\nSuccess rate:100%, LUK+1
itemid: 2040320 name: Scroll for Earring for LUK 70% description: Improves LUK on earrings.\nSuccess rate:70%, LUK+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040321 name: Scroll for Earring for LUK 60% description: Improves LUK on earrings.\nSuccess rate:60%, LUK+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040322 name: Scroll for Earring for LUK 30% description: Improves LUK on earrings.\nSuccess rate:30%, LUK+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040323 name: Scroll for Earring for LUK 10% description: Improves LUK on earrings.\nSuccess rate:10%, LUK+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040324 name: Scroll for Earring for HP 100% description: Improves MaxHP on earrings.\nSuccess rate:100%, MaxHP+5
itemid: 2040325 name: Scroll for Earring for HP 70% description: Improves MaxHP on earrings.\nSuccess rate:70%, MaxHP+15.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040326 name: Scroll for Earring for HP 60% description: Improves MaxHP on earrings.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040327 name: Scroll for Earring for HP 30% description: Improves MaxHP on earrings.\nSuccess rate:30%, MaxHP+30.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040328 name: Scroll for Earring for HP 10% description: Improves MaxHP on earrings.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040400 name: Scroll for Topwear for DEF description: Improves DEF on topwear.\nSuccess rate:100%, weapon def.+1
itemid: 2040401 name: Scroll for Topwear for DEF description: Improves DEF on topwear.\nSuccess rate:60%, weapon def.+2, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040402 name: Scroll for Topwear for DEF description: Improves DEF on topwear.\nSuccess rate:10%, weapon def.+5, magic def.+3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040403 name: Scroll for Topwear for DEF description: Improves DEF on topwear.\nSuccess rate:100%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2040404 name: Dark scroll for Topwear for DEF description: Improves DEF on topwear.\nSuccess rate:70%, weapon def.+2, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040405 name: Dark scroll for Topwear for DEF description: Improves DEF on topwear.\nSuccess rate:30%, weapon def.+5, magic def.+3, MaxHP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040406 name: Dark scroll for Topwear for STR description: Improves STR on topwear.\nSuccess rate:70%, STR+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040407 name: Dark scroll for Topwear for STR description: Improves STR on topwear.\nSuccess rate:30%, STR+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040408 name: Dark scroll for Topwear for HP description: Improves MaxHP on topwear.\nSuccess rate:70%, MaxHP+15.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040409 name: Dark scroll for Topwear for HP description: Improves MaxHP on topwear.\nSuccess rate:30%, MaxHP+30.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040410 name: Dark Scroll for Topwear for LUK description: Improves LUK on topwear.\nSuccess rate:70%, LUK+2, avoidability+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040411 name: Dark Scroll for Topwear for LUK description: Improves LUK on topwear.\nSuccess rate:30%, LUK+3, avoidability+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040412 name: Scroll for Topwear for LUK description: Improves LUK on topwear.\nSuccess rate:10%, LUK+3, avoidability+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040413 name: Scroll for Topwear for LUK description: Improves LUK on topwear.\nSuccess rate:60%, LUK+2, avoidability+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040414 name: Scroll for Topwear for LUK description: Improves LUK on topwear.\nSuccess rate:100%, LUK+1
itemid: 2040415 name: Scroll for Topwear for DEF description: Improves DEF on topwear.\nSuccess rate:65%, weapon def.+2, magic def.+1
itemid: 2040416 name: Scroll for Topwear for DEF description: Improves DEF on topwear.\nSuccess rate:15%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2040417 name: Scroll for Topwear for STR 100% description: Improves STR on topwear.\nSuccess rate:100%, STR+1
itemid: 2040418 name: Scroll for Topwear for STR 60% description: Improves STR on topwear.\nSuccess rate:60%, STR+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040419 name: Scroll for Topwear for STR 10% description: Improves STR on topwear.\nSuccess rate:10%, STR+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040420 name: Scroll for Topwear for HP 100% description: Improves MaxHP on topwear.\nSuccess rate:100%, MaxHP+5
itemid: 2040421 name: Scroll for Topwear for HP 60% description: Improves MaxHP on topwear.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040422 name: Scroll for Topwear for HP 10% description: Improves MaxHP on topwear.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040423 name: Scroll for Topwear for LUK 100% description: Improves LUK on topwear.\nSuccess rate:100%, LUK+1
itemid: 2040424 name: Scroll for Topwear for LUK 70% description: Improves LUK on topwear.\nSuccess rate:70%, LUK+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040425 name: Scroll for Topwear for LUK 60% description: Improves LUK on topwear.\nSuccess rate:60%, LUK+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040426 name: Scroll for Topwear for LUK 30% description: Improves LUK on topwear.\nSuccess rate:30%, LUK+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040427 name: Scroll for Topwear for LUK 10% description: Improves LUK on topwear.\nSuccess rate:10%, LUK+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040500 name: Scroll for Overall Armor for DEX description: Improves DEX on overalls.\nSuccess rate:100%, DEX+1
itemid: 2040501 name: Scroll for Overall Armor for DEX description: Improves DEX on overalls.\nSuccess rate:60%, DEX+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040502 name: Scroll for Overall Armor for DEX description: Improves DEX on overalls.\nSuccess rate:10%, DEX+5, accuracy+3, speed+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040503 name: Scroll for Overall Armor for DEF description: Improves DEF on overalls.\nSuccess rate:100%, weapon def.+1
itemid: 2040504 name: Scroll for Overall Armor for DEF description: Improves DEF on overalls.\nSuccess rate:60%, weapon def.+2, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040505 name: Scroll for Overall Armor for DEF description: Improves DEF on overalls.\nSuccess rate:10%, weapon def.+5, magic def.+3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040506 name: Scroll for Overall Armor for DEX description: Improves DEX on overalls.\nSuccess rate:100%, DEX+5, accuracy+3, speed+1
itemid: 2040507 name: Scroll for Overall Armor for DEF description: Improves DEF on overalls.\nSuccess rate:30%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2040508 name: Dark scroll for Overall Armor for DEX description: Improves DEX on overalls.\nSuccess rate:70%, DEX+2, accuracy+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040509 name: Dark scroll for Overall Armor for DEX description: Improves DEX on overalls.\nSuccess rate:30%, DEX+4, accuracy+3, speed+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040510 name: Dark scroll for Overall Armor for DEF description: Improves DEF on overalls.\nSuccess rate:70%, weapon def.+2, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040511 name: Dark scroll for Overall Armor for DEF description: Improves DEF on overalls.\nSuccess rate:30%, weapon def.+5, magic def.+3, MaxHP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040512 name: Scroll for Overall Armor for INT description: Improves INT on overalls.\nSuccess rate:100%, INT+1
itemid: 2040513 name: Scroll for Overall Armor for INT description: Improves INT on overalls.\nSuccess rate:60%, INT+2, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040514 name: Scroll for Overall Armor for INT description: Improves INT on overalls.\nSuccess rate:10%, INT+5, magic def.+3, MaxMP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040515 name: Scroll for Overall Armor for LUK description: Improves LUK on overalls.\nSuccess rate:100%, LUK+1
itemid: 2040516 name: Scroll for Overall Armor for LUK description: Improves LUK on overalls.\nSuccess rate:60%, LUK+2, avoidability+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040517 name: Scroll for Overall Armor for LUK description: Improves LUK on overalls.\nSuccess rate:10%, LUK+5, avoidability+3, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040518 name: Dark scroll for Overall Armor for INT description: Improves INT on overalls.\nSuccess rate:70%, INT+2, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040519 name: Dark scroll for Overall Armor for INT description: Improves INT on overalls.\nSuccess rate:30%, INT+5, magic def.+3, MaxMP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040520 name: Dark scroll for Overall Armor for LUK description: Improves LUK on overalls.\nSuccess rate:70%, LUK+2, avoidability+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040521 name: Dark scroll for Overall Armor for LUK description: Improves LUK on overalls.\nSuccess rate:30%, LUK+5, avoidability+3, accuracy+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040522 name: Scroll for Overall Armor for DEX description: Improves DEX on overalls.\nSuccess rate:65%, DEX+2, accuracy+1
itemid: 2040523 name: Scroll for Overall Armor for DEX description: Improves DEX on overalls.\nSuccess rate:15%, DEX+5, accuracy+3, speed+1
itemid: 2040524 name: Overall Armor Scroll for DEF description: Improves DEF on overalls.\nSuccess rate:65%, weapon def.+2, magic def.+1
itemid: 2040525 name: Overall Armor Scroll for DEF description: Improves DEF on overalls.\nSuccess rate:15%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2040526 name: Scroll for Overall Armor for INT description: Improves INT on overalls.\nSuccess rate:65%, INT+2, magic def.+1
itemid: 2040527 name: Scroll for Overall Armor for INT description: Improves INT on overalls.\nSuccess rate:15%, INT+5, magic def.+3, MaxMP+10
itemid: 2040528 name: Scroll for Overall Armor for LUK description: Improves LUK on overalls.\nSuccess rate:65%, LUK+2, avoidability+1
itemid: 2040529 name: Scroll for Overall Armor for LUK description: Improves LUK on overalls.\nSuccess rate:15%, LUK+5, avoidability+3, accuracy+1
itemid: 2040530 name: Scroll for Overall for STR 100% description: Improves STR on overalls.\nSuccess rate:100%, STR+1
itemid: 2040531 name: Scroll for Overall for STR 70% description: Improves STR on overalls.\nSuccess rate:70%, STR+2, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040532 name: Scroll for Overall for STR 60% description: Improves STR on overalls.\nSuccess rate:60%, STR+2, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040533 name: Scroll for Overall for STR 30% description: Improves STR on overalls.\nSuccess rate:30%, STR+5, weapon def.+3, MaxHP+5.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040534 name: Scroll for Overall for STR 10% description: Improves STR on overalls.\nSuccess rate:10%, STR+5, weapon def.+3, MaxHP+5. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040600 name: Scroll for Bottomwear for DEF description: Improves DEF on bottomwear.\nSuccess rate:100%, weapon def.+1
itemid: 2040601 name: Scroll for Bottomwear for DEF description: Improves DEF on bottomwear.\nSuccess rate:60%, weapon def.+2, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040602 name: Scroll for Bottomwear for DEF description: Improves DEF on bottomwear.\nSuccess rate:10%, weapon def.+5, magic def.+3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040603 name: Scroll for Bottomwear for DEF description: Improves DEF on bottomwear.\nSuccess rate:100%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2040604 name: Dark scroll for Bottomwear for DEF description: Improves DEF on bottomwear.\nSuccess rate:70%, weapon def.+2, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040605 name: Dark scroll for Bottomwear for DEF description: Improves DEF on bottomwear.\nSuccess rate:30%, weapon def.+5, magic def.+3, MaxHP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040606 name: Dark scroll for Bottomwear for Jump description: Improves jump on bottomwear.\nSuccess rate:70%, jump+2, avoidability+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040607 name: Dark scroll for Bottomwear for Jump description: Improves jump on bottomwear.\nSuccess rate:30%, jump+4, avoidability+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040608 name: Dark scroll for Bottomwear for HP description: Improves MaxHP on bottomwear.\nSuccess rate:70%, MaxHP+15.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040609 name: Dark scroll for Bottomwear for HP description: Improves MaxHP on bottomwear.\nSuccess rate:30%, MaxHP+30.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040610 name: Dark Scroll for Bottomwear for DEX description: Improves DEX on bottomwear.\nSuccess rate:70%, DEX+2, speed+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040611 name: Dark Scroll for Bottomwear for DEX description: Improves DEX on bottomwear.\nSuccess rate:30%, DEX+3, speed+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040612 name: Scroll for Bottomwear for DEX description: Improves DEX on bottomwear.\nSuccess rate:10%, DEX+3, speed+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040613 name: Scroll for Bottomwear for DEX description: Improves DEX on bottomwear.\nSuccess rate:60%, DEX+2, speed+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040614 name: Scroll for Bottomwear for DEX description: Improves DEX on bottomwear.\nSuccess rate:100%, DEX+1
itemid: 2040615 name: Scroll for Bottomwear for DEF description: Improves DEF on bottomwear.\nSuccess rate:65%, weapon def.+2, magic def.+1
itemid: 2040616 name: Scroll for Bottomwear for DEF description: Improves DEF on bottomwear.\nSuccess rate:15%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2040617 name: Scroll for Bottomwear for Jump 100% description: Improves jump on bottomwear.\nSuccess rate:100%, jump+1
itemid: 2040618 name: Scroll for Bottomwear for Jump 60% description: Improves jump on bottomwear.\nSuccess rate:60%, jump+2, avoidability+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040619 name: Scroll for Bottomwear for Jump 10% description: Improves jump on bottomwear.\nSuccess rate:10%, jump+4, avoidability+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040620 name: Scroll for Bottomwear for HP 100% description: Improves MaxHP on bottomwear.\nSuccess rate:100%, MaxHP+5
itemid: 2040621 name: Scroll for Bottomwear for HP 60% description: Improves MaxHP on bottomwear.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040622 name: Scroll for Bottomwear for HP 10% description: Improves MaxHP on bottomwear.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040623 name: Scroll for Bottomwear for DEX 100% description: Improves DEX on bottomwear.\nSuccess rate:100%, DEX+1
itemid: 2040624 name: Scroll for Bottomwear for DEX 70% description: Improves DEX on bottomwear.\nSuccess rate:70%, DEX+2, accuracy+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040625 name: Scroll for Bottomwear for DEX 60% description: Improves DEX on bottomwear.\nSuccess rate:60%, DEX+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040626 name: Scroll for Bottomwear for DEX 30% description: Improves DEX on bottomwear.\nSuccess rate:30%, DEX+3, accuracy+2, speed+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040627 name: Scroll for Bottomwear for DEX 10% description: Improves DEX on bottomwear.\nSuccess rate:10%, DEX+3, accuracy+2, speed+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040700 name: Scroll for Shoes for DEX description: Improves DEX on shoes.\nSuccess rate:100%, avoidability+1
itemid: 2040701 name: Scroll for Shoes for DEX description: Improves DEX on shoes.\nSuccess rate:60%, avoidability+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040702 name: Scroll for Shoes for DEX description: Improves DEX on shoes.\nSuccess rate:10%, avoidability+5, accuracy+3, speed+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040703 name: Scroll for Shoes for Jump description: Improves jump on shoes.\nSuccess rate:100%, jump+1
itemid: 2040704 name: Scroll for Shoes for Jump description: Improves jump on shoes.\nSuccess rate:60%, jump+2, DEX+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040705 name: Scroll for Shoes for Jump description: Improves jump on shoes.\nSuccess rate:10%, jump+5, DEX+3, speed+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040706 name: Scroll for Shoes for Speed description: Improves speed on shoes.\nSuccess rate:100%, speed+1
itemid: 2040707 name: Scroll for Shoes for Speed description: Improves speed on shoes.\nSuccess rate:60%, speed+2
itemid: 2040708 name: Scroll for Shoes for Speed description: Improves speed on shoes.\nSuccess rate:10%, speed+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040709 name: Scroll for Shoes for DEX description: Improves DEX on shoes.\nSuccess rate:100%, avoidability+5, accuracy+3, speed+1
itemid: 2040710 name: Scroll for Shoes for Jump description: Improves jump on shoes.\nSuccess rate:100%, jump+5, DEX+3, speed+1
itemid: 2040711 name: Scroll for Shoes for Speed description: Improves speed on shoes.\nSuccess rate:100%, speed+3
itemid: 2040712 name: Dark scroll for Shoes for DEX description: Improves DEX on shoes.\nSuccess rate:70%, avoidability+2, accuracy+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040713 name: Dark scroll for Shoes for DEX description: Improves DEX on shoes.\nSuccess rate:30%, avoidability+5, accuracy+3, speed+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040714 name: Dark scroll for Shoes for Jump description: Improves jump on shoes.\nSuccess rate:70%, jump+2, DEX+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040715 name: Dark scroll for Shoes for Jump description: Improves jump on shoes.\nSuccess rate:30%, jump+5, DEX+3, speed+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040716 name: Dark scroll for Shoes for Speed description: Improves speed on shoes.\nSuccess rate:70%, speed+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040717 name: Dark scroll for Shoes for Speed description: Improves speed on shoes.\nSuccess rate:30%, speed+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040718 name: Scroll for Shoes for DEX description: Improves DEX on shoes.\nSuccess rate:65%, avoidability+2, accuracy+1
itemid: 2040719 name: Scroll for Shoes for DEX description: Improves DEX on shoes.\nSuccess rate:15%, avoidability+5, accuracy+3, speed+1
itemid: 2040720 name: Scroll for Shoes for Jump description: Improves jump on shoes.\nSuccess rate:65%, jump+2, DEX+1
itemid: 2040721 name: Scroll for Shoes for Jump description: Improves jump on shoes.\nSuccess rate:15%, jump+5, DEX+3, speed+1
itemid: 2040722 name: Scroll for Shoes for Speed description: Improves speed on shoes.\nSuccess rate:65%, speed+2
itemid: 2040723 name: Scroll for Shoes for Speed description: Improves speed on shoes.\nSuccess rate:15%, speed+3
itemid: 2040727 name: Scroll for Spikes on Shoes 10% description: Adds traction to the shoes, which prevents the shoes from slipping on slippery surfaces.\nSuccess rate:10%, Does not affect the number of upgrades available. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040800 name: Scroll for Gloves for DEX description: Improves DEX on gloves.\nSuccess rate:100%, accuracy+1
itemid: 2040801 name: Scroll for Gloves for DEX description: Improves DEX on gloves.\nSuccess rate:60%, accuracy+2, DEX+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040802 name: Scroll for Gloves for DEX description: Improves DEX on gloves.\nSuccess rate:10%, accuracy+5, DEX+3, avoidability+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040803 name: Scroll for Gloves for ATT description: Improves weapon attack on gloves.\nSuccess rate:100%, weapon attack+1
itemid: 2040804 name: Scroll for Gloves for ATT description: Improves weapon attack on gloves.\nSuccess rate:60%, weapon attack+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040805 name: Scroll for Gloves for ATT description: Improves weapon attack on gloves.\nSuccess rate:10%, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040806 name: Scroll for Gloves for DEX description: Improves DEX on gloves.\nSuccess rate:100%, accuracy+5, DEX+3, avoidability+1
itemid: 2040807 name: Scroll for Gloves for ATT description: Improves weapon attack on gloves.\nSuccess rate:100%, weapon attack+3
itemid: 2040808 name: Dark scroll for Gloves for DEX description: Improves DEX on gloves.\nSuccess rate:70%, accuracy+2, DEX+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040809 name: Dark scroll for Gloves for DEX description: Improves DEX on gloves.\nSuccess rate:30%, accuracy+5, DEX+3, avoidability+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040810 name: Dark scroll for Gloves for ATT description: Improves weapon attack on gloves.\nSuccess rate:70%, weapon attack+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040811 name: Dark scroll for Gloves for ATT description: Improves weapon attack on gloves.\nSuccess rate:30%, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040812 name: Dark scroll for Gloves for HP description: Improves MaxHP on gloves.\nSuccess rate:70%, MaxHP+15.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040813 name: Dark scroll for Gloves for HP description: Improves MaxHP on gloves.\nSuccess rate:30%, MaxHP+30.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040814 name: Dark Scroll for Gloves for Magic Att. description: Improves magic attack on gloves.\nSuccess rate:70%, magic attack+1, INT+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040815 name: Dark Scroll for Gloves for Magic Att. description: Improves magic attack on gloves.\nSuccess rate:30%, magic attack+3, INT+3, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040816 name: Scroll for Gloves for Magic Att. description: Improves magic attack on gloves.\nSuccess rate:10%, magic def.+1, magic attack+3, INT+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040817 name: Scroll for Gloves for Magic Att. description: Improves magic attack on gloves.\nSuccess rate:60%, magic attack+1, INT+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040818 name: Scroll for Gloves for Magic Att. description: Improves magic attack on gloves.\nSuccess rate:100%, magic attack+1
itemid: 2040819 name: Scroll for Gloves for DEX description: Improves DEX on gloves.\nSuccess rate:65%, accuracy+2, DEX+1
itemid: 2040820 name: Scroll for Gloves for DEX description: Improves DEX on gloves.\nSuccess rate:15%, accuracy+5, DEX+3, avoidability+1
itemid: 2040821 name: Scroll for Gloves for ATT description: Improves weapon attack on gloves.\nSuccess rate:65%, weapon attack+2
itemid: 2040822 name: Scroll for Gloves for ATT description: Improves weapon attack on gloves.\nSuccess rate:15%, weapon attack+3
itemid: 2040823 name: Scroll for Gloves for HP 100% description: Improves MaxHP on gloves.\nSuccess rate:100%, MaxHP+5
itemid: 2040824 name: Scroll for Gloves for HP 60% description: Improves MaxHP on gloves.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040825 name: Scroll for Gloves for HP 10% description: Improves MaxHP on gloves.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040900 name: Scroll for Shield for DEF description: Improves DEF on shields.\nSuccess rate:100%, weapon def.+1
itemid: 2040901 name: Scroll for Shield for DEF description: Improves DEF on shields.\nSuccess rate:60%, weapon def.+2, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040902 name: Scroll for Shield for DEF description: Improves DEF on shields.\nSuccess rate:10%, weapon def.+5, magic def.+3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040903 name: Scroll for Shield for DEF description: Improves DEF on shields.\nSuccess rate:100%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2040904 name: Dark scroll for Shield for DEF description: Improves DEF on shields.\nSuccess rate:70%, weapon def.+2, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040905 name: Dark scroll for Shield for DEF description: Improves DEF on shields.\nSuccess rate:30%, weapon def.+5, magic def.+3, MaxHP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040906 name: Dark scroll for Shield for LUK description: Improves LUK on shields.\nSuccess rate:70%, LUK+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040907 name: Dark scroll for Shield for LUK description: Improves LUK on shields.\nSuccess rate:30%, LUK+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040908 name: Dark scroll for Shield for HP description: Improves MaxHP on shields.\nSuccess rate:70%, MaxHP+15.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040909 name: Dark scroll for Shield for HP description: Improves MaxHP on shields.\nSuccess rate:30%, MaxHP+30.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040910 name: Scroll for Shield for DEF description: Improves DEF on shields.\nSuccess rate:65%, weapon def.+2, magic def.+1
itemid: 2040911 name: Scroll for Shield for DEF description: Improves DEF on shields.\nSuccess rate:15%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2040912 name: [4yrAnniv]Scroll for Shield for DEF description: Improves DEF for Maple Magician Shield, Maple Warrior Shield, and the Maple Shibus shield.\nSuccess rate:40%, weapon def.+3, magic def.+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2040914 name: Scroll for Shield for Weapon Att. description: Improves weapon attack on shields.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040915 name: Scroll for Shield for Weapon Att. description: Improves weapon attack on shields.\nSuccess rate:10%, weapon attack+3, STR+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040916 name: Dark Scroll for Shield for Weapon Att. description: Improves weapon attack on shields.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040917 name: Dark Scroll for Shield for Weapon Att. description: Improves weapon attack on shields.\nSuccess rate:30%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040918 name: Scroll for Shield for Magic Att. description: Improves magic attack on shields.\nSuccess rate:100%, magic attack+1
itemid: 2040919 name: Scroll for Shield for Magic Att. description: Improves magic attack on shields.\nSuccess rate:60%, magic attack+2, INT+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040920 name: Scroll for Shield for Magic Att. description: Improves magic attack on shields.\nSuccess rate:10%, magic attack+3, INT+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040921 name: Dark Scroll for Shield for Magic Att. description: Improves magic attack on shields.\nSuccess rate:70%, magic attack+2, INT+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040922 name: Dark Scroll for Shield for Magic Att. description: Improves magic attack on shields.\nSuccess rate:50%, magic attack+3, INT+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040923 name: Scroll for Shield for LUK 100% description: Improves LUK on shields.\nSuccess rate:100%, LUK+1
itemid: 2040924 name: Scroll for Shield for LUK 60% description: Improves LUK on shields.\nSuccess rate:60%, LUK+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040925 name: Scroll for Shield for LUK 10% description: Improves LUK on shields.\nSuccess rate:10%, LUK+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040926 name: Scroll for Shield for HP 100% description: Improves MaxHP on shields.\nSuccess rate:100%, MaxHP+5
itemid: 2040927 name: Scroll for Shield for HP 60% description: Improves MaxHP on shields.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040928 name: Scroll for Shield for HP 10% description: Improves MaxHP on shields.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040929 name: Scroll for Shield for STR 100% description: Improves STR on shields.\nSuccess rate:100%, STR+1
itemid: 2040930 name: Scroll for Shield for STR 70% description: Improves STR on shields.\nSuccess rate:70%, STR+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040931 name: Scroll for Shield for STR 60% description: Improves STR on shields.\nSuccess rate:60%, STR+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040932 name: Scroll for Shield for STR 30% description: Improves STR on shields.\nSuccess rate:30%, STR+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2040933 name: Scroll for Shield for STR 10% description: Improves STR on shields.\nSuccess rate:10%, STR+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041000 name: Scroll for Cape for Magic Def. description: Improves magic def. on capes.\nSuccess rate:100%, magic def.+1
itemid: 2041001 name: Scroll for Cape for Magic Def. description: Improves magic def. on capes.\nSuccess rate:60%, magic def.+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041002 name: Scroll for Cape for Magic Def. description: Improves magic def. on capes.\nSuccess rate:10%, magic def.+5, weapon def.+3, MaxMP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041003 name: Scroll for Cape for Weapon Def. description: Improves DEF on capes.\nSuccess rate:100%, weapon def.+1
itemid: 2041004 name: Scroll for Cape for Weapon Def. description: Improves DEF on capes.\nSuccess rate:60%, weapon def.+3, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041005 name: Scroll for Cape for Weapon Def. description: Improves DEF on capes.\nSuccess rate:10%, weapon def.+5, magic def.+3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041006 name: Scroll for Cape for HP description: Improves MaxHP on capes.\nSuccess rate:100%, MaxHP+5
itemid: 2041007 name: Scroll for Cape for HP description: Improves MaxHP on capes.\nSuccess rate:60%, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041008 name: Scroll for Cape for HP description: Improves MaxHP on capes.\nSuccess rate:10%, MaxHP+20. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041009 name: Scroll for Cape for MP description: Improves MaxMP on capes.\nSuccess rate:100%, MaxMP+5
itemid: 2041010 name: Scroll for Cape for MP description: Improves MaxMP on capes.\nSuccess rate:60%, MaxMP+10. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041011 name: Scroll for Cape for MP description: Improves MaxMP on capes.\nSuccess rate:10%, MaxMP+20. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041012 name: Scroll for Cape for STR description: Improves STR on capes.\nSuccess rate:100%, STR+1
itemid: 2041013 name: Scroll for Cape for STR description: Improves STR on capes.\nSuccess rate:60%, STR+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041014 name: Scroll for Cape for STR description: Improves STR on capes.\nSuccess rate:10%, STR+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041015 name: Scroll for Cape for INT description: Improves INT on capes.\nSuccess rate:100%, INT+1
itemid: 2041016 name: Scroll for Cape for INT description: Improves INT on capes.\nSuccess rate:60%, INT+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041017 name: Scroll for Cape for INT description: Improves INT on capes.\nSuccess rate:10%, INT+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041018 name: Scroll for Cape for DEX description: Improves DEX on capes.\nSuccess rate:100%, DEX+1
itemid: 2041019 name: Scroll for Cape for DEX description: Improves DEX on capes.\nSuccess rate:60%, DEX+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041020 name: Scroll for Cape for DEX description: Improves DEX on capes.\nSuccess rate:10%, DEX+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041021 name: Scroll for Cape for LUK description: Improves LUK on capes.\nSuccess rate:100%, LUK+1
itemid: 2041022 name: Scroll for Cape for LUK description: Improves LUK on capes.\nSuccess rate:60%, LUK+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041023 name: Scroll for Cape for LUK description: Improves LUK on capes.\nSuccess rate:10%, LUK+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041024 name: Scroll for Cape for Magic Def. description: Improves magic def. on capes.\nSuccess rate:100%, magic def.+5, weapon def.+3, MaxMP+10
itemid: 2041025 name: Scroll for Cape for Weapon Def. description: Improves DEF on capes.\nSuccess rate:100%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2041026 name: Dark scroll for Cape for Magic Def. description: Improves magic def. on capes.\nSuccess rate:70%, magic def.+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041027 name: Dark scroll for Cape for Magic Def. description: Improves magic def. on capes.\nSuccess rate:30%, magic def.+5, weapon def.+3, MaxMP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041028 name: Dark scroll for Cape for Weapon Def. description: Improves DEF on capes.\nSuccess rate:70%, weapon def.+3, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041029 name: Dark scroll for Cape for Weapon Def. description: Improves DEF on capes.\nSuccess rate:30%, weapon def.+5, magic def.+3, MaxHP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041030 name: Dark scroll for Cape for HP description: Improves MaxHP on capes.\nSuccess rate:70%, MaxHP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041031 name: Dark scroll for Cape for HP description: Improves MaxHP on capes.\nSuccess rate:30%, MaxHP+20.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041032 name: Dark scroll for Cape for MP description: Improves MaxMP on capes.\nSuccess rate:70%, MaxMP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041033 name: Dark scroll for Cape for MP description: Improves MaxMP on capes.\nSuccess rate:30%, MaxMP+20.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041034 name: Dark scroll for Cape for STR description: Improves STR on capes.\nSuccess rate:70%, STR+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041035 name: Dark scroll for Cape for STR description: Improves STR on capes.\nSuccess rate:30%, STR+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041036 name: Dark scroll for Cape for INT description: Improves INT on capes.\nSuccess rate:70%, INT+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041037 name: Dark scroll for Cape for INT description: Improves INT on capes.\nSuccess rate:30%, INT+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041038 name: Dark scroll for Cape for DEX description: Improves DEX on capes.\nSuccess rate:70%, DEX+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041039 name: Dark scroll for Cape for DEX description: Improves DEX on capes.\nSuccess rate:30%, DEX+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041040 name: Dark scroll for Cape for LUK description: Improves LUK on capes.\nSuccess rate:70%, LUK+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041041 name: Dark scroll for Cape for LUK description: Improves LUK on capes.\nSuccess rate:30%, LUK+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2041042 name: Scroll for Cape for Magic DEF description: Improves magic def. on capes.\nSuccess rate:65%, magic def.+3, weapon def.+1
itemid: 2041043 name: Scroll for Cape for Magic DEF description: Improves magic def. on capes.\nSuccess rate:15%, magic def.+5, weapon def.+3, MaxMP+10
itemid: 2041044 name: Scroll for Cape for Weapon DEF description: Improves DEF on capes.\nSuccess rate:65%, weapon def.+3, magic def.+1
itemid: 2041045 name: Scroll for Cape for Weapon DEF description: Improves DEF on capes.\nSuccess rate:15%, weapon def.+5, magic def.+3, MaxHP+10
itemid: 2041046 name: Scroll for Cape for MaxHP description: Improves MaxHP on capes.\nSuccess rate:65%, MaxHP+10
itemid: 2041047 name: Scroll for Cape for MaxHP description: Improves MaxHP on capes.\nSuccess rate:15%, MaxHP+20
itemid: 2041048 name: Scroll for Cape for MP description: Improves MaxMP on capes.\nSuccess rate:65%, MaxMP+10
itemid: 2041049 name: Scroll for Cape for MP description: Improves MaxMP on capes.\nSuccess rate:15%, MaxMP+20
itemid: 2041050 name: Scroll for Cape for STR description: Improves STR on capes.\nSuccess rate:65%, STR+2
itemid: 2041051 name: Scroll for Cape for STR description: Improves STR on capes.\nSuccess rate:15%, STR+3
itemid: 2041052 name: Scroll for Cape for INT description: Improves INT on capes.\nSuccess rate:65%, INT+2
itemid: 2041053 name: Scroll for Cape for INT description: Improves INT on capes.\nSuccess rate:15%, INT+3
itemid: 2041054 name: Scroll for Cape for DEX description: Improves DEX on capes.\nSuccess rate:65%, DEX+2
itemid: 2041055 name: Scroll for Cape for DEX description: Improves DEX on capes.\nSuccess rate:15%, DEX+3
itemid: 2041056 name: Scroll for Cape for LUK description: Improves LUK on capes.\nSuccess rate:65%, LUK+2
itemid: 2041057 name: Scroll for Cape for LUK description: Improves LUK on capes.\nSuccess rate:15%, LUK+3
itemid: 2041058 name: Scroll for Cape for Cold Protection 10% description: Includes the effect of protection from cold weather on the cape.\nSuccess rate:10%. Does not affect the number of upgrades available. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041059 name: [4yrAnniv] Scroll for Cape for STR 20% description: Improves STR on the Maple Cape.\nSuccess rate:20%, STR+3.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2041060 name: [4yrAnniv] Scroll for Cape for INT 20% description: Improves INT on the Maple Cape.\nSuccess rate:20%, INT+3.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2041061 name: [4yrAnniv] Scroll for Cape for DEX 20% description: Improves DEX on the Maple Cape.\nSuccess rate:20%, DEX+3.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2041062 name: [4yrAnniv] Scroll for Cape for LUK 20% description: Improves LUK on the Maple Cape.\nSuccess rate:20%, LUK+3.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2041200 name: Dragon Stone description: A powerful stone that contains the mysterious power of the dragon. Can only be used on Horntail Necklace.\nSuccess rate:100%, weapon def.+140, magic def.+140, avoidability+15, All Stats+15
itemid: 2041212 name: Rock of Wisdom description: Can only be used on Horus's Eye.\nSuccess rate:60%, HP+70, MP+70
itemid: 2043000 name: Scroll for One-Handed Sword for ATT description: Improves weapon attack on one-handed swords.\nSuccess rate:100%, weapon attack+1
itemid: 2043001 name: Scroll for One-Handed Sword for ATT description: Improves weapon attack on one-handed swords.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043002 name: Scroll for One-Handed Sword for ATT description: Improves weapon attack on one-handed swords.\nSuccess rate:10%, weapon attack+5, STR+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043003 name: Scroll for One-Handed Sword for ATT description: Improves weapon attack on one-handed swords.\nSuccess rate:100%, weapon attack+5, STR+3, weapon def.+1
itemid: 2043004 name: Dark scroll for One-Handed Sword for ATT description: Improves weapon attack on one-handed swords.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043005 name: Dark scroll for One-Handed Sword for ATT description: Improves weapon attack on one-handed swords.\nSuccess rate:30%, weapon attack+5, STR+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043006 name: Dark Scroll for One-Handed Sword for Magic Att. description: Improves magic attack on one-handed swords.\nSuccess rate:70%, magic attack+1, INT+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043007 name: Dark Scroll for One-Handed Sword for Magic Att. description: Improves magic attack on one-handed swords.\nSuccess rate:30%, magic attack+2, INT+2, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043008 name: Scroll for One-Handed Sword for Magic Att. description: Improves magic attack on one-handed swords.\nSuccess rate:10%, magic attack+2, magic def.+1, INT+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043009 name: Scroll for One-Handed Sword for Magic Att. description: Improves magic attack on one-handed swords.\nSuccess rate:60%, magic attack+1, INT+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043010 name: Scroll for One-Handed Sword for Magic Att. description: Improves magic attack on one-handed swords.\nSuccess rate:100%, magic attack+1
itemid: 2043011 name: Scroll for One-Handed Sword for ATT description: Improves weapon attack on one-handed swords.\nSuccess rate:65%, weapon attack+2, STR+1
itemid: 2043012 name: Scroll for One-Handed Sword for ATT description: Improves weapon attack on one-handed swords.\nSuccess rate:15%, weapon attack+5, STR+3, weapon def.+1
itemid: 2043013 name: [4yrAnniv]Scroll for One-Handed Sword for ATT description: Improves weapon attack for Maple Glory Sword.\nSuccess rate:40%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2043015 name: Scroll for One-Handed Sword for Accuracy 100% description: Improves accuracy on one-handed swords.\nSuccess rate:100%, accuracy+1
itemid: 2043016 name: Scroll for One-Handed Sword for Accuracy 70% description: Improves accuracy on one-handed swords.\nSuccess rate:70%, accuracy+3, DEX+2, weapon attack+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043017 name: Scroll for One-Handed Sword for Accuracy 60% description: Improves accuracy on one-handed swords.\nSuccess rate:60%, accuracy+3, DEX+2, weapon attack+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043018 name: Scroll for One-Handed Sword for Accuracy 30% description: Improves accuracy on one-handed swords.\nSuccess rate:30%, accuracy+5, DEX+3, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043019 name: Scroll for One-Handed Sword for Accuracy 10% description: Improves accuracy on one-handed swords.\nSuccess rate:10%, accuracy+5, DEX+3, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043100 name: Scroll for One-Handed Axe for ATT description: Improves weapon attack on one-handed axes.\nSuccess rate:100%, weapon attack+1
itemid: 2043101 name: Scroll for One-Handed Axe for ATT description: Improves weapon attack on one-handed axes.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043102 name: Scroll for One-Handed Axe for ATT description: Improves weapon attack on one-handed axes.\nSuccess rate:10%, weapon attack+5, STR+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043103 name: Scroll for One-Handed Axe for ATT description: Improves weapon attack on one-handed axes.\nSuccess rate:100%, weapon attack+5, STR+3, weapon def.+1
itemid: 2043104 name: Dark scroll for One-Handed Axe for ATT description: Improves weapon attack on one-handed axes.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043105 name: Dark scroll for One-Handed Axe for ATT description: Improves weapon attack on one-handed axes.\nSuccess rate:30%, weapon attack+5, STR+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043106 name: Scroll for One-Handed Axe for ATT description: Improves weapon attack on one-handed axes.\nSuccess rate:65%, weapon attack+2, STR+1
itemid: 2043107 name: Scroll for One-Handed Axe for ATT description: Improves weapon attack on one-handed axes.\nSuccess rate:15%, weapon attack+5, STR+3, weapon def.+1
itemid: 2043108 name: [4yrAnniv]Scroll for One-Handed Axe for ATT description: Improves weapon attack on the Maple Steel Axe.\nSuccess rate:40%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2043110 name: Scroll for One-Handed Axe for Accuracy 100% description: Improves accuracy on one-handed axes.\nSuccess rate:100%, accuracy+1
itemid: 2043111 name: Scroll for One-Handed Axe for Accuracy 70% description: Improves accuracy on one-handed axes.\nSuccess rate:70%, accuracy+3, DEX+2, weapon attack+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043112 name: Scroll for One-Handed Axe for Accuracy 60% description: Improves accuracy on one-handed axes.\nSuccess rate:60%, accuracy+3, DEX+2, weapon attack+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043113 name: Scroll for One-Handed Axe for Accuracy 30% description: Improves accuracy on one-handed axes.\nSuccess rate:30%, accuracy+5, DEX+3, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043114 name: Scroll for One-Handed Axe for Accuracy 10% description: Improves accuracy on one-handed axes.\nSuccess rate:10%, accuracy+5, DEX+3, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043200 name: Scroll for One-Handed BW for ATT description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:100%, weapon attack+1
itemid: 2043201 name: Scroll for One-Handed BW for ATT description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043202 name: Scroll for One-Handed BW for ATT description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:10%, weapon attack+5, STR+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043203 name: Scroll for One-Handed BW for ATT description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:100%, weapon attack+5, STR+3, weapon def.+1
itemid: 2043204 name: Dark scroll for One-Handed BW for ATT description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043205 name: Dark scroll for One-Handed BW for ATT description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:30%, weapon attack+5, STR+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043206 name: Scroll for One-Handed BW for ATT description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:65%, weapon attack+2, STR+1
itemid: 2043207 name: Scroll for One-Handed BW for ATT description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:15%, weapon attack+5, STR+3, weapon def.+1
itemid: 2043208 name: [4yrAnniv]Scroll for One-Handed BW for ATT description: Improves weapon attack on the Maple Havoc Hammer.\nSuccess rate:40%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2043210 name: Scroll for One-Handed BW for Accuracy 100% description: Improves accuracy on one-handed blunt weapons.\nSuccess rate:100%, accuracy+1
itemid: 2043211 name: Scroll for One-Handed BW for Accuracy 70% description: Improves accuracy on one-handed blunt weapons.\nSuccess rate:70%, accuracy+3, DEX+2, weapon attack+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043212 name: Scroll for One-Handed BW for Accuracy 60% description: Improves accuracy on one-handed blunt weapons.\nSuccess rate:60%, accuracy+3, DEX+2, weapon attack+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043213 name: Scroll for One-Handed BW for Accuracy 30% description: Improves accuracy on one-handed blunt weapons.\nSuccess rate:30%, accuracy+5, DEX+3, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043214 name: Scroll for One-Handed BW for Accuracy 10% description: Improves accuracy on one-handed blunt weapons.\nSuccess rate:10%, accuracy+5, DEX+3, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043300 name: Scroll for Dagger for ATT description: Improves weapon attack on daggers.\nSuccess rate:100%, weapon attack+1
itemid: 2043301 name: Scroll for Dagger for ATT description: Improves weapon attack on daggers.\nSuccess rate:60%, weapon attack+2, LUK+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043302 name: Scroll for Dagger for ATT description: Improves weapon attack on daggers.\nSuccess rate:10%, weapon attack+5, LUK+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043303 name: Scroll for Dagger for ATT description: Improves weapon attack on daggers.\nSuccess rate:100%, weapon attack+5, LUK+3, weapon def.+1
itemid: 2043304 name: Dark scroll for Dagger for ATT description: Improves weapon attack on daggers.\nSuccess rate:70%, weapon attack+2, LUK+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043305 name: Dark scroll for Dagger for ATT description: Improves weapon attack on daggers.\nSuccess rate:30%, weapon attack+5, LUK+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043306 name: Scroll for Dagger for ATT description: Improves weapon attack on daggers.\nSuccess rate:65%, weapon attack+2, LUK+1
itemid: 2043307 name: Scroll for Dagger for ATT description: Improves weapon attack on daggers.\nSuccess rate:15%, weapon attack+5, LUK+3, weapon def.+1
itemid: 2043308 name: [4yrAnniv]Scroll for Dagger for ATT description: Improves weapon attack on the Maple Dark Mate and Maple Asura Dagger.\nSuccess rate:40%, weapon attack+3, LUK+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2043700 name: Scroll for Wand for Magic Att. description: Improves magic attack on wands.\nSuccess rate:100%, magic attack+1
itemid: 2043701 name: Scroll for Wand for Magic Att. description: Improves magic attack on wands.\nSuccess rate:60%, magic attack+2, INT+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043702 name: Scroll for Wand for Magic Att. description: Improves magic attack on wands.\nSuccess rate:10%, magic attack+5, INT+3, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043703 name: Scroll for Wand for Magic Att. description: Improves magic attack on wands.\nSuccess rate:100%, magic attack+5, INT+3, magic def.+1
itemid: 2043704 name: Dark scroll for Wand for Magic Att. description: Improves magic attack on wands.\nSuccess rate:70%, magic attack+2, INT+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043705 name: Dark scroll for Wand for Magic Att. description: Improves magic attack on wands.\nSuccess rate:30%, magic attack+5, INT+3, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043706 name: Scroll for Wand for Magic Att. description: Improves magic attack on wands.\nSuccess rate:65%, magic attack+2, INT+1
itemid: 2043707 name: Scroll for Wand for Magic Att. description: Improves magic attack on wands.\nSuccess rate:15%, magic attack+5, INT+3, magic def.+1
itemid: 2043708 name: [4yrAnniv]Scroll for Wand for Magic Att. description: Improves magic attack on the Maple Shine Wand.\nSuccess rate:40%, magic attack+3, INT+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2043800 name: Scroll for Staff for Magic Att. description: Improves magic attack on staffs.\nSuccess rate:100%, magic attack+1
itemid: 2043801 name: Scroll for Staff for Magic Att. description: Improves magic attack on staffs.\nSuccess rate:60%, magic attack+2, INT+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043802 name: Scroll for Staff for Magic Att. description: Improves magic attack on staffs.\nSuccess rate:10%, magic attack+5, INT+3, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043803 name: Scroll for Staff for Magic Att. description: Improves magic attack on staffs.\nSuccess rate:100%, magic attack+5, INT+3, magic def.+1
itemid: 2043804 name: Dark scroll for Staff for Magic Att. description: Improves magic attack on staffs.\nSuccess rate:70%, magic attack+2, INT+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043805 name: Dark scroll for Staff for Magic Att. description: Improves magic attack on staffs.\nSuccess rate:30%, magic attack+5, INT+3, magic def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2043806 name: Scroll for Staff for Magic Att. description: Improves magic attack on staffs.\nSuccess rate:65%, magic attack+2, INT+1
itemid: 2043807 name: Scroll for Staff for Magic Att. description: Improves magic attack on staffs.\nSuccess rate:15%, magic attack+5, INT+3, magic def.+1
itemid: 2043808 name: [4yrAnniv]Scroll for Staff for Magic Att. description: Improves magic attack on the Maple Wisdom Staff.\nSuccess rate:40%, magic attack+3, INT+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044000 name: Scroll for Two-handed Sword for ATT description: Improves weapon attack on two-handed swords.\nSuccess rate:100%, weapon attack+1
itemid: 2044001 name: Scroll for Two-handed Sword for ATT description: Improves weapon attack on two-handed swords.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044002 name: Scroll for Two-handed Sword for ATT description: Improves weapon attack on two-handed swords.\nSuccess rate:10%, weapon attack+5, STR+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044003 name: Scroll for Two-handed Sword for ATT description: Improves weapon attack on two-handed swords.\nSuccess rate:100%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044004 name: Dark scroll for Two-handed Sword for ATT description: Improves weapon attack on two-handed swords.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044005 name: Dark scroll for Two-handed Sword for ATT description: Improves weapon attack on two-handed swords.\nSuccess rate:30%, weapon attack+5, STR+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044006 name: Scroll for Two-Handed Sword for ATT description: Improves weapon attack on two-handed swords.\nSuccess rate:65%, weapon attack+2, STR+1
itemid: 2044007 name: Scroll for Two-Handed Sword for ATT description: Improves weapon attack on two-handed swords.\nSuccess rate:15%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044008 name: [4yrAnniv]Scroll for Two-Handed Sword for ATT description: Improves weapon attack on the Maple Soul Rohen.\nSuccess rate:40%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044010 name: Scroll for Two-Handed Sword for Accuracy 100% description: Improves accuracy on two-handed swords.\nSuccess rate:100%, accuracy+1
itemid: 2044011 name: Scroll for Two-Handed Sword for Accuracy 70% description: Improves accuracy on two-handed swords.\nSuccess rate:70%, accuracy+3, DEX+2, weapon attack+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044012 name: Scroll for Two-Handed Sword for Accuracy 60% description: Improves accuracy on two-handed swords.\nSuccess rate:60%, accuracy+3, DEX+2, weapon attack+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044013 name: Scroll for Two-Handed Sword for Accuracy 30% description: Improves accuracy on two-handed swords.\nSuccess rate:30%, accuracy+5, DEX+3, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044014 name: Scroll for Two-Handed Sword for Accuracy 10% description: Improves accuracy on two-handed swords.\nSuccess rate:10%, accuracy+5, DEX+3, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044100 name: Scroll for Two-handed Axe for ATT description: Improves weapon attack on two-handed axes.\nSuccess rate:100%, weapon attack+1
itemid: 2044101 name: Scroll for Two-handed Axe for ATT description: Improves weapon attack on two-handed axes.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044102 name: Scroll for Two-handed Axe for ATT description: Improves weapon attack on two-handed axes.\nSuccess rate:10%, weapon attack+5, STR+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044103 name: Scroll for Two-handed Axe for ATT description: Improves weapon attack on two-handed axes.\nSuccess rate:100%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044104 name: Dark scroll for Two-handed Axe for ATT description: Improves weapon attack on two-handed axes.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044105 name: Dark scroll for Two-handed Axe for ATT description: Improves weapon attack on two-handed axes.\nSuccess rate:30%, weapon attack+5, STR+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044106 name: Scroll for Two-Handed Axe for ATT description: Improves weapon attack on two-handed axes.\nSuccess rate:65%, weapon attack+2, STR+1
itemid: 2044107 name: Scroll for Two-Handed Axe for ATT description: Improves weapon attack on two-handed axes.\nSuccess rate:15%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044108 name: [4yrAnniv]Scroll for Two-Handed Axe for ATT description: Improves weapon attack on the Maple Demon Axe.\nSuccess rate:40%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044110 name: Scroll for Two-Handed Axe for Accuracy 100% description: Improves accuracy on two-handed axes.\nSuccess rate:100%, accuracy+1
itemid: 2044111 name: Scroll for Two-Handed Axe for Accuracy 70% description: Improves accuracy on two-handed axes.\nSuccess rate:70%, accuracy+3, DEX+2, weapon attack+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044112 name: Scroll for Two-Handed Axe for Accuracy 60% description: Improves accuracy on two-handed axes.\nSuccess rate:60%, accuracy+3, DEX+2, weapon attack+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044113 name: Scroll for Two-Handed Axe for Accuracy 30% description: Improves accuracy on two-handed axes.\nSuccess rate:30%, accuracy+5, DEX+3, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044114 name: Scroll for Two-Handed Axe for Accuracy 10% description: Improves accuracy on two-handed axes.\nSuccess rate:10%, accuracy+5, DEX+3, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044200 name: Scroll for Two-handed BW for ATT description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:100%, weapon attack+1
itemid: 2044201 name: Scroll for Two-handed BW for ATT description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044202 name: Scroll for Two-handed BW for ATT description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:10%, weapon attack+5, STR+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044203 name: Scroll for Two-handed BW for ATT description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:100%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044204 name: Dark scroll for Two-handed BW for ATT description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044205 name: Dark scroll for Two-handed BW for ATT description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:30%, weapon attack+5, STR+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044206 name: Scroll for Two-Handed BW for ATT description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:65%, weapon attack+2, STR+1
itemid: 2044207 name: Scroll for Two-Handed BW for ATT description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:15%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044208 name: [4yrAnniv]Scroll for Two-Handed BW for ATT description: Improves weapon attack on the Maple Belzet.\nSuccess rate:40%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044210 name: Scroll for Two-Handed BW for Accuracy 100% description: Improves accuracy on two-handed blunt weapons.\nSuccess rate:100%, accuracy+1
itemid: 2044211 name: Scroll for Two-Handed BW for Accuracy 70% description: Improves accuracy on two-handed blunt weapons.\nSuccess rate:70%, accuracy+3, DEX+2, weapon attack+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044212 name: Scroll for Two-Handed BW for Accuracy 60% description: Improves accuracy on two-handed blunt weapons.\nSuccess rate:60%, accuracy+3, DEX+2, weapon attack+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044213 name: Scroll for Two-Handed BW for Accuracy 30% description: Improves accuracy on two-handed blunt weapons.\nSuccess rate:30%, accuracy+5, DEX+3, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044214 name: Scroll for Two-Handed BW for Accuracy 10% description: Improves accuracy on two-handed blunt weapons.\nSuccess rate:10%, accuracy+5, DEX+3, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044300 name: Scroll for Spear for ATT description: Improves weapon attack on spears.\nSuccess rate:100%, weapon attack+1
itemid: 2044301 name: Scroll for Spear for ATT description: Improves weapon attack on spears.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044302 name: Scroll for Spear for ATT description: Improves weapon attack on spears.\nSuccess rate:10%, weapon attack+5, STR+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044303 name: Scroll for Spear for ATT description: Improves weapon attack on spears.\nSuccess rate:100%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044304 name: Dark scroll for Spear for ATT description: Improves weapon attack on spears.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044305 name: Dark scroll for Spear for ATT description: Improves weapon attack on spears.\nSuccess rate:30%, weapon attack+5, STR+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044306 name: Scroll for Spear for ATT description: Improves weapon attack on spears.\nSuccess rate:65%, weapon attack+2, STR+1
itemid: 2044307 name: Scroll for Spear for ATT description: Improves weapon attack on spears.\nSuccess rate:15%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044308 name: [4yrAnniv]Scroll for Spear for ATT description: Improves weapon attack on the Maple Soul Spear.\nSuccess rate:40%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044310 name: Scroll for Spear for Accuracy 100% description: Improves accuracy on spears.\nSuccess rate:100%, accuracy+1
itemid: 2044311 name: Scroll for Spear for Accuracy 70% description: Improves accuracy on spears.\nSuccess rate:70%, accuracy+3, DEX+2, weapon attack+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044312 name: Scroll for Spear for Accuracy 60% description: Improves accuracy on spears.\nSuccess rate:60%, accuracy+3, DEX+2, weapon attack+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044313 name: Scroll for Spear for Accuracy 30% description: Improves accuracy on spears.\nSuccess rate:30%, accuracy+5, DEX+3, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044314 name: Scroll for Spear for Accuracy 10% description: Improves accuracy on spears.\nSuccess rate:10%, accuracy+5, DEX+3, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044400 name: Scroll for Pole Arm for ATT description: Improves weapon attack on pole arms.\nSuccess rate:100%, weapon attack+1
itemid: 2044401 name: Scroll for Pole Arm for ATT description: Improves weapon attack on pole arms.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044402 name: Scroll for Pole Arm for ATT description: Improves weapon attack on pole arms.\nSuccess rate:10%, weapon attack+5, STR+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044403 name: Scroll for Pole Arm for ATT description: Improves weapon attack on pole arms.\nSuccess rate:100%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044404 name: Dark scroll for Pole Arm for ATT description: Improves weapon attack on pole arms.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044405 name: Dark scroll for Pole Arm for ATT description: Improves weapon attack on pole arms.\nSuccess rate:30%, weapon attack+5, STR+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044406 name: Scroll for Pole Arm for ATT description: Improves weapon attack on pole arms.\nSuccess rate:65%, weapon attack+2, STR+1
itemid: 2044407 name: Scroll for Pole Arm for ATT description: Improves weapon attack on pole arms.\nSuccess rate:15%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044408 name: [4yrAnniv]Scroll for Pole Arm for ATT description: Improves weapon attack on the Maple Karstan.\nSuccess rate:40%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044410 name: Scroll for Pole-Arm for Accuracy 100% description: Improves accuracy on pole arms.\nSuccess rate:100%, accuracy+1
itemid: 2044411 name: Scroll for Pole-Arm for Accuracy 70% description: Improves accuracy on pole arms.\nSuccess rate:70%, accuracy+3, DEX+2, weapon attack+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044412 name: Scroll for Pole-Arm for Accuracy 60% description: Improves accuracy on pole arms.\nSuccess rate:60%, accuracy+3, DEX+2, weapon attack+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044413 name: Scroll for Pole-Arm for Accuracy 30% description: Improves accuracy on pole arms.\nSuccess rate:30%, accuracy+5, DEX+3, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044414 name: Scroll for Pole-Arm for Accuracy 10% description: Improves accuracy on pole arms.\nSuccess rate:10%, accuracy+5, DEX+3, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044500 name: Scroll for Bow for ATT description: Improves weapon attack on bows.\nSuccess rate:100%, weapon attack+1
itemid: 2044501 name: Scroll for Bow for ATT description: Improves weapon attack on bows.\nSuccess rate:60%, weapon attack+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044502 name: Scroll for Bow for ATT description: Improves weapon attack on bows.\nSuccess rate:10%, weapon attack+5, accuracy+3, DEX+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044503 name: Scroll for Bow for ATT description: Improves weapon attack on bows.\nSuccess rate:100%, weapon attack+5, accuracy+3, DEX+1
itemid: 2044504 name: Dark scroll for Bow for ATT description: Improves weapon attack on bows.\nSuccess rate:70%, weapon attack+2, accuracy+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044505 name: Dark scroll for Bow for ATT description: Improves weapon attack on bows.\nSuccess rate:30%, weapon attack+5, accuracy+3, DEX+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044506 name: Scroll for Bow for ATT description: Improves weapon attack on bows.\nSuccess rate:65%, weapon attack+2, accuracy+1
itemid: 2044507 name: Scroll for Bow for ATT description: Improves weapon attack on bows.\nSuccess rate:15%, weapon attack+5, accuracy+3, DEX+1
itemid: 2044508 name: [4yrAnniv]Scroll for Bow for ATT description: Improves weapon attack on the Maple Kandiva Bow.\nSuccess rate:40%, weapon attack+3, accuracy+1.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044600 name: Scroll for Crossbow for ATT description: Improves weapon attack on crossbows.\nSuccess rate:100%, weapon attack+1
itemid: 2044601 name: Scroll for Crossbow for ATT description: Improves weapon attack on crossbows.\nSuccess rate:60%, weapon attack+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044602 name: Scroll for Crossbow for ATT description: Improves weapon attack on crossbows.\nSuccess rate:10%, weapon attack+5, accuracy+3, DEX+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044603 name: Scroll for Crossbow for ATT description: Improves weapon attack on crossbows.\nSuccess rate:100%, weapon attack+5, accuracy+3, DEX+1
itemid: 2044604 name: Dark scroll for Crossbow for ATT description: Improves weapon attack on crossbows.\nSuccess rate:70%, weapon attack+2, accuracy+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044605 name: Dark scroll for Crossbow for ATT description: Improves weapon attack on crossbows.\nSuccess rate:30%, weapon attack+5, accuracy+3, DEX+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044606 name: Scroll for Crossbow for ATT description: Improves weapon attack on crossbows.\nSuccess rate:65%, weapon attack+2, accuracy+1
itemid: 2044607 name: Scroll for Crossbow for ATT description: Improves weapon attack on crossbows.\nSuccess rate:15%, weapon attack+5, accuracy+3, DEX+1
itemid: 2044608 name: [4yrAnniv]Scroll for Crossbow for ATT description: Improves weapon attack on the Maple Nishada.\nSuccess rate:40%, weapon attack+3, accuracy+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044700 name: Scroll for Claw for ATT description: Improves weapon attack on claws.\nSuccess rate:100%, weapon attack+1
itemid: 2044701 name: Scroll for Claw for ATT description: Improves weapon attack on claws.\nSuccess rate:60%, weapon attack+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044702 name: Scroll for Claw for ATT description: Improves weapon attack on claws.\nSuccess rate:10%, weapon attack+5, accuracy+3, LUK+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044703 name: Scroll for Claw for ATT description: Improves weapon attack on claws.\nSuccess rate:100%, weapon attack+5, accuracy+3, LUK+1
itemid: 2044704 name: Dark Scroll for Claw for ATT description: Improves weapon attack on claws.\nSuccess rate:70%, weapon attack+2, accuracy+1.\nIf failed, the item will be destroyed at the 50% rate.
itemid: 2044705 name: Dark scroll for Claw for ATT description: Improves weapon attack on claws.\nSuccess rate:30%, weapon attack+5, accuracy+3, LUK+1.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044706 name: Scroll for Claw for ATT description: Improves weapon attack on claws.\nSuccess rate:65%, weapon attack+2, accuracy+1
itemid: 2044707 name: Scroll for Claw for ATT description: Improves weapon attack on claws.\nSuccess rate:15%, weapon attack+5, accuracy+3, LUK+1
itemid: 2044708 name: [4yrAnniv]Scroll for Claw for ATT description: Improves weapon attack on the Maple Skanda.\nSuccess rate:40%, weapon attack+3, accuracy+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044800 name: Scroll for Knuckler for Attack 100% description: Improves weapon attack on knuckles.\nSuccess rate:100%, weapon attack+1
itemid: 2044801 name: Scroll for Knuckler for Attack 60% description: Improves weapon attack on knuckles.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044802 name: Scroll for Knuckler for ATT description: Improves weapon attack on knuckles.\nSuccess rate:10%, weapon attack+5, STR+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044803 name: Scroll for Knuckler for Attack 70% description: Improves weapon attack on knuckles.\nSuccess rate:70%, weapon attack+2, STR+1.\nIf failed, the item will be destroyed at a 50% rate
itemid: 2044804 name: Scroll for Knuckler for Attack 30% description: Improves weapon attack on knuckles.\nSuccess rate:30%, weapon attack+5, STR+3, weapon def.+1.\nIf failed, the item will be destroyed at a 50% rate
itemid: 2044805 name: Scroll for Knuckle for Accuracy 100% description: Improves accuracy on knuckles.\nSuccess rate:100%, accuracy+1
itemid: 2044806 name: Scroll for Knuckle for Accuracy 70% description: Improves accuracy on knuckles.\nSuccess rate:70%, accuracy+3, DEX+2, weapon attack+1.\nIf failed, the item will be destroyed at a 50% rate..
itemid: 2044807 name: Scroll for Knuckle for Accuracy 60% description: Improves accuracy on knuckles.\nSuccess rate:60%, accuracy+3, DEX+2, weapon attack+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044808 name: Scroll for Knuckle for Accuracy 30% description: Improves accuracy on knuckles.\nSuccess rate:30%, accuracy+5, DEX+3, weapon attack+3.\nIf failed, the item will be destroyed at a 50% rate..
itemid: 2044809 name: Scroll for Knuckle for Accuracy 10% description: Improves accuracy on knuckles.\nSuccess rate:10%, accuracy+5, DEX+3, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044810 name: [4yrAnniv] Scroll for Knuckle for Attack 40% description: Improves weapon attack on the Maple Golden Claw.\nSuccess rate:40%, weapon attack+3, STR+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2044900 name: Scroll for Gun for Attack 100% description: Improves weapon attack on guns.\nSuccess rate:100%, weapon attack+1
itemid: 2044901 name: Scroll for Gun for Attack 60% description: Improves weapon attack on guns.\nSuccess rate:60%, weapon attack+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044902 name: Scroll for Gun for ATT description: Improves weapon attack on guns.\nSuccess rate:10%, weapon attack+5, accuracy+3, DEX+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044903 name: Scroll for Gun for Attack 70% description: Improves weapon attack on guns.\nSuccess rate:70%, weapon attack+2, accuracy+1.\nIf failed, the item will be destroyed at a 50% rate
itemid: 2044904 name: Scroll for Gun for Attack 30% description: Improves weapon attack on guns.\nSuccess rate:30%, weapon attack+5, accuracy+3, DEX+1.\nIf failed, the item will be destroyed at a 50% rate
itemid: 2044905 name: [4yrAnniv] Gun for Attack 40% description: Improves weapon attack on the Maple Canon Shooter.\nSuccess rate:40%, weapon attack+3, accuracy+2.\nIf failed, the item will be destroyed at a 30% rate.
itemid: 2048000 name: Scroll for Pet Equip. for Speed description: Improves speed on pet equip.\nSuccess rate:100%, speed+1
itemid: 2048001 name: Scroll for Pet Equip. for Speed description: Improves speed on pet equip.\nSuccess rate:60%, speed+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2048002 name: Scroll for Pet Equip. for Speed description: Improves speed on pet equip.\nSuccess rate:10%, speed+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2048003 name: Scroll for Pet Equip. for Jump description: Improves jump on pet equip.\nSuccess rate:100%, jump+1
itemid: 2048004 name: Scroll for Pet Equip. for Jump description: Improves jump on pet equip.\nSuccess rate:60%, jump+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2048005 name: Scroll for Pet Equip. for Jump description: Improves jump on pet equip.\nSuccess rate:10%, jump+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2048006 name: Scroll for Pet Equip. for Speed description: Improves speed on pet equip.\nSuccess rate:65%, speed+2
itemid: 2048007 name: Scroll for Pet Equip. for Speed description: Improves speed on pet equip.\nSuccess rate:15%, speed+3
itemid: 2048008 name: Scroll for Pet Equip. for Jump description: Improves jump on pet equip.\nSuccess rate:65%, jump+2
itemid: 2048009 name: Scroll for Pet Equip. for Jump description: Improves jump on pet equip.\nSuccess rate:15%, jump+3
itemid: 2048010 name: Scroll for Pet Equip. for STR 60% description: Improves STR on pet equip.\nSuccess rate:60%, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2048011 name: Scroll for Pet Equip. for INT 60% description: Improves INT on pet equip.\nSuccess rate:60%, INT+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2048012 name: Scroll for Pet Equip. for DEX 60% description: Improves DEX on pet equip.\nSuccess rate:60%, DEX+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2048013 name: Scroll for Pet Equip. for LUK 60% description: Improves LUK on pet equip.\nSuccess rate:60%, LUK+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2049000 name: Clean Slate Scroll 1% description: Recovers the lost number of upgrades due to failed scroll by 1. Not available on Cash Items. Success rate:1%. If failed, the item will be destroyed at a 2% rate.
itemid: 2049001 name: Clean Slate Scroll 3% description: Recovers the lost number of upgrades due to failed scroll by 1. Success rate:3%. If failed, the item will be destroyed at a 6% rate.
itemid: 2049002 name: Clean Slate Scroll 5% description: Recovers the lost number of upgrades due to failed scroll by 1. Success rate:5%. If failed, the item will be destroyed at a 10% rate.
itemid: 2049003 name: Clean Slate Scroll 20% description: Recovers the lost number of upgrades due to failed scroll by 1. Success rate:20%. If failed, the item will be destroyed at a 50% rate.
itemid: 2049100 name: Chaos Scroll 60% description: Alters the equipment for better or worse. Not available on Cash Items.\nSuccess rate:60%
itemid: 2049101 name: Liar Tree Sap 100% description: Use this on Pinocchio's nose to improve or downgrade the item options.\nSuccess rate:100%
itemid: 2049102 name: Maple Syrup 100% description: Use it on Maple Leaf to improve or downgrade the item option.\nSuccess rate:100%
itemid: 2049104 name: Agent Equipment Scroll 100% description: Can be used on an agent equipment to either enhance or worsen the function.\nSuccess rate:100%
itemid: 2050000 name: Antidote description: Cures the state of being poisoned.
itemid: 2050001 name: Eyedrop description: Cures the state of darkness.
itemid: 2050002 name: Tonic description: Cures the state of weakness.
itemid: 2050003 name: Holy Water description: Allows you to recover from the state of curse or being sealed up.
itemid: 2050004 name: All Cure Potion description: Allows you to recover from any abnormal state.
itemid: 2050005 name: One View description: Use it on view-restricted map to increase the vision of your partymates and yourself for 1 minute.
itemid: 2050006 name: Owl Potion description: Recover total vision in vision-restricted map for 30 seconds.
itemid: 2050098 name: The Lost eye description: The Lost eye
itemid: 2050099 name: Flaming feather description: Flaming feather
itemid: 2060000 name: Arrow for Bow description: A barrel full of arrows. Only usable with bows.
itemid: 2060001 name: Bronze Arrow for Bow description: A barrel full of bronze arrows. Only usable with bows.\nAttack+1
itemid: 2060002 name: Steel Arrow for Bow description: A barrel full of steel arrows. Only usable with bows.\nSTR+1, Attack+1
itemid: 2060003 name: Red Arrow for Bow description: A case full of arrows. Can only be used with a bow.\nAttack+4.
itemid: 2060004 name: Diamond Arrow for Bow description: A case full of arrows. Can only be used with a bow.\nAttack+4.
itemid: 2060005 name: Snowball description: A packed ball of snow. Can be thrown to inflict damage.
itemid: 2060006 name: Big Snowball description: A bigger, more intimidating, packed ball of snow. Can be thrown to inflict damage.
itemid: 2061000 name: Arrow for Crossbow description: A barrel full of arrows. Only usable with crossbows.
itemid: 2061001 name: Bronze Arrow for Crossbow description: A barrel full of bronze arrows. Only usable with crossbows.\nAttack+1
itemid: 2061002 name: Steel Arrow for Crossbow description: A barrel full of steel arrows. Only usable with crossbows.\nAttack+2
itemid: 2061003 name: Blue Arrow for Crossbow description: A case full of arrows. Can only be used with a crossbow.\nAttack+4.
itemid: 2061004 name: Diamond Arrow for Crossbow description: A case full of arrows. Can only be used with a crossbow.\nAttack+4.
itemid: 2070000 name: Subi Throwing-Stars description: A throwing star made out of steel. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+15
itemid: 2070001 name: Wolbi Throwing-Stars description: A throwing star made out of steel. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+17
itemid: 2070002 name: Mokbi Throwing-Stars description: A throwing star made out of steel. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+19
itemid: 2070003 name: Kumbi Throwing-Stars description: A throwing star made out of steel. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+21
itemid: 2070004 name: Tobi Throwing-Stars description: A throwing star made out of steel. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+23
itemid: 2070005 name: Steely Throwing-Knives description: A throwing star made out of steel. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+25
itemid: 2070006 name: Ilbi Throwing-Stars description: A throwing star made out of steel. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+27
itemid: 2070007 name: Hwabi Throwing-Stars description: A throwing star made out of steel. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+27
itemid: 2070008 name: Snowball description: A well-packed snowball. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+17
itemid: 2070009 name: Wooden Top description: When thrown, it spins fast and flies at great speed. Once they are all used up, they need to be recharged.\nLevel Limit:10, Attack+19
itemid: 2070010 name: Icicle description: Sharp icicles. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+21
itemid: 2070011 name: Maple Throwing-Stars description: Maple-shaped steel throwing stars. Once they run out, they need to be recharged.\nLevel Limit:10, Attack+21
itemid: 2070012 name: Paper Fighter Plane description: A paper plane that can be thrown at things. Once they run out, they need to be recharged.\nAttack+20
itemid: 2070013 name: Orange description: A tasty orange that can be thrown at things.\nAttack+20
itemid: 2070015 name: A Beginner Thief's Throwing Stars description: These are steel throwing stars given by Dark Lord for Beginner Thieves. Unlike normal throwing stars, you can't recharge it.\nAttack+15
itemid: 2070016 name: Crystal Ilbi Throwing-Stars description: A throwing star made of crystal. Once they run out, they need to be recharged.\nAttack+29
itemid: 2070018 name: Balanced Fury description: Ancient Shadowknight throwing stars made from black crystal. These can be recharged when used up.\nAttack+30
itemid: 2100000 name: Black Sack description: If you think your level's too low, don't bother opening it.
itemid: 2100001 name: Monster Sack 1 description: Summons weak monsters of level 10 and under.
itemid: 2100002 name: Monster Sack 2 description: Summons weak monsters between levels 10 and 20.
itemid: 2100003 name: Monster Sack 3 description: Summons mid-lower-leveled monsters between levels 20 and 30.
itemid: 2100004 name: Monster Sack 4 description: Summons mid-level monsters between levels 30 and 40.
itemid: 2100005 name: Monster Sack 5 description: Summons mid-leveled monsters between levels 40 and 50.
itemid: 2100006 name: Monster Sack 6 description: Summons high-leveled monsters between levels 50 and 60.
itemid: 2100007 name: Monster Sack 7 description: Summons high-leveled monsters between levels 60 and 70.
itemid: 2100008 name: Summoning the Boss description: To the old, the pregnant, and the low-leveled: don't even bother...
itemid: 2100009 name: Summoning New-Type Balrog description: The moment you summon it... you're dead already.
itemid: 2100010 name: Summoning "Dances with Balrog's Clone" description: Summons Dances with Balrog's Clone.
itemid: 2100011 name: Summoning Grendel the Really Old's Clone description: Summons Grendel the Really Old's Clone.
itemid: 2100012 name: Summoning Athena Pierce's Clone description: Summons Athena Pierce's Clone.
itemid: 2100013 name: Summoning Dark Lord's Clone description: Summons Dark Lord's Clone.
itemid: 2100014 name: Brand New Monster Galore description: Bam!
itemid: 2100015 name: Summoning Bag of Birds description: A bag that summons blue and pink birds living in Eos Tower.
itemid: 2100016 name: Different Sack description: A sack that summons monsters.
itemid: 2100017 name: Alien Sack description: A sack full of aliens.
itemid: 2100018 name: Toy Robot Sack description: A sack full of toy robots.
itemid: 2100019 name: Toy Trojan Sack description: A sack full of toy trojans.
itemid: 2100020 name: Moon Sack description: Make your wish in front of the full moon.
itemid: 2100021 name: Moon Sack description: Make your wish in front of the full moon.
itemid: 2100022 name: Moon Sack description: Make your wish in front of the full moon.
itemid: 2100023 name: Moon Sack description: Make your wish in front of the full moon.
itemid: 2100024 name: Moon Sack description: Make your wish in front of the full moon.
itemid: 2100025 name: Moon Sack description: Make your wish in front of the full moon.
itemid: 2100026 name: Penalty Monster Sack 1 description: Summons Black Knight.
itemid: 2100027 name: Penalty Monster Sack 2 description: Summons Myst Knight.
itemid: 2100028 name: Summoning Three-Tail Fox description: A peculiar summon sack that summons Three-Tail Fox.
itemid: 2100029 name: Summoning Ghosts description: A peculiar summon sack that summons ghosts. No way to tell which one, though...
itemid: 2100030 name: Summoning Goblins description: A peculiar summon sack that summons goblins. No way to tell which one, though...
itemid: 2100031 name: Summoning Horntail A description: Summons Head A of Horntail.
itemid: 2100032 name: Summoning Horntail C description: Summons Head C of Horntail.
itemid: 2100033 name: Monster Sack 8 description: Summons high-leveled monsters between levels 70 and 80.
itemid: 2100034 name: Monster Sack 9 description: Summons high-leveled monsters between levels 80 and 90.
itemid: 2100035 name: Monster Sack 10 description: Summons high-leveled monsters between levels 90 and 100.
itemid: 2100036 name: Monster Sack 11 description: Summons high-leveled monsters between levels 100 and 110.
itemid: 2100037 name: Summon Master Monsters 1 description: Summon the event-only Mano & Stumpy.
itemid: 2100038 name: Summon Master Monsters 2 description: Summon the event-only Faust, King Clang, Timer, and Dyle.
itemid: 2100039 name: Summon Master Monsters 3 description: Summon the event-only Nine-Tailed Fox, Tae Roon, and King Sage Cat.
itemid: 2100040 name: Summon Master Monsters 4 description: Summon the event-only Elliza, and Snowman.
itemid: 2100041 name: Summoning Lord Pirate description: Summons Lord Pirate.
itemid: 2100042 name: Summoning Peeking Lord Pirate description: Summons Peeking Lord Pirate.
itemid: 2100043 name: Summoning Angry Lord Pirate description: Summons Angry Lord Pirate.
itemid: 2100044 name: Summoning Enraged Lord Pirate description: Summons Enraged Lord Pirate.
itemid: 2100045 name: Summoning Lord Pirate's Jar description: Summoning Lord Pirate's Jar.
itemid: 2100046 name: Summoning Lord Pirate's Ginseng Jar description: Summons Lord Pirate's Ginseng Jar.
itemid: 2100047 name: Summoning Lord Pirate's Bellflower description: Summons Lord Pirate's Bellflower.
itemid: 2100048 name: Summoning Lord Pirate's Old Bellflower description: Summoning Lord Pirate's Old Bellflower.
itemid: 2100049 name: Summoning Lord Pirate's Mr. Alli description: Summons Lord Pirate's Mr. Alli.
itemid: 2100050 name: Summoning Lord Pirate's Kru description: Summons Lord Pirate's Kru.
itemid: 2100051 name: Summoning Lord Pirate's Captain description: Summons Lord Pirate's Captain.
itemid: 2100052 name: Moon Rabit Monster Sack description: You can summon Moon Rabbit.
itemid: 2100053 name: Summon Romeo and Juliet PQ Mob description: Summon Rabbit bundle.
itemid: 2100054 name: Summon Romeo and Juliet PQ Mob description: Summon Frankenroid.
itemid: 2100055 name: Summon Romeo and Juliet PQ Mob description: Summon Angry Frankenroid.
itemid: 2100056 name: Summon Romeo and Juliet PQ Mob description: Summon Fallen Romeo.
itemid: 2100057 name: Summon Romeo and Juliet PQ Mob description: Summon Fallen Romeo.
itemid: 2100058 name: Summon Romeo and Juliet PQ Mob description: Summon Frankenroid.
itemid: 2100059 name: Summon Romeo and Juliet PQ Mob description: Summon Angry Frankenroid.
itemid: 2100060 name: Weird Sack description: Summon Halloween Monster!
itemid: 2100061 name: Strange Sack description: Summon Halloween Monster!!
itemid: 2100062 name: Interesting Sack description: Summon Halloween Monster!!!
itemid: 2100063 name: Summon Ghost description: Summon Mirror Ghost.
itemid: 2100064 name: Summon Ghost  2 description: Summon Mirror Ghost.
itemid: 2100065 name: Summon Ghost  3 description: Summon Mirror Ghost.
itemid: 2100066 name: Summon Slime description: A summoning sack to summon 10 Slimes.
itemid: 2100067 name: Bombs for Hunting Competition description: A bomb used for the Hunting Competition. If hit with the bomb, the victim will lose the Spirit Jewel.
itemid: 2100068 name: Snowman Summon Sack description: A sack that summons small Snowman made with hands. After 3 minutes, the summoned snowman will melt and disappear.
itemid: 2100069 name: Event Box description: For events.
itemid: 2100070 name: 1st Monster Marble description: A marble that contains poisoned monsters on the 1st floor. Use it to bring out the poisoned monster from the marble.
itemid: 2100071 name: Mu Lung Dojo Summon Package1_Mano description: Summon Mano.
itemid: 2100072 name: Mu Lung Dojo Summon Package2_Stumpy description: Summon Stumpy.
itemid: 2101000 name: Summoning Mushmom description: Summons a Mushmom.
itemid: 2101001 name: Summoning Crimson Balrog description: Summons a Crimson Balrog.
itemid: 2101002 name: Summoning Werewolf description: Summons a Werewolf.
itemid: 2101003 name: Summoning Yeti & Pepe description: Summons one set of Yeti & Pepe.
itemid: 2101004 name: Summoning Superslime description: Summons a Superslime.
itemid: 2101005 name: Summoning Tauromacis description: Summons a Tauromacis.
itemid: 2101006 name: Summoning Taurospear description: Summons a Taurospear.
itemid: 2101007 name: Summoning Lycanthrope description: Summons a Lycanthrope.
itemid: 2101008 name: Summoning Dark Yeti & Pepe description: Summons a set of Dark Yeti & Pepe.
itemid: 2101009 name: Summon Red Boogie description: Summons Red Boogies.
itemid: 2101010 name: Summon Blue Boogie description: Summons Blue Boogies.
itemid: 2101011 name: Summon Green Boogie description: Summons Green Boogies.
itemid: 2101012 name: Summon Black Boogie description: Summons Black Boogies.
itemid: 2101013 name: Summon Showa Boss description: Summons Showa Boss.
itemid: 2101014 name: Summon Monsters description: Summon particular monsters.
itemid: 2101015 name: Summon Bodyguard A description: Summons Bodyguard A.
itemid: 2101020 name: Halloween Monster Sack description: Summon Halloween monsters.
itemid: 2101021 name: Monster Sack (Jr. Mimick) description: Summons 1 Jr. Mimick.
itemid: 2101023 name: Monster Sack (Slime Gold) description: Summons 3 Slime Gold.
itemid: 2101024 name: Monster Sack (Slime Silver) description: Summons 1 Slime Silver.
itemid: 2101025 name: Monster Sack (Slime Red) description: Summons 5 Slime Red.
itemid: 2101026 name: Monster Sack (Mushmom Blue) description: Summons 1 Mushmom Blue.
itemid: 2101039 name: Monster Summoning Sack(Alishar) description: Summons 1 Alishar.
itemid: 2101043 name: Amoria Penalty Monster Sack1 description: Summons some monsters.
itemid: 2101044 name: Amoria Penalty Monster Sack2 description: Summons some monsters.
itemid: 2101045 name: Amoria Penalty Monster Sack3 description: Summons some monsters.
itemid: 2101046 name: Amoria Penalty Monster Sack4 description: Summons some monsters.
itemid: 2101047 name: Amoria Penalty Monster Sack5 description: Summons some monsters.
itemid: 2101048 name: Amoria Penalty Monster Sack6 description: Summons some monsters.
itemid: 2101049 name: Amoria Penalty Monster Sack7 description: Summons some monsters.
itemid: 2101050 name: GM event Sack1 description: Summons some monsters. Slime Storm.
itemid: 2101051 name: GM event Sack2 description: Summons some monsters. Mushroom Boom.
itemid: 2101052 name: GM event Sack3 description: Summons some monsters. Pigs in a Blanket.
itemid: 2101053 name: GM event Sack4 description: Summons some monsters. Eye See You.
itemid: 2101054 name: GM event Sack5 description: Summons some monsters. Alien Armada.
itemid: 2101055 name: GM event Sack6 description: Summons some monsters. Toying Around.
itemid: 2101056 name: GM event Sack7 description: Summons some monsters. Crimson Crash.
itemid: 2101057 name: Amoria Penalty Monster Sack8 description: Summons some monsters.
itemid: 2101060 name: Monster Sack (SG CBD) description: Summons 9 SG-exclusive monsters.
itemid: 2101061 name: Monster Sack (SG Ghost ship) description: Summons 4 SG-exclusive monsters.
itemid: 2101072 name: Monster Sack description: Summons some monsters.
itemid: 2101073 name: Monster Sack description: Summons some monsters.
itemid: 2101080 name: Monster Sack(x-mas07_1) description: Monster Sack(x-mas07_1).
itemid: 2101081 name: Monster Sack(x-mas07_2) description: Monster Sack(x-mas07_2).
itemid: 2101082 name: Monster Sack(x-mas07_3) description: Monster Sack(x-mas07_3).
itemid: 2101083 name: Monster Sack(x-mas07_4) description: Monster Sack(x-mas07_4).
itemid: 2101084 name: Monster Sack(x-mas07_5) description: Monster Sack(x-mas07_5).
itemid: 2101085 name: Monster Sack(x-mas07_6) description: Monster Sack(x-mas07_6).
itemid: 2101086 name: Monster Sack(x-mas07_7) description: Monster Sack(x-mas07_7).
itemid: 2101087 name: Monster Sack(x-mas07_8) description: Monster Sack(x-mas07_8).
itemid: 2101088 name: Monster Sack(x-mas07_9) description: Monster Sack(x-mas07_9).
itemid: 2101089 name: Monster Sack(x-mas07_10) description: Monster Sack(x-mas07_10).
itemid: 2101090 name: Monster Sack(x-mas07_11) description: Monster Sack(x-mas07_11).
itemid: 2101091 name: Monster Sack(x-mas07_12) description: Monster Sack(x-mas07_12).
itemid: 2101092 name: Monster Sack(x-mas07_13) description: Monster Sack(x-mas07_13).
itemid: 2101093 name: Monster Sack(x-mas07_14) description: Monster Sack(x-mas07_14).
itemid: 2101124 name: Giant Snowman (Lvl 1) - Easy Sack description: A monster sack that summons a Giant Snowman.
itemid: 2101125 name: Giant Snowman (Lvl 1) - Medium Sack description: A monster sack that summons a Giant Snowman.
itemid: 2101126 name: Giant Snowman (Lvl 1) - Hard Sack description: A monster sack that summons a Giant Snowman.
itemid: 2101127 name: Cross (Easy) Sack description: A monster sack that summons Cross.
itemid: 2101128 name: Cross (Medium) Sack description: A monster sack that summons Cross.
itemid: 2101129 name: Cross (Hard) Sack description: A monster sack that summons Cross.
itemid: 2101130 name: Summon Christmas Socks description: Summons Christmas Sock monsters.
itemid: 2101131 name: Summon Luck Sack description: Summons luck sack.
itemid: 2101137 name: Masteria Summoning Bag-Jungle Jam description: A mysterious black sack that calls forth monsters from the Krakian Jungle.
itemid: 2101138 name: Masteria Summoning Bag-Corrupted Army description: A mysterious black sack that calls forth monsters from Crimsonwood Mountain.
itemid: 2101139 name: Masteria Summoning Bag-Bosses description: A mysterious black sack that calls forth powerful monsters from Masteria. Not for the faint of heart! Bigfoot will stomp nearly anyone!
itemid: 2101140 name: MasteriaPQ Summon Bag1
itemid: 2101141 name: MasteriaPQ Summon Bag2
itemid: 2101142 name: MasteriaPQ Summon Bag3
itemid: 2101143 name: MasteriaPQ Summon Bag4
itemid: 2101144 name: MasteriaPQ Summon Bag5
itemid: 2101145 name: MasteriaPQ Summon Bag6
itemid: 2101146 name: MasteriaPQ Summon Bag7
itemid: 2101147 name: MasteriaPQ Summon Bag8
itemid: 2101148 name: MasteriaPQ Summon Bag9
itemid: 2101158 name: Big Puff Daddy Sack description: A sack filled with Big Puff Daddys.
itemid: 2102000 name: Monster Attack Lvl 1 description: Summons 3 Slimes, Pigs, Orange Mushrooms, Bubblings, Octopuses, Green Mushrooms, and Horny Mushrooms each.
itemid: 2102001 name: Monster Attack Lvl 2 description: Summons 3 Drumming Bunnies, Ligators, Ratz, Star Pixies, Jr. Wraiths, and Jr. Pepes each.
itemid: 2102002 name: Monster Attack Lvl 3 description: Summons 3 Panda Teddies, King Bloctopuses, Lorangs, Zombie Lupins, Hellies, and Tweeters each.
itemid: 2102003 name: Monster Attack Lvl 4 description: Summons 3 Toy Trojans, King Block Golems, Wraiths, Cheif Grays, and Mixed Golems each.
itemid: 2102004 name: Monster Attack Lvl 5 description: Summons 3 Mushmoms, Red Drakes, Ice Drakes, Master Soul Teddies, and Dark Yetis each.
itemid: 2102005 name: Monster Attack Lvl 6 description: Summons 3 Taurospears, King Blue Goblins, Luinels, Werewolves, and Yeti & Pepes each.
itemid: 2102006 name: Monster Attack Lvl 7 description: Summons 3 Lycanthropes, Death Teddies, Gigantic Spirit Vikings, and G. Phantom Watches each.
itemid: 2102007 name: Monster Attack Lvl 8 description: Summons 5 Bains, 2 Jr. Balrogs, and 1 Crimson Balrog.
itemid: 2102008 name: Monster Attack Package 1 description: Summons one of each monsters featured in Monster Attack Level 1 ~ Level 3.
itemid: 2102009 name: Monster Attack Package 2 description: Summons one of each monsters featured in Monster Attack Level 4 ~ Level 7.
itemid: 2109000 name: Monster Marble description: A marble that contains poisoned monsters. Use it to bring out the poisoned monster from the marble.
itemid: 2109001 name: 1st Monster Marble description: A marble that contains poisoned monsters on the 1st floor. Use it to bring out the poisoned monster from the marble.
itemid: 2109002 name: 2nd Monster Marble description: A marble that contains poisoned monsters on the 2nd floor. Use it to bring out the poisoned monster from the marble.
itemid: 2109003 name: 3rd Monster Marble description: A marble that contains poisoned monsters on the 3rd floor. Use it to bring out the poisoned monster from the marble.
itemid: 2120000 name: Pet Food description: Small pets love them. Recovers 30 Fullness. NOT for humans!
itemid: 2120008 name: Dry Treat description: A high-quality dry treat that the Pigmies love. Pets love them, too.
itemid: 2160101 name: New Year's Card description: Double-click on the item to send a New Year's card to a character of your choice.
itemid: 2190000 name: Lie Detector Test description: Can be used on suspected botters. Usable only when a suspect is hunting.
itemid: 2210000 name: Orange Mushroom Piece description: A crystal piece that resembles Orange Mushroom. When used, the crystal will melt into the body, and its mythical power will transform the user into Orange Mushroom. This mythical power will last for an hour.
itemid: 2210001 name: Ribbon Pig Piece description: A crystal piece that resembles Ribbon Pig. When used, the crystal will melt into the body, and its mythical power will transform the user into Ribbon Pig. This mythical power will last for an hour.
itemid: 2210002 name: Grey Piece description: A crystal piece that resembles Grey. When used, the crystal will melt into the body, and its mythical power will transform the user into Grey. This mythical power will last for an hour.
itemid: 2210003 name: Dragon Elixir description: A mysterious elixir made by Moira that enables anyone who drinks this potion to temporarily transform into a dragon.
itemid: 2210005 name: Tigun Transformation Bundle. description: A secret medicine that allows you to transform into Tigun, the patrol guard.
itemid: 2210006 name: Rainbow-colored Snail Shell description: A special shell only found through Mano. Apparently it's powerful enough to grant a wish...
itemid: 2210007 name: Change to Ghost description: First the body feels light, then all of a sudden, you're floating. Oh no, you're a ghost!
itemid: 2210008 name: Ghost Candy description: A ghost-shaped candy with a mysterious set of ingredients. Apparently it has some special powers.
itemid: 2210009 name: Sophillia's Abandoned Doll description: An abandoned doll that Sophillia threw away a long time ago, but revived by the Masked Man. Pet its hair, and you'll turn into Sophillia for 3 minutes.
itemid: 2210010 name: Potion of Transformation description: The moment this potion is taken, you'll become a powerful, otherworldly being.
itemid: 2210011 name: Potion of Transformation description: The moment this potion is taken, you'll become a powerful, otherworldly being.
itemid: 2210012 name: Change to Mouse description: Transform into a small, tiny mouse.
itemid: 2210016 name: Mini Draco Transformation description: The mysterious skills of an old halfling has transformed you into a form of a dragon. You can now fly.
itemid: 2210032 name: Cody's Picture description: A picture given by Cody of himself. I get a feeling something fun will happen when I use it.
itemid: 2210033 name: Cake Picture description: A picture of a delicious cake that Cody gave as a gift. I get a feeling something funny will happen when I use it.
itemid: 2211000 name: Cliff's Special Potion description: No one knows what you'll transform into when you drink this, but something WILL happen for one hour. It's all about the risk...
itemid: 2212000 name: Maplemas Party Potion description: Double-click on this to transform a character of your choice. Which one? Try it and find out!
itemid: 2240000 name: Moonstone Engagement Ring Box description: Engagement Ring made of Moon Rock. The ring will be inside a wrapped box. Required for proposal.
itemid: 2240001 name: Star gem Engagement Ring Box description: Engagement Ring made of Star Rock. The ring will be inside a wrapped box. Required for proposal.
itemid: 2240002 name: Golden Heart Engagement Ring Box description: Engagement Ring made of gold. The ring will be inside a wrapped box. Required for proposal.
itemid: 2240003 name: Silver Swan Engagement Ring Box description: Engagement Ring made of silver. The ring will be inside a wrapped box. Required for proposal.
itemid: 2260000 name: Revitalizer description: Restores tamed monster's fatigue level by 30.
itemid: 2270000 name: Pheromone Perfume description: A perfume created by Kenta using Pheromone. Enables the user to tame hogs down at the Korean Folk Village.
itemid: 2270001 name: Pouch description: A pouch with a jewel on the surface. Possesses a special power in that double-clicking the pouch will suck up the surrounding ghosts in the area.
itemid: 2270002 name: Element Rock description: A special alchemist tool that converts an absorbed power of monster into a jewel. The inner part seems to be slightly transparent.
itemid: 2270003 name: Cliff's Magic Cane description: A magic cane that tames the lost Rudolph.
itemid: 2270004 name: Purification Marble description: It's a special magic marble that can contain and purify a monster.
itemid: 2270005 name: 1st Transparent Marble description: A special magic marble that can contain a poisoned monster on the 1st floor.
itemid: 2270006 name: 2nd Transparent Marble description: A special magic marble that can contain a poisoned monster on the 2nd floor.
itemid: 2270007 name: 3rd Transparent Marble description: A special magic marble that can contain a poisoned monster on the 3rd floor.
itemid: 2280000 name: Lava Bottle description: A glass bottle that contains actual lava, which is waiting to be spilled out. Drink this lava and the lava will consume the body with fire, which will enable the drinker to master Fire Demon.
itemid: 2280001 name: Black Cloud Machine description: A mechanical device that produces black clouds. Enables the character to acquire the Smokescreen skill using the clouds.
itemid: 2280002 name: Firm Hand description: A stimulant packaged inside a bottle that resembles a clenched fist. Drinking the stimulant will allow the character to acquire The Will of a Warrior.
itemid: 2280003 name: [Skill Book] Maple Warrior description: You can learn #cMaple Warrior# with this book.\nJob: All 4th jobs.\nCondition: #cMaple Warrior# not acquired.
itemid: 2280004 name: [Skill Book] Infinity description: You can learn #cInfinity# with this book.\nJob: 4th Advancement Magician.\nCondition: #cInfinity# not acquired.
itemid: 2280005 name: [Skill Book] Dragon's Breath description: You can learn #cDragon's Breath# with this book.\nJob: 4th Advancement Bowman.\nCondition: #cDragon's Breath# not acquired.
itemid: 2280006 name: [Skill Book] Taunt description: You can learn #cTaunt# with this book.\nJob: 4th Advancement Thief.\nCondition: #cTaunt# not acquired.
itemid: 2280007 name: [Skill Book] Advanced Combo Attack description: You can learn #cAdvanced Combo Attack# with this book.\nClass: Hero.\nCondition: #cAdvanced Combo# not acquired.
itemid: 2280008 name: [Skill Book] Advanced Charge description: You can learn #cAdvanced Charge# with this book.\nClass: Paladin.\nCondition: #cAdvanced Charge# not acquired.
itemid: 2280009 name: [Skill Book] Angel Ray description: You can learn #cAngel Ray# with this book.\nClass: Bishop.\nCondition: #cAngel Ray# not acquired.
itemid: 2280010 name: [Skill Book] Triple Throw description: You can learn #cTriple Throw# with this book.\nClass: Night Lord.\nCondition: #cTriple Throw# not acquired.
itemid: 2280011 name: Ancient Ice Powder description: This is a pack full of ancient ice powder. If you eat this, you will feel chilled and can learn Ice Demon.
itemid: 2280012 name: [Skill Book] Rush description: You can learn #cRush# with this book.\nJob: 4th Advancement Warrior.\nCondition : #cRush# not acquired.
itemid: 2310000 name: The Owl of Minerva description: #cThe Owl of Minerva#, which represents wisdom, can be used to search for items sold at the Free Market. #cDisappears right after showing the results of the item search#.
itemid: 2320000 name: Teleport Rock description: Remembers 5 maps of your choice. This rock will enable you to #cteleport to the map you remembered#. It can even allow you to #cmove to the map where a certain character is#, provided that the person is in the same channel at the same world.
itemid: 2330000 name: Bullet description: A bullet made out of steel. A set contains numerous bullets and once they are used up, they'll need to be recharged.\nAttack+10
itemid: 2330001 name: Split Bullet description: A bullet made out of steel. A set contains numerous bullets and once they are used up, they'll need to be recharged.\nAttack+12
itemid: 2330002 name: Mighty Bullet description: A bullet made out of steel. A set contains numerous bullets and once they are used up, they'll need to be recharged.\nAttack+14
itemid: 2330003 name: Vital Bullet description: A bullet made out of steel. A set contains numerous bullets and once they are used up, they'll need to be recharged.\nAttack+16
itemid: 2330004 name: Shiny Bullet description: A bullet made out of steel. A set contains numerous bullets and once they are used up, they'll need to be recharged.\nAttack+18
itemid: 2330005 name: Eternal Bullet description: A bullet made out of steel. A set contains numerous bullets and once they are used up, they'll need to be recharged.\nAttack+20
itemid: 2330006 name: Bullet for Novice Pirates description: A bullet made out of steel. A set contains numerous bullets.\nAttack+10
itemid: 2331000 name: Blaze Capsule description: A capsule used for fire-elemental attacks.
itemid: 2332000 name: Glaze Capsule description: A capsule used for ice-elemental attacks.
itemid: 2340000 name: White Scroll description: One of Subani's sacred scrolls. If used in conjunction with a normal or Dark Scroll, the number of item upgrade slots will not be deducted if the scroll fails. However, if using a Dark Scroll, there is still a chance that your weapon will be destroyed.
itemid: 2360000 name: Change to Ghost description: First the body feels light, then all of a sudden, you're floating. Oh no, you're a ghost!
itemid: 2360001 name: Ghost Candy description: A ghost-shaped candy with a mysterious set of ingredients. Take this to change into a ghost for 1 hour.
itemid: 2370000 name: The Songs of Solomon description: An ancient collection of poems and life lessons from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 100,000 EXP. Only available for users under Level 51.
itemid: 2370001 name: The Stories of Solomon description: An ancient book of stories, fables and other myths from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 50,000 EXP. Only available for users under Level 51.
itemid: 2370002 name: The Travels of Solomon description: An ancient collection of map routes, hidden paths and shortcuts from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 30,000 EXP. Only available for users under Level 51.
itemid: 2370003 name: The Writs of Solomon X description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 20,000 EXP. Only available for users under Level 51.
itemid: 2370004 name: The Writs of Solomon IX description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 10,000 EXP. Only available for users under Level 51.
itemid: 2370005 name: The Writs of Solomon VIII description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 5,000 EXP. Only available for users under Level 51.
itemid: 2370006 name: The Writs of Solomon VII description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 3,000 EXP. Only available for users under Level 51.
itemid: 2370007 name: The Writs of Solomon VI description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 2,000 EXP. Only available for users under Level 51.
itemid: 2370008 name: The Writs of Solomon V description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 1,000 EXP. Only available for users under Level 51.
itemid: 2370009 name: The Writs of Solomon IV description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 500 EXP. Only available for users under Level 51.
itemid: 2370010 name: The Writs of Solomon III description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 300 EXP. Only available for users under Level 51.
itemid: 2370011 name: The Writs of Solomon II description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 200 EXP. Only available for users under Level 51.
itemid: 2370012 name: The Writs of Solomon I description: An ancient document of collected wisdom from various elders, sages and warriors in the Maple World. Reading this allows one to gain their collective experience (EXP) in a single second. This edition provides 100 EXP. Only available for users under Level 51.
itemid: 2380000 name: Snail Card description: A card that features Snail.
itemid: 2380001 name: Blue Snail Card description: A card that features Blue Snail.
itemid: 2380002 name: Spore Card description: A card that features Spore.
itemid: 2380003 name: Stump Card description: A card that features Stump.
itemid: 2380004 name: Red Snail Card description: A card that features Red Snail.
itemid: 2380005 name: Slime Card description: A card that features Slime.
itemid: 2380006 name: Pig Card description: A card that features Pig.
itemid: 2380007 name: Orange Mushroom Card description: A card that features Orange Mushroom.
itemid: 2380008 name: Dark Stump Card description: A card that features Dark Stump.
itemid: 2380009 name: Ribbon Pig Card description: A card that features Ribbon Pig.
itemid: 2380010 name: Octopus Card description: A card that features Octopus.
itemid: 2380011 name: Green Mushroom Card description: A card that features Green Mushroom.
itemid: 2380012 name: Bubbling Card description: A card that features Bubbling.
itemid: 2381000 name: Axe Stump Card description: A card that features Axe Stump.
itemid: 2381001 name: Ghost Stump Card description: A card that features Ghost Stump.
itemid: 2381002 name: Blue Mushroom Card description: A card that features Blue Mushroom.
itemid: 2381003 name: Stirge Card description: A card that features Stirge.
itemid: 2381004 name: Female Desert Rabbit Card description: A card that features Female Desert Rabbit.
itemid: 2381005 name: Male Desert Rabbit Card description: A card that features Male Desert Rabbit.
itemid: 2381006 name: Jr. Necki Card description: A card that features Jr. Necki.
itemid: 2381007 name: Horny Mushroom Card description: A card that features Horny Mushroom.
itemid: 2381008 name: Dark Axe Stump Card description: A card that features Dark Axe Stump.
itemid: 2381009 name: Pinboom Card description: A card that features Pinboom.
itemid: 2381010 name: Jr. Cactus Card description: A card that features Jr. Cactus.
itemid: 2381011 name: Trixter Card description: A card that features Trixter.
itemid: 2381012 name: Jr. Sentinel Card description: A card that features Jr. Sentinel.
itemid: 2381013 name: Seacle Card description: A card that features Seacle.
itemid: 2381014 name: Wooden Mask Card description: A card that features Wooden Mask.
itemid: 2381015 name: Bellamoa Card description: A card that features Bellamoa.
itemid: 2381016 name: Zombie Mushroom Card description: A card that features Zombie Mushroom.
itemid: 2381017 name: Krappy Card description: A card that features Krappy.
itemid: 2381018 name: Rocky Mask Card description: A card that features Rocky Mask.
itemid: 2381019 name: Ear Plug Plead Card description: A card that features Ear Plug Plead.
itemid: 2381020 name: Sand Rat Card description: A card that features Sand Rat.
itemid: 2381021 name: Cico Card description: A card that features Cico.
itemid: 2381022 name: Wild Boar Card description: A card that features Wild Boar.
itemid: 2381023 name: Cactus Card description: A card that features Cactus.
itemid: 2381024 name: Evil Eye Card description: A card that features Evil Eye.
itemid: 2381025 name: Scarf Plead Card description: A card that features Scarf Plead.
itemid: 2381026 name: Bubble Fish Card description: A card that features Bubble Fish.
itemid: 2381027 name: Green Trixter Card description: A card that features Green Trixter.
itemid: 2381028 name: Royal Cactus Card description: A card that features Royal Cactus.
itemid: 2381029 name: Flower Fish Card description: A card that features Flower Fish.
itemid: 2381030 name: Meercat Card description: A card that features Meercat.
itemid: 2381031 name: Scorpion Card description: A card that features Scorpion.
itemid: 2381032 name: Sentinel Card description: A card that features Sentinel.
itemid: 2381033 name: Fairy Card description: A card that features Fairy.
itemid: 2381034 name: Brown Teddy Card description: A card that features Brown Teddy.
itemid: 2381035 name: Krip Card description: A card that features Krip.
itemid: 2381036 name: Kiyo Card description: A card that features Kiyo.
itemid: 2381037 name: Ice Sentinel Card description: A card that features Ice Sentinel.
itemid: 2381038 name: Fire Sentinel Card description: A card that features Fire Sentinel.
itemid: 2382000 name: Chirppy Card description: A card that features Chirppy.\n#cIf hunting at Eos Tower, Speed+1#
itemid: 2382001 name: Drum Bunny Card description: A card that features Drum Bunny.\n#cImproves the drop rate of the Drum Bunny.#
itemid: 2382002 name: Ligator Card description: A card that features Ligator.\n#cIf hunting at the Swamp, Avoidability+1#
itemid: 2382003 name: Fireboar Card description: A card that features Fireboar.\n#cIf hunting at Perion, Defense against fire-based attacks+3%#
itemid: 2382004 name: Pink Teddy Card description: A card that features Pink Teddy.\n#cIf hunting at the upper floors of the Clocktower, Jump+1#
itemid: 2382005 name: Ratz Card description: A card that features Ratz.\n#cIf hunting at Eos Tower, Meso drop rate is increased#
itemid: 2382006 name: Leatty Card description: A card that features Leatty.\n#cIf hunting at Orbis Tower, Accuracy+1#
itemid: 2382007 name: Mask Fish Card description: A card that features Mask Fish.\n#cIf hunting at Aqua Road, Avoidability+1#
itemid: 2382008 name: Sand Dwarf Card description: A card that features Sand Dwarf.\n#cIf hunting at the Desert, The drop rate for ores are increased#
itemid: 2382009 name: Cube Slime Card description: A card that features Cube Slime.\n#cIf hunting at the Zenumist Institute, Jump+1#
itemid: 2382010 name: Red Sand Dwarf Card description: A card that features Red Sand Dwarf.\n#cIf hunting at the Desert, The drop rate for jewels are increased#
itemid: 2382011 name: Jr. Cellion Card description: A card that features Jr. Cellion.\n#cIf hunting at the Orbis Garden, Defense against fire-based attacks+3%#
itemid: 2382012 name: Jr. Lioner Card description: A card that features Jr. Lioner.\n#cIf hunting at the Orbis Garden, Defense against electric-based attacks+3%#
itemid: 2382013 name: Jr. Grupin Card description: A card that features Jr. Grupin.\n#cIf hunting at the Orbis Garden, Defense against ice-based attacks+3%#
itemid: 2382014 name: Dark Leatty Card description: A card that features Dark Leatty.\n#cIf hunting at Orbis Tower, Accuracy+1#
itemid: 2382015 name: Roloduck Card description: A card that features Roloduck.\n#cWhen party hunting, Accuracy+1#
itemid: 2382016 name: Black Ratz Card description: A card that features Black Ratz.\n#cIf hunting at Eos Tower, Meso drop rate is increased#
itemid: 2382017 name: Tick Card description: A card that features Tick.\n#cIf hunting at the upper floors of the Clocktower, Accuracy+1#
itemid: 2382018 name: Curse Eye Card description: A card that features Curse Eye.\n#cIf hunting at Victoria Island, Defense against poison-based attacks+3%#
itemid: 2382019 name: Jr. Wraith Card description: A card that features Jr. Wraith.\n#cIf hunting at the Subway, Speed+1#
itemid: 2382020 name: Star Pixie Card description: A card that features Star Pixie.\n#cIf hunting at the Cloud Park, Speed+1#
itemid: 2382021 name: Jr. Boogie Card description: A card that features Jr. Boogie.\n#cDefense against curse+5%#
itemid: 2382022 name: Bloctopus Card description: A card that features Bloctopus.\n#cIf hunting at Eos Tower, Jump+1#
itemid: 2382023 name: Jr. Pepe Card description: A card that features Jr. Pepe.\n#cIf hunting at Orbis Tower, Speed+1#
itemid: 2382024 name: Rumo Card description: A card that features Rumo.\n#cIf hunting at the Zenumist Institute, Defense against poison-based attacks+3%#
itemid: 2382025 name: Panda Teddy Card description: A card that features Panda Teddy.\n#cIf attacking a weapon-carrying monster, Accuracy+1#
itemid: 2382026 name: Helly Card description: A card that features Helly.\n#cIf hunting at Eos Tower, Avoidability+1#
itemid: 2382027 name: Scuba Pepe Card description: A card that features Scuba Pepe.\n#cCancels out drowning damage underwater#
itemid: 2382028 name: Retz description: A card that features Retz.\n#cIf hunting at Helios Tower, Item drop rates are increased#
itemid: 2382029 name: Lupin Card description: A card that features Lupin.\n#cIf hunting at Victoria Island, Speed+1#
itemid: 2382030 name: Lorang Card description: A card that features Lorang.\n#cIf hunting at Victoria Island, Speed+1#
itemid: 2382031 name: Propelly Card description: A card that features Propelly.\n#cIf hunting at Eos Tower, Speed+1#
itemid: 2382032 name: Chronos Card description: A card that features Chronos.\n#cIf hunting at the upper floors of the Clocktower, Avoidability+1#
itemid: 2382033 name: King Bloctopus Card description: A card that features King Bloctopus.\n#cIf hunting at Eos Tower, Jump+1#
itemid: 2382034 name: Planey Card description: A card that features Planey.\n#cIf hunting at Eos Tower, Accuracy+1#
itemid: 2382035 name: Jr. Seal Card description: A card that features Jr. Seal.\n#cIf hunting at Aqua Road, Jump+1#
itemid: 2382036 name: Triple Rumo Card description: A card that features Triple Rumo.\n#cIf hunting at the Zenumist Institute, Defense against poison-based attacks+3%#
itemid: 2382037 name: Tweeter Card description: A card that features Tweeter.\n#cIf hunting at Eos Tower, Accuracy+1#
itemid: 2382038 name: Toy Trojan Card description: A card that features Toy Trojan.\n#cIf hunting at the upper floors of the Clocktower, Speed+1#
itemid: 2382039 name: Cold Eye Card description: A card that features Cold Eye.\n#cIf hunting at Victoria Island, Defense against ice-based attacks+3%#
itemid: 2382040 name: Zombie Lupin Card description: A card that features Zombie Lupin.\n#cIncreases the drop rate of Cursed Doll#
itemid: 2382041 name: Tick-Tock Card description: A card that features Tick-Tock.\n#cIf hunting at the upper floors of the Clocktower, Accuracy+1#
itemid: 2382042 name: Barnard Grey Card description: A card that features Barnard Grey.\n#cIf hunting at Kulan Field, Jump+1#
itemid: 2382043 name: Poopa Card description: A card that features Poopa.\n#cIf hunting at Aqua Road, Speed+1#
itemid: 2382044 name: Poison Poopa Card description: A card that features Poison Poopa.\n#cIf hunting at Aqua Road, Defense against poison-based attacks+3%#
itemid: 2382045 name: Chipmunk Card description: A card that features Chipmunk.\n#cIf hunting at Mu Lung, Speed+1#
itemid: 2382046 name: Desert Giant Card description: A card that features Desert Giant.\n#cIf hunting at the Desert, Speed+1#
itemid: 2382047 name: Flyeye description: A card that features Flyeye.\n#cIf hunting at the Cave, Avoidability+1#
itemid: 2382048 name: Robo Card description: A card that features Robo.\n#cIf hunting at the upper floors of the Clocktower, Defense against electric-based attacks+3%#
itemid: 2382049 name: Platoon Chronos Card description: A card that features Platoon Chronos.\n#cIf hunting at the upper floors of the Clocktower, Speed+1#
itemid: 2382050 name: Mateon Card description: A card that features Mateon.\n#cIf hunting at Boswell Field, The drop rates for droppings are increased#
itemid: 2382051 name: Red Porky Card description: A card that features Red Porky.\n#cIf hunting at Mu Lung, Avoidability+1#
itemid: 2382052 name: Nependeath Card description: A card that features Nependeath.\n#cIncreases drop rate of Nependeath Honey#
itemid: 2382053 name: Iron Hog Card description: A card that features Iron Hog.\n#cIf hunting at Victoria Island, Jump+1#
itemid: 2382054 name: Block Golem description: A card that features Block Golem.\n#cIf hunting at Eos Tower, Accuracy+1#
itemid: 2382055 name: Zeta Grey Card description: A card that features Zeta Grey.\n#cIf hunting at Kulan Field, Speed+1#
itemid: 2382056 name: Freezer Card description: A card that features Freezer.\n#cIf hunting at Aqua Road, Defense against ice-based attacks+3%#
itemid: 2382057 name: Iron Mutae description: A card that features Iron Mutae.\n#cIf hunting at the Alcadno Institute, Speed+1#
itemid: 2382058 name: Jr. Cerebes Card description: A card that features Jr. Cerebes.\n#cIf hunting at Dead Mine, Jump+1#
itemid: 2382059 name: Sparker Card description: A card that features Sparker.\n#cIf hunting at Aqua Road, Defense against electric-based attacks+3%#
itemid: 2382060 name: Black Porky Card description: A card that features Black Porky.\n#cIf hunting at Mu Lung, Avoidability+1#
itemid: 2382061 name: Plateon Card description: A card that features Plateon.\n#cIf hunting at Boswell Field, Speed+1#
itemid: 2382062 name: Master Robo Card description: A card that features Master Robo.\n#cIf hunting at the upper floors of the Clocktower, Defense against electric-based attacks+3%#
itemid: 2382063 name: Skeledog Card description: A card that features Skeledog.\n#cIf hunting at Perion, Speed+1#
itemid: 2382064 name: Lunar Pixie Card description: A card that features Lunar Pixie.\n#cIf hunting at the Cloud Park, Jump+1#
itemid: 2382065 name: Copper Drake Card description: A card that features Copper Drake.\n#cIf hunting at Victoria Island, Speed+1#
itemid: 2382066 name: King Block Golem Card description: A card that features King Block Golem.\n#cIf hunting at Eos Tower, Accuracy+1#
itemid: 2382067 name: Ultra Grey Card description: A card that features Ultra Grey.\n#cIf hunting at Kulan Field, Avoidability+1#
itemid: 2382068 name: Moon Bunny Card description: A card that features Moon Bunny.\n#cIf hunting at the Black Mountain, Jump+1#
itemid: 2382069 name: Iron Boar Card description: A card that features Iron Boar.\n#cIf hunting at Victoria Island, Accuracy+1#
itemid: 2382070 name: Blue Flower Serpent description: A card that features Blue Flower Serpent.\n#cIf hunting at Mu Lung, Avoidability+1#
itemid: 2382071 name: Red Flower Serpent description: A card that features Red Flower Serpent.\n#cIf hunting at Mu Lung, Avoidability+1#
itemid: 2382072 name: Reinforced Iron Mutae description: A card that features Reinforced Iron Mutae.\n#cIf hunting at the Alcadno Institute, Accuracy+1#
itemid: 2382076 name: Mossy Snail Card description: A picture of Mossy Snail is on this card.\n#cWhile hunting in Ellin Forest, Accuracy+1
itemid: 2383000 name: Mecateon Card description: A card that features Mecateon.\n#cIf hunting at Boswell Field, Speed+2#
itemid: 2383001 name: Tortie Card description: A card that features Tortie.\n#cIf hunting at Florina Beach, Accuracy+2#
itemid: 2383002 name: Master Chronos Card description: A card that features Master Chronos.\n#cIf hunting at the upper floors of the Clocktower, Jump+2#
itemid: 2383003 name: Dark Nependeath Card description: A card that features Dark Nependeath.\n#cIf hunting at the Cloud Park, Increases drop rate of Nependeath Honey#
itemid: 2383004 name: Rombot Card description: A card that features Rombot.\n#cIf hunting at Eos Tower, Item drop rates are increased#
itemid: 2383005 name: Mummy Dog Card description: A card that features Mummy Dog.\n#cIf hunting at Perion, Jump+2#
itemid: 2383006 name: Jar Card description: A card that features Jar.\n#cIf hunting at Herb Town, Item drop rates are increased#
itemid: 2383007 name: Mithril Mutae Card description: A card that features Mithril Mutae.\n#cIf hunting at the Alcadno Institute, Accuracy+2#
itemid: 2383008 name: Wraith Card description: A card that features Wraith.\n#cIf hunting at the Subway, Speed+2#
itemid: 2383009 name: Clang Card description: A card that features Clang.\n#cIf hunting at Florina Beach, Speed+2#
itemid: 2383010 name: Ginseng Jar description: A card that features Ginseng Jar.\n#cIf hunting at Herb Town, The "Use" item drop rates are increased#
itemid: 2383011 name: Chief Grey Card description: A card that features Chief Grey.\n#cIf hunting at Kulan Field, Accuracy+2#
itemid: 2383012 name: Drake Card description: A card that features Drake.\n#cIf hunting at Victoria Island, Speed+2#
itemid: 2383013 name: Jr. Yeti Card description: A card that features Jr. Yeti.\n#If hunting at the Snowfield, Cancels out damage penalty#
itemid: 2383014 name: Hodori Card description: A card that features Hodori.\n#cIf hunting at the Black Mountain, Speed+2#
itemid: 2383015 name: Straw Target Dummy description: A card that features Straw Target Dummy.\n#cIf hunting at the Training Field, Avoidability+2#
itemid: 2383016 name: Reinforced Mithril Mutae description: A card that features Reinforced Mithril Mutae.\n#cIf hunting at the Alcadno Institute, Avoidability+2#
itemid: 2383017 name: Firebomb Card description: A card that features Firebomb.\n#cIf hunting at Dead Mine, Defense against fire-based attacks+6%#
itemid: 2383018 name: Wooden Target Dummy description: A card that features Wooden Target Dummy.\n#cIf hunting at the Training Field, Accuracy+2#
itemid: 2383019 name: Croco Card description: A card that features Croco.\n#cIf hunting at the Swamp, Avoidability+2#
itemid: 2383020 name: Luster Pixie Card description: A card that features Luster Pixie.\n#cIf hunting at Cloud Park, Accuracy+2#
itemid: 2383021 name: Cellion Card description: A card that features Cellion.\n#cIf hunting at the Orbis Garden, Defense against fire-based attacks+6%#
itemid: 2383022 name: Lioner Card description: A card that features Lioner.\n#cIf hunting at the Orbis Garden, Defense against electric-based attacks+6%#
itemid: 2383023 name: Grupin Card description: A card that features Grupin.\n#cIf hunting at the Orbis Garden, Defense against ice-based attacks+6%#
itemid: 2383024 name: Hogul description: A card that features Hogul.\n#cIf hunting at the Black Mountain, Protection against being knocked out+10%#
itemid: 2383025 name: Bellflower Root Card description: A card that features Bellflower Root.\n#cIf hunting at Herb Town, Jump+2#
itemid: 2383026 name: MT-09 Card description: A card that features MT-09.\n#cIf hunting at Kulan Field, Accuracy+2#
itemid: 2383027 name: Sr. Bellflower Root Card description: A card that features Sr. Bellflower Root.\n#cIf hunting at Herb Town, Jump+2#
itemid: 2383028 name: Roid Card description: A card that features Roid.\n#cIf hunting at the Alcadno Institute, Defense against electric-based attacks+6%#
itemid: 2383029 name: Malady Card description: A card that features Malady.\n#cIf hunting at Ellinia, Speed+2#
itemid: 2383030 name: Stone Golem Card description: A card that features Stone Golem.\n#cIf hunting at Victoria Island, Accuracy+2#
itemid: 2383031 name: Hector Card description: A card that features Hector Card.\n#cIf hunting at the Snowfield, Speed+2#
itemid: 2383032 name: The Book Ghost Card description: A card that features the Book Ghost.\n#cIf hunting at Mu Lung, Avoidability+2#
itemid: 2383033 name: Dark Jr. Yeti Card description: A card that features Dark Jr. Yeti.\n#cIf hunting at the Snowfield, Cancels out the damage penalty#
itemid: 2383034 name: Tri-Tailed Fox Card description: A card that features Tri-Tailed Fox.\n#cIf hunting at the Black Mountain, Defense against curse+10%#
itemid: 2383035 name: Grizzly Card description: A card that features Grizzly.\n#If hunting at Mu Lung, Jump+2#
itemid: 2383036 name: Skeleton Soldier description: A card that features Skeleton Soldier.\n#cIf hunting at Perion, Avoidability+2#
itemid: 2383037 name: Coolie Zombie Card description: A card that features Coolie Zombie.\n#cIf hunting at El Nath, Defense against poison-based attacks+6%#
itemid: 2383038 name: Miner Zombie description: A card that features Miner Zombie.\n#cIf hunting at El Nath, Defense against poison-based attacks+6%#
itemid: 2383039 name: Dark Stone Golem description: A card that features Dark Stone Golem.\n#cIf hunting at Victoria Island, Accuracy+2#
itemid: 2383040 name: White Fang Card description: A card that features White Fang.\n#cIf hunting at the Snowfield, Speed+2#
itemid: 2383041 name: Reindeer Card description: A card that features Reindeer.\n#cIf hunting at Mu Lung, Jump+2#
itemid: 2383042 name: Neo Huroid Card description: A card that features Neo Huroid.\n#cIf hunting at the Alcadno Institute, Defense against electric-based attacks+6%#
itemid: 2383043 name: Mixed Golem Card description: A card that features Mixed Golem.\n#cIf hunting at Victoria Island, Accuracy+2/Avoidability+2#
itemid: 2383044 name: Red Drake Card description: A card that features Red Drake.\n#cIf hunting at Victoria Island, Defense against fire-based attacks+6%#
itemid: 2383045 name: Pepe Card description: A card that features Pepe.\n#cIf hunting at the Snowfield, Speed+2#
itemid: 2383046 name: Blin Card description: A card that features Blin.\n#cIf hunting at the Black Mountain, Avoidability+2#
itemid: 2383047 name: Panda Card description: A card that features Panda.\n#cIf hunting at Mu Lung, Defense against weakness+10%#
itemid: 2383048 name: Shade Card description: A card that features Shade.\n#cIf hunting at the Subway, Avoidability+2#
itemid: 2383049 name: Master Dummy Card description: A card that features Master Dummy.\n#cIf hunting at Mu Lung Training Ground, Avoidability+2#
itemid: 2383056 name: Tree Rod Card description: A picture of Tree Rod is on this card.\n#cWhile hunting in Ellin Forest, Avoidability+2#
itemid: 2383057 name: Mossy Mushroom Card description: A picture of Mossy Mushroom is on this card.\n#cWhile hunting in Ellin Forest, Jump+2#
itemid: 2383058 name: Primitive Boar Card description: A picture of Primitive Boar is on this card.\n#cWhile hunting in Ellin Forest, Speed+2#
itemid: 2383059 name: Stone Bug Card description: A picture of Stone Bug is on this card.\n#cWhile hunting in Ellin Forest, Accuracy+2#
itemid: 2384000 name: Buffy Card description: A card that features Buffy.\n#cIf hunting at the lower levels of the Clocktower, Jump+3#
itemid: 2384001 name: Wild Cargo Card description: A card that features Wild Cargo.\n#cIf hunting at Victoria Island, Jump+3#
itemid: 2384002 name: Peach Monkey Card description: A card that features Peach Monkey.\n#cIf hunting at Mu Lung, Accuracy+3#
itemid: 2384003 name: Officer Skeleton Card description: A card that features Officer Skeleton.\n#cIf hunting at Perion, Avoidability+3#
itemid: 2384004 name: Soul Teddy Card description: A card that features Soul Teddy.\n#cIf hunting at the lower levels of the Clocktower, Avoidability+3#
itemid: 2384005 name: Jr. Luinel Card description: A card that features Jr. Luinel.\n#cIf hunting at the Orbis Garden, Defense against darkness+15%#
itemid: 2384006 name: Ice Drake Card description: A card that features Ice Drake.\n#cIf hunting at Victoria Island, Defense against ice-based attacks+9%#
itemid: 2384007 name: Dark Pepe Card description: A card that features Dark Pepe.\n#cIf hunting at the Snowfield, Speed+3#
itemid: 2384008 name: Mr. Alli Card description: A card that features Mr. Alli.\n#cIf hunting at Herb Town, Protection against being knocked out+15%#
itemid: 2384009 name: Yeti Card description: A card that features Yeti.\n#cIf hunting at the Snowfield, Defense against ice-based attacks+9%#
itemid: 2384010 name: Riche Card description: A card that features Riche.\n#cIf hunting at the Snowfield, Defense against seal+15%#
itemid: 2384011 name: Homun Card description: A card that features Homun.\n#cIf hunting at the Zenumist Institute, Avoidability+3#
itemid: 2384012 name: Lazy Buffy Card description: A card that features Lazy Buffy.\n#cIf hunting at the lower levels of the Clocktower, Avoidability+3#
itemid: 2384013 name: Sage Cat Card description: A card that features Sage Cat.\n#cIf hunting at Mu Lung, Accuracy+3#
itemid: 2384014 name: Master Soul Teddy Card description: A card that features Master Soul Teddy.\n#cIf hunting at the lower levels of the Clocktower, Avoidability+3#
itemid: 2384015 name: Dark Drake Card description: A card that features Dark Drake.\n#cIf hunting at Victoria Island, Defense against darkness+15%#
itemid: 2384016 name: Dark Yeti Card description: A card that features Dark Yeti.\n#cIf hunting at the Snowfield, Defense against ice-based attacks+9%#
itemid: 2384017 name: Kru Card description: A card that features Kru.\n#cIf hunting at Herb Town, Speed+3#
itemid: 2384018 name: Cyti Card description: A card that features Cyti.\n#cIf hunting at the lab, Avoidability+3#
itemid: 2384019 name: Klock Card description: A card that features Klock.\n#cIf hunting at the lower levels of the Clocktower, Accuracy+3#
itemid: 2384020 name: Tauromacis Card description: A card that features Tauromacis.\n#cIf hunting at Victoria Island, Defense against poison-based attacks+9%#
itemid: 2384021 name: Yellow King Goblin Card description: A card that features Yellow King Goblin.\n#cIf hunting at the Black Mountain, Defense against fire-based attacks+9%#
itemid: 2384022 name: Blue King Goblin Card description: A card that features Blue King Goblin.\n#cIf hunting at the Black Mountain, Defense against ice-based attacks+9%#
itemid: 2384023 name: Green King Goblin Card description: A card that features Green King Goblin.\n#cIf hunting at the Black Mountain, Defense against poison-based attacks+9%#
itemid: 2384024 name: Rash Card description: A card that features Rash.\n#cIf hunting at Leafre Forest, Defense against curse+15%#
itemid: 2384025 name: Captain Card description: A card that features Captain.\n#cIf hunting at Herb Town, Jump+3#
itemid: 2384026 name: Cerebes Card description: A card that features Cerebes.\n#cIf hunting at Dead Mine, Accuracy+3#
itemid: 2384027 name: Beetle Card description: A card that features Beetle.\n#cIf hunting at Leafre Forest, Avoidability+3#
itemid: 2384028 name: Hobi Card description: A card that features Hobi.\n#cIf hunting at Leafre Forest, Defense against poison-based attack+15%#
itemid: 2384029 name: Commander Skeleton Card description: A card that features Commander Skeleton.\n#cIf hunting at Perion, Accuracy+3/Avoidability+3#
itemid: 2384030 name: Luinel Card description: A card that features Luinel.\n#cIf hunting at the Orbis Garden, Defense against darkness+15%#
itemid: 2384031 name: Homunculu Card description: A card that features Homunculu.\n#cIf hunting at the Zenumist Institute, Avoidability+3#
itemid: 2384032 name: Buffoon Card description: A card that features Buffoon.\n#cIf hunting at the lower levels of the Clocktower, Speed+3#
itemid: 2384033 name: Dark Rash Card description: A card that features Dark Rash.\n#cIf hunting at Leafre Forest, Defense against curse+15%#
itemid: 2384034 name: D.Roy Card description: A card that features D. Roy.\n#cIf hunting at the Alcadno Institute, Accuracy+3/Avoidability+3#
itemid: 2384035 name: Werewolf Card description: A card that features Werewolf.\n#cIf hunting at the Snowfield, Accuracy+3#
itemid: 2384036 name: Taurospear Card description: A card that features Taurospear.\n#cIf hunting at Victoria Island, Accuracy+3#
itemid: 2384037 name: Snow Witch Card description: A card that features Snow Witch.\n#cIf hunting at the Snowfield, Defense against ice-based attacks+9%#
itemid: 2384038 name: Security Camera Card description: A card that features Security Camera.\n#cIf hunting at the Alcadno Institute, Speed+3#
itemid: 2384039 name: Scholar Ghost Card description: A card that features Scholar Ghost.\n#cIf hunting at the Black Mountain, Item drop rate increased#
itemid: 2384040 name: Rurumo Card description: A card that features Rurumo.\n#cIf hunting at the Alcadno Institute, Item drop rate increased#
itemid: 2385000 name: Dark Klock Card description: A card that features Dark Klock.\n#cIf hunting at the lower levels of the Clocktower, Avoidability+4#
itemid: 2385001 name: Dual Beetle Card description: A card that features Dual Beetle.\n#cIf hunting at Leafre Forest, Avoidability+4#
itemid: 2385002 name: Green Hobi Card description: A card that features Green Hobi.\n#cIf hunting at Minar Forest, Accuracy+4/Avoidability+4#
itemid: 2385003 name: Deep Buffoon Card description: A card that features Deep Buffoon.\n#cIf hunting at the lower levels of the Clocktower, Speed+4#
itemid: 2385004 name: Yeti and Pepe Card description: A card that features Yeti and Pepe.\n#cIf hunting at the Snowfield, Avoidability+4#
itemid: 2385005 name: Hankie Card description: A card that features Hankie.\n#cIf hunting at Leafre Forest, Jump+4#
itemid: 2385006 name: Lycanthrope Card description: A card that features Lycanthrope.\n#cIf hunting at the Snowfield, Accuracy+4#
itemid: 2385007 name: Harp Card description: A card that features Harp.\n#cIf hunting at Minar Forest, Avoidability+4#
itemid: 2385008 name: Homunscullo Card description: A card that features Homunscullo.\n#cIf hunting at the Zenumist Institute, Jump+4#
itemid: 2385009 name: Dark Yeti and Pepe Card description: A card that features Dark Yeti and Pepe.\n#cIf hunting at the Snowfield, Avoidability+4#
itemid: 2385010 name: Pirate Card description: A card that features Pirate.\n#cIf hunting at the lower levels of the Clocktower, Accuracy+4#
itemid: 2385011 name: Blood Harp Card description: A card that features Blood Harp.\n#cIf hunting at Minar Forest, Accuracy+4#
itemid: 2385012 name: Death Teddy Card description: A card that features Death Teddy.\n#cIf hunting at the lower levels of the Clocktower, Accuracy+4#
itemid: 2385013 name: Goby Card description: A card that features Goby.\n#cIf hunting at Aqua Road, 15% chance of breaking through the monster's magic defense#
itemid: 2385014 name: Birk Card description: A card that features Birk.\n#cIf hunting at Leafre Forest, Speed+4#
itemid: 2385015 name: Dual Pirate Card description: A card that features Dual Pirate.\n#cIf hunting at the lower levels of the Clocktower, Accuracy+4#
itemid: 2385016 name: Black Kentaurus Card description: A card that features Black Kentaurus.\n#cIf hunting at Leafre Forest, Defense against darkness+20%#
itemid: 2385017 name: Red Kentaurus Card description: A card that features Red Kentaurus.\n#cIf hunting at Leafre Forest, Defense against fire-based attacks+12%#
itemid: 2385018 name: Blue Kentaurus Card description: A card that features Blue Kentaurus.\n#cIf hunting at Leafre Forest, Defense against ice-based attacks+12%#
itemid: 2385019 name: Dual Birk Card description: A card that features Dual Birk.\n#cIf hunting at Leafre Forest, Speed+4#
itemid: 2385020 name: Master Death Teddy Card description: A card that features Master Death Teddy.\n#cIf hunting at the lower levels of the Clocktower, Accuracy+4/Avoidability+4#
itemid: 2385021 name: Bain Card description: A card that features Bain.\n#cIf hunting at Dead Mine, Defense against fire-based attacks+12%#
itemid: 2385022 name: Blue Dragon Turtle Card description: A card that features Blue Dragon Turtle.\n#cIf hunting at the Dragon Forest, Accuracy+4#
itemid: 2385023 name: Deet and Roi Card description: A card that features Deet and Roi.\n#cIf hunting at the Zenumist Institute, Speed+4#
itemid: 2385025 name: Eye of Time Card description: A card with a picture of the Eye of Time.\nWhen hunting on the Temple of Time, Speed+4#
itemid: 2386000 name: Bone Fish Card description: A card that features Bone Fish.\n#cIf hunting at Aqua Road, 30% chance of breaking through monster's weapon defense#
itemid: 2386001 name: Red Dragon Turtle Card description: A card that features Red Dragon Turtle.\n#cIf hunting at the Dragon Forest, Avoidability+5#
itemid: 2386002 name: Viking Card description: A card that features Viking.\n#cIf hunting at the lower levels of the Clocktower, Defense against fire-based attacks+15%#
itemid: 2386003 name: Squid Card description: A card that features Squid.\n#cIf hunting at Aqua Road, Defense against darkness+25%#
itemid: 2386004 name: Phantom Watch Card description: A card that features Phantom Watch.\n#cIf hunting at the lower levels of the Clocktower, Defense against ice-based attacks+15%#
itemid: 2386005 name: Rexton Card description: A card that features Rexton.\n#cIf hunting at the Dragon Forest, Speed+5#
itemid: 2386006 name: Brexton Card description: A card that features Brexton.\n#cIf hunting at the Dragon Forest, Accuracy+5#
itemid: 2386007 name: Risell Squid Card description: A card that features Risell Squid.\n#cIf hunting at Aqua Road, Defense against darkness+25%#
itemid: 2386008 name: Red Wyvern Card description: A card that features Red Wyvern.\n#cIf hunting at the Dragon Forest, Defense against fire-based attacks+15%#
itemid: 2386009 name: Gigantic Viking Card description: A card that features Gigantic Viking.\n#cIf hunting at the lower levels of the Clocktower, Defense against fire-based attacks+15%#
itemid: 2386010 name: G. Phantom Watch Card description: A card that features G. Phantom Watch.\n#cIf hunting at the lower levels of the Clocktower, Defense against ice-based attacks+15%#
itemid: 2386011 name: Green Cornian Card description: A card that features Green Cornian.\n#cIf hunting at the Dragon Forest, Speed+5#
itemid: 2386012 name: Shark Card description: A card that features Shark\n#cIf hunting at Aqua Road, Defense against ice-based attacks+15%#
itemid: 2386013 name: Blue Wyvern Card description: A card that features Blue Wyvern.\n#cIf hunting at the Dragon Forest, Defense against ice-based attacks+15%#
itemid: 2386014 name: Cold Shark Card description: A card that features Cold Shark.\n#cIf hunting at Aqua Road, Accuracy+5#
itemid: 2386015 name: Dark Wyvern Card description: A card that features Dark Wyvern.\n#cIf hunting at the Dragon Forest, Defense against darkness+25%#
itemid: 2386016 name: Dark Cornian Card description: A card that features Dark Cornian.\n#cIf hunting at the Dragon Forest, Accuracy+5#
itemid: 2386017 name: Jr. Newtie Card description: A card that features Jr. Newtie.\n#cIf hunting at the Dragon Forest, Avoidability+5#
itemid: 2386021 name: Memory Monk Card description: A card with a picture of the Memory Monk.\n#cWhen hunting on Memory Lane, Evasion rate+5#
itemid: 2386022 name: Memory Monk Trainee Card description: A card with a picture of the Memory Monk Trainee.\n#cWhen hunting on Memory Lane, Accuracy+5#
itemid: 2386023 name: Memory Guardian Card description: A card with a picture of the Memory Guardian.\n#cWhen hunting on Memory Lane, Jump+5#
itemid: 2386024 name: Chief Memory Guardian Card description: A card with a picture of the Chief Memory Guardian.\n#cWhen hunting on Memory Lane, Speed+5#
itemid: 2387000 name: Gatekeeper Card description: A card that features Gatekeeper.\n#If hunting at the lower levels of the Clocktower, 25% chance of breaking through monster's weapon defense#
itemid: 2387001 name: Thanatos Card description: A card that features Thanatos.\n#cIf hunting at the lower levels of the Clocktower, 25% chance of breaking through monster's magic defense#
itemid: 2387002 name: Skelegon Card description: A card that features Skelegon.\n#cIf hunting at the Dragon Forest, Accuracy+6/Avoidability+6#
itemid: 2387003 name: Skelosaurus Card description: A card that features Skelosaurus.\n#cIf hunting at the Dragon Forest, 20% chance of breaking through monster's weapon/magic defense#
itemid: 2387004 name: Nest Golem Card description: A card that features Nest Golem.\n#cIf hunting at the Dragon Forest, Accuracy+5
itemid: 2387006 name: Qualm Monk Card description: A card with a picture of the Qualm Monk.\n#cWhen hunting on the Road of Regrets, Evasion rate+6#
itemid: 2387007 name: Qualm Monk Trainee Card description: A card with a picture of the Qualm Monk Trainee.\n#cWhen hunting on the Road of Regrets, Accuracy+6#
itemid: 2387008 name: Qualm Guardian Card description: A card with a picture of the Qualm Guardian.\n#cWhen hunting on the Road of Regrets, Jump+6#
itemid: 2387009 name: Chief Qualm Guardian Card description: A card with a picture of the Chief Qualm Guardian.\n#cWhen hunting on the Road of Regrets, Speed+6#
itemid: 2387010 name: Oblivion Monk Card description: A card with a picture of the Oblivion Monk.\n#cWhen hunting on the Road to Oblivion, Evasion rate+6#
itemid: 2387011 name: Oblivion Monk Trainee Card description: A card with a picture of the Oblivion Monk Trainee.\n#cWhen hunting on the Road to Oblivion, Accuracy+6#
itemid: 2387012 name: Oblivion Guardian Card description: A card with a picture of the Oblivion Guardian.\n#cWhen hunting on the Road to Oblivion, Jump+6#
itemid: 2387013 name: Chief Oblivion Guardian Card description: A card with a picture of the Chief Oblivion Guardian.\n#cWhen hunting on the Road to Oblivion, Speed+6#
itemid: 2388000 name: Mano Card description: A card that features Mano.\n#cIf hunting around the area of Lith Harbor, Item/Meso drop rate is increased#
itemid: 2388001 name: King Slime Card description: A card that features King Slime.\n#cIf hunting around the area of Kerning City, Speed+1/Jump+1
itemid: 2388002 name: Faust Card description: A card that features Faust.\n#cIf hunting around the area of Ellinia, Item/Meso drop rate is increased#
itemid: 2388003 name: King Clang Card description: A card that features King Clang.\n#cIf hunting around the area of Florina Beach, Item/Meso drop rate is increased#
itemid: 2388004 name: Alishar Card description: A card that features Alishar.\n#cIf hunting around the area of Eos Tower, Item/Meso drop rate is increased#
itemid: 2388005 name: Timer Card description: A card that features Timer.\n#cIf hunting at the upper floors of the Clocktower, Item/Meso drop rate is increased#
itemid: 2388006 name: Mushmom Card description: A card that features Mushmom.\n#cIf hunting around the area of Henesys, Item/Meso drop rate is increased#
itemid: 2388007 name: Dyle Card description: A card that features Dyle.\n#cIf hunting around the area of Kerning City, Item/Meso drop rate is increased#
itemid: 2388008 name: Zombie Mushmom description: A card that features Zombie Mushmom.\n#cIf hunting around the area of Ant Tunnel, Item/Meso drop rate is increased#
itemid: 2388009 name: Nine-Tailed Fox Card description: A card that features Nine-Tailed Fox.\n#cIf hunting around the area of Korean Folk Town, Item/Meso drop rate is increased#
itemid: 2388010 name: Tae Roon Card description: A card that features Tae Roon.\n#cIf hunting around the area of Sky Forest, Item/Meso drop rate is increased#
itemid: 2388011 name: Lord Pirate Card description: A card that features Lord Pirate.\n#cIf hunting around the area of Herb Town, Item/Meso drop rate is increased#
itemid: 2388012 name: Papa Pixie Card description: A card that features Papa Pixie.\n#cIf hunting around the area of Cloud Town, Item/Meso drop rate is increased#
itemid: 2388013 name: King Sage Cat Card description: A card that features King Sage Cat.\n#cIf hunting around the area of Peach Farm, Item/Meso drop rate is increased#
itemid: 2388014 name: Frankenroid Card description: A card that features Frankenroid.\n#cIf hunting around the area of Magatia, Item/Meso drop rate is increased#
itemid: 2388015 name: Elliza Card description: A card that features Elliza.\n#cIf hunting around the area of Orbis Garden, Item/Meso drop rate is increased#
itemid: 2388016 name: Snowman Card description: A card that features Snowman.\n#cIf hunting around the area of Snowfields, Item/Meso drop rate is increased#
itemid: 2388017 name: Crimson Balrog Card description: A card that features Crimson Balrog.\n#cIf hunting at El Nath/Orbis, Item/Meso drop rate is increased#
itemid: 2388018 name: Manon Card description: A card that features Manon.\n#cIf hunting at Leafre Forest, Meso drop rate is increased#
itemid: 2388019 name: Griffey Card description: A card that features Griffey.\n#cIf hunting at Leafre Forest, Item drop rates are increased#
itemid: 2388020 name: Pianus Card description: A card that features Pianus.\n#cIf hunting around the Aqua Road area, Item/Meso drop rate is increased#
itemid: 2388021 name: Ergoth Card description: A card that features Ergoth.\n#cWhen party hunting, Jump+6/Speed+6#
itemid: 2388022 name: Papulatus Card description: A card that features Papulatus.\n#cIf hunting at the lower levels of the Clocktower, Item/Meso drop rate is increased#
itemid: 2388023 name: Zakum Card description: A card that features Zakum.\n#cIf hunting around the area of the Dead Mine, Item/Meso drop rate is increased#
itemid: 2388024 name: Horned Tail Card description: A card that features Horned Tail.\n#cIf hunting around the area of Minar Forest, Item/Meso drop rate is increased#
itemid: 2388025 name: Stumpy Card description: A card that features Stumpy.\n#cIf hunting around the area of Perion, Item/Meso drop rate is increased#
itemid: 2388026 name: Jr. Balrog Card description: A card that features Jr. Balrog.\n#cIf hunting around the area of Sleepywood, Item/Meso drop rate is increased#
itemid: 2388027 name: Rudolph Card description: A card that features Santa's favorite, Rudolph.
itemid: 2388028 name: Kid Snowman Card description: A card that features the little rascal that is the Kid Snowman.
itemid: 2388029 name: Deo Card description: A card that features Deo.\n#cIf hunting around the desert area, Item/Meso drop rate will be increased#
itemid: 2388030 name: Seruf Card description: A card that features Seruf.\n#cIf hunting at a shallow sea, Item/Meso drop rate will be increased#
itemid: 2388031 name: Zeno Card description: A card that features Zeno.\n#cIf hunting around the area of Omega Sector, Item/Meso drop rate will be increased#
itemid: 2388032 name: Kimera Card description: A card that features Kimera.\n#cIf hunting around the lab area, Item/meso drop rate increases#
itemid: 2388033 name: Leviathan Card description: A card that features Leviathan.\n#cIf hunting around the area of Dragon Forest, Item/Meso drop rate will be increased#
itemid: 2388039 name: Poison Golem Card description: A picture of Poison Golem is on this card.\n#cWhile hunting in Ellin Forest, Drop rate of item and meso increase#
itemid: 2388040 name: Dodo Card description: A card with a picture of Dodo.\n#cWhen hunting on Memory Lane, Item/Meso Drop rate increase#
itemid: 2388041 name: Lilynouch Card description: A card with a picture of Lilynouch.\n#cWhen hunting on the Road of Regrets, Item/Meso Drop rate increase#
itemid: 2388042 name: Lyka Card description: A card with a picture of Lyka.\n#cWhen hunting on the Road to Oblivion, Item/Meso Drop rate increase#
itemid: 2388043 name: Pink Bean description: A card with a picture of Pink Bean.\n#cWhen hunting at the Temple of Time, Item/Meso Drop rate increase#
itemid: 2430000 name: Torn Cygnus' Book Volume 1 description: When used one at a time, a special power covers my body and blesses me. I think if I collect 20, I'll be able to read what's written inside.
itemid: 2430001 name: Torn Cygnus' Book Volume 2 description: When used one at a time, a special power covers my body and blesses me. I think if I collect 20, I'll be able to read what's written inside.
itemid: 2430002 name: Torn Cygnus' Book Volume 3 description: When used one at a time, a special power covers my body and blesses me. I think if I collect 20, I'll be able to read what's written inside.
itemid: 2430003 name: Cygnus Quiz description: I can receive a reward by answering questions regarding the Cygnus Knights. I should click on it and try.
itemid: 2022554 name: Independence Day Firecracker 1 description: This firecracker has been specially made to celebrate July 4th, 1776, our Independence Day. For 10 minutes, Speed and Jump increase by 5.
itemid: 2022555 name: Independence Day Firecracker 2 description: This firecracker has been specially made to celebrate July 4th, 1776, our Independence Day. For 10 minutes, Attack and Magic increase by 5.
itemid: 2022556 name: Independence Day Firecracker 3 description: This firecracker has been specially made to celebrate July 4th, 1776, our Independence Day. For 10 minutes, Def. and Magic Def. increase by 10.
itemid: 2000020 name: Red Potion for Noblesse description: A special potion made out of herbs that exclusively grow in Ereve. Made specifically for Noblesss. HP +50.
itemid: 2000021 name: Blue Potion for Noblesse description: A special potion made out of herbs that exclusively grow in Ereve. Made specifically for Noblesss. MP +100.
itemid: 2022323 name: Fish Net with a Catch description: The fish net seems to have caught something. Let's double-click it to check its content.
itemid: 2022324 name: Big Belly Fish description: A fish that apparently swallowed something. Let's double-click on the fish to check its content.
itemid: 2022326 name: Blessing of the Forest description: With the purified forest raining gold rain, all affected will receive a temporary boost on speed and jump.
itemid: 2022352 name: Fire Grill Skewer description: A delicious holiday food made out of beef, mushroom, and bellflower on a skewer.
itemid: 2022356 name: Sweet Rice Cake description: A sweet, tasty rice cake. Recovers 1,500 HP and MP.
itemid: 2022357 name: Sweet Rice Cake description: A sweet, tasty rice cake. ATT +8, MP +8 for 15 minutes.
itemid: 2022358 name: Sweet Rice Cake description: A sweet, tasty rice cake. For 15 min., Speed +5, Jump +3.
itemid: 2022359 name: Increases Physical Attack Rat. description: An item that only works inside Mu Lung Dojo.
itemid: 2022360 name: Increases Magic Attack Rate. description: An item that only works inside Mu Lung Dojo.
itemid: 2022361 name: Increases Physical Defense Rate. description: An item that only works inside Mu Lung Dojo.
itemid: 2022362 name: Increases Magic Defense Rate. description: An item that only works inside Mu Lung Dojo.
itemid: 2022363 name: Increases Accuracy description: An item that only works inside Mu Lung Dojo.
itemid: 2022364 name: Increases Avoidability description: An item that only works inside Mu Lung Dojo.
itemid: 2022365 name: Increases Speed description: An item that only works inside Mu Lung Dojo.
itemid: 2022366 name: Increases Max HP description: An item that only works inside Mu Lung Dojo.
itemid: 2022367 name: Increases Max MP description: An item that only works inside Mu Lung Dojo.
itemid: 2022368 name: Increases Physical Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022369 name: Increases Magic Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022370 name: Increases Physical Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022371 name: Increases Magic Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022372 name: Increases Accuracy description: An item that only works inside Mu Lung Dojo.
itemid: 2022373 name: Increases Avoidability description: An item that only works inside Mu Lung Dojo.
itemid: 2022374 name: Increases Speed description: An item that only works inside Mu Lung Dojo.
itemid: 2022375 name: Increases MaxHP description: An item that only works inside Mu Lung Dojo.
itemid: 2022376 name: Increases Max MP description: An item that only works inside Mu Lung Dojo.
itemid: 2022377 name: Increases Physical Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022378 name: Increases Magic Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022379 name: Increases Physical Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022380 name: Increases Magic Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022381 name: Increases Accuracy description: An item that only works inside Mu Lung Dojo.
itemid: 2022382 name: Increases Avoidability description: An item that only works inside Mu Lung Dojo.
itemid: 2022383 name: Increases Speed description: An item that only works inside Mu Lung Dojo.
itemid: 2022384 name: Increases Max HP description: An item that only works inside Mu Lung Dojo.
itemid: 2022385 name: Increases Max MP description: An item that only works inside Mu Lung Dojo.
itemid: 2022386 name: Increases Physical Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022387 name: Increases Magic Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022388 name: Increases Physical Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022389 name: Increases Magic Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022390 name: Increases Accuracy description: An item that only works inside Mu Lung Dojo.
itemid: 2022391 name: Increases Avoidability description: An item that only works inside Mu Lung Dojo.
itemid: 2022392 name: Increases Speed description: An item that only works inside Mu Lung Dojo.
itemid: 2022393 name: Increases Max HP description: An item that only works inside Mu Lung Dojo.
itemid: 2022394 name: Increases Max MP description: An item that only works inside Mu Lung Dojo.
itemid: 2022395 name: Increases Physical Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022396 name: Increases Magic Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022397 name: Increases Physical Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022398 name: Increases Magic Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022399 name: Increases Accuracy description: An item that only works inside Mu Lung Dojo.
itemid: 2022400 name: Increases Avoidability description: An item that only works inside Mu Lung Dojo.
itemid: 2022401 name: Increases Speed description: An item that only works inside Mu Lung Dojo.
itemid: 2022402 name: Increases Max HP description: An item that only works inside Mu Lung Dojo.
itemid: 2022403 name: Increases Max MP description: An item that only works inside Mu Lung Dojo.
itemid: 2022404 name: Increases Physical Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022405 name: Increases Magic Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022406 name: Increases Physical Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022407 name: Increases Magic Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022408 name: Increases Accuracy description: An item that only works inside Mu Lung Dojo.
itemid: 2022409 name: Increases Avoidability description: An item that only works inside Mu Lung Dojo.
itemid: 2022410 name: Increases Speed description: An item that only works inside Mu Lung Dojo.
itemid: 2022411 name: Increases Max HP description: An item that only works inside Mu Lung Dojo.
itemid: 2022412 name: Increases Max MP description: An item that only works inside Mu Lung Dojo.
itemid: 2022413 name: Increases Physical Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022414 name: Increases Magic Attack Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022415 name: Increases Physical Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022416 name: Increases Magic Defense Rate description: An item that only works inside Mu Lung Dojo.
itemid: 2022417 name: Increases Accuracy description: An item that only works inside Mu Lung Dojo.
itemid: 2022418 name: Increases Avoidability description: An item that only works inside Mu Lung Dojo.
itemid: 2022419 name: Increases Speed description: An item that only works inside Mu Lung Dojo.
itemid: 2022420 name: Increases Max HP description: An item that only works inside Mu Lung Dojo.
itemid: 2022421 name: Increases Max MP description: An item that only works inside Mu Lung Dojo.
itemid: 2022422 name: Small Stories description: A tape that contains various small stories from daily life. You can fine view its content by double-clicking on it.
itemid: 2022423 name: Gaga's Appreciation description: Gaga's appreciation. For an hour, your attack and magic rate will go up 20, defense rate 100, accuracy and avoidability 50, and speed and jump ability will go up 10.
itemid: 2022424 name: Gaga's Appreciation description: Gaga's appreciation. For 20 minutes, your attack rate and magic will go up 10, defense rate 30, accuracy and avoidability 20, and speed and jump ability will go up 3.
itemid: 2022428 name: Mysterious Box description: A box with something mysterious inside. I should open it to see what it could be. If it's my lucky day, I might find an awesome gift inside.\n#cYou can open it by double-clicking on it.#
itemid: 2022429 name: Protective Shield description: It can only be used in Mu Lung Dojo. It blocks an attack up to 3 times.
itemid: 2022430 name: Mu Lung Dojo Mana Elixir description: It recovers your MP.
itemid: 2022431 name: Mu Lung Dojo Elixir description: It recovers 50% of your HP and MP.
itemid: 2022432 name: Mu Lung Dojo Power Elixir description: It recovers both HP and MP.
itemid: 2022433 name: Mu Lung Dojo Cure-All Medicine description: It recovers any status error.
itemid: 2022434 name: Warm and Fuzzy Winter description: Weapon Att +20, Magic Att +30 for 15 minutes.
itemid: 2022442 name: Maze Reward description: The EXP awarded by completing the maze created by Richie Gold.
itemid: 2022450 name: EXP Increase(S) description: Provides 50 Bonus EXP.
itemid: 2022451 name: EXP Increase(M) description: Provides 200 Bonus EXP.
itemid: 2022452 name: EXP Increase(L) description: Provides 500 Bonus EXP.
itemid: 2022455 name: Happy New Year! description: Weapon Att +20, Magic Att +30 for 15 min.
itemid: 2022456 name: Elixir description: A legendary potion.\nRecovers 50% of HP and MP.
itemid: 2022457 name: Power Elixir description: A legendary potion.\nFully recovers HP and MP.
itemid: 2022458 name: Shinsoo's Blessing description: For 1 hour, Weapon Att +5, MP +10, Weapon DEF +20, Magic DEF +20, Speed +10.
itemid: 2022459 name: Cassandra's Reward 1 description: For 1 hour, Meso Drop Rate +30%.
itemid: 2022460 name: Cassandra's Reward 2 description: For 40 minutes, Meso Drop Rate +50%.
itemid: 2022461 name: Cassandra's Reward 3 description: For 30 min., Meso Drop Rate 2x.
itemid: 2022462 name: Cassandra's Reward 4 description: For 1 hour, Item Drop Rate +50%.
itemid: 2022463 name: Cassandra's Reward 5 description: For 30 min., Item Drop Rate 2x.
itemid: 2022465 name: Heartpounding Box description: A box in which no one has a clue what's in it. If luck is on your side, then a beautiful present might be in store for you.\n#cDouble-click to open.#
itemid: 2022466 name: Heartpounding Box description: A box in which no one has a clue what's in it. If luck is on your side, then a beautiful present might be in store for you.\n#cDouble-click to open.#
itemid: 2022467 name: Heartpounding Box description: A box in which no one has a clue what's in it. If luck is on your side, then a beautiful present might be in store for you.\n#cDouble-click to open.#
itemid: 2022468 name: Heartpounding Box description: A box in which no one has a clue what's in it. If luck is on your side, then a beautiful present might be in store for you.\n#cDouble-click to open.#
itemid: 2031002 name: Invitation to the Moon description: An invitation to the moon, sent by the Moon Bunnies. Using this will send you directly to the Moon Bunnies.
itemid: 2031003 name: Invitation to the Nest description: An invitation to the baby bird's nest sent by Gaga. Use it to be sent directly to the nest.
itemid: 2031004 name: Invitation to Ereve description: An invitation to Ereve from Neinheart. This invitation will allow you to instantly move to Ereve.
itemid: 2032000 name: Richie Gold's Strange Lamp description: An unbelievable lamp made by Richie Gold. Use this and you'll be led somewhere in the maze. No one knows exactly where you'll be sent, though.
itemid: 2040110 name: Red-Nose STR Bandage 60% description: Improves STR on Rudolf's Red Nose.\nSuccess rate:60%, STR+1
itemid: 2040111 name: Red-Nose DEX Bandage 60% description: Improves DEX on Rudolf's Red Nose.\nSuccess rate:60%, DEX+1
itemid: 2040112 name: Red-Nose INT Bandage 60% description: Improves INT on Rudolf's Red Nose.\nSuccess rate:60%, INT+1
itemid: 2040113 name: Red-Nose LUK Bandage 60% description: Improves LUK on Rudolf's Red Nose.\nSuccess rate:60%, LUK+1
itemid: 2040114 name: Red-Nose ATT Bandage 60% description: Improves ATT on Rudolf's Red Nose.\nSuccess rate:60%, ATT+1
itemid: 2040115 name: Red-Nose Weapon DEF Bandage 60% description: Improves weapon def. on Rudolf's Red Nose.\nSuccess rate:60%, weapon def.+1
itemid: 2040116 name: Red-Nose MP Bandage 60% description: Improves MP on Rudolf's Red Nose.\nSuccess rate:60%, MP+1
itemid: 2040117 name: Red-Nose Magic DEF Bandage 60% description: Improves magic def. on Rudolf's Red Nose.\nSuccess rate:60%, magic def.+1
itemid: 2040118 name: Red-Nose Avoidability Bandage 60% description: Improves avoidability on Rudolf's Red Nose.\nSuccess rate:60%, Avoidability+1
itemid: 2040119 name: Red-Nose Accuracy Bandage 60% description: Improves accuracy on Rudolf's Red Nose.\nSuccess rate:60%, Accuracy+1
itemid: 2044811 name: Scroll for Knuckles for ATT 65% description: Improves weapon attack on knuckles.\nSuccess rate:65%, weapon attack+2, STR+1
itemid: 2044812 name: Scroll for Knuckles for ATT 15% description: Improves weapon attack on knuckles.\nSuccess rate:15%, weapon attack+5, STR+3, weapon def.+1
itemid: 2044813 name: Scroll for Knuckles for Accuracy 65% description: Improves accuracy on knuckles.\nSuccess rate:65%, accuracy+3, DEX+2, weapon attack+1
itemid: 2044814 name: Scroll for Knuckles for Accuracy 15% description: Improves accuracy on knuckles.\nSuccess rate:15%, accuracy+5, DEX+3, weapon attack+3
itemid: 2044906 name: Scroll for Gun for ATT 65% description: Improves weapon attack on guns.\nSuccess rate:65%, weapon attack+2, accuracy+1
itemid: 2044907 name: Scroll for Gun for ATT 15% description: Improves weapon attack on guns.\nSuccess rate:15%, weapon attack+5, accuracy+3, DEX+1
itemid: 2049103 name: Beach Sandals Scroll 100% description: Used on limited-edition beach sandals, with the options of improving/decreasing the stats.\nSuccess rate:100%
itemid: 2100073 name: Mu Lung Dojo Summon Package3_Deo description: Summon Deo
itemid: 2100074 name: Mu Lung Dojo Summon Package4_King Slime description: Summon King Slime
itemid: 2100075 name: Mu Lung Dojo Summon Package5_Giant Centepede description: Summon Giant Centipede
itemid: 2100076 name: Mu Lung Dojo Summon Package6_Faust description: Summon Faust
itemid: 2100077 name: Mu Lung Dojo Summon Package7_King Clang description: Summon King Clang
itemid: 2100078 name: Mu Lung Dojo Summon Package8_Mushroom description: Summon Mushmom
itemid: 2100079 name: Mu Lung Dojo Summon Package9_Alishar description: Summon Alishar
itemid: 2100080 name: Mu Lung Dojo Summon Package10_Timer description: Summon Timer
itemid: 2100081 name: Mu Lung Dojo Summon Package11_Dyle description: Summon Dyle
itemid: 2100082 name: Mu Lung Dojo Summon Package12_Papa Pixie description: Summon Papa Pixie
itemid: 2100083 name: Mu Lung Dojo Summon Package13_Zombie Mushroom description: Summon Zombie Mushmom
itemid: 2100084 name: Mu Lung Dojo Summon Package14_Zeno description: Summon Zeno
itemid: 2100085 name: Mu Lung Dojo Summon Package15_Lord Pirate description: Summon Lord Pirate
itemid: 2100086 name: Mu Lung Dojo Summon Package16_Nine-Tailed Fox description: Summon Nine-Tailed Fox
itemid: 2100087 name: Mu Lung Dojo Summon Package17_Tae Room description: Summon Tae Roon
itemid: 2100088 name: Mu Lung Dojo Summon Package18_Poison Golem description: Summon Poison Golem
itemid: 2100089 name: Mu Lung Dojo Summon Package19_Priest Cat description: Summon Priest Cat
itemid: 2100090 name: Mu Lung Dojo Summon Package20_Jr. Balrog description: Summon Jr. Balrog
itemid: 2100091 name: Mu Lung Dojo Summon Package21_Elliza description: Summon Elliza
itemid: 2100092 name: Mu Lung Dojo Summon Package22_Franken Lloyd description: Summon Franken Lloyd
itemid: 2100093 name: Mu Lung Dojo Summon Package23_Kimera description: Summon Kimera
itemid: 2100094 name: Mu Lung Dojo Summon Package24_Snack Bar description: Summon Snack Bar
itemid: 2100095 name: Mu Lung Dojo Summon Package25_Snowman description: Summon Snowman
itemid: 2100096 name: Mu Lung Dojo Summon Package26_Blue Mushroom description: Summon Blue Mushroom
itemid: 2100097 name: Mu Lung Dojo Summon Package27_Crimson Balrog description: Summon Crimson Balrog
itemid: 2100098 name: Mu Lung Dojo Summon Package28_Manon description: Summon Manon
itemid: 2100099 name: Mu Lung Dojo Summon Package29_Griffey description: Summon Griffey
itemid: 2100100 name: Mu Lung Dojo Summon Package30_Leviathan description: Summon Leviathan
itemid: 2100101 name: Mu Lung Dojo Summon Package31_Papulatus description: Summon Papulatus
itemid: 2100102 name: Mu Lung Dojo Summon Package32_Moo Gong description: Summon Moo Gong
itemid: 2100103 name: Mu Lung Dojo Summon Package00_So Gong description: Summon So Gong
itemid: 2100104 name: Maple Ambush Sack description: Unwrap this sack, and the aliens will bring doom to the world of Maple.
itemid: 2100105 name: Maze Snail Set description: A Maze Snail set, including 5 types of snails for a total of 25 snails.
itemid: 2100106 name: Maze Transformation Snail Set description: A Maze Transformation Snail Set, including 3 types of snails for a total of 3, but they change their look every 3 seconds.
itemid: 2100107 name: Maze Transformation Snail Set2 description: A Maze Transformation Snail Set, including 2 types of snails for a total of 2, but they change their look every 10 seconds.
itemid: 2100112 name: Summon Flying Monsters (Mark) description: Summons marked monsters
itemid: 2100116 name: Summon Maze Pigs description: Summons Maze Pig.
itemid: 2100117 name: Summon Maze Rash description: Summons Maze Rash.
itemid: 2100118 name: Dr. Kim's Anti-Virus Project description: Eliminates Chief Grays.
itemid: 2100119 name: Summons Maze Sand Bunny description: Summons Maze Sand Bunnies.
itemid: 2210017 name: Moon Photo description: The more you look at it, the more you feel lightheaded... and you feel closer to the moon.
itemid: 2210018 name: Sweet Rice Cake description: A sweet, delicious rice cake. Sometimes creates an interesting set of powers.
itemid: 2210021 name: Gaga Transformation Potion description: The moment you drink this potion, you'll become the biggest star in the world of Maple, Gaga.
itemid: 2210022 name: Peto Transformation Potion description: A transformation potion from the masked gentleman that allows you to transform into Peto for 15 minutes.
itemid: 2270012 name: Purple Ribbon Pig description: A purple ribbon that helps catch Maze Pig.
itemid: 2270008 name: Fish Net description: A fish net intended to catch something. Can be used with Gaga.
itemid: 2270009 name: Red Ribbon Pig description: A red ribbon that helps catch Maze Pig.
itemid: 2270010 name: Green Ribbon Pig description: A green ribbon that helps catch Maze Pig.
itemid: 2270011 name: Blue Ribbon Pig description: A blue ribbon that helps catch Maze Pig.
itemid: 2380013 name: Cynical Orange Mushroom Card description: A card featuring the Cynical Orange Mushroom.
itemid: 2388046 name: Mu Gong Card description: A card with a drawing of Moo Gong on it.\n#cWhen hunting in Mu Lung, Increases Item/Meso drop rate.#
itemid: 2430004 name: Richie Gold's Random Key Pot description: Resets the Gold Key Room in Richie Gold's Maze.
itemid: 2430005 name: Memorial Map description: Allows you to check your current position, along with the spot of the Gold Key Room.
itemid: 2440000 name: Richie Gold's Fake Lead description: Using this will randomly take you to a spot in the maze.
itemid: 2022157 name: Carnival Point 1 description: Enhances CP 3.
itemid: 2022158 name: Carnival Point 2 description: Enhances CP 3.
itemid: 2022159 name: Carnival Point 3 description: Enhances CP 3.
itemid: 2022175 name: Elixir description: A legendary potion.\nRecovers about 50% of HP and MP. (Exclusively for Monster Carnival)
itemid: 2022176 name: Power Elixir description: A legendary Potion.\nRecovers all HP and MP. (Exclusively for Monster Carnival)
itemid: 2022177 name: Mana Elixir description: A legendary potion.\nRecovers about 300 MP. (Exclusively for Monster Carnival)
itemid: 2022178 name: All-Cure Potion description: Recovers the character from any abnormal state. (Exclusively for Monster Carnival)
itemid: 2041211 name: Spiegelmann's Marble description: Can only be used on Spiegelmann's Necklace.\nSuccess rate:60%, HP+30, MP+30
itemid: 2044712 name: Scroll for Claw for ATT 100% description: Improves weapon attack on claws.\nSuccess rate:100%, weapon attack+2, accuracy+3
itemid: 2044612 name: Scroll for Crossbow for ATT 100% description: Improves weapon attack on crossbows.\nSuccess rate:100%, weapon attack+2, accuracy+3
itemid: 2044512 name: Scroll for Bow for ATT 100% description: Improves weapon attack on bows.\nSuccess rate:100%, weapon attack+2, accuracy+3
itemid: 2044417 name: Scroll for Pole Arm for ATT 100% description: Improves weapon attack on pole arms.\nSuccess rate:100%, weapon attack+2, STR+2
itemid: 2044317 name: Scroll for Spear for ATT 100% description: Improves weapon attack on spears.\nSuccess rate:100%, weapon attack+2, STR+2
itemid: 2044217 name: Scroll for Two-handed BW for ATT 100% description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:100%, weapon attack+2, STR+2
itemid: 2044117 name: Scroll for Two-handed Axe for ATT 100% description: Improves weapon attack on two-handed axes.\nSuccess rate:100%, weapon attack+2, STR+2
itemid: 2044025 name: Scroll for Two-handed Sword for ATT 100% description: Improves weapon attack on two-handed swords.\nSuccess rate:100%, weapon attack+2, STR+2
itemid: 2043812 name: Scroll for Staff for Magic ATT 100% description: Improves magic attack on staffs.\nSuccess rate:100%, magic attack+2, INT+2
itemid: 2043712 name: Scroll for Wand for Magic ATT 100% description: Improves magic attack on wands.\nSuccess rate:100%, magic attack+2, INT+2
itemid: 2043312 name: Scroll for Dagger for ATT 100% description: Improves weapon attack on daggers.\nSuccess rate:100%, weapon attack+2, LUK+2
itemid: 2043217 name: Scroll for One-Handed BW for ATT 100% description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:100%, weapon attack+2, STR+2
itemid: 2043117 name: Scroll for One-Handed Axe for ATT 100% description: Improves weapon attack on one-handed axes.\nSuccess rate:100%, weapon attack+2, STR+2
itemid: 2043023 name: Scroll for One-Handed Sword for ATT 100% description: Improves weapon attack on one-handed swords.\nSuccess rate:100%, weapon attack+2, STR+2
itemid: 2041066 name: Scroll for Cape for Magic DEF 100% description: Improves magic def. on capes.\nSuccess rate:100%, magic def.+3, weapon def.+2
itemid: 2041067 name: Scroll for Cape for Weapon DEF 100% description: Improves weapon def. on capes.\nSuccess rate:100%, weapon def.+3, magic def.+2
itemid: 2040936 name: Scroll for Shield for DEF 100% description: Improves DEF on shields.\nSuccess rate:100%, weapon def.+2, magic def.+3
itemid: 2040829 name: Scroll for Gloves for DEX 100% description: Improves DEX on gloves.\nSuccess rate:100%, accuracy+2, DEX+2
itemid: 2040830 name: Scroll for Gloves for ATT 100% description: Improves weapon attack on gloves.\nSuccess rate:100%, weapon attack+2
itemid: 2040740 name: Scroll for Shoes for DEX 100% description: Improves DEX on shoes.\nSuccess rate:100%, avoidability+2, accuracy+3
itemid: 2040741 name: Scroll for Shoes for Jump 100% description: Improves jump on shoes.\nSuccess rate:100%, jump+2, DEX+2
itemid: 2040742 name: Scroll for Shoes for Speed 100% description: Improves speed on shoes.\nSuccess rate:100%, speed+2
itemid: 2040630 name: Scroll for Bottomwear for DEF 100% description: Improves DEF on bottomwear.\nSuccess rate:100%, weapon def.+2, magic def.+3
itemid: 2040538 name: Scroll for Overall Armor for DEX 100% description: Improves DEX on overalls.\nSuccess rate:100%, DEX+2, accuracy+3
itemid: 2040539 name: Scroll for Overall Armor for DEF 100% description: Improves DEF on overalls.\nSuccess rate:100%, weapon def.+2, magic def.+3
itemid: 2040430 name: Scroll for Topwear for DEF 100% description: Improves DEF on topwear.\nSuccess rate:100%, weapon def.+2, magic def.+3
itemid: 2040334 name: Scroll for Earring for INT 100% description: Improves INT on earrings.\nSuccess rate:100%, magic attack+2, INT+2
itemid: 2040041 name: Scroll for Helmet for DEF 100% description: Improves DEF on headwear.\nSuccess rate:100%, weapon def.+2, magic def.+3
itemid: 2040042 name: Scroll for Helmet for HP 100% description: Improves MaxHP on headwear.\nSuccess rate:100%, MaxHP+15
itemid: 2101200 name: GMEvent_Horntail's Left Head description: GMEvent_Horntail's Left Head
itemid: 2101201 name: GMEvent_Horntail's Right Head description: GMEvent_Horntail's Right Head
itemid: 2101202 name: GMEvent_Pink Bean description: GMEvent_Pink Bean
itemid: 2022481 name: Mysterious Maple description: The excitement of waiting for an adventure makes you feel good. Weapon and Magic Defense +10.
itemid: 2022482 name: Pigmy's Wings description: Pigmy's Wings can be used to grant Speed +8.
itemid: 2022496 name: Cassandra's Star description: Blessings from the star given to explorers who participated in the Starlight Festival. Weapon and Magic Defense +5 for 15 minutes.
itemid: 2022499 name: Point Improvement Treasure Chest description: Improves point acquisition in the Biscuit Map.
itemid: 2022500 name: Point Increase Treasure Chest description: Improves point acquisition in the Biscuit Map for 1 minute.
itemid: 2022501 name: Geppetto's Writing Analysis description: Your Speed and Jump skills have increased because Geppetto has deciphered the letters.
itemid: 2022502 name: Hero's Gladius description: Tristan's Powerful Strength
itemid: 2022503 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022504 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022505 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022506 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022507 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022508 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022509 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022510 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022511 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022512 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022513 name: Golden Pig's Shiny Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022514 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022515 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022516 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022517 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022518 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022519 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022520 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022521 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022522 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022523 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022524 name: Golden Pig's Dazzling Egg description: An egg from a Golden Pig. You cannot tell what's inside. Double-click to crack it open.
itemid: 2022526 name: Azalea description: A spring flower that especially enjoys sunlight. Restores approximately 2000 HP.
itemid: 2022527 name: Forsythia description: The first flower to bloom in the spring. Restores approximately 2000 HP.
itemid: 2022528 name: Clover description: A spring flower that symbolizes good luck. Restores approximately 2000 HP.
itemid: 2022529 name: Meaning of Azaleas description: The meaning of Azaleas is love. 2x Meso drops for 30 minutes.
itemid: 2022530 name: Meaning of Forsythias description: The meaning of Forsythias is hope. 2X item drops for 30 minutes.
itemid: 2022531 name: Meaning of Clovers description: The meaning of Clovers is luck. 2X item drops for 1 hour.
itemid: 2022536 name: Underground Temple's Seal description: The Seal's energy has been placed on the Underground Temple in order to trap the Balrog inside. It restricts the abilities of all living things.
itemid: 2022537 name: Gladius' Strength description: The abilities of the person wielding the Hero's Gladius is amplified under the protection of Tristan. Weapon ATT +30 and Magic ATT +30.
itemid: 2022539 name: Cry of a Little Lamb description: Wolves slow down when they hear a lamb cry.
itemid: 2022540 name: Danger Escape description: Movement speed increased for 3 seconds.
itemid: 2022541 name: Self Protection description: Protects from a Wolf's attack 1 time.
itemid: 2022542 name: Little Lamb's Surprise Attack description: Attacks a Wolf's back, temporarily immobilizing it.
itemid: 2022543 name: Great Confusion description: Causes the sheep to become confused and lose direction.
itemid: 2022547 name: Sound of the Sheep's Bells description: Slows wolves' movement speed.
itemid: 2022548 name: Sound of the Wolf's Bells description: Sheep are temporarily unable to move.
itemid: 2022549 name: Wolf's Threat description: Intimidates the sheep, making them weaker.
itemid: 2022550 name: Sheep Ranch Golden ? Egg description: A golden egg that can only be obtained at the Sheep Ranch. It has a question mark engraved on it. Double-click to find out what's inside.
itemid: 2022552 name: 6th Anniversary Gift Box description: A gift box celebrating Maple Story's 6th Anniversary. What could be inside?\n#cCan be opened by double-clicking.#
itemid: 2022553 name: Crackers's Buff description: A buff that Crackers has placed on the Witch's Treasure. Weapon and Magic Attack +10, Defense +20, Accuracy +20, and Avoidability +20 for 40 minutes.
itemid: 2022562 name: Artifact Hunt Encouragement Buff description: A buff to encourage you upon accumulating 2,500 points in the Artifact Hunt. Attack +3, Magic Attack +6, Speed +6
itemid: 2022563 name: Artifact Hunt Encouragement Buff description: A buff to encourage you upon accumulating 4,000 points in the Artifact Hunt. Attack +5, Magic Attack +10, Speed +15
itemid: 2031006 name: Family Studio Photo Coupon description: A coupon that allows you to attend the 6th Anniversary Family Photo Shoot Event.
itemid: 2040329 name: Scroll for Earring for DEX 10% description: Improves DEX on earrings.\nSuccess rate:10%, DEX+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040330 name: Scroll for Earring for INT 10% description: Improves INT on earrings.\nSuccess rate:10%, magic attack+5, INT+3, magic defense+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040331 name: Scroll for Earring for LUK 10% description: Improves LUK on earrings.\nSuccess rate:10%, LUK+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040728 name: Balrog's STR Scroll 30% description: Improves STR on Balrog Leather Shoes.\nSuccess rate:30%, STR+2
itemid: 2040729 name: Balrog's INT Scroll 30% description: Improves INT on Balrog Leather Shoes.\nSuccess rate:30%, INT+2
itemid: 2040730 name: Balrog's LUK Scroll 30% description: Improves LUK on Balrog Leather Shoes.\nSuccess rate:30%, LUK+2
itemid: 2040731 name: Balrog's DEX Scroll 30% description: Improves DEX on Balrog Leather Shoes.\nSuccess rate:30%, DEX+2
itemid: 2040732 name: Balrog's HP Scroll 30% description: Improves HP on Balrog Leather Shoes.\nSuccess rate:30%, MaxHP+30
itemid: 2040733 name: Balrog's MP Scroll 30% description: Improves MP on Balrog Leather Shoess.\nSuccess rate:30%, MaxMP+30
itemid: 2040734 name: Balrog's Speed Scroll 30% description: Improves speed on Balrog Leather Shoes.\nSuccess rate:30%, speed+3
itemid: 2040735 name: Balrog's Jump Scroll 30% description: Improves jump on Balrog Leather Shoes.\nSuccess rate:30%, jump+3
itemid: 2040736 name: Balrog's Accuracy Scroll 30% description: Improves accuracy on Balrog Leather Shoes.\nSuccess rate:30%, accuracy+5
itemid: 2040737 name: Balrog's Avoidability Scroll 30% description: Improves avoidability on Balrog Leather Shoes.\nSuccess rate:30%, avoidability+5
itemid: 2040738 name: Balrog's Defense Scroll 30% description: Improves DEF on Balrog Leather Shoes.\nSuccess rate:30%, weapon def.+10, magic def.+10
itemid: 2040739 name: Balrog's Twilight Scroll 5% description: Improves the function of Balrog Leather Shoes.\nSuccess rate:5%, STR+4, INT+4, DEX+4, LUK+4, speed+4, jump+4, avoidability+4, accuracy+4, weapon def.+14, magic def.+14, MaxHP+40, MaxMP+40
itemid: 2040826 name: Scroll for Gloves for ATT 60% description: Improves weapon attack on gloves.\nSuccess rate:60%, weapon attack+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041100 name: Scroll for Ring for STR 100% description: Improves STR on rings.\nSuccess rate:100%, STR+1
itemid: 2041101 name: Scroll for Rings for STR 60% description: Improves STR on rings.\nSuccess rate:60%, STR+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041102 name: Scroll for Rings for STR 10% description: Improves STR on rings.\nSuccess rate:10%, STR+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041103 name: Scroll for Rings for INT 100% description: Improves INT on rings.\nSuccess rate:100%, INT+1
itemid: 2041104 name: Scroll for Rings for INT 60% description: Improves INT on rings.\nSuccess rate:60%, INT+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041105 name: Scroll for Rings for INT 10% description: Improves INT on rings.\nSuccess rate:10%, INT+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041106 name: Scroll for Rings for DEX 100% description: Improves DEX on rings.\nSuccess rate:100%, DEX+1
itemid: 2041107 name: Scroll for Rings for DEX 60% description: Improves DEX on rings.\nSuccess rate:100%, DEX+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041108 name: Scroll for Rings for DEX 10% description: Improves DEX on rings.\nSuccess rate:10%, DEX+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041109 name: Scroll for Rings for LUK 100% description: Improves LUK on rings.\nSuccess rate:100%, LUK+1
itemid: 2041110 name: Scroll for Rings for LUK 60% description: Improves LUK on rings.\nSuccess rate:60%, LUK+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041111 name: Scroll for Rings for LUK 10% description: Improves LUK on rings.\nSuccess rate:10%, LUK +3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041112 name: Dark Scroll for Rings for STR 70% description: Improves STR on rings.\nSuccess rate:70%, STR+2.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041113 name: Dark Scroll for Rings for STR 30% description: Improves STR on rings.\nSuccess rate:30%, STR+3.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041114 name: Dark Scroll for Rings for INT 70% description: Improves INT on rings.\nSuccess rate:70%, INT+2.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041115 name: Dark Scroll for Rings for INT 30% description: Improves INT on rings.\nSuccess rate:30%, INT+3.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041116 name: Dark Scroll for Rings for DEX 70% description: Improves DEX on rings.\nSuccess rate:70%, DEX+2.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041117 name: Dark Scroll for Rings for DEX 30% description: Improves DEX on rings.\nSuccess rate:30%, DEX+3.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041118 name: Dark Scroll for Rings for LUK 70% description: Improves LUK on rings.\nSuccess rate:70%, LUK+2.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041119 name: Dark Scroll for Rings for LUK 30% description: Improves LUK on rings.\nSuccess rate:30%, LUK+3.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041300 name: Scroll for Belts for STR 100% description: Improves STR on belts.\nSuccess rate:100%, STR+1
itemid: 2041301 name: Scroll for Belts for STR 60% description: Improves STR on belts.\nSuccess rate:60%, STR+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041302 name: Scroll for Belts for STR 10% description: Improves STR on belts.\nSuccess rate:10%, STR+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041303 name: Scroll for Belts for INT 100% description: Improves INT on belts.\nSuccess rate:100%, INT+1
itemid: 2041304 name: Scroll for Belts for INT 60% description: Improves INT on belts.\nSuccess rate:60%, INT+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041305 name: Scroll for Belts for INT 10% description: Improves INT on belts.\nSuccess rate:10%, INT+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041306 name: Scroll for Belts for DEX 100% description: Improves DEX on belts.\nSuccess rate:100%, DEX+1
itemid: 2041307 name: Scroll for Belts for DEX 60% description: Improves DEX on belts.\nSuccess rate:60%, DEX+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041308 name: Scroll for Belts for DEX 10% description: Improves DEX on belts.\nSuccess rate:10%, DEX+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041309 name: Scroll for Belts for LUK 100% description: Improves LUK on belts.\nSuccess rate:100%, LUK+1
itemid: 2041310 name: Scroll for Belts for LUK 60% description: Improves LUK on belts.\nSuccess rate:60%, LUK+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041311 name: Scroll for Belts for LUK 10% description: Improves LUK on belts.\nSuccess rate:10%, LUK+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2041312 name: Dark Scroll for Belts for STR 70% description: Improves STR on belts.\nSuccess rate:70%, STR+2.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041313 name: Dark Scroll for Belts for STR 30% description: Improves STR on belts.\nSuccess rate:30%, STR+3.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041314 name: Dark Scroll for Belts for INT 70% description: Improves INT on belts.\nSuccess rate:70%, INT+2.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041315 name: Dark Scroll for Belts for INT 30% description: Improves INT on belts.\nSuccess rate:30%, INT+3.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041316 name: Dark Scroll for Belts for DEX 70% description: Improves DEX on belts.\nSuccess rate:70%, DEX+2.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041317 name: Dark Scroll for Belts for DEX 30% description: Improves DEX on belts.\nSuccess rate:30%, DEX+3.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041318 name: Dark Scroll for Belts for LUK 70% description: Improves LUK on belts.\nSuccess rate:70%, LUK+2.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2041319 name: Dark Scroll for Belts for LUK 30% description: Improves LUK on belts.\nSuccess rate:30%, LUK+3.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2044015 name: Scroll for Two-Handed Swords for ATT 10% description: Improves weapon attack on two-handed swords.\nSuccess rate:10%, weapon attack+5, STR+3, weapons def.+1
itemid: 2049105 name: [6th Anniversary] Dark Scroll for Gloves for ATT 70% description: Improves weapon attack on gloves.\nSuccess rate:70%, weapon attack+1.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2049106 name: [6th Anniversary] Dark Scroll for Gloves for ATT 30% description: Improves weapon attack on gloves.\nSuccess rate:30%, weapon attack+2.\nIf unsuccessful, item has an 80% chance of being destroyed.
itemid: 2049107 name: [6th Anniversary] Dark Scroll for Gloves for STR 70% description: Improves STR on gloves.\nSuccess rate:70%, accuracy+2, STR+1.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2049108 name: [6th Anniversary] Dark Scroll for Gloves for LUK 70% description: Improves LUK on gloves.\nSuccess rate:70%, accuracy+2, LUK+1.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2049109 name: [6th Anniversary] Dark Scroll for Gloves for INT 70% description: Improves INT on gloves.\nSuccess rate:70%, accuracy+2, INT+1.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2049110 name: [6th Anniversary] Dark Scroll for Gloves for DEX 70% description: Improves DEX on gloves.\nSuccess rate:70%, accuracy+2, DEX+1.\nIf unsuccessful, item has a 50% chance of being destroyed.
itemid: 2100108 name: Master of Disguise Summoning Sack description: Summons the Master of Disguise.
itemid: 2100109 name: Black Witch Summoning Summoning Sack description: Summons the Black Witch.
itemid: 2100110 name: Blue Mushroom Summoning Sack description: Summons a group of Blue Mushrooms.
itemid: 2100111 name: Puppeteer Summoning Sack description: Summons the Puppeteer.
itemid: 2100113 name: Tristan's Balrog Summon description: Summons Tristan's Balrog.
itemid: 2100120 name: Snail Summoning Sack description: Summons a group of Snails.
itemid: 2100121 name: Slime Summoning Sack description: Summons a group of Slimes.
itemid: 2100122 name: Green Mushroom Summoning Sack description: Summons a group of Green Mushrooms.
itemid: 2100123 name: Octopus Summoning Sack description: Summons a group of Octopuses.
itemid: 2100124 name: Pig Summoning Sack description: Summons a group of Pigs.
itemid: 2100125 name: Ribbon Pig Summoning Sack description: Summons a group of Ribbon Pigs.
itemid: 2100126 name: Orange Mushroom Summoning Sack description: Summons a group of Orange Mushrooms.
itemid: 2100127 name: Bubbling Summoning Sack description: Summons a group of Bubblings.
itemid: 2100128 name: Horny Mushroom Summoning Sack description: Summons a group of Horny Mushrooms.
itemid: 2100129 name: Jr. Necki Summoning Sack. description: Summons Jr. Necki.
itemid: 2100130 name: Blue Mushroom Summoning Sack description: Summons a group of Blue Mushrooms.
itemid: 2100131 name: Tristan's Balrog Summoning Sack description: Summons Tristan's Balrog.
itemid: 2100132 name: Balrog Summoning Sack description: Balrog Summoning Sack
itemid: 2100133 name: Balrog's Spirit description: Balrog's Spirit
itemid: 2100134 name: Rescued Gaga Summoning Sack description: Summons Gaga, who has been rescued.
itemid: 2100135 name: Test MOB Summoning Sack description: Test MOB Summoning Sack
itemid: 2100136 name: Easy Mode Balrog Summoning Sack description: Easy Mode Balrog Summoning Sack
itemid: 2100137 name: Easy Mode Balrog's Spirit description: Easy Mode Balrog's Spirit
itemid: 2100138 name: Puppeteer Summoning Sack description: Summons the Puppeteer.
itemid: 2100139 name: Puppeteer Summoning Sack description: Summons the Puppeteer.
itemid: 2100140 name: Puppeteer Summong Sack description: Summons the Puppeteer.
itemid: 2101110 name: Monster Summoning Sack(Leviathan) description: Summons 1 Leviathan.
itemid: 2210004 name: Blue Ribbon Pig Piece description: A crystal piece that resembles Blue Ribbon Pig. When used, the crystal will melt into the body, and its mythical power will transform the user into Blue Ribbon Pig. This mythical power will last for an hour.
itemid: 2100900 name: Mysterious Sack description: Cassandra says that it's impossible to know what monsters will be summoned from this sack, but it may summon special, hard-to-find monsters.
itemid: 2109004 name: Steal Sheep Wool description: Summons a bomb to steel wool from sheep.
itemid: 2109005 name: Plant a Rose Thorn description: Plants a Rose Thorn Bush to keep Wolves away.
itemid: 2210030 name: Geppetto Transformation description: You've entered a fable and transformed into Geppetto. You feel a bit sluggish, but do your best to leave the dungeon with your party members.
itemid: 2210034 name: Alien Gray Transformation description: The mysterious force emanating from the crystal statue shall be absorbed into your body, and you will no longer find yourself as you are.
itemid: 2210035 name: Penguin Transformation 1 description: Will transform you into a penguin.
itemid: 2210036 name: Penguin Transformation 2 description: Will transform you into a penguin.
itemid: 2210037 name: Penguin Transformation 3 description: Will transform you into a penguin.
itemid: 2210038 name: Penguin Transformation 4 description: Will transform you into a penguin.
itemid: 2210039 name: Penguin Transformation 5 description: Will transform you into a penguin.
itemid: 2360002 name: Board the Spaceship description: Let's go rescue Gaga!
itemid: 2388055 name: Balrog Card description: A card that features a Balrog.\n#cIncreases the Item/Meso drop rates in the central dungeon of Victoria.#
itemid: 2430006 name: Mysterious Piece of Paper description: It's full of mysterious scribbles.\n#cA quest will begin when you double-click it.#
itemid: 2430007 name: Empty Compass description: A compass with no markings. However, it can be turned into a working compass if you have the letters #cN,E,W,S#.
itemid: 2430008 name: Golden Compass description: A golden compass that reveals the location of Gold Richie's Treasure Island.\n#cBy double-clicking it# you can move to the island.
itemid: 2430009 name: Pure Perfume description: A perfume that contains the scent of an inexperienced adventurer.\n#cBy double-clicking on it#, that scent is released to confuse monsters.
itemid: 2430010 name: Mysterious Artifact description: An artifact with an unknown date of origin.\n#cDouble-click# on it to find out its date of origin.
itemid: 2430011 name: Agent Summon description: Summons Agents. (For GM Event Use)
itemid: 2430012 name: Agent Removal description: Removes Agents. (For GM Event Use)
itemid: 2022476 name: Chicken Kapitan description: A popular Malaysian dish. This mild curry contains chicken pieces with rich coconut milk, onions and spices.\nRecovers 4000 HP.
itemid: 2022477 name: Mee Siam description: A popular Malaysian dish made up of thin rice noodles. Served with salted soy beans, dried bean curd, boiled egg and tamarind.\nRecovers 4000 MP.
itemid: 2022478 name: Rojak description: This famous dish is served with generous amounts of sweet thick, spicy peanut sauce with bean curds, prawn fritters, hard-boiled eggs and bean sprouts.\nRecovers 1000 HP and 1000 MP.
itemid: 2022479 name: Kangkung belacan description: This spicy vegetable dish is served with KanKung (water spinach) and spicy sambal.\nImproves Weapon Attack and Magic Attack +8 for 10 minutes.
itemid: 2022480 name: Kuih description: These sweet, bite-sized delights are a favorite pastry dish served during parties and just for tea.\nImproves Speed +10 for 30 minutes.
itemid: 2044713 name: Scroll for Claw for ATT 50% description: Improves weapon attack on claws.\nSuccess rate:50%, weapon attack+5, LUK+1, DEX+1
itemid: 2044613 name: Scroll for Crossbow for ATT 50% description: Improves weapon attack on crossbows.\nSuccess rate:50%, weapon attack+5, DEX+1, STR+1
itemid: 2044513 name: Scroll for Bow for ATT 50% description: Improves weapon attack on bows.\nSuccess rate:50%, weapon attack+5, DEX+1, STR+1
itemid: 2044420 name: Scroll for Pole Arm for ATT 50% description: Improves weapon attack on pole arms.\nSuccess rate:50%, weapon attack+5, STR+3, DEX+1
itemid: 2044320 name: Scroll for Spear for ATT 50% description: Improves weapon attack on spears.\nSuccess rate:50%, weapon attack+5, STR+3, DEX+1
itemid: 2044220 name: Scroll for Two-handed BW for ATT 50% description: Improves weapon attack on two-handed blunt weapons.\nSuccess rate:50%, weapon attack+5, STR+3, DEX+1
itemid: 2044120 name: Scroll for Two-handed Axe for ATT 50% description: Improves weapon attack on two-handed axes.\nSuccess rate:50%, weapon attack+5, STR+3, DEX+1
itemid: 2044028 name: Scroll for Two-handed Sword for ATT 50% description: Improves weapon attack on two-handed swords.\nSuccess rate:50%, weapon attack+5, STR+3, DEX+1
itemid: 2043813 name: Scroll for Staff for Magic Att. 50% description: Improves magic attack on staffs.\nSuccess rate:50%, magic attack+5, INT+3, LUK+1
itemid: 2043713 name: Scroll for Wand for Magic Att. 50% description: Improves magic attack on wands.\nSuccess rate:50%, magic attack+5, INT+3, LUK+1
itemid: 2043313 name: Scroll for Dagger for ATT 50% description: Improves weapon attack on daggers.\nSuccess rate:50%, weapon attack+5, LUK+3, DEX+1
itemid: 2043220 name: Scroll for One-Handed BW for ATT 50% description: Improves weapon attack on one-handed blunt weapons.\nSuccess rate:50%, weapon attack+5, STR+3, DEX+1
itemid: 2043120 name: Scroll for One-Handed Axe for ATT 50% description: Improves weapon attack on one-handed axes.\nSuccess rate:50%, weapon attack+5, STR+3, DEX+1
itemid: 2043022 name: Scroll for One-Handed Sword for ATT 50% description: Improves weapon attack on one-handed swords.\nSuccess rate:50%, weapon attack+5, STR+3, DEX+1
itemid: 2041068 name: Scroll for Cape for Magic Def. 50% description: Improves magic def. on capes.\nSuccess rate:50%, magic def.+5, weapon def.+4
itemid: 2041069 name: Scroll for Cape for Weapon Def. 50% description: Improves weapon def. on capes.\nSuccess rate:50%, weapon def.+5, magic def.+4
itemid: 2040943 name: Scroll for Shield for DEF 50% description: Improves weapon def. on shields.\nSuccess rate:50%, weapon def.+5, magic def.+4
itemid: 2040833 name: Scroll for Gloves for DEX 50% description: Improves DEX on gloves.\nSuccess rate:50%, accuracy+3, DEX+3, avoidability+2
itemid: 2040834 name: Scroll for Gloves for ATT 50% description: Improves weapon attack on gloves.\nSuccess rate:50%, weapon attack+3
itemid: 2040755 name: Scroll for Shoes for DEX 50% description: Improves DEX on shoes.\nSuccess rate:50%, avoidability+3, accuracy+3, speed+2
itemid: 2040756 name: Scroll for Shoes for Jump 50% description: Improves jump on shoes.\nSuccess rate:50%, jump+6, speed+1
itemid: 2040757 name: Scroll for Shoes for Speed 50% description: Improves speed on shoes.\nSuccess rate:50%, speed+3, jump+1
itemid: 2040629 name: Scroll for Bottomwear for DEF 50% description: Improves DEF on bottomwear.\nSuccess rate:50%, weapon def.+5, magic def.+4
itemid: 2040542 name: Scroll for Overall Armor for DEX 50% description: Improves DEX on overalls.\nSuccess rate:50%, DEX+5, avoidability+1, speed+1
itemid: 2040543 name: Scroll for Overall Armor for DEF 50% description: Improves DEF on overalls.\nSuccess rate:50%, weapon def.+5, magic def.+4
itemid: 2040429 name: Scroll for Topwear for DEF 50% description: Improves DEF on topwear.\nSuccess rate:50%, weapon def.+5, magic def.+4
itemid: 2040333 name: Scroll for Earring for INT 50% description: Improves INT on earrings.\nSuccess rate:50%, magic attack+5, INT+3, magic def.+2
itemid: 2040045 name: Scroll for Helmet for DEF 50% description: Improves DEF on headwear.\nSuccess rate:50%, weapon def.+5, magic def.+4
itemid: 2040046 name: Scroll for Helmet for HP 50% description: Improves MaxHP on headwear.\nSuccess rate:50%, MaxHP+35
itemid: 2101207 name: A Parasite Summoning Sack description: Summons A Parasite
itemid: 2101208 name: Andras Summoning Sack description: Summons Andras
itemid: 2101209 name: Marbas Summoning Sack description: Summons Marbas
itemid: 2101210 name: Amdusias Summoning Sack description: Summons Amdusias
itemid: 2101211 name: Valefor Summoning Sack description: Summons Valefor
itemid: 2101212 name: Crocell Summoning Sack description: Summons Crocell
itemid: 2101213 name: Astaroth Summoning Sack description: Summons Astaroth
itemid: 2022623 name: Seasoned Frog Eggs and Mushrooms description: A stinky dish made with Cursed Frog Eggs. Increases 400 HP if eaten.
itemid: 2022624 name: Bloody Mushroom Wine description: A non-alcoholic wine made by the Witch using Cursed Cat Spittle. Increases 200 MP when consumed.
itemid: 2022625 name: Slimy Canape description: A creepy and slimy Canape that the Witch has made for you. Increases Weapon ATT and Weapon DEF +15 for 15 minutes.
itemid: 2022626 name: Zingy Kabab description: A suspiciously sharp-tasting Kabab that the Witch has made for you. Increases Magic ATT and Magic DEF +15 for 15 minutes.
itemid: 2022627 name: Swamp Wrap description: The Witch's wrap dish that fills your mouth with the aroma of the swamp with each bite. Increases Weapon ATT and Weapon DEF +25 for 15 minutes.
itemid: 2022628 name: Rough Leather Steak description: A rough leather steak that the Witch has carefully grilled for you. Increases Magic ATT and Magic Defense +25 for 15 minutes.
itemid: 2022629 name: Witch's Special Stew description: The Witch's special stew that gives off a sour stink. Increases Weapon and Magic ATT +40, Weapons and Magic DEF +100, and Speed and Jump +15 for 15 minutes.
itemid: 2049113 name: Normal Witch Scroll description: A scroll that, depending on chance, will either improve or worsen the Talking Witch Hat or Broomstick obtained from the Witch.
itemid: 2049114 name: Witch's Belt Scroll description: A scroll that, depending on chance, will either improve or worsen the Witch's Belts obtained from the Witch.
itemid: 2101203 name: Suspicious Black Sack description: A sack that Cassandra gave you as a gift. On it appears a note that reads "Open with Friends."
itemid: 2101204 name: Olivia (30) Monster Sack description: Sack containing a Lv. 30 Olivia.
itemid: 2101205 name: Olivia (50) Monster Sack description: Sack containing a Lv. 50 Olivia.
itemid: 2101206 name: Olivia (70) Monster Sack description: Sack containing a Lv. 70 Olivia.
itemid: 2210043 name: Leech Costume description: An offensive-looking leech costume. Can be worn to trick your friends.
itemid: 2022634 name: Turkey Leg description: A huge roasted turkey leg. It's so big that it seems like it would take all day to finish eating.\n[Gives +30 Physical Attack for 3 minutes]
itemid: 2101236 name: GMEvent_Pink Bean2 description: GMEvent_Pink Bean2
itemid: 2000022 name: Special Rien Red Potion description: A special bottle of potion consisting of herbs that only grow in Rien.\nRecovers HP +100.
itemid: 2000023 name: Special Rien Blue Potion description: A special bottle of potion consisting of herbs that only grow in Rien.\nRecovers MP +50.
itemid: 2002030 name: Angelic Steps description: Allows one to move fast.\nWill increase your speed for 10 minutes.
itemid: 2012005 name: Angel Apple description: A red, ripe apple.\nRecovers 200 HP.
itemid: 2012006 name: Angel Lemon description: A very sour fruit.\nRecovers 200 MP.
itemid: 2022564 name: Aran Paper Box description: A paper box containing a special present commemorating the Aran release. It is well-packed, so you may need to #cdouble-click# to open.
itemid: 2022570 name: King Pepe Warrior Weapon Box description: King Pepe's box containing a Warrior weapon.
itemid: 2022571 name: King Pepe Magician Weapon Box description: King Pepe's box containing a Magician weapon.
itemid: 2022572 name: King Pepe Bowman Weapon Box description: King Pepe's box containing a Bowman weapon.
itemid: 2022573 name: King Pepe Thief Weapon Box description: King Pepe's box containing a Thief weapon.
itemid: 2022574 name: King Pepe Pirate Weapon Box description: King Pepe's box containing a Pirate weapon.
itemid: 2022575 name: King Pepe Warrior Armor Box description: King Pepe's box containing armor for Warriors.
itemid: 2022576 name: King Pepe Magician Armor Box description: King Pepe's box containing armor for Magicians.
itemid: 2022577 name: King Pepe Bowman Armor Box description: King Pepe's box containing armor for Bowmen.
itemid: 2022578 name: King Pepe Thief Armor Box description: King Pepe's box containing armor for Thieves.
itemid: 2022579 name: King Pepe Pirate Armor Box description: King Pepe's box containing armor for Pirates.
itemid: 2022580 name: King Pepe Warrior Box description: King Pepe's box containing an equipment item for Warriors.
itemid: 2022581 name: King Pepe Magician Box description: King Pepe's box containing an equipment item for Magicians.
itemid: 2022582 name: King Pepe Bowman Box description: King Pepe's box containing an equipment item for Bowmen.
itemid: 2022583 name: King Pepe Thief Box description: King Pepe's box containing an equipment item for Thieves.
itemid: 2022584 name: King Pepe Pirate Box description: King Pepe's box containing an equipment item for Pirates.
itemid: 2022585 name: Pharaoh's Blessing Lv. 1 description: 100% Damage, Attack Speed +1
itemid: 2022586 name: Pharaoh's Blessing Lv. 2 description: 200% Damage, Attack Speed +2
itemid: 2022587 name: Pharaoh's Blessing Lv. 3 description: 300% Damage, Attack Speed +3
itemid: 2022588 name: Pharaoh's Blessing Lv. 4 description: 400% Damage, Attack Speed +4
itemid: 2022613 name: Pharaoh's Treasure Chest description: A treasure chest containing Pharaoh's treasured items. Double-click to open.
itemid: 2022614 name: Bingo Gift Box description: A surprise gift box received after completing a line on the Bingo Board. Open it to discover what's inside!
itemid: 2022615 name: Subway Lost and Found description: A Lost and Found box accidentally ingested by Bubbling. Double-click to open.
itemid: 2022616 name: Power Buff Lv. 1 description: 100% Damage, Attack Speed +1
itemid: 2022617 name: Power Buff Lv. 2 description: 200% Damage, Attack Speed +2
itemid: 2022618 name: Pharaoh's Treasure Chest description: A treasure chest containing Pharaoh's precious items. Double-click to open.
itemid: 2031008 name: Rien Teleport Ticket description: A teleport ticket given by the Maple Admin. It will immediately teleport you to Rien.
itemid: 2043021 name: King Pepe's 60% Scroll for One-handed Sword Attacks description: Improves the attack strength of King Pepe's Cutlass.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043116 name: King Pepe's 60% Scroll for One-handed Axe Attacks description: Improves the attack strength of King Pepe's Danker.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043216 name: King Pepe's 60% Scroll for One-handed BW Attacks description: Improves the attack strength of King Pepe's Heavy Hammer.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043311 name: King Pepe's 60% Scroll for Dagger Attacks description: Improves the attack strength of King Pepe's Gephart.\nSuccess rate:60%, weapon attack+2, LUK+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043711 name: King Pepe's 60% Scroll for Wand Magic Attacks description: Improves the magic attack strength of King Pepe's Wizard Wand.\nSuccess rate:60%, magic attack+2, INT+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2043811 name: King Pepe's 60% Scroll for Staff Magic Attacks description: Improves the magic attack strength of King Pepe's Petal Staff.\nSuccess rate:60%, magic attack+2, INT+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044024 name: King Pepe's 60% Scroll for Two-handed Sword Attacks description: Improves the attack strength of King Pepe's Highlander.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044116 name: King Pepe's 60% Scroll for Two-handed Axe Attacks description: Improves the attack strength of King Pepe's Niam.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044216 name: King Pepe's 60% Scroll for Two-handed BW Attacks description: Improves the attack strength of King Pepe's Big Hammer.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044316 name: King Pepe's 60% Scroll for Spear Attacks description: Improves the attack strength of King Pepe's Nakamaki.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044416 name: King Pepe's 60% Scroll for Polearm Attacks description: Improves the attack strength of King Pepe's Axe Polearm.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044511 name: King Pepe's 60% Scroll for Bow Attacks description: Improves the attack strength of King Pepe's Red Viper.\nSuccess rate:60%, weapon attack+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044611 name: King Pepe's 60% Scroll for Crossbow Attacks description: Improves the attack strength of King Pepe's Eagle Crow.\nSuccess rate:60%, weapon attack+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044711 name: King Pepe's 60% Scroll for Thief Attacks description: Improves the attack strength of King Pepe's Dark Guardian.\nSuccess rate:60%, weapon attack+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044816 name: King Pepe's 60% Scroll for Knuckle Attacks description: Improves the attack strength of King Pepe's Silver Maden.\nSuccess rate:60%, weapon attack+2, STR+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044909 name: King Pepe's 60% Scroll for Gun Attacks description: Improves the attack strength of King Pepe's Shooting Star.\nSuccess rate:60%, weapon attack+2, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2049112 name: King Pepe's 100% Scroll for Weapons description: Improves or decreases the effectiveness of King Pepe weapons.\nSuccess rate:100%
itemid: 2100160 name: Gray Yeti and King Pepe Summoning Bag description: Summons Gray Yeti and King Pepe.
itemid: 2100161 name: Gold Yeti and King Pepe Summoning Bag description: Summons Gold Yeti and King Pepe.
itemid: 2100162 name: White Yeti and King Pepe Summoning Bag description: Summons White Yeti and King Pepe.
itemid: 2100163 name: Prime Minister Summoning Bag description: Summons Prime Minister.
itemid: 2109006 name: Pharaoh Yeti Summoning Bag description: Summons Pharaoh Yeti.
itemid: 2109007 name: Pharaoh Yeti Summoning Bag description: Summons Pharaoh Yeti in 90 seconds.
itemid: 2109008 name: Bubbling Summoning Bag description: For use in the restricted bonus map area of the subway station.
itemid: 2109009 name: Jr. Yeti Pharaoh Summoning Bag description: Summons Jr. Yeti Pharaoh for the bonus stage of Nett's Pyramid (Easy, Normal, Hard)
itemid: 2109010 name: Jr. Yeti Pharaoh Summoning Bag description: Summons Jr. Yeti Pharaoh for the bonus stage of Nett's Pyramid (Hell Mode)
itemid: 2280013 name: [Skill Book] Final Blow description: Skill Book from which you can learn about the #cFinal Blow# skill.\nJob: 4th Advancement Aran\nCondition: #cFinal Blow# not available
itemid: 2280014 name: [Skill Book] High Defense description: Skill Book from which you can learn about the #cHigh Defense# skill.\nJob: 4th Advancement Aran\nCondition: #cHigh Defense# not available
itemid: 2280015 name: [Skill Book] Combo Tempest description: Skill Book from which you can learn about the #cCombo Tempest# skill.\nJob: 4th Advancement Aran\nCondition: #cCombo Tempest# not available
itemid: 2280017 name: [Skill Book] Pig's Weakness description: Skill Book from which you can learn about the #cPig's Weakness# skill.\nCondition: #cPig's Weakness# not available
itemid: 2280016 name: [Skill Book] Combo Barrier description: Skill Book from which you can learn about the #cCombo Barrier# skill.\nJob: 4th Advancement Aran\nCondition: #cCombo Barrier# not available
itemid: 2280018 name: [Skill Book] Stump's Weakness description: Skill Book from which you can learn about the #cStump's Weakness# skill.\nCondition: #cStump's Weakness# not available
itemid: 2280019 name: [Skill Book] Slime's Weakness description: Skill Book from which you can learn about the #cSlime's Weakness# skill.\nCondition: #cSlime's Weakness# not available
itemid: 2290126 name: [Mastery Book] Overswing description: This increases the master level of #cOverswing# to 20 with a 70% chance of success.\nJob: Aran\nCondition: At least level 5 in this skill
itemid: 2290127 name: [Mastery Book] Overswing description: This increases the master level of #cOverswing# to 30 with a 50% chance of success.\nJob: Aran\nCondition: At least level 15 in this skill
itemid: 2290128 name: [Mastery Book] High Mastery description: This increases the master level of #cHigh Mastery# to 20 with a 70% chance of success.\nJob: Aran\nCondition: At least level 5 in this skill
itemid: 2290129 name: [Mastery Book] High Mastery description: This increases the master level of #cHigh Mastery# to 30 with a 50% chance of success.\nJob: Aran\nCondition: At least level 15 in this skill
itemid: 2290130 name: [Mastery Book] Freeze Standing description: This increases the master level of #cFreeze Standing# to 20 with a 70% chance of success.\nJob: Aran\nCondition: At least level 5 in this skill
itemid: 2290131 name: [Mastery Book] Freeze Standing description: This increases the master level of #cFreeze Standing# to 30 with a 50% chance of success.\nJob: Aran\nCondition: At least level 15 in this skill
itemid: 2290132 name: [Mastery Book] Final Blow description: This increases the master level of #cFinal Blow# to 20 with a 70% chance of success.\nJob: Aran\nCondition: At least level 5 in this skill
itemid: 2290133 name: [Mastery Book] Final Blow description: This increases the master level of #cFinal Blow# to 30 with a 50% chance of success.\nJob: Aran\nCondition: At least level 15 in this skill
itemid: 2290134 name: [Mastery Book] High Defense description: This increases the master level of #cHigh Defense# to 20 with a 70% chance of success.\nJob: Aran\nCondition: At least level 5 in this skill
itemid: 2290135 name: [Mastery Book] High Defense description: This increases the master level of #cHigh Defense# to 30 with a 50% chance of success.\nJob: Aran\nCondition: At least level 15 in this skill
itemid: 2290136 name: [Mastery Book] Combo Tempest description: This increases the master level of #cCombo Tempest# to 20 with a 70% chance of success.\nJob: Aran\nCondition: At least level 5 in this skill
itemid: 2290137 name: [Mastery Book] Combo Tempest description: This increases the master level of #cCombo Tempest# to 30 with a 50% chance of success.\nJob: Aran\nCondition: At least level 15 in this skill
itemid: 2290138 name: [Mastery Book] Combo Barrier description: This increases the master level of #cCombo Barrier# to 20 with a 70% chance of success.\nJob: Aran\nCondition: At least level 5 in this skill
itemid: 2290139 name: [Mastery Book] Combo Barrier description: This increases the master level of #cCombo Barrier# to 30 with a 50% chance of success.\nJob: Aran\nCondition: At least level 15 in this skill
itemid: 2380014 name: Dejected Green Mushroom Card description: A card featuring the Dejected Green Mushroom.
itemid: 2380015 name: Muru Card description: A card featuring Muru.
itemid: 2380016 name: Murupa Card description: A card featuring Murupa.
itemid: 2380017 name: Murupia Card description: A card featuring Murupia.
itemid: 2380018 name: MuruMuru Card description: A card featuring MuruMuru.
itemid: 2380019 name: Murukun Card description: A card featuring Murukun.
itemid: 2381082 name: Smiling Ghost Stump Card description: A card featuring the Smiling Ghost Stump.
itemid: 2381083 name: Annoyed Zombie Mushroom Card description: A card featuring the Annoyed Zombie Mushroom.
itemid: 2382092 name: Renegade Spore Card description: A card featuring Renegade Spores.\n#cWhen hunting in the Mushroom Castle, Avoidability+1
itemid: 2382093 name: Poison Mushroom Card description: A card featuring the Poison Mushroom.\n#cWhen hunting in the Mushroom Castle, Accuracy+1
itemid: 2382094 name: Intoxicated Pig Card description: A card featuring the Intoxicated Pig.\n#cWhen hunting in the Mushroom Castle, Speed+1
itemid: 2382095 name: Helmet Pepe Card description: A card featuring Helmet Pepe.\n#cWhen hunting in the Mushroom Castle, Jump+1
itemid: 2382096 name: Royal Guard Pepe Card description: A card featuring Royal Guard Pepe.\n#cWhen hunting in the Mushroom Castle, Speed+1
itemid: 2388052 name: Giant Centipede Card description: A card that features Giant Centipede.\n#cItem drop rates are increased at Herb Town#
itemid: 2388053 name: Blue Mushmom Card description: A card that features Blue Mushmom.\n#cItem drop rates are increased at Korean Folk Town#
itemid: 2388054 name: Snack Bar Card description: A card that features Snack Bar.\n#cItem drop rates are increased at Drake's area#
itemid: 2388067 name: Gray Yeti and King Pepe Card description: A card featuring the Gray Yeti and King Pepe.\n#cIncreases the item drop rate when used inside the Mushroom Castle.#
itemid: 2388068 name: Gold Yeti and King Pepe Card description: A card featuring the Gold Yeti and King Pepe.\n#cIncreases the item drop rate when used inside the Mushroom Castle.#
itemid: 2388069 name: White Yeti and King Pepe Card description: A card featuring the White Yeti and King Pepe.\n#cIncreases the item drop rate when used inside the Mushroom Castle.#
itemid: 2388070 name: Prime Minister Mushroom Card description: A card featuring the Prime Minister Mushroom.\n#cIncreases the item/meso drop rate when used inside the Mushroom Castle.#
itemid: 2430013 name: Peng Peng Popsicle description: A frozen popsicle that tranforms you into a Peng Peng. There's no determining the type of Peng Peng you'll transform into.
itemid: 2430014 name: Killer Mushroom Spore description: A powerful chemical extracted from a Poison Mushroom. Helps you remove sprawling, thorny magic barriers in the forest.
itemid: 2430015 name: Thorn Remover description: A magic powder that eliminates the thorns from sprawling vines.
itemid: 2430016 name: Crystal Chest description: A chest full of items that's sure to excite anyone who sees it. Open it by August 31st, 2009, or it'll disappear.
itemid: 2450000 name: Hunter's Luck description: For 30 minutes, doubles your EXP from hunting.
itemid: 2040758 name: Scroll for Shoes for ATT description: Improves weapon attack on shoes.\nSuccess rate:100%, weapon attack+1
itemid: 2040759 name: Scroll for Shoes for ATT description: Improves weapon attack on shoes.\nSuccess rate:60%, weapon attack+2. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2040760 name: Scroll for Shoes for ATT description: Improves weapon attack on shoes.\nSuccess rate:10%, weapon attack+3. The success rate of this scroll can be enhanced by Vega's Spell.
itemid: 2044815 name: Scroll for Knuckler for Attack 100% description: Improves weapon attack on knuckles.\nSuccess rate:100%, weapon attack+2, STR+1
itemid: 2044817 name: Scroll for Knuckler for Attack 50% description: Improves weapon attack on knuckles.\nSuccess rate:50%, weapon attack+5, STR+3, DEX+1
itemid: 2044908 name: Scroll for Gun for Attack 100% description: Improves weapon attack on guns.\nSuccess rate:100%, weapon attack+2, accuracy+1
itemid: 2044910 name: Scroll for Gun for Attack 50% description: Improves weapon attack on guns.\nSuccess rate:50%, weapon attack+5, LUK+1, DEX+1
itemid: 2022544 name: White Elixir description: A legendary potion.\nRecovers 50% HP and MP and cancels abnormal statuses. It can recover all abnormal statuses.
itemid: 2022545 name: Dynamite Drink EX description: A drink with "Energy Boost" written on the label. Consuming this drink will grant ATT +25, MP +30, DEF +30, and Jump +10 for 30 minutes.
itemid: 2022546 name: Energy Drink description: Consuming this drink will increase MAX HP for a set amount of time.
itemid: 2430032 name: Black Bag description: A black bag you received from Hiver, a member of the Black Wings. Release it in front of the Safe...
itemid: 2430030 name: Golden Compass description: A golden compass that will lead you to Goldrich's Treasure Island.\n#cDouble-click it to# be transported to the Treasure Island.
itemid: 2430029 name: Mystery Box  description: A box whose contents are unknown, though a Yellow Butterfly might just be hidden inside.
itemid: 2430028 name: Mystery Box  description: A box whose contents are unknown, though a Yellow Butterfly might just be hidden inside. It will be empty if opened by a character higher than Lv. 101.
itemid: 2430027 name: Mystery Box  description: A box whose contents are unknown, though a Yellow Butterfly might just be hidden inside. It will be empty if opened by a character higher than Lv. 71.
itemid: 2430026 name: Mystery Box  description: A box whose contents are unknown, though a Yellow Butterfly might just be hidden inside. It will be empty if opened by a character higher than Lv. 41.
itemid: 2430031 name: Instant Camera description: An instant camera that can be used to take a picture of the moon. To take a picture of the moon, double-click on the moon that can be seen from town. If you fail to capture the picture, return to the Moon Bunny for another instant camera.
itemid: 2100164 name: Black Wing Henchman Summoning Sack description: Summons the Black Wing's Henchman
itemid: 2100165 name: Hiver Summoning Sack description: Summons Hiver
itemid: 2100152 name: Giant Summoning Sack description: Summons the Giant
itemid: 2100153 name: Shadow Knight Summoning Sack description: Summons the Shadow Knight
itemid: 2100154 name: Gentleman Summoning Sack description: Summons the Gentleman
itemid: 2100155 name: Master of Disguise Summoning Sack description: Summons the Master of Disguise
itemid: 2100159 name: Transformed Tru Summoning Sack description: Summons Transformed Tru
itemid: 2049200 name: Dark Scroll for Accessory for STR 70%   description: Improves STR on accessories (pendants, belts, rings).\nSuccess rate:70%, STR+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049201 name: Dark Scroll for Accessory for STR 30% description: Improves STR on accessories (pendants, belts, rings).\nSuccess rate:30%, STR+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049202 name: Dark Scroll for Accessory for DEX 70% description: Improves DEX on accessories (pendants, belts, rings).\nSuccess rate:70%, DEX+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049203 name: Dark Scroll for Accessory for DEX 30% description: Improves DEX on accessories (pendants, belts, rings).\nSuccess rate:30%, DEX+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049204 name: Dark Scroll for Accessory for INT 70% description: Improves INT on accessories (pendants, belts, rings).\nSuccess rate:70%, INT+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049205 name: Dark Scroll for Accessory for INT 30% description: Improves INT on accessories (pendants, belts, rings).\nSuccess rate:30%, INT+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049206 name: Dark Scroll for Accessory for LUK 70% description: Improves LUK on accessories (pendants, belts, rings).\nSuccess rate:70%, LUK+2.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049207 name: Dark Scroll for Accessory for LUK 30% description: Improves LUK on accessories (pendants, belts, rings).\nSuccess rate:30%, LUK+3.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049208 name: Dark Scroll for Accessory for HP 70% description: Improves MaxHP on accessories (pendants, belts, rings).\nSuccess rate:70%, MaxHP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049209 name: Dark Scroll for Accessory for HP 30% description: Improves MaxHP on accessories (pendants, belts, rings).\nSuccess rate:30%, MaxHP+30.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049210 name: Dark Scroll for Accessory for MP 70% description: Improves MaxMP on accessories (pendants, belts, rings).\nSuccess rate:70%, MaxMP+10.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2049211 name: Dark Scroll for Accessory for MP 30% description: Improves MaxMP on accessories (pendants, belts, rings).\nSuccess rate:30%, MaxMP+30.\nIf failed, the item will be destroyed at a 50% rate.
itemid: 2044418 name: Scroll for Polearm for Accuracy 65% description: Improves accuracy on pole arms.\nSuccess rate:65%, accuracy+3, DEX+2, weapon attack+1
itemid: 2044419 name: Scroll for Polearm for Accuracy 15% description: Improves accuracy on pole arms.\nSuccess rate:15%, accuracy+5, DEX+3, weapon attack+3
itemid: 2044318 name: Scroll for Spears for Accuracy 65% description: Improves accuracy on spears.\nSuccess rate:65%, accuracy+3, DEX+2, weapon attack+1
itemid: 2044319 name: Scroll for Spears for Accuracy 15% description: Improves accuracy on spears.\nSuccess rate:15%, accuracy+5, DEX+3, weapon attack+3
itemid: 2044218 name: Scroll for Two-Handed BW for Accuracy 65% description: Improves accuracy on two-handed blunt weapons.\nSuccess rate:65%, accuracy+3, DEX+2, weapon attack+1
itemid: 2044219 name: Scroll for Two-Handed BW for Accuracy 15% description: Improves accuracy on two-handed blunt weapons.\nSuccess rate:15%, accuracy+5, DEX+3, weapon attack+3
itemid: 2044118 name: Scroll for Two-Handed Axe for Accuracy 65% description: Improves accuracy on two-handed axes.\nSuccess rate:65%, accuracy+3, DEX+2, weapon attack+1
itemid: 2044119 name: Scroll for Two-Handed Axe for Accuracy 15% description: Improves accuracy on two-handed axex.\nSuccess rate:15%, accuracy+5, DEX+3, weapon attack+3
itemid: 2044026 name: Scroll for Two-Handed Sword for Accuracy 65% description: Improves accuracy on two-handed swords.\nSuccess rate:65%, accuracy+3, DEX+2, weapon attack+1
itemid: 2044027 name: Scroll for Two-Handed Sword for Accuracy 15% description: Improves accuracy on two-handed swords.\nSuccess rate:15%, accuracy+5, DEX+3, weapon attack+3
itemid: 2043218 name: Scroll for One-Handed BW for Accuracy 65% description: Improves accuracy on one-handed blunt weapons.\nSuccess rate:65%, accuracy+3, DEX+2, weapon attack+1
itemid: 2043219 name: Scroll for One-Handed BW for Accuracy 15% description: Improves accuracy on one-handed blunt weapons.\nSuccess rate:15%, accuracy+5, DEX+3, weapon attack+3
itemid: 2043118 name: Scroll for One-Handed Axe for Accuracy 65% description: Improves accuracy on one-handed axes.\nSuccess rate:65%, accuracy+3, DEX+2, weapon attack+1
itemid: 2043119 name: Scroll for One-Handed Axe for Accuracy 15% description: Improves accuracy on one-handed axes.\nSuccess rate:15%, accuracy+5, DEX+3, weapon attack+3
itemid: 2043024 name: Scroll for One-Handed Sword for Accuracy 65% description: Improves accuracy on one-handed swords.\nSuccess rate:65%, accuracy+3, DEX+2, weapon attack+1
itemid: 2043025 name: Scroll for One-Handed Sword for Accuracy 15% description: Improves accuracy on one-handed swords.\nSuccess rate:15%, accuracy+5, DEX+3, weapon attack+3
itemid: 2040937 name: Scroll for Shield for LUK 65% description: Improves LUK on shields.\nSuccess rate:65%, LUK+2
itemid: 2040938 name: Scroll for Shield for LUK 15% description: Improves LUK on shields.\nSuccess rate:15%, LUK+3
itemid: 2040939 name: Scroll for Shield for HP 65% description: Improves MaxHP on shields.\nSuccess rate:65%, MaxHP+15
itemid: 2040940 name: Scroll for Shield for HP 15% description: Improves MaxHP on shields.\nSuccess rate:15%, MaxHP+30
itemid: 2040941 name: Scroll for Shield for STR 65% description: Improves STR on shields.\nSuccess rate:65%, STR+2
itemid: 2040942 name: Scroll for Shield for STR 15% description: Improves STR on shields.\nSuccess rate:15%, STR+3
itemid: 2040831 name: Scroll for Gloves for HP 65% description: Improves MaxHP on gloves.\nSuccess rate:65%, MaxHP+15
itemid: 2040832 name: Scroll for Gloves for HP 15% description: Improves MaxHP on gloves.\nSuccess rate:15%, MaxHP+30
itemid: 2040631 name: Scroll for Bottomwear for Jump 65% description: Improves jump on bottomwear.\nSuccess rate:65%, jump+2, avoidability+1
itemid: 2040632 name: Scroll for Bottomwear for Jump 15% description: Improves jump on bottomwear.\nSuccess rate:15%, jump+4, avoidability+2
itemid: 2040633 name: Scroll for Bottomwear for HP 65% description: Improves HP on bottomwear.\nSuccess rate:65%, MaxHP+15
itemid: 2040634 name: Scroll for Bottomwear for HP 15% description: Improves HP on bottomwear.\nSuccess rate:15%, MaxHP+30
itemid: 2040635 name: Scroll for Bottomwear for DEX 65% description: Improves DEX on bottomwear.\nSuccess rate:65%, DEX+2, accuracy+1
itemid: 2040636 name: Scroll for Bottomwear for DEX 15% description: Improves DEX on bottomwear.\nSuccess rate:15%, DEX+3, accuracy+2, speed+1
itemid: 2040540 name: Scroll for Overall Armor for STR 65% description: Improves STR on overalls.\nSuccess rate:65%, STR+2, weapon attack+1
itemid: 2040541 name: Scroll for Overall Armor for STR 15% description: Improves STR on overalls.\nSuccess rate:15%, STR+5, weapon attack+3, MaxHP+5
itemid: 2040431 name: Scroll for Topwear for STR 65% description: Improves STR on topwear.\nSuccess rate:65%, STR+2
itemid: 2040432 name: Scroll for Topwear for STR 15% description: Improves STR on topwear.\nSuccess rate:15%, STR+3
itemid: 2040433 name: Scroll for Topwear for HP 65% description: Improves HP on topwear.\nSuccess rate:65%, MaxHP+15
itemid: 2040434 name: Scroll for Topwear for HP 15% description: Improves HP on topwear.\nSuccess rate:15%, MaxHP+30
itemid: 2040435 name: Scroll for Topwear for LUK 65% description: Improves LUK on topwear.\nSuccess rate:65%, LUK+2
itemid: 2040436 name: Scroll for Topwear for LUK 15% description: Improves LUK on topwear.\nSuccess rate:15%, LUK+3
itemid: 2040335 name: Scroll for Earring for DEX 65% description: Improves DEX on earrings.\nSuccess rate:65%, DEX+2
itemid: 2040336 name: Scroll for Earring for DEX 15% description: Improves DEX on earrings.\nSuccess rate:15%, DEX+3
itemid: 2040337 name: Scroll for Earring for LUK 65% description: Improves LUK on earrings.\nSuccess rate:65%, LUK+2
itemid: 2040338 name: Scroll for Earring for LUK 15% description: Improves LUK on earrings.\nSuccess rate:15%, LUK+3
itemid: 2040339 name: Scroll for Earring for HP 65% description: Improves HP on earrings.\nSuccess rate:65%, MaxHP+15
itemid: 2040340 name: Scroll for Earring for HP 15% description: Improves HP on earrings.\nSuccess rate:15%, MaxHP+30
itemid: 2040043 name: Scroll for Helmet for DEX 65% description: Improves DEX on headwear.\nSuccess rate:65%, DEX+2
itemid: 2040044 name: Scroll for Helmet for DEX 15% description: Improves DEX on headwear.\nSuccess rate:15%, DEX+3
itemid: 2022620 name: Handmade Sandwich  description: A sandwich made personally by Anna. Eat it in the morning to guarantee a sense of satisfaction all throughout the day.
itemid: 2022621 name: Tasty Milk description: Fresh milk produced at the farm.\nRecovers around 100 HP.
itemid: 2022622 name: Squeezed Juice description: Fresh juice produced at the farm.\nRecovers around 50 MP.
itemid: 2022631 name: Rose Scent description: As you are surrounded by the fragrant scent of Roses, you get a strange headache and your feet start to feel heavy. Go see Lana before the scent disappears.
itemid: 2022632 name: Freesia Scent description: As you are surrounded by the refreshing scent of Freesias, you get a strange headache and your feet start to feel heavy. Go see Lana before the scent disappears.
itemid: 2022633 name: Lavender Scent description: As you are surrounded by the sweet scent of Lavenders, you get a strange headache and your feet start to feel heavy. Go see Lana before the scent disappears.
itemid: 2012008 name: Unripe Onyx Apple description: A mysterious and unripe Onyx Apple. When consumed, it grants the following: ATT +60, Magic ATT +70, DEF +10 for 1 minute.
itemid: 2030020 name: Return Scroll to New Leaf City description: Use this scroll to venture back to New Leaf City whenever you want!
itemid: 2000000 name: Red Potion description: A potion made out of red herbs.\nRecovers 50 HP.
itemid: 2000001 name: Orange Potion description: A concentrated potion made out of red herbs.\nRecovers 150 HP.
itemid: 2000002 name: White Potion description: A highly concentrated potion made out of red herbs.\nRecovers 300 HP.
itemid: 2000003 name: Blue Potion description: A potion made out of blue herbs.\nRecovers 100 MP.
itemid: 2290000 name: [Mastery Book] Monster Magnet description: This increases the master level of the #cMonster Magnet# skill to 20 with a 70% chance of success.\nJob: 4th Advancement Warrior\nCondition: At least level 5 in this skill
itemid: 2290001 name: [Mastery Book] Monster Magnet description: This increases the master level of the #cMonster Magnet# skill to 30 with a 50% chance of success.\nJob: 4th Advancement Warrior\nCondition: At least level 15 in this skill
itemid: 2290002 name: [Mastery Book] Achilles description: This increases the master level of #cAchilles# to 20 with a 70% chance of success.\nJob: 4th Advancement Warrior\nCondition: At least level 5 in this skill
itemid: 2290003 name: [Mastery Book] Achilles description: This increases the master level of #cAchilles# to 30 with a 50% chance of success.\nJob: 4th Advancement Warrior\nCondition: At least level 15 in this skill
itemid: 2290004 name: [Mastery Book] Rush description: This increases the master level of #cRush# to 20 with a 70% chance of success.\nJob: 4th Advancement Warrior\nCondition: At least level 5 in this skill
itemid: 2290005 name: [Mastery Book] Rush description: This increases the master level of #cRush# to 30 with a 50% chance of success.\nJob: 4th Advancement Warrior\nCondition: At least level 15 in this skill
itemid: 2290006 name: [Mastery Book] Power Stance description: This increases the master level of #cPower Stance# to 20 with a 70% chance of success.\nJob: 4th Advancement Warrior\nCondition: At least level 5 in this skill
itemid: 2290007 name: [Mastery Book] Power Stance description: This increases the master level of #cPower Stance# to 30 with a 50% chance of success.\nJob: 4th Advancement Warrior\nCondition: At least level 15 in this skill
itemid: 2290008 name: [Mastery Book] Advanced Combo Attack description: This increases the master level of #cAdvanced Combo Attack# to 20 with a 70% chance of success.\nClass: Hero\nCondition: At least level 5 in this skill
itemid: 2290009 name: [Mastery Book] Advanced Combo Attack description: This increases the master level of #cAdvanced Combo Attack# to 30 with a 50% chance of success.\nClass: Hero\nCondition: At least level 15 in this skill
itemid: 2290010 name: [Mastery Book] Brandish description: This increases the master level of #cBrandish# to 20 with a 70% chance of success.\nClass: Hero\nCondition: At least level 5 in this skill
itemid: 2290011 name: [Mastery Book] Brandish description: This increases the master level of #cBrandish# to 30 with a 50% chance of success.\nClass: Hero\nCondition: At least level 15 in this skill
itemid: 2290012 name: [Mastery Book] Blast description: This increases the master level of #cBlast # to 20 with a 70% chance of success.\nClass: Paladin\nCondition: At least level 5 in this skill
itemid: 2290013 name: [Mastery Book] Blast description: This increases the master level of #cBlast# to 30 with a 50% chance of success.\nClass: Paladin\nCondition: At least level 15 in this skill
itemid: 2290014 name: [Mastery Book] Guardian description: This increases the master level of #cGuardian# to 20 with a 70% chance of success.\nClass: Hero, Paladin\nCondition: At least level 5 in this skill
itemid: 2290015 name: [Mastery Book] Guardian description: This increases the master level of #cGuardian# to 30 with a 50% chance of success.\nClass: Hero, Paladin\nCondition: At least level 15 in this skill
itemid: 2290016 name: [Mastery Book] Enrage description: This increases the master level of #cEnrage# to 20 with a 70% chance of success.\nClass: Hero\nCondition: At least level 5 in this skill
itemid: 2290017 name: [Mastery Book] Enrage description: This increases the master level of #cEnrage# to 30 with a 50% chance of success.\nClass: Hero\nCondition: At least level 15 in this skill
itemid: 2290018 name: [Mastery Book] Holy Charge description: This increases the master level of #cHoly Charge# to 20 with a 70% chance of success.\nClass: Paladin\nCondition: At least level 5 in this skill
itemid: 2290019 name: [Mastery Book] Divine Charge description: This increases the master level of #cDivine Charge# to 20 with a 70% chance of success.\nClass: Paladin\nCondition: At least level 5 in this skill
itemid: 2290020 name: [Mastery Book] Heaven's Hammer description: This increases the master level of #cHeaven's Hammer# to 20 with a 70% chance of success.\nClass: Paladin\nCondition: At least level 5 in this skill
itemid: 2290021 name: [Mastery Book] Heaven's Hammer description: This increases the master level of #cHeaven's Hammer# to 30 with a 50% chance of success.\nClass: Paladin\nCondition: At least level 15 in this skill
itemid: 2290022 name: [Mastery Book] Berserk description: This increases the master level of #cBerserk# to 20 with a 70% chance of success.\nClass: Dark Knight\nCondition: At least level 5 in this skill
itemid: 2290023 name: [Mastery Book] Berserk description: This increases the master level of #cBerserk# to 30 with a 50% chance of success.\nClass: Dark Knight\nCondition: At least level 15 in this skill
itemid: 2290024 name: [Mastery Book] Mana Reflection description: This increases the master level of #cMana Reflection# to 20 with a 70% chance of success.\nJob: 4th Advancement Magician\nCondition: At least level 5 in this skill
itemid: 2290025 name: [Mastery Book] Mana Reflection description: This increases the master level of #cMana Reflection# to 30 with a 50% chance of success.\nJob: 4th Advancement Magician\nCondition: At least level 15 in this skill
itemid: 2290026 name: [Mastery Book] Big Bang description: This increases the master level of #cBig Bang# to 20 with a 70% chance of success.\nJob: 4th Advancement Magician\nCondition: At least level 5 in this skill
itemid: 2290027 name: [Mastery Book] Big Bang description: This increases the master level of #cBig Bang# to 30 with a 50% chance of success.\nJob: 4th Advancement Magician\nCondition: At least level 15 in this skill
itemid: 2290028 name: [Mastery Book] Infinity description: This increases the master level of #cInfinity# to 20 with a 70% chance of success.\nJob: 4th Advancement Magician\nCondition: At least level 5 in this skill
itemid: 2290029 name: [Mastery Book] Infinity description: This increases the master level of #cInfinity# to 30 with a 50% chance of success.\nJob: 4th Advancement Magician\nCondition: At least level 15 in this skill
itemid: 2290030 name: [Mastery Book] Paralyze description: This increases the master level of #cParalyze# to 20 with a 70% chance of success.\nClass: Arch Mage (Fire,Poison)\nCondition: At least level 5 in this skill
itemid: 2290031 name: [Mastery Book] Paralyze description: This increases the master level of #cParalyze# to 30 with a 50% chance of success.\nClass: Arch Mage (Fire,Poison)\nCondition: At least level 15 in this skill
itemid: 2290032 name: [Mastery Book] Chain Lightning description: This increases the master level of #cChain Lightning# to 20 with a 70% chance of success.\nClass: Arch Mage (Ice,Lightning)\nCondition: At least level 5 in this skill
itemid: 2290033 name: [Mastery Book] Chain Lightning description: This increases the master level of #cChain Lightning# to 30 with a 50% chance of success.\nClass: Arch Mage (Ice,Lightning)\nCondition: At least level 15 in this skill
itemid: 2290034 name: [Mastery Book]  Holy Shield description: This increases the master level of #cHoly Shield# to 20 with a 70% chance of success.\nClass: Bishop\nCondition: At least level 5 in this skill
itemid: 2290035 name: [Mastery Book] Holy Shield description: This increases the master level of #cHoly Shield# to 30 with a 50% chance of success.\nClass: Bishop\nCondition: At least level 15 in this skill
itemid: 2290036 name: [Mastery Book] Fire Demon description: This increases the master level of #cFire Demon# to 20 with a 70% chance of success.\nClass: Arch Mage (Fire,Poison)\nCondition: At least level 5 in this skill
itemid: 2290037 name: [Mastery Book] Fire Demon description: This increases the master level of #cFire Demon# to 30 with a 50% chance of success.\nClass: Arch Mage (Fire,Poison)\nCondition: At least level 15 in this skill
itemid: 2290038 name: [Mastery Book] Elquines description: This increases the master level of #cElquines# to 20 with a 70% chance of success.\nClass: Arch Mage (Fire,Poison)\nCondition: At least level 5 in this skill
itemid: 2290039 name: [Mastery Book] Elquines description: This increases the master level of #cElquines# to 30 with a 50% chance of success.\nClass: Arch Mage (Fire,Poison)\nCondition: At least level 15 in this skill
itemid: 2290040 name: [Mastery Book] Meteor Shower description: This increases the master level of #cMeteor Shower# to 20 with a 70% chance of success.\nClass: Arch Mage (Fire,Poison)\nCondition: At least level 5 in this skill
itemid: 2290041 name: [Mastery Book] Meteor Shower description: This increases the master level of #cMeteor Shower# to 30 with a 50% chance of success.\nClass: Arch Mage (Fire,Poison)\nCondition: At least level 15 in this skill
itemid: 2290042 name: [Mastery Book] Ice Demon description: This increases the master level of #cIce Demon# to 20 with a 70% chance of success.\nClass: Arch Mage (Ice,Lightning)\nCondition: At least level 5 in this skill
itemid: 2290043 name: [Mastery Book] Ice Demon description: This increases the master level of #cIce Demon# to 30 with a 50% chance of success.\nClass: Arch Mage (Ice,Lightning)\nCondition: At least level 15 in this skill
itemid: 2290044 name: [Mastery Book] Ifrit description: This increases the master level of #cIfrit# to 20 with a 70% chance of success.\nClass: Arch Mage (Ice,Lightning)\nCondition: At least level 5 in this skill
itemid: 2290045 name: [Mastery Book] Ifrit description: This increases the master level of #cIfrit# to 30 with a 50% chance of success.\nClass: Arch Mage (Ice,Lightning)\nCondition: At least level 15 in this skill
itemid: 2290046 name: [Mastery Book] Blizzard description: This increases the master level of #cBlizzard# to 20 with a 70% chance of success.\nClass: Arch Mage (Ice,Lightning)\nCondition: At least level 5 in this skill
itemid: 2290047 name: [Mastery Book] Blizzard description: This increases the master level of #cBlizzard# to 30 with a 50% chance of success.\nClass: Arch Mage (Ice,Lightning)\nCondition: At least level 15 in this skill
itemid: 2290048 name: [Mastery Book] Genesis description: This increases the master level of #cGenesis# to 20 with a 70% chance of success.\nClass: Bishop\nCondition: At least level 5 in this skill
itemid: 2290049 name: [Mastery Book] Genesis description: This increases the master level of #cGenesis# to 30 with a 50% chance of success.\nClass: Bishop\nCondition: At least level 15 in this skill
itemid: 2290050 name: [Mastery Book] Angel Ray description: This increases the master level of #cAngel Ray# to 20 with a 70% chance of success.\nClass: Bishop\nCondition: At least level 5 in this skill
itemid: 2290051 name: [Mastery Book] Angel Ray description: This increases the master level of #cAngel Ray# to 30 with a 50% chance of success.\nClass: Bishop\nCondition: At least level 15 in this skill
itemid: 2290052 name: [Mastery Book] Sharp Eyes description: This increases the master level of #cSharp Eyes# to 20 with a 70% chance of success.\nJob: 4th Advancement Bowman\nCondition: At least level 5 in this skill
itemid: 2290053 name: [Mastery Book] Sharp Eyes description: This increases the master level of #cSharp Eyes# to 30 with a 50% chance of success.\nJob: 4th Advancement Bowman\nCondition: At least level 15 in this skill
itemid: 2290054 name: [Mastery Book] Dragon's Breath description: This increases the master level of #cDragon's Breath# to 20 with a 70% chance of success.\nJob: 4th Advancement Bowman\nCondition: At least level 5 in this skill
itemid: 2290055 name: [Mastery Book] Dragon's Breath description: This increases the master level of #cDragon's Breath# to 30 with a 50% chance of success.\nJob: 4th Advancement Bowman\nCondition: At least level 15 in this skill
itemid: 2290056 name: [Mastery Book] Bow Expert description: This increases the master level of #cBow Expert# to 20 with a 70% chance of success.\nClass: Bow Master\nCondition: At least level 5 in this skill
itemid: 2290057 name: [Mastery Book] Bow Expert description: This increases the master level of #cBow Expert# to 30 with a 50% chance of success.\nClass: Bow Master\nCondition: At least level 15 in this skill
itemid: 2290058 name: [Mastery Book] Hamstring Shot description: This increases the master level of #cHamstring Shot# to 20 with a 70% chance of success.\nClass: Bow Master\nCondition: At least level 5 in this skill
itemid: 2290059 name: [Mastery Book] Hamstring Shot description: This increases the master level of #cHamstring Shot# to 30 with a 50% chance of success.\nClass: Bow Master\nCondition: At least level 15 in this skill
itemid: 2290060 name: [Mastery Book] Hurricane description: This increases the master level of #cHurricane# to 20 with a 70% chance of success.\nClass: Bow Master\nCondition: At least level 5 in this skill
itemid: 2290061 name: [Mastery Book] Hurricane description: This increases the master level of #cHurricane# to 30 with a 50% chance of success.\nClass: Bow Master\nCondition: At least level 15 in this skill
itemid: 2290062 name: [Mastery Book] Phoenix description: This increases the master level of #cPhoenix# to 20 with a 70% chance of success.\nClass: Bow Master\nCondition: At least level 5 in this skill
itemid: 2290063 name: [Mastery Book] Phoenix description: This increases the master level of #cPhoenix# to 30 with a 50% chance of success.\nClass: Bow Master\nCondition: At least level 15 in this skill
itemid: 2290064 name: [Mastery Book] Concentrate description: This increases the master level of #cConcentrate# to 20 with a 70% chance of success.\nClass: Bow Master\nCondition: At least level 5 in this skill
itemid: 2290065 name: [Mastery Book] Concentrate description: This increases the master level of #cConcentrate# to 30 with a 50% chance of success.\nClass: Bow Master\nCondition: At least level 15 in this skill
itemid: 2290066 name: [Mastery Book] Marksman Boost description: This increases the master level of #cMarksman Boost# to 20 with a 70% chance of success.\nClass: Marksman\nCondition: At least level 5 in this skill
itemid: 2290067 name: [Mastery Book] Marksman Boost description: This increases the master level of #cMarksman Boost# to 30 with a 50% chance of success.\nClass: Marksman\nCondition: At least level 15 in this skill
itemid: 2290068 name: [Mastery Book] Blind description: This increases the master level of #cBlind# to 20 with a 70% chance of success.\nClass: Marksman\nCondition: At least level 5 in this skill
itemid: 2290069 name: [Mastery Book] Blind description: This increases the master level of #cBlind# to 30 with a 50% chance of success.\nClass: Marksman\nCondition: At least level 15 in this skill
itemid: 2290070 name: [Mastery Book] Piercing Arrow description: This increases the master level of #cPiercing Arrow# to 20 with a 70% chance of success.\nClass: Marksman\nCondition: At least level 5 in this skill
itemid: 2290071 name: [Mastery Book] Piercing Arrow description: This increases the master level of #cPiercing Arrow# to 30 with a 50% chance of success.\nClass: Marksman\nCondition: At least level 15 in this skill
itemid: 2290072 name: [Mastery Book] Frostprey description: This increases the master level of #cFrostprey# to 20 with a 70% chance of success.\nClass: Marksman\nCondition: At least level 5 in this skill
itemid: 2290073 name: [Mastery Book] Frostprey description: This increases the master level of #cFrostprey# to 30 with a 50% chance of success.\nClass: Marksman\nCondition: At least level 15 in this skill
itemid: 2290074 name: [Mastery Book] Snipe description: This increases the master level of #cSnipe# to 20 with a 70% chance of success.\nClass: Marksman\nCondition: At least level 5 in this skill
itemid: 2290075 name: [Mastery Book] Snipe description: This increases the master level of #cSnipe# to 30 with a 50% chance of success.\nClass: Marksman\nCondition: At least level 15 in this skill
itemid: 2290076 name: [Mastery Book] Shadow Shifter description: This increases the master level of #cShadow Shifter# to 20 with a 70% chance of success.\nJob: 4th Advancement Thief\nCondition: At least level 5 in this skill
itemid: 2290077 name: [Mastery Book] Shadow Shifter description: This increases the master level of #cShadow Shifter# to 30 with a 50% chance of success.\nJob: 4th Advancement Thief\nCondition: At least level 15 in this skill
itemid: 2290078 name: [Mastery Book] Venomous Star/Venomous Stab description: This increases the master level of #cVenomous Star or Venomous Stab# to 20 with a 70% chance of success.\nJob: 4th Advancement Thief\nCondition: At least level 5 in this skill
itemid: 2290079 name: [Mastery Book] Venomous Star/Venomous Stab description: This increases the master level of #cVenomous Star or Venomous Stab# to 30 with a 50% chance of success.\nJob: 4th Advancement Thief\nCondition: At least level 15 in this skill
itemid: 2290080 name: [Mastery Book] Taunt description: This increases the master level of #cTaunt# to 20 with a 70% chance of success.\nJob: 4th Advancement Thief\nCondition: At least level 5 in this skill
itemid: 2290081 name: [Mastery Book] Taunt description: This increases the master level of #cTaunt# to 30 with a 50% chance of success.\nJob: 4th Advancement Thief\nCondition: At least level 15 in this skill
itemid: 2290082 name: [Mastery Book] Ninja Ambush description: This increases the master level of #cNinja Ambush# to 20 with a 70% chance of success.\nJob: 4th Advancement Thief\nCondition: At least level 5 in this skill
itemid: 2290083 name: [Mastery Book] Ninja Ambush description: This increases the master level of #cNinja Ambush# to 30 with a 50% chance of success.\nJob: 4th Advancement Thief\nCondition: At least level 15 in this skill
itemid: 2290084 name: [Mastery Book] Triple Throw description: This increases the master level of #cTriple Throw# to 20 with a 70% chance of success.\nClass: Night Lord\nCondition: At least level 5 in this skill
itemid: 2290085 name: [Mastery Book] Triple Throw description: This increases the master level of #cTriple Throw# to 30 with a 50% chance of success.\nClass: Night Lord\nCondition: At least level 15 in this skill
itemid: 2290086 name: [Mastery Book] Ninja Storm description: This increases the master level of #cNinja Storm# to 20 with a 70% chance of success.\nClass: Night Lord\nCondition: At least level 5 in this skill
itemid: 2290087 name: [Mastery Book] Ninja Storm description: This increases the master level of #cNinja Storm# to 30 with a 50% chance of success.\nClass: Night Lord\nCondition: At least level 15 in this skill
itemid: 2290088 name: [Mastery Book] Shadow Claw description: This increases the master level of #cShadow Claw# to 20 with a 70% chance of success.\nClass: Night Lord\nCondition: At least level 5 in this skill
itemid: 2290089 name: [Mastery Book] Shadow Claw description: This increases the master level of #cShadow Claw# to 30 with a 50% chance of success.\nClass: Night Lord\nCondition: At least level 15 in this skill
itemid: 2290090 name: [Mastery Book] Boomerang Step description: This increases the master level of #cBoomerang Step# to 20 with a 70% chance of success.\nClass: Shadower\nCondition: At least level 5 in this skill
itemid: 2290091 name: [Mastery Book] Boomerang Step description: This increases the master level of #cBoomerang Step# to 30 with a 50% chance of success.\nClass: Shadower\nCondition: At least level 15 in this skill
itemid: 2290092 name: [Mastery Book] Assassinate description: This increases the master level of #cAssassinate# to 20 with a 70% chance of success.\nClass: Shadower\nCondition: At least level 5 in this skill
itemid: 2290093 name: [Mastery Book] Assassinate description: This increases the master level of #cAssassinate# to 30 with a 50% chance of success.\nClass: Shadower\nCondition: At least level 15 in this skill
itemid: 2290094 name: [Mastery Book] Smokescreen description: This increases the master level of #cSmokescreen# to 20 with a 70% chance of success.\nClass: Shadower\nCondition: At least level 5 in this skill
itemid: 2290095 name: [Mastery Book] Smokescreen description: This increases the master level of #cSmokescreen# to 30 with a 50% chance of success.\nClass: Shadower\nCondition: At least level 15 in this skill
itemid: 2290096 name: [Mastery Book] Maple Warrior description: This increases the master level of #cMaple Warrior# to 20 with a 70% chance of success.\nJob: All 4th Advancement Jobs\nCondition: At least level 5 in this skill
itemid: 2290097 name: [Mastery Book] Dragon Strike description: This increases the master level of #cDragon Strike# to 20 with a 70% chance of success.\nJob: Buccaneer\nCondition: At least level 5 in this skill
itemid: 2290098 name: [Mastery Book] Dragon Strike description: This increases the master level of #cDragon Strike# to 30 with a 50% chance of success.\nJob: Buccaneer\nCondition: At least level 15 in this skill
itemid: 2290099 name: [Mastery Book] Energy Orb description: This increases the master level of #cEnergy Orb# to 20 with a 70% chance of success.\nJob: Buccaneer\nCondition: At least level 5 in this skill
itemid: 2290100 name: [Mastery Book] Energy Orb description: This increases the master level of #cEnergy Orb# to 30 with a 50% chance of success.\nJob: Buccaneer\nCondition: At least level 15 in this skill
itemid: 2290101 name: [Mastery Book] Super Transformation description: This increases the master level of #cSuper Transformation# to 20 with a 70% chance of success.\nJob: Buccaneer\nCondition: At least level 5 in this skill
itemid: 2290102 name: [Mastery Book] Demolition description: This increases the master level of #cDemolition# to 20 with a 70% chance of success.\nJob: Buccaneer\nCondition: At least level 5 in this skill
itemid: 2290103 name: [Mastery Book] Demolition description: This increases the master level of #cDemolition# to 30 with a 50% chance of success.\nJob: Buccaneer\nCondition: At least level 15 in this skill
itemid: 2290104 name: [Mastery Book] Snatch description: This increases the master level of #cSnatch# to 20 with a 70% chance of success.\nJob: Buccaneer\nCondition: At least level 5 in this skill
itemid: 2290105 name: [Mastery Book] Snatch description: This increases the master level of #cSnatch# to 30 with a 50% chance of success.\nJob: Buccaneer\nCondition: At least level 15 in this skill
itemid: 2290106 name: [Mastery Book] Barrage description: This increases the master level of #cBarrage# to 20 with a 70% chance of success.\nJob: Buccaneer\nCondition: At least level 5 in this skill
itemid: 2290107 name: [Mastery Book] Barrage description: This increases the master level of #cBarrage# to 30 with a 50% chance of success.\nJob: Buccaneer\nCondition: At least level 15 in this skill
itemid: 2290108 name: [Mastery Book] Speed Infusion description: This increases the master level of #cSpeed Infusion# to 20 with a 70% chance of success.\nJob: Buccaneer\nCondition: At least level 5 in this skill
itemid: 2290110 name: [Mastery Book] Time Leap description: This increases the master level of #cTime Leap# to 20 with a 70% chance of success.\nJob: Buccaneer\nCondition: At least level 5 in this skill
itemid: 2290111 name: [Mastery Book] Time Leap description: This increases the master level of #cTime Leap# to 30 with a 50% chance of success.\nJob: Buccaneer\nCondition: At least level 15 in this skill
itemid: 2290112 name: [Mastery Book] Elemental Boost description: This increases the master level of #cElemental Boost# to 20 with a 70% chance of success.\nJob: Corsair\nCondition: At least level 5 in this skill
itemid: 2290113 name: [Mastery Book] Elemental Boost description: This increases the master level of #cElemental Boost# to 30 with a 50% chance of success.\nJob: Corsair\nCondition: At least level 15 in this skill
itemid: 2290114 name: [Mastery Book] Wrath of the Octopi description: This increases the master level of #cWrath of the Octopi# to 20 with a 70% chance of success.\nJob: Corsair\nCondition: At least level 5 in this skill
itemid: 2290115 name: [Mastery Book] Air Strike description: This increases the master level of #cAir Strike# to 20 with a 70% chance of success.\nJob: Corsair\nCondition: At least level 5 in this skill
itemid: 2290116 name: [Mastery Book] Air Strike description: This increases the master level of #cAir Strike# to 30 with a 50% chance of success.\nJob: Corsair\nCondition: At least level 15 in this skill
itemid: 2290117 name: [Mastery Book] Rapid Fire description: This increases the master level of #cRapid Fire# to 20 with a 70% chance of success.\nJob: Corsair\nCondition: At least level 5 in this skill
itemid: 2290118 name: [Mastery Book] Rapid Fire description: This increases the master level of #cRapid Fire# to 30 with a 50% chance of success.\nJob: Corsair\nCondition: At least level 15 in this skill
itemid: 2290119 name: [Mastery Book] Battleship Cannon description: This increases the master level of #cBattleship Cannon# to 20 with a 70% chance of success.\nJob: Corsair\nCondition: At least level 5 in this skill
itemid: 2290120 name: [Mastery Book] Battleship Cannon description: This increases the master level of #cBattleship Cannon# to 30 with a 50% chance of success.\nJob: Corsair\nCondition: At least level 15 in this skill
itemid: 2290121 name: [Mastery Book] Battleship Torpedo description: This increases the master level of #cBattleship Torpedo# to 20 with a 70% chance of success.\nJob: Corsair\nCondition: At least level 5 in this skill
itemid: 2290122 name: [Mastery Book] Battleship Torpedo description: This increases the master level of #cBattleship Torpedo# to 30 with a 50% chance of success.\nJob: Corsair\nCondition: At least level 15 in this skill
itemid: 2290123 name: [Mastery Book] Hypnotize description: This increases the master level of #cHypnotize# to 20 with a 70% chance of success.\nJob: Corsair\nCondition: At least level 5 in this skill
itemid: 2290124 name: [Mastery Book] Bullseye description: This increases the master level of #cBullseye# to 20 with a 70% chance of success.\nJob: Corsair\nCondition: At least level 5 in this skill
itemid: 2290125 name: [Mastery Book] Maple Warrior description: This increases the master level of #cMaple Warrior# to 30 with a 50% chance of success.\nJob: All 4th Advancement Jobs\nCondition: At least level 15 in this skill
 */

