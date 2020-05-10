package cn.lu.fm.data;

import cn.lu.fm.entity.FmClub;
import cn.lu.fm.entity.FmPlayer;
import cn.lu.fm.entity.FmSkill;
import cn.lu.fm.mapper.FmClubMapper;
import cn.lu.fm.mapper.FmPlayerMapper;
import cn.lu.fm.mapper.FmSkillMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lu
 * @date 2020/4/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class NeoDataTests {

    @Autowired
    private FmPlayerMapper playerMapper;

    @Autowired
    private FmClubMapper clubMapper;

    @Autowired
    private FmSkillMapper skillMapper;

    /**
     *
     * @throws Exception
     */
    @Test
    public void loadPlayer() throws Exception {
        List<File> fileList = new ArrayList<>();
        Resource resource = new ClassPathResource("data/neotechnology.txt");
        String path = resource.getFile().getPath();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        int count = 0;
        List<FmPlayer> playerList = new ArrayList<>();
        List<FmClub> clubList = new ArrayList<>();
        List<FmSkill> skillList = new ArrayList<>();
        Map<String, FmClub> clubMap = new HashMap<>();
        Map<String, FmSkill> skillMap = new HashMap<>();
        String line = reader.readLine();
        while (null != line) {
            String [] data = line.split("\t");
            String playerName = data[1];
            String playerLevel = data[2];
            String clubs = data[3];
            String nationality = data[4];
            String position1 = data[5];
            String skill1 = data[7];
            String skill2 = data[8];
            String skill3 = data[9];
            String skill4 = data[10];
            int ability = Integer.parseInt(data[11]);
            int addition = Integer.parseInt(data[12]);
            int train = Integer.parseInt(data[14]);
            String nickname = data[15];
            String source = data[16];

            String [] club_data = clubs.split("、");
            for (String s : club_data) {
                if (!clubMap.containsKey(s)) {
                    FmClub c = new FmClub();
                    c.setClubName(s);
                    c.setShortName(s);
                    clubMap.put(s, c);
                }
            }

            parseSkill(skillMap, skill1);
            parseSkill(skillMap, skill2);
            parseSkill(skillMap, skill3);
            parseSkill(skillMap, skill4);

            FmPlayer player = new FmPlayer();
            player.setPlayerName(playerName);
            player.setNickName(nickname);
            if (playerLevel.equalsIgnoreCase("CL")) {
                player.setLevel(12);
            } else if (playerLevel.equalsIgnoreCase("S+")) {
                player.setLevel(11);
            } else {
                player.setLevel(0);
            }
            player.setNationality(nationality);
            player.setPosition(getPosition(position1));
            player.setAbility(ability);
            player.setAddition(addition);
            player.setTrain(train);
            player.setResource(source);
            playerList.add(player);
            line = reader.readLine();
        }
        reader.close();

        for (FmClub c : clubMap.values()) {
            clubList.add(c);
        }
        clubMapper.insertList(clubList);

        for (FmSkill s : skillMap.values()) {
            skillList.add(s);
        }
        skillMapper.insertList(skillList);

        count += playerMapper.insertList(playerList);
        log.info("count=%d", count);
    }

    void parseSkill(Map<String, FmSkill> skillMap, String skill) {
        if (!skillMap.containsKey(skill)) {
            FmSkill s = new FmSkill();
            s.setSkillName(skill);
            s.setShortName(skill.substring(0, 1));
            skillMap.put(skill, s);
        }
    }

    String getPosition(String position) {
        if (position.contains("锋")) {
            return "F";
        }

        if (position.contains("腰")) {
            return "M";
        }

        if (position.contains("前卫")) {
            return "M";
        }

        if (position.contains("后卫")) {
            return "D";
        }

        if (position.contains("门")) {
            return "G";
        }

        log.error("position={%s}", position);
        return "";
    }

}
