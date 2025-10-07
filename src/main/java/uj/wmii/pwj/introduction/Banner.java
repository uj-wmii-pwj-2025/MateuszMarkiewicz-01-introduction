package uj.wmii.pwj.introduction;

import java.util.HashMap;
import java.util.Map;

public class Banner {

    private final Map<Character, String[]> alphabet = new HashMap<>();

    Banner() {
        init();
    }

    void init() {
        alphabet.put('A', new String[] {
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #",
                "#######",
                "#     #",
                "#     #"
        });
        alphabet.put('B', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#     #",
                "#     #",
                "###### "
        });
        alphabet.put('C', new String[] {
                " ##### ",
                "#     #",
                "#      ",
                "#      ",
                "#      ",
                "#     #",
                " ##### "
        });
        alphabet.put('D', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "###### "
        });
        alphabet.put('E', new String[] {
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#######"
        });
        alphabet.put('F', new String[] {
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#      "
        });
        alphabet.put('G', new String[] {
                " ##### ",
                "#     #",
                "#      ",
                "#  ####",
                "#     #",
                "#     #",
                " ##### "
        });
        alphabet.put('H', new String[] {
                "#     #",
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #",
                "#     #"
        });
        alphabet.put('I', new String[] {
                "###",
                " # ",
                " # ",
                " # ",
                " # ",
                " # ",
                "###"
        });
        alphabet.put('J', new String[] {
                "      #",
                "      #",
                "      #",
                "      #",
                "#     #",
                "#     #",
                " ##### "
        });
        alphabet.put('K', new String[] {
                "#    #",
                "#   # ",
                "#  #  ",
                "###   ",
                "#  #  ",
                "#   # ",
                "#    #"
        });
        alphabet.put('L', new String[] {
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#######"
        });
        alphabet.put('M', new String[] {
                "#     #",
                "##   ##",
                "# # # #",
                "#  #  #",
                "#     #",
                "#     #",
                "#     #"
        });
        alphabet.put('N', new String[] {
                "#     #",
                "##    #",
                "# #   #",
                "#  #  #",
                "#   # #",
                "#    ##",
                "#     #"
        });
        alphabet.put('O', new String[] {
                "#######",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#######"
        });
        alphabet.put('P', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#      ",
                "#      ",
                "#      "
        });
        alphabet.put('Q', new String[] {
                " ##### ",
                "#     #",
                "#     #",
                "#     #",
                "#   # #",
                "#    # ",
                " #### #"
        });
        alphabet.put('R', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#   #  ",
                "#    # ",
                "#     #"
        });
        alphabet.put('S', new String[] {
                " ##### ",
                "#     #",
                "#      ",
                " ##### ",
                "      #",
                "#     #",
                " ##### "
        });
        alphabet.put('T', new String[] {
                "#######",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        alphabet.put('U', new String[] {
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " ##### "
        });
        alphabet.put('W', new String[] {
                "#     #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                " ## ## "
        });
        alphabet.put('V', new String[] {
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   "
        });
        alphabet.put('X', new String[] {
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #"
        });
        alphabet.put('Y', new String[] {
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        alphabet.put('Z', new String[] {
                "#######",
                "     # ",
                "    #  ",
                "   #   ",
                "  #    ",
                " #     ",
                "#######"
        });
        alphabet.put(' ', new String[] {
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  "
        });
    }

    public String[] toBanner(String input) {
        if (input == null || input.isEmpty()) return new String[0];

        String inputUpperCase = input.toUpperCase();
        String[] banner = new String[7];

        for(int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char letter : inputUpperCase.toCharArray()) {
                String[] charBanner = alphabet.get(letter);
                if (charBanner != null) {
                    line.append(charBanner[i]).append(" ");
                }
            }
            banner[i] = line.toString();
        }
        return banner;
    }
}