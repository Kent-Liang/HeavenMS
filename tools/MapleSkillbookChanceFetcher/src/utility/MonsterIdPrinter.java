package utility;

import life.MapleLifeFactory;
import life.MapleMonsterStats;

import java.util.Map;
import java.util.Set;

public class MonsterIdPrinter {

    public static void main(String[] args) {
        Map<Integer, MapleMonsterStats>  mobStats = MapleLifeFactory.getAllMonsterStats();

        Set<Map.Entry<Integer, MapleMonsterStats>> entries = mobStats.entrySet();
        for(Map.Entry<Integer, MapleMonsterStats> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue().getName());
        }
    }
}

/*
6230101 Puco
6230100 Wild Kargo
5120100 MT-09
9400511 Yellow Eggy Popp
9400510 Green Eggy Popp
9400509 Sakura Cellion
9400508 Mad Turkey
9400507 Cake Monster
9400506 Candle Monster
9400505 Turkey
9400504 Coolie Zombie
9400503 Stirge
9400502 Wraith
9400501 Jr. Wraith
9400500 Malady
9400527 Fire Boar GL
9400526 Fierry GL
9400525 Cold Eye GL
9400524 Curse Eye GL
1110100 Green Mushroom
9400523 Evil Eye GL
1110101 Dark Stump
9400522 B Slime
9400521 O Slime
9400520 P Slime
9400519 G Slime
9400518 Magik Fierry B
9400517 Magik Fierry A
9400516 Crystal Boar
9400515 Indigo Eye
5120002 Lioner
5120003 Grupin
9400514 Geist Balrog Phase 3
9400513 Candle Mob (2nd)
5120000 Luster Pixie
9400512 Cake Mob (2nd)
5120001 Cellion
9400543 Electrophant
9400542 Fire Tusk
9400541 Killa Bee
9400540 Killa Bee
9400539 Urban Fungus
9400538 Street Slime
9400537 Geist Balrog Phase 2
9400536 Geist Balrog Phase 1
9400535 Magik Fiarry A PQ
9400534 Crystal Boar PQ
9400533 Indigo Eye PQ
9400531 Toy Trojan GL
9400530 Zombie Lupin GL
9400529 Ice Sentinel GL
9400528 Sentinel GL
9400559 Sophilia Doll Ground
9400558 Psycho Jack
1110130 Dejected Green Mushroom
9400557 Psycho Jack Box
9400556 Glutton Ghoul
9400555 Blue Flying Book
2220100 Blue Mushroom
9400554 Orange Flying Book
9400553 Purple Flying Book
9400552 Zoo Snail
9400551 Bob
9400550 Boomer
9400549 Headless Horseman
9400548 Mighty Maple Eater
9400547 Boomer
9400546 I.AM.ROBOT
9400545 Wolf Spider
9400544 Gryphon
9400575 Bigfoot
9400574 Typhon
9400573 Baby typhon
9400572 Geist Balrog
9400571 Headless Horseman
9400570 Anniversary Cake
9400569 Big Puff Daddy
9400568 Turkey Commando
9400567 Loki Box Tr
9400566 Loki Box Ex
9400565 Glutton Ghoul
9400564 Mirror Ghost
9400563 Nightmare
9400562 Hoodoo
9400561 Voodoo
9400560 Sophilia Doll
9400335 Giant Snowman (Lvl 4) - Hard
9400334 Giant Snowman (Lvl 3) - Hard
9400333 Giant Snowman (Lvl 2) - Hard
9400332 Giant Snowman (Lvl 1) - Hard
9400331 Giant Snowman (Lvl 5) - Medium
9400330 Giant Snowman (Lvl 4) - Medium
9400329 Giant Snowman (Lvl 3) - Medium
9400328 Giant Snowman (Lvl 2) - Medium
9400327 Giant Snowman (Lvl 1) - Medium
9400326 Giant Snowman (Lvl 5) - Easy
9400325 Giant Snowman (Lvl 4) - Easy
9400324 Giant Snowman (Lvl 3) - Easy
9400323 Giant Snowman (Lvl 2) - Easy
9400322 Giant Snowman (Lvl 1) - Easy
9400321 Cross (Hard)
9400320 Cross (Medium)
2130100 Dark Axe Stump
2130103 Jr. Necki
9400336 Giant Snowman (Lvl 5) - Hard
8110300 Homunscullo
7160000 Dual Ghost Pirate
8143000 Grim Phantom Watch
6230201 Separated Dark Pepe
6230200 Dark Pepe
6300000 Yeti
9400719 Snow Blower
9200012 Drake (PC)
6300001 Transformed Yeti
9400718 Snow Blower
9200013 Cold Eye (PC)
6300002 Separated Yeti
9200014 Wild Kargo (PC)
9400717 Snow Blower
6300003 Punco
9200015 Brown Tanny
9400716 Snow Blower
6300004 Pachu
9400715 Snow Blower
9200008 Blue Mushroom (PC)
9200009 Stone Golem (PC)
6300005 Zombie Mushmom
9400714 Snow Blower
9200010 Zombie Mushroom (PC)
9400713 Item Killer
9400712 Little Snowman
9200011 Evil Eye (PC)
9400711 Transparent Mob
9200004 Green Mushroom (PC)
9200005 Slime (PC)
9400710 Snowman3
9200006 Lupin (PC)
9400709 Snowman2
9200007 Zombie Lupin (PC)
9400708 Snowman1
9200000 Wild Boar (PC)
9400707 Item Maker
9400706 Jr. MV
9200001 Fire Boar (PC)
9200002 Dark Stump (PC)
9400704 Beef Eater
9200003 Horned Mushroom (PC)
9200020 Yetti & Pepe
9200021 Separated Yetti
9200022 Separated Pepe
9400724 Snow Blower
9200016 Drumming Bunny
9400723 Snow Blower
9200017 Pink Tanny
9400722 Snow Blower
9200018 Jr. Yetti
9400721 Snow Blower
9200019 White Fang
9400720 Snow Blower
9400749 Red Eggy Popp
9400748 MV
9400747 Bain Minion
9400746 Muscle Stone Minion
9400745 Jr. Balrog Minion
9400744 Crimson Balrog Minion
9400743 Angry Guard Dog
9400742 Mummy Guard Dog
9400741 Skel Guard Dog
9400740 MV Minion
9400739 MV Minion
6230300 Lazy Buffy
8180000 Manon
8180001 Griffey
9409001 Tutorial Drumming Rabbit
9409000 Tutorial Leatty
3400003 Yeti Doll Claw Game
3400002 Melon Bubble Tea
3400001 Mango Bubble Tea
3400000 Cherry Bubble Tea
3400007 Transformed Doll Claw Game
3400006 Jr. Pepe Doll
3400005 Jr. Pepe Doll Claw Game
3400004 Yeti Doll
3400008 Transformed Doll Claw Game
9400591 Red Nirg
9400590 Margana
9400589 MV
9400588 Phantom Tree
9400587 Phantom Tree
9400586 Crimson Tree
9400585 Crimson Tree
9400584 Leprechaun
9400583 Leprechaun
9400582 Crimson Guardian
9400581 Stormbreaker
9400580 Elderwraith
9400579 Nightshadow
9400578 Firebrand
9400577 Firebrand
9400576 Windraider
9400607 Cake Monster
9400606 Giant Cake
9400605 Chocolate Cake
9400604 Deluxe Candle
9400603 Angry Strawberry Cake
9400602 Strawberry Cake
9400601 Birthday Candle
9400600 MasteriaPQ Mob Summoner
9400599 Black Bird
9400598 Dark Menhir
9400597 Azure Ocelot
9400596 Scarlet Phoenix
9400595 Blood Stirge
9400594 Master Guardian
9400593 Hsalf
9400592 Rellik
9400623 Amdusias
9400622 Strange Blue Mushroom
9400621 Strange Horny Mushroom
9400620 Strange Dark Stump
9400619 Strange Zombie Mushroom
6300100 Buffoon
9400618 Strange Dark Axe Stump
9400617 Strange Pig
9400616 Strange Green Mushroom
5100005 Hogul
9400615 Strange Ribbon Pig
9400614 Strange Orange Mushroom
5100004 Samiho
9400613 Valefor
9400612 Marbas
5100001 Transforming Jr. Yeti
9400611 Crocell
5100000 Jr. Yeti
9400610 Amdusias
5100003 Hodori
9400609 Andras
5100002 Firebomb
9400608 Big Puff Daddy
9400639 Dead Scarecrow
9400638 Rotting Skeleton
9400637 Cursed Black Cat
9400636 Black Cat
5120506 The Book Ghost
9400635 Cursed Frog
9400634 Frog
5120504 Wooden Target Dummy
9400633 Astaroth
5120505 Reindeer
9400632 Event Pink Bean
9400631 Event Horntail's Right Head
5120502 Sr. Bellflower Root
9400630 Event Horntail's Left Head
5120503 Straw Target Dummy
5120500 Grizzly
5120501 Bellflower Root
6230500 Master Soul Teddy
9400655 Strange Orange Mushroom
9400654 Event Pink Bean
8520000 Pianus
9400653 Possessed Rabbit Doll
9400652 Possessed Bear Doll
9400651 Possessed Rabbit Doll
9400650 Possessed Bear Doll
9400649 Possessed Rabbit Doll
9400648 Possessed Bear Doll
9400647 A Parasite
9400646 Totem2
9400645 Totem1
9400644 Malady
9400643 Olivia
9400642 Olivia
9400641 Olivia
9400640 Twisted Jester
9400657 Strange Green Mushroom
6230401 Jr. Lucida
9400656 Strange Ribbon Pig
6230400 Soul Teddy
8090000 Deet and Roi
3220001 Deo
3220000 Stumpy
6230602 Officer Skeleton
6230601 Dark Drake
6230600 Ice Drake
9700020 Metro Bubbling
9700021 Pharaoh Yeti
9700022 Transparent Pharaoh Yeti
9700023 Transparent Pharaoh Yeti
9700016 Mummy
9700017 Pharaoh Snake
9700018 Anubis
9700019 Pharaoh Jr. Yeti
9700028 Anubis
9700029 Pharaoh Jr. Yeti
9700030 瓕啰熫唡唄啶珝쟮
9700031 瓕啰熫唡唄啾篝쟮
9700024 Pyramid Mummydog
9700025 Pyramid Skeleton
9700026 Mummy
9700027 Pharaoh Snake
9700004 Pyramid Mummydog
9700005 Pyramid Skeleton
9700006 Mummy
9700007 Pharaoh Snake
9700000 Subway Slime
9700001 Subway Orange Mushroom
9700002 Subway Ribbon Pig
9700003 Subway Horny Mushroom
9700012 Pharaoh Snake
9700013 Anubis
9700014 Pyramid Mummydog
9700015 Pyramid Skeleton
9700008 Anubis
9700009 Pyramid Mummydog
9700010 Pyramid Skeleton
9700011 Mummy
9700036 颰唴㖽唡唄
9700037 ⃇唹㢾唡⛅唢
9700038 ⃇唹㢾唡⛅唢唚啷泍햹
9700032 瓕啰熫唡唄Ã웚샎
9700033 瓕啰熫唡唄Ó횦벺
9700034 瓕啰熫唡唄啚忏햳
9700035 糇쟱唡唄啯
4240000 Chief Gray
7140000 Ghost Pirate
2110200 Horny Mushroom
9303005 Tae Roon
9303004 Mushmom
9303007 Zeno
9303006 Rombot
9303001 Stumpy
9303000 Mano
9303003 Deo
9303002 King Slime
9303016 Leviathan
9303013 Crimson Balrog
9303012 Papa Pixie
9303015 Eliza
9303014 Seruf
9303009 King Sage Cat
9303008 Nine-Tailed Fox
9303011 Lord Pirate
9303010 Jr. Balrog
8160000 Gatekeeper
2110300 Sand Rat
2110301 Scorpion
8500001 Papulatus Clock
8500000 Time Sphere
8500003 High Darkstar
8500002 Papulatus
8500004 Low Darkstar
4220000 Seruf
4220001 Seruf
9000101 Lupin 2
9000100 Fire Boar 2
7120108 Robby
7120109 Iruvata
7120104 Silver Slime
7120105 Gold Slime
7120106 Overlord A
7120107 Overlord B
7120100 Gatekeeper Nex
7120101 Gatekeeper Nex
7120102 Gatekeeper Nex
7120103 Red Slime
8140000 Lycanthrope
8140001 Harp
8140002 Blood Harp
210100 Slime
9000001 Curse Eye 2
9000002 Horned Mushroom 2
3110102 Ratz
3110101 Pink Teddy
3110100 Ligator
4130104 Dark Nependeath
4130103 Rombot
4130102 Dark Nependeath
4130101 Tortie
4130100 Copper Drake
120100 Shroom
8140110 Birk
8140111 Dual Birk
8140100 Dark Yeti and Pepe
8140101 Black Kentaurus
8140102 Red Kentaurus
8140103 Blue Kentaurus
9500112 Jr. Pepe
9500113 Panda Teddy
9500114 King Blockpus
9500115 Lorang
9500116 Zombie Lupin
9500117 Helly
9500118 Tweeter
9500119 Toy Trojan
9500120 King Block Golem
9500121 Wraith
9500122 Chief Gray
9500123 Mixed Golem
9500124 Mushmom
9500125 Red Drake
9500126 Ice Drake
9500127 Master Soul Teddy
9410015 Snack Bar
9410014 Snack Bar
9410013 Doll Vending Machine
9410012 UFO Catcher
9410011 Jr. Pepe Doll
9500100 Slime
9500101 Pig
9410010 Jr. Pepe UFO Catcher
9410009 Yeti Doll
9500102 Orange Mushroom
9500103 Bubbling
9410008 Yeti UFO Catcher
9500104 Octopus
9410007 Green Bubble Tea
9410006 Yellow Bubble Tea
9500105 Green Mushroom
9500106 Horny Mushroom
9410005 Red Bubble Tea
9500107 Drumming Bunny
9410004 Biker Monkey
9410003 Clown Monkey
9500108 Ligator
9500109 Ratz
9410002 Angry Stray Dog
9410001 Stylish Stray Dog
9500110 Star Pixie
9500111 Jr. Wraith
9410000 Stray Dog
9500144 Coke Snail
9500145 Coke Seal
9500146 Play Seal
9500147 Yeti and Coketump
9500148 Igloo Turtle
9500149 Coke Golem
9500150 Ice Golem
9500151 Coke Slime
9500152 Coke Mushroom
9500153 Coketump
9500154 Coketump Lite
9500155 Three-Tailed Fox
9500156 Wraith
9500157 Jr. Wraith
9500158 Yellow King Goblin
9500159 Blue King Goblin
9500128 Dark Yeti
9500129 Taurospear
9500130 Blue King Goblin
9500131 Lucida
9500132 Werewolf
9500133 Yeti and Pepe
9500134 Lycanthrope
9500135 Death Teddy
9500136 Gigantic Viking
9500137 G. Phantom Watch
9500138 Bain
9500139 Jr. Balrog
9500140 Crimson Balrog
9500141 Separated Yeti
5150000 Mixed Golem
9500142 Separated Pepe
5150001 Skeleton Soldier
9500143 Coke Pig
9000201 Zombie Mushroom 2
9000200 Evil Eye 2
5400000 Jr. Pepe
1140100 Ghost Stump
8820006 Munin
8820007 Mini Bean
8820004 Rex the Wise
8820005 Hugin
8820002 Ariel
8820003 Solomon the Wise
8820000 Pink Bean
8820001 Pink Bean
8820014 Pink Bean
8820015 Solomon the Wise
8820012 Pink Bean
8820013 Pink Bean
8820010 Pink Bean
8820011 Pink Bean
8820008 Transparent Mob for summoning baby boss
8820009 set0 Transparent Mob
8820022 Hugin
3110303 Triple Rumo
3110302 Rumo
8820023 Munin
8820020 Solomon the Wise
3110301 Dark Sand Dwarf
1140130 Smirking Ghost Stump
3110300 Cube Slime
8820021 Rex the Wise
8820018 Munin
8820019 Ariel
8820016 Rex the Wise
8820017 Hugin
8820026 Hugin
8820027 Munin
8820024 Solomon the Wise
8820025 Rex the Wise
8140200 Klock
9000301 Blue Mushroom 2
9000300 Cold Eye 2
9500000 Making a wish to full moon
9500001 Making a wish to the full moon
9500002 Making a wish to the full moon
9500003 Making a wish to the full moon
9500004 Making a wish to the full moon
9500005 Making a wish to the full moon
9500304 Mirror Ghost 3
9500305 Jack-o-Lantern
9500306 Mano
9500307 Stumpy
9500308 Faust
9500309 King Clang
9500310 Timer
9500311 Dyle
9500312 Nine-Tailed Fox
9500313 Tae Roon
9500314 King Sage Cat
9500315 Eliza
9500316 Snow Yeti
9500317 Kid Snowman
9500318 Angry Snowman
9500319 Giant Snowman
9500300 Busted Doll
9500301 Destroyed Doll
9500302 Jack-o-Lantern at Pumpkin Farm
9500303 Mirror Ghost 2
9500336 P Junior
9500337 Mano
9500338 Stumpy
9500339 Deo
9500340 King Slime
9500341 Faust
9500342 King Clang
9500343 Alishar
9500344 Timer
9500345 Mushmom
9500346 Dyle
9500347 Zeno
9500348 Nine-Tailed Fox
9500349 Lord Pirate
9500350 Tae Roon
9500351 Papa Pixie
9500320 Lost Rudolph
9500321 Snowman
9500322 Kid Snowman
9500323 Kitty from Cheese Storage
9500324 Kitty from Cheese Storage
9500325 King Slime
9500326 Mushmom
9500327 Jr. Balrog
9500328 Crimson Balrog
9500329 Papa Pixie
9500330 Alishar
9500331 Papulatus
9500332 Pianus
9500333 Leviathan
9500334 Lord Pirate
9500335 Frankenroid
9500368 Ultra Gray
9500369 Chief Gray
9500370 Mecateon
9500371 Mateon
9500372 Plateon
9500373 Machine MT-09
9500352 King Sage Cat
9500353 Jr. Balrog
9500354 Frankenroid
9500355 Eliza
9500356 Chimera
9500357 Snow Yeti
9500358 Crimson Balrog
9500359 Manon
9500360 Griffey
9500361 Leviathan
9500362 Papulatus
9500363 Pianus
9500364 Mini Dungeon Transparent Monster
9500365 Mini Dungeon Agent Box
9500366 Barnard Gray
9500367 Zeta Gray
9500400 Gourd
8140300 Dark Klock
9500176 Blue Mushmom
9500177 Giant Centipede
9500178 Snack Bar
9500179 Transformed Snack Bar
9500180 Papulatus
9500181 Papulatus
9500182 Watermelon Guard Hogol
9500183 Watermelon Guard Hogol
9500184 Rideword P
9500185 Rideword Y
9500186 Rideword B
9500187 Busted Doll
9500188 Destroyed Doll
9500189 Gift Box
9500190 Toy Clown
9500191 Green Phantom
9500160 Green King Goblin
9500161 Hankie
9500162 Harp
9500163 Blood Harp
9500164 Black Kentaurus
9500165 Red Kentaurus
9500166 Blue Kentaurus
9500167 Golden Pig
9500168 King Slime
9500169 Jr. Balrog
9500170 Papa Pixie
9500171 Crimson Balrog
9500172 Alishar
8140512 Royal Guard
9500173 Griffey
9500174 Manon
9500175 Angry Lord Pirate
8140510 Gatekeeper Nex
8140511 Imperial Guard
8140500 Bain
9500192 Pumpkin Knight
9500193 Fire Steed
9500194 Mirror Ghost
9500195 Jack-o-Lantern
9500196 Ghost
9500197 Ghost
9500198 Gift Box
9500199 Toy Clown
9500200 Zoo Balrog
9500201 Zoo Yeti
9500202 Zoo White Fang
9500203 Zoo Pig
9500204 Zoo Ribbon Pig
1210102 Orange Mushroom
1210103 Bubbling
1210100 Pig
1210101 Ribbon Pig
3000005 Brown Teddy
3000004 Fairy 4
5220004 Giant Centipede
3000006 Krip
5220003 Timer
3000001 Fairy 1
5220002 Faust
3000000 Sentinel
3000003 Fairy 3
5220001 King Clang
5220000 King Clang
3000002 Fairy 2
100101 Blue Snail
100100 Snail
100121 Tiv
100120 Tino
100123 Tiru
100122 Timu
100124 Tiguru
100131 Murupa
100130 Muru
100133 Murumuru
100132 Murupia
100134 Murukun
5130108 Miner Zombie
5130106 Transforming Dark Jr. Yeti
5130107 Coolie Zombie
5130104 Hector
5130105 Dark Jr. Yeti
5130102 Dark Stone Golem
5130103 Croco
5130100 Drake
5130101 Stone Golem
8140600 Bone Fish
8120107 Maverick Type D
8120106 Maverick Type D
2230131 Annoyed Zombie Mushroom
8120105 Maverick Type S
8120104 Maverick Type A
8120103 Prototype Lord
8120102 Afterlord
8120101 Gatekeeper Nex
8120100 Gatekeeper Nex
2230102 Wild Boar
2230103 Trixter
1120100 Octopus
2230100 Evil Eye
8140555 Bombing Fish House
2230101 Zombie Mushroom
2230106 Cico
2230107 Krappy
2230104 Green Trixter
2230105 Seacle
2230110 Wooden Mask
2230111 Rocky Mask
2230108 Pinboom
2230109 Bubble Fish
8800006 Zakum's Arm 4
8800007 Zakum's Arm 5
8800004 Zakum's Arm 2
8800005 Zakum's Arm 3
8800002 Zakum3
8800003 Zakum's Arm 1
8800000 Zakum1
8800001 Zakum2
8800010 Zakum's Arm 8
8800008 Zakum's Arm 6
8800009 Zakum's Arm 7
2230200 Flower Fish
8140700 Blue Dragon Turtle
4110302 Mithril  mutae
8140701 Red Dragon Turtle
4110300 Iron Mutae
8140702 Rexton
8140703 Brexton
4110301 Reinforced Iron Mutae
9300109 Lord Pirate's Ginseng Jar
9300108 Lord Pirate's Jar
9300111 Lord Pirate's Ancient Bellflower
9300110 Lord Pirate's Bellflower
9300105 Angry Lord Pirate
9300104 Zeta Gray
6400100 Deep Buffoon
9300107 Peeking Lord Pirate
9300106 Enraged Lord Pirate
9300101 Tamable Hog
9300100 The Elemental Thanatos
9300103 Barnard Gray
9300102 Watchhog
9300097 Goby in Warped Dimension
9300096 Black Kentaurus
9300099 Shark in Warped Dimension
9300098 Bone Fish in Warped Dimension
9300125 Lord Pirate's Captain
9300124 Lord Pirate's Kru
9300127 Brown Teddy
9300126 Lord Pirate's Enraged Ginseng Jar
9300121 Lord Pirate's Furious Kru
9300120 Lord Pirate's Furious Mr. Alli
9300123 Lord Pirate's Mr. Alli
9300122 Lord Pirate's Furious Captain
9300117 Lord Pirate's Devoted Kru
9300116 Lord Pirate's Enraged Captain
9300119 Lord Pirate
9300118 Lord Pirate's Devoted Captain
9300113 Lord Pirate's 100yrOld Ancient Bellflower
9300112 Lord Pirate's 100yrOld Bellflower
9300115 Lord Pirate's Enraged Kru
9300114 Lord Pirate's Enraged Mr. Alli
9300141 Homun of Closed Laboratory
9300140 Angry Frankenroid
9300143 Reinforced Iron Mutae
9300142 Homunculu of hidden laboratory
9300137 Juliet
9300136 Rombot
9300139 Frankenroid
9300138 Romeo
9300133 Robo
9300132 Tick-Tock
9300135 Master Chronos
9300134 King Bloctopus
9300129 Ratz
9300128 Bloctopus
9300131 Toy Trojan
9300130 Chronos
9300157 Scorpion
9300156 Black Magician's Disciple
9300159 Inferno Kyrin
9300158 Kyrin
9300153 Obstacle Mutae
9300152 Angry Frankenroid
9300155 Pig
9300154 Experimental Neo Huroid
9300149 Roid
9300148 Neo Huroid
9300151 Frankenroid
9300150 Neo Huroid
9300145 Homun
9300144 Reinforced Mithril Mutae
9300147 Homunculus
9300146 Cyti
9300173 Poisoned Stone Bug
9300172 Poisoned Lord Tree
9300175 Poison Flower
9300174 Poisoned Spright
9300169 Ratz from Another Dimension
9300171 Bloctopus from Another Dimension
9300170 Black Ratz from Another Dimension
9300165 Peach Monkey
8190004 Skelosaurus
8190005 Nest Golem
9300164 The Book Ghost
9300166 Bomb
8190000 Jr. Newtie
9300161 Red Flower Serpent
9300160 Blue Flower Serpent
8190001 Jr. Newtie
8190002 Nest Golem
9300163 Sage Cat
9300162 Willi
8190003 Skelegon
9300189 Faust
9300188 Giant Centipede
9300191 Mushmom
9300190 King Clang
9300185 Stumpy
9300184 Mano
9300187 King Slime
9300186 Deo
9300181 Charged Poison Golem
9300180 Poison Golem
9300183 Deeply Poisoned Stone Bug
9300182 Super-Charged Poison Golem
9300177 Poison Golem Level 2
9300176 Poison Golem
9300179 Spright
9300178 Poison Golem Level 3
6400001 Transformed Dark Yeti
9300205 Frankenroid
6400000 Dark Yeti
9300204 Eliza
6400003 Cuzco
9300207 Snack Bar
6400002 Separated Dark Yeti
9300206 Chimera
6400005 ﳈ죈즴늵닁唢
9300201 Super-Charged Poison Golem
9300200 Tae Roon
6400004 Opachu
6400007 Baby Balrog
9300203 Jr. Balrog
6400006 Crimson Balrog
9300202 King Sage Cat
6400009 Crimson Balrog
9300197 Zeno
6400008 Jr. Balrog
9300196 Zombie Mushmom
9300199 Nine-Tailed Fox
9300198 Lord Pirate
9300193 Timer
9300192 Alishar
9300195 Papa Pixie
9300194 Dyle
9300221 Cactus
9300220 Axe Stump
9300223 Slime
9300222 Royal Cactus
9300217 Blue Snail
9300216 A transparent item for checking elimination
9300219 Stump
9300218 Red Snail
9300213 Leviathan
9300212 Griffey
9300215 Mu Gong Merits
9300214 Papulatus
9300209 Blue Mushmom
9300208 Snowman
9300211 Manon
9300210 Crimson Balrog
9001001 Grendel the Really Old's Clone
9300013 King Block Golem from Another Dimension
9300012 Alishar
9001000 Dances with Balrog's Clone
9001003 Dark Lord's Clone
9300015 Cronos
9001002 Athena Pierce's Clone
9300014 Dark Eye from Another Dimension
9300009 Block Golem from Another Dimension
9001005 OctoPirate
9001004 Shadow Kyrin
9300008 Shadow Eye from Another Dimension
9001007 Scarecrow for Training
9300011 Toy Trojan
9300010 Rombad from Another Dimension
9001006 OctoPirate
9300005 Ratz from Another Dimension
9300004 Mimic
9300007 Bloctopus from Another Dimension
9300006 Black Ratz from Another Dimension
9300001 Ligator (PC)
9300000 Jr. Necki (PC)
4090000 Iron Hook
9300003 King Slime
9300002 Curse Eye (PC)
9300029 Lion Statue A
9300028 Ergoth
9300031 Knight Statue A
9300030 Lion Statue B
9300025 Gargoyle
8141000 Spirit Viking
9300024 Puppet Golem
9300027 Devil Slime
9300026 Jr. Gargoyle
9001009 Master of Disguise
9300021 Dark Muscle Stone
9300020 Muscle Stone
9001008 Shadow Kyrin's Clone
9300023 Myst Knight
9001011 Tiguru of Exam
9300022 Black Knight
9001010 Black Witch
9300017 Master Cronos
9001013 Thief Crow
9001012 Scarred Bear
9300016 Platoon Cronos
6220000 Dyle
9300019 Master Muscle Stone
6220001 Zeno
9001014 Uncontrollable Maha
9300018 Tutorial Jr. Sentinel
9300045 Lunar Pixie in Tower of Goddess
9300044 Lucida in Tower of Goddess
9300047 Luster Pixie in Tower of Goddess
9300046 Star Pixie in Tower of Goddess
9300041 Cellion in Tower of Goddess
9300040 Cellion in Tower of Goddess
9300043 Lioner in Tower of Goddess
9300042 Grupin in Tower of Goddess
9300037 Mist Knight
9300036 Black Knight
9300039 Papa Pixie
9300038 Ghost Pixie
9300033 Jr. Gargoyle
9300032 Knight Statue B
5200002 Fire Sentinel
5200001 Ice Sentinel
9300035 Jr. Gargoyle
9300034 Mist Knight
5200000 Jr. Sentinel
9300061 Moon Bunny
9300060 Iron Hog
9300063 Stirge
9300062 Flyeye
9300057 Cellion in Tower of Goddess
9300056 Luster Pixie in Tower of Goddess(Summon Boss)
9300059 Ribbon Pig
9300058 Pig
9300053 Jr. Grupin in Tower of Goddess
9300052 Jr. Lioner in Tower of Goddess
9300055 Star Pixie in Tower of Goddess(Summon Boss)
9300054 Lunar Pixie in Tower of Goddess(Summon Boss)
9300049 Royal Nependeath in Tower of Goddess
9300048 Nependeath in Tower of Goddess
9300051 Jr. Cellion in Tower of Goddess
9300050 Flying Boogie
9300077 T-Skelegon in Cave
9300076 Skelegon 2 in Cave
9300079 Nest Golem in Cave
9300078 Jr. Newtie in Cave
9300073 Dark Wyvern 1 in Cave
9300072 Blue Wyvern 2 in Cave
9300075 Skelegon 1 in Cave
2300100 Stirge
9300074 Dark Wyvern 2 in Cave
9300069 Red Wyvern 1 in Cave
9300068 Dark Cornian 2 in Cave
9300071 Blue Wyvern 1 in Cave
9300070 Red Wyvern 2 in Cave
9300065 Green Cornian1 in Cave
9300064 Goblin Fire
9300067 Dark Cornian 1 in Cave
9300066 Green Cornian 2 in Cave
9300093 Tylus
9300092 Jr. Balrog in Forgotten Shrine
9300095 Lycanthrope the Kidnapper
9300094 Crimson Balrog the Kidnapper
9300089 Phoenix
9300088 Dark Lord's Disciple
9300091 Buff Rocky in the Dark
9300090 Freezer
9300085 Jr. Balrog in Another World
9300084 Deathly Fear
9300087 The Charging Taurospear
9300086 The Elemental Thanatos
9300081 Flyeye
9300080 Kru
9300083 Goblin Fire
9300082 Stirge
9300365 Grii Gingerman
9300364 Sma Gingerman
9300367 Witch Bear
9300366 Grii Gingerman
9300361 Grii Gingerman
9300360 Grii Gingerman
9300363 Grii Gingerman
9300362 Grii Gingerman
9300357 Grii Gingerman
9300356 Sma Gingerman
9300359 Sma Gingerman
9300358 Grii Gingerman
9300353 Gentleman
9300352 Gentleman
9300355 Shapeshifter
9300354 Wolf Underling
9300381 Black Mage Skelegon
9300380 Black Mage Cornian
9300383 Tutorial Muru
9300382 ???
9300377 Witch Bear
9300376 Witch Bear
9300379 Black Mage Wyvern
9300378 Giant Nependeath
9300373 Witch Bear
9300372 Witch Bear
9300375 Witch Bear
9300374 Witch Bear
9300369 Witch Bear
9300368 Witch Bear
9300371 Witch Bear
9300370 Witch Bear
8141100 Gigantic Spirit Viking
9300237 Ghost Pixie
9300236 Luster Pixie
9300239 Zeta
9300238 Zombie Mushroom
9300233 Tick-Tock
9300232 Tick
9300235 Croko
9300234 Ligator
8141300 Squid
9300229 Orange Mushroom
9300228 Clang
9300231 Master Chronos
9300230 Platoon Chronos
9300225 Lupin
9300224 Black Sheep
9300227 Lorang
9300226 Zombie Lupin
9300253 Reinforced Mithril Mutae
9300252 Reinforced Iron Mutae
9300255 Mithril Mutae
9300254 Reinforced Iron Mutae
9300249 Tauromacis
9300248 Sage Cat
9300251 Lucida
9300250 Taurospear
9300245 Panda
9300244 Grizzly
9300247 Stone Bug
9300246 Tree Road
9300241 Kru
9300240 Ultra Gray
9300243 Samiho
9300242 Captain
9300269 So Gong
9300268 Tae Roon
9300271 Target Slime
9300270 Mingu
3230101 Jr. Wraith
9300265 Blue Wyvern
9300264 Dark Wyvern
3230100 Curse Eye
3230103 King Bloctopus
9300267 Low Darkstar
9300266 High Darkstar
3230102 Lorang
9300261 Black Kentaurus
9300260 Jr. Balrog
3230104 Mask Fish
9300263 Blue Kentaurus
9300262 Red Kentaurus
9300257 Transforming Doll Machine  (After)
9300256 Transforming Doll Machine  (Before)
9300259 Blue Mushroom
9300258 Yeti
9300285 Puppeteer
9300284 Transforming Yellow Snail of the Maze
9300287 Snowman of Competence
9300286 Dangerous Blue Mushroom
9300281 Transforming Green Snail of the Maze
9300280 Transforming Yellow Snail of the Maze
9300283 Transforming Yellow Snail of the Maze
9300282 Blue Transforming Snail of the Maze
9300277 Blue Snail of the Maze
9300276 Green Snail of the Maze
9300279 Purple Snail of the Maze
9300278 Red Snail of the Maze
9300273 Target Pig
9300272 Target Orange Mushroom
9300275 Yellow Snail of the Maze
9300274 Cynical Orange Mushroom
9300301 Purple Ribbon Pig of the Maze
9501008 Seduce
9501009 Immune to Weapon
9300300 Blue Ribbon Pig of the Maze
9501010 Immune to Magic
9300303 Sky Mushroom of the Maze I
9501011 Cancel Element
9300302 Pig of the Maze
9501012 Reduce Element
9300297 Mutae of the Maze
9300296 The Cool Shade of the Maze
9501013 Expand Element
9501014 Undead
9300299 Green Ribbon Pig of the Maze
9300298 Red Ribbon Pig of the Maze
9501015 Boss
9300293 Advanced Leviathan
9300292 Advanced Griffey
9501017 Skull
3230200 Star Pixie
9300295 The Dangerous Tree of the Maze
9501018 Stat Change Test
9300294 Advanced Pianus
9300289 Snipe of Competence
9300288 Crimson Balrog of Competence
9300291 Advanced Manon
9300290 Lilynouch of Competence
4250000 Mossy Snail
9300317 Lazy Buffy
4250001 Tree Rod
9300316 Soul Teddy
9300319 Klock
9300318 Master Soul Teddy
9300313 Witch Cat
9300312 Pigmy that lays Golden Eggs
9300315 Buffy
9300314 Witch Cat
9300309 Rash of the Maze
9501000 Sealed
9501001 Darkness
9300308 Sky Mushroom of the Maze VI
9501002 Weakness
9300311 Bam Bam Cat
9300310 Sand Rabbit of the Maze
9501003 Knocked Out
9300305 Sky Mushroom of the Maze III
9501004 Cursed
9300304 Sky Mushroom of the Maze II
9501005 Poisoned
9300307 Sky Mushroom of the Maze V
9501006 Slow
9300306 Sky Mushroom of the Maze IV
9501007 Disable Buff
9300332 Barnard Gray
9300335 Mateon
9300334 Chief Gray
9300329 Wolf's Bomb
6130104 Boogie
9300328 Tutorial Tino
9300331 Gaga
9300330 Rose Thorn
6130101 Mushmom
9300325 Cat Sleeping Spot
9300324 Viking
6130100 Red Drake
6130103 Pepe
9300327 Balrog Corpse
6130102 Separated Pepe
9300326 Unknown Jr. Balrog
9300321 Deep Buffoon
9300320 Buffoon
9300323 Death Teddy
9300322 Ghost Pirate
9300349 Gentleman
9300348 Giant
9300351 Shadow Knight
9300350 Mu Gong's Shadow
9300345 Puppeteer
9300344 Puppeteer
9300347 Giant Nependeath
9300346 Puppeteer
9300341 Target Slime
9300340 Maple Bday Cake
9300343 Target Pig
9300342 Target Orange Mushroom
9300337 Mecateon
9300336 Mecateon
9300339 Space Mateon
9300338 Rescued Gaga
8510100 Bloody Boom
6130204 Mr. Alli
6130207 Peach Monkey
6130201 Blin
6130200 Buffy
6130203 Panda
6130202 Morphed Blin
5110301 Roid
3230305 Toy Trojan
5110300 Reinforced Mithril Mutae
3230304 Planey
3230307 Chirppy
5110302 Neo Huroid
3230306 Chronos
3230308 Tweeter
9100010 Mr. Black Sheep
9100008 Super Coke Snail 1
9100009 Super Coke Snail 2
9100013 Adin
9100002 Super Stirge
9100003 Ultra Jr. Necki 1
9100000 Super Slime
9100001 Super Jr. Necki
9100006 Super Green Trickster
3230301 Jr. Boogie 2
8170000 Thanatos
3230300 Jr. Boogie 1
9100007 Super Ribbon-Pig
3230303 Propelly
9100004 Ultra Jr. Necki 2
9100005 Super Trickster
3230302 Bloctopus
6130209 Sage Cat
6130208 Kru
3300002 Intoxicated Pig
3300003 Helmet Pepe
3300000 Renegade Spores
3300001 Poison Mushroom
3300006 Gold Yeti and King Pepe
3300007 White Yeti and King Pepe
3300004 Royal Guard Pepe
3300005 Grey Yeti and King Pepe
3300008 Prime Minister
5090001 Master Dummy
5090000 Shade
8510000 Pianus
3230400 Drumming Bunny
3230405 Jr. Seal
3210100 Fire Boar
7220004 Bergamot
7220005 Bergamot
7220002 King Sage Cat
7220003 Bergamot
7220000 Tae Roon
7220001 Nine-Tailed Fox
5250000 Mossy Mushroom
5250001 Stone Bug
5250002 Primitive Boar
8150000 Crimson Balrog
4230100 Cold Eye
7130104 Captain
4230101 Zombie Lupin
4230102 Wraith
4230103 Iron Hog
4230104 Clang
7130100 Tauromacis
7130101 Taurospear
4230105 Nependeath
4230106 Lunar Pixie
7130102 Yeti and Pepe
4230107 Flyeye
7130103 Commander Skeleton
4230108 Jr. Cerebes
4230109 Block Golem
4230110 King Block Golem
4230111 Robo
4230112 Master Robo
4230113 Tick-Tock
4230114 Platoon Chronos
4230115 Master Chronos
2100100 Desert Rabbit (F)
4230116 Barnard Gray
2100101 Desert Rabbit (M)
4230117 Zeta Gray
2100102 Jr. Cactus
4230118 Ultra Gray
2100103 Cactus
4230119 Mateon
2100104 Royal Cactus
4230120 Plateon
4230121 Mecateon
2100105 Bellamoa
4230122 Nependeath
2100106 Ear Plug Plead
4230123 Sparker
2100107 Scarf Plead
2100108 Meerkat
4230124 Freezer
4230125 Skeledog
4230126 Mummydog
7130020 Goby
3210208 Retz
3210200 Jr. Cellion
3210201 Jr. Lioner
3210202 Jr. Grupin
3210203 Panda Teddy
3210204 Roloduck
3210205 Black Ratz
3210206 Helly
3210207 Tick
7130010 Death Teddy
7130004 Hankie
7130000 Lucida
7130001 Cerebes
7130002 Beetle
7130003 Dual Beetle
6110301 Saitie
6110300 Homun
8150100 Shark
8150101 Cold Shark
7130200 Werewolf
130101 Red Snail
130100 Stump
9420015 NooNoo
9420005 White Rooster
9420004 Yellow Lizard
9420003 Red Lizard
9420002 Python
9420001 Frog
9420000 Toad
4230200 Poopa
4230201 Poison Poopa
9600002 Duck
9600003 Sheep
9600001 Rooster
9600006 Cow
9600007 Plow Ox
9600004 Goat
9600005 Black Goat
9600010 Giant Centipede
9600008 Black Sheep
9600009 Giant Centipede
4300001 Blue Perfume
4300000 Blue Perfume
4300003 Yellow Perfume
4300002 Yellow Perfume
4300005 Pink Perfume
4300004 Pink Perfume
4300007 Female Mannequin
4300006 Kid Mannequin
4300009 Latest Hits Compilation
4300008 Male Mannequin
4300011 Cheap Amplifier
4300010 Greatest Oldies
4300013 Spirit of Rock
4300012 Fancy Amplifier
4300015 Cheap Amplifier
4300014 Greatest Oldies
8830006 Balrog
4300017 Spirit of Rock's Soul
8830007 Balrog
4300016 Fancy Amplifier
8830004 Balrog
8830005 Balrog
8830002 Balrog
8830003 Balrog
8830000 Balrog
8830001 Balrog
8830012 Balrog
8830013 Balrog
8830010 Balrog
8830011 Balrog
8830008 Balrog
8830009 Balrog
8150200 Green Cornian
8150201 Dark Cornian
8142000 Phantom Watch
9600066 New Year's Party Pouch
7130300 Master Death Teddy
9600065 Holiday Super Sock
4230300 Moon Bunny
3210450 Scuba Pepe
8220013 Nibelung
8220012 Oberon
8220015 Nibelung
8220014 Nibelung
8220009 Snack Bar
8220008 Unknow Snack Bar
8220011 Aufheben
8220010 Dunas
8220005 Lilynouch
8220004 Dodo
8220007 Blue Mushmom
8220006 Lyka
8220001 Snowman
8220000 Eliza
8220003 Leviathan
8220002 Chimera
4230500 Chipmunk
4230501 Red Porky
4230502 Black Porky
4230503 Blue Flower Serpent
4230504 Red Flower Serpent
4230505 Jar
4230506 Ginseng Jar
4230400 Iron Boar
6090004 Rurumo
6090000 Riche
7130400 Yellow King Goblin
6090001 Snow Witch
7130401 Blue King Goblin
6090002 Bamboo Warrior
7130402 Green King Goblin
6090003 Scholar Ghost
8150300 Red Wyvern
8150301 Blue Wyvern
8150302 Dark Wyvern
8142100 Risell Squid
7130600 Hobi
7130601 Green Hobi
7130602 Thorny Vine
4230600 Desert Giant
7130500 Rash
3100102 Kiyo
7130501 Dark Rash
3100101 Sand Dwarf
3210800 Lupin
9400014 Black Crow
9400013 Dreamy Ghost
9400012 Water Goblin
9400011 Paper Lantern Ghost
9400010 Flaming Raccoon
9400009 Crow
9400008 Black Boogie
8130100 Jr. Balrog
9400007 Green Boogie
9400006 Blue Boogie
9400005 Red Boogie
9400004 Big Cloud Fox
9400003 Nightghost
9400002 Cloud Fox
9400001 Fire Raccoon
9400000 Crow
9420511 Selkie Jr.
9420510 Slimy
9420509 Pac Pinky
9420508 Octobunny
9420507 Trucker
9420506 Batoo
9420505 Tippo Blue
9420504 Tippo Red
9420503 Nospeed
9420502 Biner
9420501 Freezer
9420500 Stopnow
9420527 Chlorotrap
1130100 Axe Stump
5140000 White Fang
9420513 Capt. Latanica
9420512 Mr. Anchor
9420543 Angry Targa
9420542 Targa
9420541 Targa
9420540 Gallopera
9420539 Vikerola
9420538 Booper Scarlion
9420537 Yabber Doo
9420536 Froscola
9420535 Jester Scarlion
9420534 Charmer
9420533 Rodeo
9420532 Ratatula
9420531 Scaredy Scarlion
9420530 Oly Oly
9420529 Dark Fission
9420528 Emo Slime
8810006 Horntail's Right Hand
8810007 Horntail's Wings
8810004 Horntail's Head C
8810005 Horntail's Left Hand
8810002 Horntail's Head A
8810003 Horntail's Head B
8810000 Horntail's Left Head
8810001 Horntail's Right Head
8810014 Dead Horntail's Right Hand
8810015 Dead Horntail's Wings
8810012 Dead Horntail's Head C
8810013 Dead Horntail's Left Hand
8810010 Dead Horntail's Head A
8810011 Dead Horntail's Head B
8810008 Horntail's Legs
8810009 Horntail's Tails
8810022 Green Cornian
8810023 Dark Cornian
8810020 Blue Wyvern
8810021 Dark Wyvern
8810018 Horntail
8810019 Red Wyvern
8810016 Dead Horntail's Legs
8810017 Dead Horntail's Tails
8810026 Summon Horntail
8810024 Summon Horntail's Left Head
8810025 Summon Horntail's Right Head
7110300 D. Roy
7110301 Homunculus
9400205 Blue Mushmom
9400204 Red Slime
9400203 Silver Slime
9400202 Golden Slime
9400201 Wild Cargo
9400200 Malady
9400218 Tauromacis (JP)
9400217 Flyeye (JP)
9400216 Zeta Gray (JP)
9400215 Ultra Gray (JP)
9400214 Master Chronos (JP)
9400213 Dark Jr. Yeti (JP)
9400212 Stone Golem (JP)
9400211 Dark Stone Golem (JP)
9400210 Coolie Zombie (JP)
9400209 Miner Zombie (JP)
9400239 Sand Rat
9400238 Drumming Bunny
8200012 Chief Oblivion Guardian
8200009 Oblivion Monk
8200008 Chief Qualm Guardian
8200011 Oblivion Guardian
9400249 Roid
8200010 Oblivion Monk Trainee
9400248 Sand Rat
9400247 Drumming Bunny
8200005 Qualm Monk
8200004 Chief Memory Guardian
9400246 Horny Mushroom
8200007 Qualm Guardian
9400245 Zombie Mushroom
8200006 Qualm Monk Trainee
9400244 Mixed Golem
9400243 Stone Golem
8200001 Memory Monk
7090000 Security Camera
8200000 Eye of Time
9400242 Ribbon Pig
8200003 Memory Guardian
9400241 Pig
8200002 Memory Monk Trainee
9400240 Roid
9400300 The Boss
5300000 Leatty
9400319 Cross (Easy)
5300001 Dark Leatty
9400318 Toe (Hard)
9400317 Tac (Hard)
9400316 Tic (Hard)
9302009 Golden Pig
9400315 Toe (Medium)
9400314 Tac (Medium)
9302008 Golden Pig
9400313 Tic (Medium)
9302011 Lupin Pig
9302010 Golden Pig
9400312 Toe (Easy)
9302005 Golden Pig
9400311 Tac (Easy)
9400310 Tic (Easy)
9302004 Golden Pig
9302007 Golden Pig
9302006 Golden Pig
9302001 Golden Pig
9302000 Golden Pig
9302003 Golden Pig
9302002 Golden Pig
9420550 Scaredy Scarlion
9420549 Furious Scarlion Boss
9420548 Angry Scarlion Boss
9420547 Scarlion Boss
9420546 Scarlion Boss
9420545 Ratatula
9420544 Furious Targa
9400111 Leader B
9400110 Leader A
9400103 Extra D
9400102 Extra C
9400101 Extra B
9400100 Extra A
9400122 Male Boss
9400121 Female Boss
9400120 Male Boss
9400114 Slot Machine
9400113 Bodyguard B
9400112 Bodyguard A
2220000 Mano
5300100 Malady
 */