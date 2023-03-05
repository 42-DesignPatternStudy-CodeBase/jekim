package kr.ft.seoul.StrategyPattern;

public class TestBaseClass {
    public boolean isDefinitlyEqualsString(String str1, String str2) {
        return str1.compareTo(str2) == 0;
    }

    public int getRandomIntWithoutRange(int rand_min, int rand_max, int range_min, int range_max) {
        int rand = (int) (Math.random() * (rand_max - rand_min + 1)) + rand_min;
        while (rand >= range_min && rand <= range_max) {
            rand = (int) (Math.random() * (rand_max - rand_min + 1)) + rand_min;
        }
        return rand;
    }

    public int getRandomInt(int rand_min, int rand_max) {
        return (int) (Math.random() * (rand_max - rand_min + 1)) + rand_min;
    }

	public String getRandomString(int size) {
		if(size > 0) {
			char[] tmp = new char[size];
			for(int i=0; i<tmp.length; i++) {
				int div = (int) Math.floor( Math.random() * 2 );
				
				if(div == 0) { // 0이면 숫자로
					tmp[i] = (char) (Math.random() * 10 + '0') ;
				}else { //1이면 알파벳
					tmp[i] = (char) (Math.random() * 26 + 'A') ;
				}
			}
			return new String(tmp);
		}
		return "ERROR : Size is required.";
	}
}
