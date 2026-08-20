

    static boolean isAnagram(String a, String b) {
         boolean result = false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        StringBuilder Master = new StringBuilder(b);

        if (a.length() == b.length()) {
            for (int c = 0; c < a.length(); c++) {
                for (int d = 0; d < Master.length(); d++) {
                    if (a.charAt(c) == Master.charAt(d)) {
                        Master.deleteCharAt(d);
                        if (c == a.length() - 1 && Master.length() == 0) {
                            result = true;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return result;
    }

