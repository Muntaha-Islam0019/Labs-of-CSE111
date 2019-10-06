class BoroInt {

    String val;

    class BoroIntErModdheNumberCharaArKisuDeyaJaiNaException extends Exception {
        public BoroIntErModdheNumberCharaArKisuDeyaJaiNaException() {
            System.out.println("Don't type something else without Integer.");
        }
    }

    // 1st Constructor
    BoroInt() {
        val = "0";
    }

    // 2nd Constructor
    BoroInt(String str) {
        try {
            if (validValue(str) == true) {
            throw new BoroIntErModdheNumberCharaArKisuDeyaJaiNaException() ;
            } else {
                val = str ;
            }
        } catch (BoroIntErModdheNumberCharaArKisuDeyaJaiNaException e) {
            System.out.println("Please enter an integer.") ;
        }
    }

    // 3rd Constructor
    BoroInt(int i) {
        val = Integer.toString(i);
    }

    // 4th Constructor
    BoroInt(BoroInt newInt) {
        val = newInt.val;
    }

    public String trim(String _val) {
        String str = "";
        int count = 0;

        while (count < _val.length()) {
            if (!(_val.charAt(count) == ' ')) {
                str += _val.charAt(count);
            }
        }
        return str;
    }

    public boolean validValue(String _val) {

        boolean flag = false;
        int count = 0;

        while (count < _val.length()) {
            if (Character.isDigit(_val.charAt(count))) {
                flag = false;
            } else {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public BoroInt add(BoroInt _val) {
        int i = Integer.parseInt(val);
        int j = Integer.parseInt(_val.val);

        BoroInt temp = new BoroInt(i + j);
        return temp;
    }

    public BoroInt subtract(BoroInt _val) {
        int i = Integer.parseInt(val);
        int j = Integer.parseInt(_val.val);

        BoroInt temp = new BoroInt(i - j);
        return temp;
    }

    public BoroInt multiply(BoroInt _val) {
        int i = Integer.parseInt(val);
        int j = Integer.parseInt(_val.val);

        BoroInt temp = new BoroInt(i * j);
        return temp;
    }

    public BoroInt divide(BoroInt _val) {
        int i = Integer.parseInt(val);
        int j = Integer.parseInt(_val.val);

        BoroInt temp = new BoroInt(i / j);
        return temp;
    }
}