package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public List<StarWars> starWars() {
        Weapon weapon1 = new Weapon("ライトセーバー(緑)");
        Weapon weapon2 = new Weapon("ライトセーバー(青)");
        Weapon weapon3 = new Weapon("ライトセーバー(赤)");
        Weapon weapon4 = new Weapon("ブラスター");

        List<StarWars> character = List.of(
                new StarWars("ルーク", "反乱同盟軍", weapon1),
                new StarWars("オビワン", "反乱同盟軍", weapon2),
                new StarWars("レイア姫", "反乱同盟軍", weapon4),
                new StarWars("ベイダー卿", "帝国軍", weapon3),
                new StarWars("パルパティーン", "帝国軍", weapon3),
                new StarWars("ターキン提督", "帝国軍", weapon4));
        return character;
    }
}
