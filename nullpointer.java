class NullPointer {
    public static void main(String[] args) {
        String str = null;           // deliberately null
        try {
            System.out.println(str.toUpperCase()); // will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("gig87ogf8o7g");     // handled here
        }
    }
}
