
        
           Arrays.sort(s, new Comparator<String>(){
            public int compare(String s1, String s2) {
                if (s1 == null || s2 == null) {
                    return 0;
                }
                BigDecimal bigDec_s1 = new BigDecimal(s1);
                BigDecimal bigDec_s2 = new BigDecimal(s2);
                return bigDec_s2.compareTo(bigDec_s1);
            }
        });
        
