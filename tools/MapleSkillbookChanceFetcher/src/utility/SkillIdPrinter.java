package utility;

import provider.MapleData;
import provider.MapleDataProvider;
import provider.MapleDataProviderFactory;

import java.io.File;

public class SkillIdPrinter {

    public static void main(String[] args) {
        MapleDataProvider stringDataWZ = MapleDataProviderFactory.getDataProvider(new File("C:\\Nexon\\MapleStory" + "/String.wz"));
        MapleData data = stringDataWZ.getData("Skill.img");

        for (MapleData item : data.getChildren()) {
            if (item.getChildren().size() == 1) {
                System.out.println("itemid: " + item.getName() + " name: " + item.getChildren().get(0).getData());
            } else {
                System.out.println("itemid: " + item.getName() + " name: " + item.getChildren().get(0).getData() + " description: " + item.getChildren().get(1).getData());
            }
        }
    }
}
