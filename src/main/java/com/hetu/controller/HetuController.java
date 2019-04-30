package com.hetu.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.hetu.util.HetuKryptaaja;

@Controller
@RequestMapping(value = "/")
public class HetuController {
	 private static String LopullinenHetu;
	
	  // Kysytään hetua käyttäjältä
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String sendHetu(Model model) {
			model.addAttribute("LopullinenHetu", LopullinenHetu);
			return "index";
		}

		// Lasketaan hetu saaduista parametreistä
		@RequestMapping(value = "/laske", method = RequestMethod.POST)
		public String getHetu(@RequestParam("paiva") String paiva,@RequestParam("kuukausi") String kuukausi,@RequestParam("vuosi") String vuosi) {
			
			Map<Integer, String> hetuMap = new HashMap<>();
			hetuMap.put(0, "0");
			hetuMap.put(1, "1");
			hetuMap.put(2, "2");
			hetuMap.put(3, "3");
			hetuMap.put(4, "4");
			hetuMap.put(5, "5");
			hetuMap.put(6, "6");
			hetuMap.put(7, "7");
			hetuMap.put(8, "8");
			hetuMap.put(9, "9");
			hetuMap.put(10, "A");
			hetuMap.put(11, "B");
			hetuMap.put(12, "C");
			hetuMap.put(13, "D");
			hetuMap.put(14, "E");
			hetuMap.put(15, "F");
			hetuMap.put(16, "H");
			hetuMap.put(17, "J");
			hetuMap.put(18, "K");
			hetuMap.put(19, "L");
			hetuMap.put(20, "M");
			hetuMap.put(21, "N");
			hetuMap.put(22, "P");
			hetuMap.put(23, "R");
			hetuMap.put(24, "S");
			hetuMap.put(25, "T");
			hetuMap.put(26, "U");
			hetuMap.put(27, "V");
			hetuMap.put(28, "W");
			hetuMap.put(29, "X");
			hetuMap.put(30, "Y");
			
			// Laskee viimeisen merkin
			Random rn = new Random();
			String hetuNumero = String.valueOf(rn.nextInt(899 - 2));

			// Lisätään etunollat hetuNumeron eteen riippuen sen nykyisestä arvosta
			if (Integer.valueOf(hetuNumero) < 10) {
				hetuNumero = "00".concat(hetuNumero);
			} else if (Integer.valueOf(hetuNumero) >= 10 && Integer.valueOf(hetuNumero) < 100) {
				hetuNumero = "0".concat(hetuNumero);
			}

			final String hetu = new StringBuilder().append(paiva).append(kuukausi).append(vuosi).toString();
			final Integer hetuNumeroJaettu = Integer.valueOf(hetu.concat(hetuNumero))%31;
			final String hetuConvert=new StringBuilder().append(hetu).append("-").append(hetuNumero).toString();

			// Hakee mapista viimeisen merkin hetulle
			LopullinenHetu = new StringBuilder().append(hetuConvert).append(hetuMap.get(hetuNumeroJaettu)).toString();

			// Kryptattu hetu
			HetuKryptaaja sk = new HetuKryptaaja();
			final String crypted=sk.crypted(LopullinenHetu);

			System.out.println("generoitu hetusi on: "+LopullinenHetu);
			System.out.println("generoitu hetusi on: "+crypted);	
		  
			return "redirect:/";
		}
}