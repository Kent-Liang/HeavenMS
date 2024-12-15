package client.command.commands.gm2;

import client.*;
import client.command.Command;
import provider.MapleData;
import provider.MapleDataProviderFactory;

import java.io.File;

public class LearnSkillCommand extends Command {
    {
        setDescription("");
    }

    @Override
    public void execute(MapleClient client, String[] params) {
        MapleCharacter player = client.getPlayer();
        for (MapleData skill_ : MapleDataProviderFactory.getDataProvider(new File(System.getProperty("wzpath") + "/" + "String.wz")).getData("Skill.img").getChildren()) {
            try {
                Skill skill = SkillFactory.getSkill(Integer.parseInt(skill_.getName()));
                int job = skill.getId() / 10_000;
                if (player.getJob().getId() == job) {
                    player.changeSkillLevel(skill, player.getSkillLevel(skill), skill.getMaxLevel(), -1);
                }
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
                break;
            } catch (NullPointerException npe) { }
        }

        player.yellowMessage("Skills learned");
    }
}
