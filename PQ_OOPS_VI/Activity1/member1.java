import java.util.ArrayList;

class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " (" + gradYear + ") " + hasGoodStanding;
    }
}

class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // Adds new members
    public void addMembers(String[] names, int gradYear) {
        for (String n : names) {
            memberList.add(new MemberInfo(n, gradYear, true));
        }
    }

    // Removes graduated members and returns those in good standing
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduatedGood = new ArrayList<MemberInfo>();
        ArrayList<MemberInfo> remaining = new ArrayList<MemberInfo>();

        for (MemberInfo m : memberList) {
            if (m.getGradYear() <= year) {
                if (m.inGoodStanding()) {
                    graduatedGood.add(m);
                }
            } else {
                remaining.add(m);
            }
        }
        memberList = remaining;
        return graduatedGood;
    }

    public void showMembers() {
        for (MemberInfo m : memberList) {
            System.out.println(m);
        }
    }
}

class MainClubTest {
    public static void main(String[] args) {
        ClubMembers club = new ClubMembers();

        String[] names1 = { "SMITH, JANE", "FOX, STEVE", "XIN, MICHAEL", "GARCIA, MARIA" };
        club.addMembers(names1, 2018);

        System.out.println("Before removing:");
        club.showMembers();

        ArrayList<MemberInfo> graduated = club.removeMembers(2018);

        System.out.println("\nAfter removing:");
        club.showMembers();

        System.out.println("\nGraduated and in good standing:");
        for (MemberInfo m : graduated) {
            System.out.println(m);
        }
    }
}
